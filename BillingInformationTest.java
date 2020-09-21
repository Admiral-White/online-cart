package smallStore;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static smallStore.CardType.VERVE;

class BillingInformationTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void userBillingInfoTest(){
        BillingInformation billTest = new BillingInformation(){

        };

        billTest.setReceiversName("mikey");
        billTest.setReceiversPhoneNumber("08087664102");
        billTest.setCreditInformation("123345678", "okon, mike Inyang", "344908734", "13245", "2020/09", VERVE);
        billTest.setDeliveryAddress("America","the Big Apple","wall street Avenue","New city Hall");

        assertEquals(billTest.getReceiversName(), "mikey");



    }



}