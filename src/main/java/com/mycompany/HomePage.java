package com.mycompany;

import org.apache.wicket.markup.ComponentTag;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.WebPage;

public class HomePage extends WebPage {
	private static final long serialVersionUID = 1L;

	public HomePage(final PageParameters parameters) {
		super(parameters);
		add(new HeaderPanel("headerPanel"));
		add(new Label("helloMessage", "Hello World By Anunay") {
			@Override
			protected void onComponentTag(ComponentTag tag) {
				super.onComponentTag(tag);
				tag.setName("span");
				tag.put("style", "font-weight:bold");
			}
		});
		/**
		 * We also have ComponentFactory that helps in quickly creating the components, supported in Java 8
		 * add(ComponentFactory.link("id", (newlink) -> {//do stuff});
		 */
		add(new Link<Void>("linkDemo") {
			@Override
			public void onClick() {
				setResponsePage(SecondPage.class);
			}
		});
		add(new Link<Void>("basePage") {
			@Override
			public void onClick() {
				setResponsePage(BasePageLayout.class);
			}
		});
		add(new Link<Void>("newPage") {
			@Override
			public void onClick() {
				setResponsePage(NewPageLayout.class);
			}
		});
		//You can think of WebMarkupContainer as a mini web page. You can add multiple components to it.
		//Here, based on the messageCount we can switch the visibility of the webMarkupContainer
		int newMessagesCount = 10;
		WebMarkupContainer webMarkupContainer = new WebMarkupContainer("webMarkupDemo");
		webMarkupContainer.add(new Label("numberOfMessage", newMessagesCount));
		if (newMessagesCount > 0) {
			webMarkupContainer.setVisible(true);
		} else {
			webMarkupContainer.setVisible(false);
		}
		add(webMarkupContainer);

	}
}
