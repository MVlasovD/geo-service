package ru.netology.geo;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import ru.netology.entity.Country;
import ru.netology.entity.Location;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doThrow;

class GeoServiceImplTest {

    @Test
    void byIp() {
        String ip = "172.0.32.11";
        GeoServiceImpl geoService = new GeoServiceImpl();
        Location expected = geoService.byIp(ip);
        Location actual = new Location("Moscow", Country.RUSSIA, null, 0);
        assertEquals(expected.getCountry(),actual.getCountry());
    }

    @Test
    void byCoordinates(){
        doThrow(RuntimeException.class);
    }
}