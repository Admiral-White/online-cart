package smallStore;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class UserTest {

    @BeforeEach
        // the most important thing here is the annotation (@) and
        //  not the method name used (the method name can be changed)
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void userCanRegisterTest(){
        //  the test case is like a simulation that help us
        //  determine if the code is doing what it should do
        User newUser = new User() {
            @Override
            void jump() {

            }
        };

        newUser.setName("bisi");
        newUser.setPhone("zeroEightZero");
        newUser.setAddress("312, Lagos");
        newUser.setEmailAddress("mikeinyang@semicolon.com");

        assertEquals(newUser.getName(), "bisi");


    }

    @Test
    void userCanRegisterInStoreTest() {
        //  the test case is like a simulation that help us
        //  determine if the code is doing what it should do

        User newUser = new User() {
            @Override
            void jump() {
                
            }
        };

        newUser.setName("Briska");
        newUser.setPhone("zeroEightZero");
        newUser.setAddress("312, Sabo, Lagos");
        newUser.setEmailAddress("Briska@semicolon.com");


        Estore store = new Estore();
        //  store.setStoreName("Amadi's store");

        store.registeredUser(newUser);
        assertFalse(store.getRegisteredUser().isEmpty());
        assertTrue(store.getRegisteredUser().contains(newUser));
        store.getRegisteredUser().forEach(user1 ->
        {
            System.out.println(user1.toString());
        });


    }

}