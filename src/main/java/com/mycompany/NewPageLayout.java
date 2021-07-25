package com.mycompany;

import org.apache.wicket.markup.html.basic.Label;

public class NewPageLayout extends BasePageLayout{
	public NewPageLayout() {
		super();
		add( new Label("news", "Good news everyone!" ) );
	}
}
