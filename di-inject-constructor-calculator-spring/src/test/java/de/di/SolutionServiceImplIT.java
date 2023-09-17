package de.di;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SolutionServiceImplIT {

    @Autowired
    SolutionService solutionService;

    @Test
    void check_amount_and_content_of_solutionUsers() {
        Set<String> solutionUsers = solutionService.getSolutionUsers();

        assertEquals(1, solutionUsers.size());
        assertEquals("[User Name UDM- Calculator Result: 30]", solutionUsers.toString());
    }
}