package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import test.SteelDaggerTest;
import test.ExecutionerAxeTest;
import test.TannedLeatherTest;
import test.SteelerTest;
import test.Add100HPTest;
import test.Add250HPTest;
import test.StoreFrontTest;


@RunWith(Suite.class)
@SuiteClasses({ WeaponProductsTest.class, ArmorProductsTest.class, HealthProductsTest.class, SteelDaggerTest.class, ExecutionerAxeTest.class, TannedLeatherTest.class,
	SteelerTest.class, Add100HPTest.class, Add250HPTest.class, SalableProductsTest.class, StoreFrontTest.class })
public class AllProductsTests {

}
