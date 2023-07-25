package bussiness_objects;

import bussiness_objects.services.operational.RegistrationService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * a test class to test the registration service.
 * @author kamar baraka.
 * */

class RegistrationServiceTest {

    /**
     * test the registration service*/
    @Test
    public void registrationTest(){

        /*construct a registration service*/
        RegistrationService service = new RegistrationService();

        /*run the service and assert that the registration is successful*/
        assertEquals("success", service.register());


    }

}