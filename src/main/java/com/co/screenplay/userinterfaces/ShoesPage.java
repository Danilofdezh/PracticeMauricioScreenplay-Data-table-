package com.co.screenplay.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ShoesPage {
    public static final Target SELECT_SHOES = Target.the("select shoes white")
            .locatedBy("//*[@class='attachment-woocommerce_thumbnail size-woocommerce_thumbnail']");
    public static final Target SELECT_SIZE = Target.the("select size shoes")
            .locatedBy("//select[@id='pa_talla']");
    public static final Target BTN_BUY_NOW = Target.the("click in button 'Comprar ahora'")
            .locatedBy("//a[@class='buy_now_link']");
    //public static final Target LBL_CAPTURE_MESSAGE = Target.the("capture message confirmation")
            //.locatedBy("//*[text()='Botines chelsea track color capuccino en cuero - 36']");
    public static final Target LBL_CAPTURE_MESSAGE = Target.the("capture message confirmation")
            .locatedBy("//*[@class='product-name']/a");
}
