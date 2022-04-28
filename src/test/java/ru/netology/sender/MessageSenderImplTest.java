package ru.netology.sender;

import org.junit.jupiter.api.Assertions;
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
        GeoService geoServiceMock = Mockito.spy(GeoServiceImpl.class);
        LocalizationService localizationServiceMock = Mockito.spy(LocalizationServiceImpl.class);
        MessageSender messageSenderMock = new MessageSenderImpl(geoServiceMock, localizationServiceMock);
        String ipAddressR = "172.";
        String ipAddressO = "96.";
        String expectedR = "Добро пожаловать";
        String expectedO = "Welcome";
        Map<String, String> headersR = new HashMap<String, String>();
        Map<String, String> headersO = new HashMap<String, String>();
        headersR.put(MessageSenderImpl.IP_ADDRESS_HEADER,ipAddressR);
        headersO.put(MessageSenderImpl.IP_ADDRESS_HEADER,ipAddressO);
        String actualR = messageSenderMock.send(headersR);
        System.out.println();
        String actualO = messageSenderMock.send(headersO);

        Assertions.assertEquals(expectedR,actualR);
        Assertions.assertEquals(expectedO,actualO);
    }
}