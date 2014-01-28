package com.sparity.springmail;

import javax.mail.MessagingException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		SendMailExample mm = (SendMailExample) context.getBean("sendMailExample");
        /*mm.sendMail("dmailtest@gmail.com",
    		   "srinivasdj81@gmail.com",
    		   "Javacodegeeks email test", 
    		   "Testing.. \n Hello Spring Email Sender");*/
       // mm.sendMailWithTemplate("dear", "content");
       //mm.sendMailWithAttachment("dear", "content");
        try {
			mm.sendMailWithInlineImage();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		context.close();
	}

}
