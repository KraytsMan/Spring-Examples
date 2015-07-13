package chapter2;

public interface NewsletterSender {

    public void setSmtpServer(String smtpServer);
    public String getSmtpServer();
    public void setFromAddress(String fromAddress);
    public String getFromAddress();
    public void send();

}
