package test;

import static org.junit.Assert.assertEquals;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.UnknownHostException;
import org.junit.Test;
import storefront.StoreFront;

public class StoreFrontTest {
    @Test
    public void testProducts() throws UnknownHostException, IOException {
        // Prepare the input to the method
        String input = "1\n1\n1\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Call the method under test
        StoreFront.products();

        // Assert that the output is correct
        assertEquals("Select a category to view products: (1-4)\n" +
                "\t1. Weapons\n" +
                "\t2. Armor\n" +
                "\t3. Health\n" +
                "\t4. Back to main menu\n" +
                "Select a weapon to view details: (1-3)\n" +
                "\t1. Steel Dagger\n" +
                "\t2. Executioner Axe\n" +
                "\t3. Cancel Order\n" +
                "How many Steel Daggers would you like to purchase? \n",toString());
    }
}
