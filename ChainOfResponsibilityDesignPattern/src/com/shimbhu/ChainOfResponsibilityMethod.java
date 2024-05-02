package com.shimbhu;

public class ChainOfResponsibilityMethod {

	// Client
	public static void main(String[] args) {
		// Create handlers
		EmailHandler spamHandler = new SpamEmailHandler();
		EmailHandler orderHandler = new OrderEmailHandler();

		// Set up the chain
		spamHandler.setNextHandler(orderHandler);

		// Process emails
		Email email1 = new Email("Buy cheap pills!", EmailType.SPAM);
		spamHandler.handleEmail(email1);

		Email email2 = new Email("Your order has been shipped.", EmailType.ORDER);
		spamHandler.handleEmail(email2);

		Email email3 = new Email("Meeting agenda.", EmailType.SPAM);
		spamHandler.handleEmail(email3);
	}
}

//Handler Interface
interface EmailHandler {
	void handleEmail(Email email);

	void setNextHandler(EmailHandler nextHandler);
}

//Concrete Handlers
class SpamEmailHandler implements EmailHandler {
	private EmailHandler nextHandler;

	@Override
	public void handleEmail(Email email) {
		if (email.getType() == EmailType.SPAM) {
			System.out.println("Handling spam email: " + email.getContent());
			// Process the email
		} else if (nextHandler != null) {
			nextHandler.handleEmail(email);
		} else {
			System.out.println("No handler available for this email.");
		}
	}

	@Override
	public void setNextHandler(EmailHandler nextHandler) {
		this.nextHandler = nextHandler;
	}
}

class OrderEmailHandler implements EmailHandler {
	private EmailHandler nextHandler;

	@Override
	public void handleEmail(Email email) {
		if (email.getType() == EmailType.ORDER) {
			System.out.println("Handling order email: " + email.getContent());
			// Process the email
		} else if (nextHandler != null) {
			nextHandler.handleEmail(email);
		} else {
			System.out.println("No handler available for this email.");
		}
	}

	@Override
	public void setNextHandler(EmailHandler nextHandler) {
		this.nextHandler = nextHandler;
	}
}

//Email class
class Email {
	private String content;
	private EmailType type;

	public Email(String content, EmailType type) {
		this.content = content;
		this.type = type;
	}

	public String getContent() {
		return content;
	}

	public EmailType getType() {
		return type;
	}
}

//Enum for Email Type
enum EmailType {
	SPAM, ORDER
}
