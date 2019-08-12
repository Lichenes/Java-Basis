package cn.linchenes.util;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.sun.mail.util.MailSSLSocketFactory;

public class MailBox {
	public static void main(String[] args) throws Exception {
		 RandomNumber rd = new RandomNumber();
		 String random = rd.random().toString();
		 Properties props = new Properties();
		 props.setProperty("mail.debug", "true");
		 props.setProperty("mail.smtp.auth", "true"); //发送服务器需要身份验证
		 props.setProperty("mail.host", "smtp.qq.com");//发送邮件服务器的主机名
		 props.setProperty("mail.transport.protocol", "smtp");
		 MailSSLSocketFactory msf = new MailSSLSocketFactory(); //开启ssl加密（并不是所有的邮箱服务器都需要，但是qq邮箱服务器是必须的）
		 msf.setTrustAllHosts(true);
		 props.put("mail.smtp.ssl.enable", "true");
		 props.put("mail.smtp.ssl.socketFactory", msf);
		 Session session = Session.getInstance(props, new javax.mail.Authenticator(){
			 protected PasswordAuthentication getPasswordAuthentication(){
				 return new PasswordAuthentication("1693597936@qq.com", "jdetyvlkkmnldjfg");   //用户名密码验证（取得的授权）
			 }
		 });
		 MimeMessage message = new MimeMessage(session);
		 message.setSubject("登录验证码");
		 message.setText("这是来自于www.lichenes.cn的登录验证码："+random);
		 message.setFrom("1693597936@qq.com");
		 Transport transport = session.getTransport();  //此类的功能是发送邮件 又会话获得实例
		 transport.connect();
		 transport.sendMessage(message, new Address[]{new InternetAddress("1693597936@qq.com")});
		 transport.close();
	}
}
