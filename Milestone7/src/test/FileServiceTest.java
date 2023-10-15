package test;

import static org.junit.Assert.assertEquals;
import java.io.File;
import java.util.ArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import admin.FileService;
import storefront.Add100HP;
import storefront.SalableProducts;

public class FileServiceTest {
	private FileService fileService;
	private File testFile;
	@Before
	public void setUp() throws Exception {
		fileService = new FileService();
		testFile = new File("testFile.json");
	}
	@After
	public void tearDown() throws Exception {
		testFile.delete();
	}
	@Test
	public void testSaveToFile() {
		SalableProducts product = new Add100HP("Test Product", "Test Description", 9.99, 10);
		fileService.saveToFile(product, false);
		ArrayList<SalableProducts> products = fileService.readFromFile();
		assertEquals(1, products.size());
		assertEquals(product, products.get(0));
	}
}
