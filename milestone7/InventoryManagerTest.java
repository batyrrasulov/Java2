package test;

import org.junit.Test;
import storefront.ArmorProducts;
import storefront.HealthProducts;
import storefront.InventoryManager;
import storefront.SalableProducts;
import storefront.StoreFront;
import storefront.WeaponProducts;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

public class InventoryManagerTest {
	@Test
	public void testDisplayProduct() {
	    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
	    
	    SalableProducts product = new WeaponProducts("Steel Dagger", "Cold Carbon steel Italian", 50.00, 10);
	    InventoryManager.displayProduct(product);
	    
	    String expectedOutput = "Steel Dagger | Cold Carbon steel Italian | $50.0 | 10\n";
	    assertEquals(expectedOutput, outContent.toString());
	}
	@Test
	public void testInventory() throws UnknownHostException, IOException {
	    // Mock user input to sort by ascending price
	    ByteArrayInputStream inContent = new ByteArrayInputStream("3".getBytes());
	    System.setIn(inContent);
	    
	    // Mock StoreFront purchases so that each product has 5 units left
	    StoreFront.setSteelDaggerPurch(45);
	    StoreFront.setExecutionerAxePurch(245);
	    StoreFront.setTannedLeatherPurch(145);
	    StoreFront.setSteelerPurch(95);
	    StoreFront.setAdd100Purch(245);
	    StoreFront.setAdd250Purch(95);
	    
	    // Call the Inventory method
	    InventoryManager.Inventory();
	    
	    // Check that the inventory is properly sorted and displayed
	    List<SalableProducts> expectedList = new ArrayList<SalableProducts>();
	    expectedList.add(new HealthProducts("Add100HP", "Extra 100 health points", 100.00, 5));
	    expectedList.add(new HealthProducts("Add250HP", "Extra 250 health points", 200.00, 5));
	    expectedList.add(new WeaponProducts("Steel Dagger", "Cold Carbon steel Italian", 50.00, 5));
	    expectedList.add(new ArmorProducts("Tanned Leather", "Original Dutch", 200.00, 5));
	    expectedList.add(new WeaponProducts("Executioner Axe", "Skeleteen Viking Medieval Costume", 10.00, 5));
	    expectedList.add(new ArmorProducts("Steeler", "Tribal Power", 300.00, 5));
	    
	    List<SalableProducts> actualList = new ArrayList<SalableProducts>();
	    assertEquals(expectedList, actualList);
	}
	@Test
    public void testGetInvSteelDagger() {
        assertEquals(0, InventoryManager.getInvSteelDagger());
    }

    @Test
    public void testGetInvExecutionerAxe() {
        assertEquals(0, InventoryManager.getInvExecutionerAxe());
    }

    @Test
    public void testGetInvTannedLeather() {
        assertEquals(0, InventoryManager.getInvTannedLeather());
    }

    @Test
    public void testGetInvSteeler() {
        assertEquals(0, InventoryManager.getInvSteeler());
    }

    @Test
    public void testGetInvAdd100() {
        assertEquals(0, InventoryManager.getInvAdd100());
    }

    @Test
    public void testGetInvAdd250() {
        assertEquals(0, InventoryManager.getInvAdd250());
    }
}
