package test;

import org.junit.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class TestAssertions {
	@SuppressWarnings({ })
	@Test
	public void testAssertions() {
		// test data
		String str1 = new String("abc");
		String str2 = new String("abc");
		String str3 = null;
		String str4 = "abc";
		String str5 = "abc";
		int val1 = 5;
		int val2 = 6;
		String[] expectedArray = { "one", "two", "three" };
		String[] resultArray = { "one", "two", "three" };
		// check that two primitives/objects are equal
		Assert.assertEquals(str1, str2);
		// check that a condition is true
		Assert.assertTrue(val1 < val2);
		// check that a condition is false
		Assert.assertFalse(val1 > val2);
		// check that an object isn't null
		Assert.assertNotNull(str1);
		// check that an object is null
		Assert.assertNull(str3);
		// check if two object references point to the same object
		Assert.assertSame(str4, str5);
		// check if ywo object references not point to the same object
		Assert.assertNotSame(str1, str3);
		// check whether two arrays are equal to each other
		Assert.assertEquals(expectedArray, resultArray);
	}
}
