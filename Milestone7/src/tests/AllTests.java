package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import test.FileServiceTest;
import test.InventoryManagerTest;
import test.ShoppingCartTest;

@RunWith(Suite.class)
@SuiteClasses({ FileServiceTest.class, InventoryManagerTest.class, ShoppingCartTest.class })
public class AllTests {

}
