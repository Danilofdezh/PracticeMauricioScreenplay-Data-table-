package com.co.screenplay.tasks;

import com.co.screenplay.models.DataLogin;
import com.co.screenplay.userinterfaces.LoginPage;
import com.co.screenplay.userinterfaces.MenuComponent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
    DataLogin dataLogin;

    public Login(DataLogin dataLogin) {
        this.dataLogin = dataLogin;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MenuComponent.BTN_LOGIN));
        actor.attemptsTo(Enter.theValue(dataLogin.getUsername()).into(LoginPage.TXT_USERNAME));
        actor.attemptsTo(Enter.theValue(dataLogin.getPassword()).into(LoginPage.TXT_PASSWORD));
        actor.attemptsTo(Click.on(LoginPage.BTN_SUBMIT));
    }
        public static Login enter(DataLogin dataLogin){
            return Tasks.instrumented(Login.class, dataLogin);
        }


    }

