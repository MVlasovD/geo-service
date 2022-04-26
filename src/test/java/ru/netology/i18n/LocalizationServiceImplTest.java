package ru.netology.i18n;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import ru.netology.entity.Country;

import static org.junit.jupiter.api.Assertions.*;
import static ru.netology.entity.Country.RUSSIA;

class LocalizationServiceImplTest {

    @Test
    void locale() {
        Country country = RUSSIA;
        String expected = "Добро пожаловать";
        assertNotNull(country);
        LocalizationServiceImpl localizationServiceMock = Mockito.mock(LocalizationServiceImpl.class);
        Mockito.when(localizationServiceMock.locale(country))
                .thenReturn("Добро пожаловать");
    }
}