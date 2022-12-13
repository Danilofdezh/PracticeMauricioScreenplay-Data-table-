package com.co.screenplay.tasks;

import com.co.screenplay.userinterfaces.MenuComponent;
import com.co.screenplay.userinterfaces.ShoesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class BuyShoes implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo
                (Click.on(MenuComponent.BTN_SHOES),
        //IMPLICIT WAIT
            /*try{
                Thread.sleep(2000);
            } catch (InterruptedException e){

            }*/

        //SCROLL
                (Scroll.to(ShoesPage.SELECT_SHOES)),
                (Click.on(ShoesPage.SELECT_SHOES)),
                (SelectFromOptions.byValue("34").from(ShoesPage.SELECT_SIZE)),
                (Scroll.to(ShoesPage.BTN_BUY_NOW)),
                (Click.on(ShoesPage.BTN_BUY_NOW)));

    }

    public static BuyShoes click(){
        return Tasks.instrumented(BuyShoes.class);
    }

}
