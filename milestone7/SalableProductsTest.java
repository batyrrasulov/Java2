package tests;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import storefront.SalableProducts;

public class SalableProductsTest {
    private SalableProducts product1;
    private SalableProducts product2;
    private SalableProducts product3;
    @Before
    public void setUp() throws Exception {
        product1 = new SalableProducts("Product 1", "Description for Product 1", 10.0, 5);
        product2 = new SalableProducts("Product 2", "Description for Product 2", 20.0, 10);
        product3 = new SalableProducts("Product 3", "Description for Product 3", 30.0, 15);
    }
    @Test
    public void testGetName() {
        assertEquals("Product 1", product1.getName());
    }
    @Test
    public void testSetName() {
        product1.setName("New Product 1");
        assertEquals("New Product 1", product1.getName());
    }
    @Test
    public void testGetDescription() {
        assertEquals("Description for Product 2", product2.getDescription());
    }
    @Test
    public void testSetDescription() {
        product2.setDescription("New description for Product 2");
        assertEquals("New description for Product 2", product2.getDescription());
    }
    @Test
    public void testGetPrice() {
        assertEquals(30.0, product3.getPrice(), 0.0);
    }
    @Test
    public void testSetPrice() {
        product3.setPrice(40.0);
        assertEquals(40.0, product3.getPrice(), 0.0);
    }
    @Test
    public void testGetQuantity() {
        assertEquals(10, product2.getQuantity());
    }
    @Test
    public void testSetQuantity() {
        product2.setQuantity(20);
        assertEquals(20, product2.getQuantity());
    }
    @Test
    public void testCompareTo() {
        // Test that products are sorted first by description, then by name
        List<SalableProducts> products = new ArrayList<>();
        products.add(product3);
        products.add(product2);
        products.add(product1);
        Collections.sort(products);
        assertEquals(product1, products.get(0));
        assertEquals(product2, products.get(1));
        assertEquals(product3, products.get(2));
    }
    @Test
    public void testNameUPComparator() {
        // Test that products are sorted by name in ascending order
        List<SalableProducts> products = new ArrayList<>();
        products.add(product3);
        products.add(product2);
        products.add(product1);
        Collections.sort(products, SalableProducts.nameUPComparator);
        assertEquals(product1, products.get(0));
        assertEquals(product3, products.get(1));
        assertEquals(product2, products.get(2));
    }
    @Test
    public void testNameDOWNComparator() {
        // Test that products are sorted by name in descending order
        List<SalableProducts> products = new ArrayList<>();
        products.add(product3);
        products.add(product2);
        products.add(product1);
        Collections.sort(products, SalableProducts.nameDOWNComparator);
        assertEquals(product2, products.get(0));
        assertEquals(product3, products.get(1));
        assertEquals(product1, products.get(2));
    }
}