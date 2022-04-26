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
        GeoService geoServiceMock = Mockito.spy(GeoServiceImpl.class);
        LocalizationService localizationServiceMock = Mockito.spy(LocalizationServiceImpl.class);
        MessageSender messageSenderMock = new MessageSenderImpl(geoServiceMock, localizationServiceMock);
        String ipAddress = "172.123.12.19";
        Map<String, String> headers = new HashMap<String, String>();
        headers.put(MessageSenderImpl.IP_ADDRESS_HEADER, "172.123.12.19");
        Location location = new Location("Moscow", Country.RUSSIA, null, 0);
        String country = localizationServiceMock.locale(Country.RUSSIA);
        Mockito.when(messageSenderMock.send(headers))
                .thenReturn("RUSSIA");
    }
}