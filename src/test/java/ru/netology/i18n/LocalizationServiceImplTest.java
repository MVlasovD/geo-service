package ru.netology.i18n;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import ru.netology.entity.Country;

import static org.junit.jupiter.api.Assertions.*;
import static ru.netology.entity.Country.RUSSIA;

class LocalizationServiceImplTest {

    @Test
    @Order(1)
    void locale() {
        Country country = RUSSIA;
        String expected = "Добро пожаловать";
        assertNotNull(country);
        LocalizationServiceImpl loc = new LocalizationServiceImpl();
        String result = loc.locale(country);
        assertEquals(expected, result);
    }
}