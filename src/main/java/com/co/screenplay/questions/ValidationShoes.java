package com.co.screenplay.questions;

import com.co.screenplay.userinterfaces.ShoesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidationShoes implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(ShoesPage.LBL_CAPTURE_MESSAGE).viewedBy(actor).asString();
    }

    public static ValidationShoes compare(){
        return new ValidationShoes();
    }
}
