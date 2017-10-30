package com.kent.MyWicketApp2;

import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.form.AjaxButton;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.Model;

public class WelcomePage extends WebPage{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public WelcomePage() {
		Form<?> form = new Form<Object>("form");
		
		
		final TextField<String> textField = new TextField<String>("text", new Model<String>());
		textField.setOutputMarkupId(true);
		textField.setOutputMarkupPlaceholderTag(true);
		
		
		form.add(textField);
		form.add(new AjaxButton("submit") {
			
			
			private static final long serialVersionUID = 1L;

			@Override
			protected void onSubmit(AjaxRequestTarget target, Form<?> form) {
				super.onSubmit(target, form);
				if(textField.isVisible()) {
					textField.setVisible(false);
				}else {
					textField.setVisible(true);
				}
				
				target.add(textField);
				
			}
			
		});
		
		
		add(form);
		
		
		
	}

}
