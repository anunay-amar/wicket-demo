package com.mycompany;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.Component;
import org.apache.wicket.markup.html.basic.Label;

public class JugTemplate extends WebPage {
        public static final String CONTENT_ID = "contentComponent";

        private Component headerPanel;

    public JugTemplate(){
        add(headerPanel = new HeaderPanel("headerPanel"));
        add(new Label(CONTENT_ID, "Put your content here"));
    }

    public Component getHeaderPanel() {
        return headerPanel;
    }
}