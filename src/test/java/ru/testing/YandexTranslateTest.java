package ru.testing;

import org.junit.jupiter.api.DisplayName;
import ru.testing.entities.ResponseTranslate;
import ru.testing.gateway.YandexTranslateGateway;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class YandexTranslateTest {
    private static final String LANGUAGE_RU = "ru";

    @Test
    @DisplayName("Hello world")
    public void getTranslateHelloWorld(){
        YandexTranslateGateway yandexTranslateGateway = new YandexTranslateGateway();
        String[] request = new String[]{
                "Hello world"
        };
        ResponseTranslate translate = yandexTranslateGateway.getTranslate(request, LANGUAGE_RU);
        Assertions.assertEquals(translate.getTranslations()[0].getText(), "Привет, мир");
    }
}