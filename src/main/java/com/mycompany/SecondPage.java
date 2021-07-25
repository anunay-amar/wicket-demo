package com.mycompany;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;

public class SecondPage extends WebPage {
	public SecondPage() {
		super();
		add(new HeaderPanel("headerPanel"));
		add(new Label("secondPageWelcome", "Welcome to the second page!!"));
		add(new Link<Void>("showLoginPage") {
			@Override
			public void onClick() {
				setResponsePage(new SimpleLoginPage());
			}
		});
	}
}
