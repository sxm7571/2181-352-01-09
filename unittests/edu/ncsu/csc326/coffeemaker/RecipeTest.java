package edu.ncsu.csc326.coffeemaker;

import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;
import junit.framework.TestCase;

public class RecipeTest extends TestCase {
	private Recipe recipe;
	
	protected void setUp() throws Exception {
		recipe = new Recipe();
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testGetAmtChocolate() {
		assertEquals(0, recipe.getAmtChocolate());
	}
	
	public void testGetAmtCoffee() {
		assertEquals(0, recipe.getAmtCoffee());
	}
	
	public void testGetAmtMilk() {
		assertEquals(0, recipe.getAmtMilk());
	}
	
	public void testGetAmtSugar() {
		assertEquals(0, recipe.getAmtSugar());
	}
	
	public void testGetPrice() {
		assertEquals(0, recipe.getPrice());
	}
	
	public void testGetName() {
		assertEquals("", recipe.getName());
	}
	
	public void testToString() {
		assertEquals("", recipe.toString());
	}
	
	public void testSetName() {
		String fakeName = "Link";
		recipe.setName(fakeName);
		assertEquals("should set name when new name is not null", fakeName, recipe.getName());
	}
	
	public void testSetNullName() {
		String fakeName = "Link";
		recipe.setName(fakeName);
		assertEquals("should set name when new name is not null", fakeName, recipe.getName());
		recipe.setName(null);
		assertEquals("should not set name when new name is null", fakeName, recipe.getName());
	}
	
	public void testSetAmtChocolateWithPositiveNumber() {
		String fakeChocolate = "12";
		try {
			recipe.setAmtChocolate(fakeChocolate);
		} catch (RecipeException e) {
			fail("RecipeException should not be thrown");
		}
		assertEquals(12, recipe.getAmtChocolate());
	}
	
	public void testSetAmtChocolateWithNotANumberException() {
		String fakeChocolate = "abc";
		try {
			recipe.setAmtChocolate(fakeChocolate);
			fail("RecipeException should be thrown");
		} catch (RecipeException e) {
		}
		assertEquals(0, recipe.getAmtChocolate());
	}
	
	public void testSetAmtChocolateWithNegativeNumberException() {
		String fakeChocolate = "-1";
		try {
			recipe.setAmtChocolate(fakeChocolate);
			fail("RecipeException should be thrown");
		} catch (RecipeException e) {
		}
		assertEquals(0, recipe.getAmtChocolate());
	}
	
	public void testSetAmtCoffeeWithPositiveNumber() {
		String fakeAmtCoffee = "12";
		try {
			recipe.setAmtCoffee(fakeAmtCoffee);
		} catch (RecipeException e) {
			fail("RecipeException should not be thrown");
		}
		assertEquals(12, recipe.getAmtCoffee());
	}
	
	public void testSetAmtCoffeeWithNotANumberException() {
		String fakeAmtCoffee = "abc";
		try {
			recipe.setAmtCoffee(fakeAmtCoffee);
			fail("RecipeException should be thrown");
		} catch (RecipeException e) {
		}
		assertEquals(0, recipe.getAmtCoffee());
	}
	
	public void testSetAmtCoffeeWithNegativeNumberException() {
		String fakeAmtCoffee = "-1";
		try {
			recipe.setAmtCoffee(fakeAmtCoffee);
			fail("RecipeException should be thrown");
		} catch (RecipeException e) {
		}
		assertEquals(0, recipe.getAmtCoffee());
	}
	
	public void testSetAmtMilkWithPositiveNumber() {
		String fakeAmtMilk = "12";
		try {
			recipe.setAmtMilk(fakeAmtMilk);
		} catch (RecipeException e) {
			fail("RecipeException should not be thrown");
		}
		assertEquals(12, recipe.getAmtMilk());
	}
	
	public void testSetAmtMilkWithNotANumberException() {
		String fakeAmtMilk = "abc";
		try {
			recipe.setAmtMilk(fakeAmtMilk);
			fail("RecipeException should be thrown");
		} catch (RecipeException e) {
		}
		assertEquals(0, recipe.getAmtMilk());
	}
	
	public void testSetAmtMilkWithNegativeNumberException() {
		String fakeAmtMilk = "-1";
		try {
			recipe.setAmtMilk(fakeAmtMilk);
			fail("RecipeException should be thrown");
		} catch (RecipeException e) {
		}
		assertEquals(0, recipe.getAmtMilk());
	}
	
	public void testSetAmtSugarWithPositiveNumber() {
		String fakeAmtSugar = "12";
		try {
			recipe.setAmtSugar(fakeAmtSugar);
		} catch (RecipeException e) {
			fail("RecipeException should not be thrown");
		}
		assertEquals(12, recipe.getAmtSugar());
	}
	
	public void testSetAmtSugarWithNotANumberException() {
		String fakeAmtSugar = "abc";
		try {
			recipe.setAmtSugar(fakeAmtSugar);
			fail("RecipeException should be thrown");
		} catch (RecipeException e) {
		}
		assertEquals(0, recipe.getAmtSugar());
	}
	
	public void testSetAmtSugarWithNegativeNumberException() {
		String fakeAmtSugar = "-1";
		try {
			recipe.setAmtSugar(fakeAmtSugar);
			fail("RecipeException should be thrown");
		} catch (RecipeException e) {
		}
		assertEquals(0, recipe.getAmtSugar());
	}
	
	public void testSetPriceWithPositiveNumber() {
		String fakePrice = "12";
		try {
			recipe.setPrice(fakePrice);
		} catch (RecipeException e) {
			fail("RecipeException should not be thrown");
		}
		assertEquals(12, recipe.getPrice());
	}
	
	public void testSetPriceWithNotANumberException() {
		String fakePrice = "abc";
		try {
			recipe.setPrice(fakePrice);
			fail("RecipeException should be thrown");
		} catch (RecipeException e) {
		}
		assertEquals(0, recipe.getPrice());
	}
	
	public void testSetPriceWithNegativeNumberException() {
		String fakePrice = "-1";
		try {
			recipe.setPrice(fakePrice);
			fail("RecipeException should be thrown");
		} catch (RecipeException e) {
		}
		assertEquals(0, recipe.getPrice());
	}
	
	public void testHashCodeWithNameIsNull() {
		recipe.setName(null);
		int hashCode = recipe.hashCode();
		assertEquals(31, hashCode);
	}
	
	public void testHashCodeWithNameIsNotNull() {
		String fakeName = "Link";
		recipe.setName(fakeName);
		int actualHashCode = recipe.hashCode();
		int expectedHashCode = 31 * 1 + fakeName.hashCode();
		assertEquals(expectedHashCode, actualHashCode);
	}
	
	public void testEqualsSameObject() {
		assertTrue(recipe.equals(recipe));
	}
	
	public void testEqualsWithNullObject() {
		assertFalse(recipe.equals(null));
	}
	
	@SuppressWarnings("unlikely-arg-type")
	public void testNotEqualsWithDifferentClassObject() {
		String fakeObject = "I am fake obejct";
		assertFalse(recipe.equals(fakeObject));
	}
	
	public void testNotEqualsNullNameWithNotNullNameObject() {
		recipe.setName(null);
		Recipe object = new Recipe();
		object.setName("recipe");
		assertFalse(recipe.equals(object));
	}
	
	public void testNotEqualsNullNameObject() {
		recipe.setName("recipe");
		Recipe object = new Recipe();
		object.setName(null);
		assertFalse(recipe.equals(object));
	}
	
	public void testNotEqualsName() {
		recipe.setName("recipe");
		Recipe object = new Recipe();
		object.setName("recipe 2");
		assertFalse(recipe.equals(object));
	}
	
	public void testEquals() {
		recipe.setName("recipe");
		Recipe object = new Recipe();
		object.setName("recipe");
		assertTrue(recipe.equals(object));
	}
}
