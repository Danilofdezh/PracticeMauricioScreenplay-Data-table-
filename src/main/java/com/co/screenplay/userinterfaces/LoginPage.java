package com.co.screenplay.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final Target TXT_USERNAME = Target.the("enter the username")
            .locatedBy("//input[@id='username']");

    public static final Target TXT_PASSWORD = Target.the("enter the password")
            .locatedBy("//input[@id='password']");

    public static final Target BTN_SUBMIT = Target.the("Click on the button 'acceder'")
            .locatedBy("//button[@name='login']");
}
