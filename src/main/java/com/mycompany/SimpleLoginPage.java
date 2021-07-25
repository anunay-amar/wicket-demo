package com.mycompany;

public class SimpleLoginPage extends JugTemplate{
	public SimpleLoginPage() {
		super();
		//here we are using the JugTemplate html page, hence we don't require explicit SimpleLoginPage
		//Also, we are replacing CONTEXT_ID and hiding headerPanel
		replace(new LoginPanel(CONTENT_ID));
		getHeaderPanel().setVisible(false);
	}
}
