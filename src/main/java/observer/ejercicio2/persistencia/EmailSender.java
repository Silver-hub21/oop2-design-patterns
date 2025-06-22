package observer.ejercicio2.persistencia;

import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import observer.ejercicio2.model.Participante;
import observer.ejercicio2.model.Registro;

import java.util.Properties;

public class EmailSender implements Registro {
    @Override
    public void registroDeParticipante(Participante participante, String msj) {
        // provide recipient's email ID
        String to = participante.email();

        // provide account credentials
        final String username = "adb50286cbb8ca";
        final String password = "5084a7c094fd60";

        // provide host address
        String host = "sandbox.smtp.mailtrap.io";

        // configure SMTP details
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", "587");

        // create the mail Session object
        Session session = Session.getInstance(props,
                new Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {
            // create a MimeMessage object
            Message message = new MimeMessage(session);
            // set From email field
            message.setFrom(new InternetAddress(username));
            // set To email field
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
            // set email subject field
            message.setSubject("Hello from the Mailtrap team");
            // set the content of the email message
            message.setText("Enjoy sending emails from Jakarta Mail!" + "\n" + msj);

            // send the email message
            Transport.send(message);

            System.out.println("Email Message Sent Successfully!");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}
