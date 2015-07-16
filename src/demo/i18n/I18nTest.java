package demo.i18n;

import java.util.Locale;
import java.util.ResourceBundle;

public class I18nTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String basename  = "demo.i18n.resource.myproperties";
		
		Locale cn = Locale.CHINA;
		Locale us = Locale.US;
		
		ResourceBundle myResourceCN = ResourceBundle.getBundle(basename,cn);
		ResourceBundle myResourceUS = ResourceBundle.getBundle(basename,us);
		
		String usernameCN = myResourceCN.getString("username");
		String passwordCN = myResourceCN.getString("password");
		
		String usernameEN = myResourceUS.getString("username");
		String passwordEN = myResourceUS.getString("password");
		
		System.out.println(usernameCN +"===" +passwordCN);
		System.out.println(usernameEN+"===" +passwordEN);
		
		
	}

}
