
/**
 * Created by shmodwalker on 11/11/2015.
 ====================================================================================================
 ====  =====       ===  ====  ==        ==       ===        ===      ===        =====  =====       ==
 ===    ====  ====  ==  ====  ==  ========  ====  =====  =====  ====  =====  =======    ====  ====  =
 ==  ==  ===  ====  ==  ====  ==  ========  ====  =====  =====  ====  =====  ======  ==  ===  ====  =
 =  ====  ==  ====  ==  ====  ==  ========  ===   =====  ======  ==========  =====  ====  ==  ===   =
 =  ====  ==  ====  ==   ==   ==      ====      =======  ========  ========  =====  ====  ==      ===
 =        ==  ====  ===  ==  ===  ========  ====  =====  ==========  ======  =====        ==  ====  =
 =  ====  ==  ====  ===  ==  ===  ========  ====  =====  =====  ====  =====  =====  ====  ==  ====  =
 =  ====  ==  ====  ====    ====  ========  ====  =====  =====  ====  =====  =====  ====  ==  ====  =
 =  ====  ==       ======  =====        ==  ====  =====  ======      ======  =====  ====  ==  ====  =
 ====================================================================================================
 */



package build;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.File;
import java.util.Date;
import java.util.Properties;




public class EmailReport {
    public static void main(String[] args) {
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "false");
        props.put("mail.smtp.host", "mail.advertstar.net");
        props.put("mail.smtp.port", "25");
        props.put("mail.debug", "true");
        Session session = Session.getInstance(props,
                new Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication("n.ruhee@advertstar.net", "plismocok123");
                    }
                });

        try {
            MimeMessage msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress("n.ruhee@advertstar.net"));
            msg.setRecipients(Message.RecipientType.TO, "n.ruhee@advertstar.net");
            msg.setSubject("AUTOMATION TEST REPORT  " + (new Date()));
            msg.setSentDate(new Date());

            Multipart multipart = new MimeMultipart();

            MimeBodyPart textPart = new MimeBodyPart();
            String textContent = "<< DO-NOT-REPLY >>" +
                    "  ATTACHED REPORT OF TEST RUN";
            textPart.setText(textContent);
            multipart.addBodyPart(textPart);

            MimeBodyPart attachementPart = new MimeBodyPart();
            attachementPart.attachFile(new File("target\\Reports\\Automation_report.html"));
            multipart.addBodyPart(attachementPart);

            msg.setContent(multipart);
            Transport.send(msg);
            System.out.println("---Done---");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}