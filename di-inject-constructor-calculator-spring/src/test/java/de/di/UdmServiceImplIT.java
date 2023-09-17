package de.di;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UdmServiceImplIT {

    @Autowired
    UdmService udmService;

    @Test
    void find_UdmUser_byId_1L() {
        String udmUserById = udmService.findUdmUserById(1L);

        assertEquals("UDM", udmUserById);
    }

    @Test
    void find_UdmUser_byId_others() {
        String udmUserById = udmService.findUdmUserById(10L);

        assertEquals("unknown", udmUserById);
    }

}