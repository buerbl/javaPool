package java核心技术代码.v2ch04.mail;

import com.sun.xml.internal.messaging.saaj.packaging.mime.MessagingException;

import java.io.*;
import java.nio.charset.*;
import java.nio.file.*;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.mail.internet.MimeMessage.RecipientType;

/**
 * This program shows how to use JavaMail to send mail messages.
 * @author Cay Horstmann
 * @version 1.00 2012-06-04
 */
public class MailTest
{
   public static void main(String[] args) throws MessagingException, IOException
   {
      Properties props = new Properties();
      try (InputStream in = Files.newInputStream(Paths.get("mail", "mail.properties")))
      {
         props.load(in);
      }
      List<String> lines = Files.readAllLines(Paths.get(args[0]), Charset.forName("UTF-8"));
       
      String from = lines.get(0);
      String to = lines.get(1);
      String subject = lines.get(2);
      
      StringBuilder builder = new StringBuilder();
      for (int i = 3; i < lines.size(); i++)
      {
         builder.append(lines.get(i));
         builder.append("\n");
      }
      
      Console console = System.console();
      String password = new String(console.readPassword("Password: "));
      
      Session mailSession = Session.getDefaultInstance(props);
      // mailSession.setDebug(true);
      MimeMessage message = new MimeMessage(mailSession);
      try {
         message.setFrom(new InternetAddress(from));
      } catch (javax.mail.MessagingException e) {
         e.printStackTrace();
      }
      try {
         message.addRecipient(RecipientType.TO, new InternetAddress(to));
      } catch (javax.mail.MessagingException e) {
         e.printStackTrace();
      }
      try {
         message.setSubject(subject);
      } catch (javax.mail.MessagingException e) {
         e.printStackTrace();
      }
      try {
         message.setText(builder.toString());
      } catch (javax.mail.MessagingException e) {
         e.printStackTrace();
      }
      Transport tr = null;
      try {
         tr = mailSession.getTransport();
      } catch (NoSuchProviderException e) {
         e.printStackTrace();
      }
      try
      {
         try {
            tr.connect(null, password);
         } catch (javax.mail.MessagingException e) {
            e.printStackTrace();
         }
         try {
            tr.sendMessage(message, message.getAllRecipients());
         } catch (javax.mail.MessagingException e) {
            e.printStackTrace();
         }
      }
      finally
      {
         try {
            tr.close();
         } catch (javax.mail.MessagingException e) {
            e.printStackTrace();
         }
      }
   }
}
