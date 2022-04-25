package ru.netology.sender;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import ru.netology.geo.GeoServiceImpl;
import ru.netology.i18n.LocalizationServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class MessageSenderImplTest {


    @Test
    void send() {
    GeoServiceImpl geoServiceMock = Mockito.mock(GeoServiceImpl.class);
    LocalizationServiceImpl localizationServiceMock = Mockito.mock(LocalizationServiceImpl.class);


//    Mockito.when();
//        .returnThen



    }
}