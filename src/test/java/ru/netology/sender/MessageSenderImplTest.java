package ru.netology.sender;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import ru.netology.entity.Country;
import ru.netology.entity.Location;
import ru.netology.geo.GeoService;
import ru.netology.geo.GeoServiceImpl;
import ru.netology.i18n.LocalizationService;
import ru.netology.i18n.LocalizationServiceImpl;

import java.util.HashMap;
import java.util.Map;

class MessageSenderImplTest {

    @Test
    void send() {
        GeoService geoServiceMock = Mockito.mock(GeoServiceImpl.class);
        LocalizationService localizationServiceMock = Mockito.mock(LocalizationServiceImpl.class);

        Mockito.when(geoServiceMock.byIp("172.123.12.19"))
                .thenReturn(new Location("Moscow",Country.RUSSIA,null, 0));

        Mockito.when(localizationServiceMock.locale(Country.RUSSIA))
                .thenReturn("Добро пожаловать");
    }
}