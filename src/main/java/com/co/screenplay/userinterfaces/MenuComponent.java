package com.co.screenplay.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MenuComponent {

    public static final Target BTN_SHOES = Target.the("enter to page shoes")
            .locatedBy("//*[@id='menu-item-10']/a");

    public static final Target BTN_LOGIN = Target.the("Select option login")
            .locatedBy("//div[@class='myaccount']");

}
