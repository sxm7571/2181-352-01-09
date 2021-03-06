package edu.ncsu.csc326.coffeemaker;
import edu.ncsu.csc326.coffeemaker.exceptions.InventoryException;
import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;

import junit.framework.TestCase;

public class InventoryTest extends TestCase {
	
	private Inventory i1;
	private Recipe r1;
	private Inventory i2;
	private Recipe r2;
	private Recipe r3;
	private Inventory i3;
	
	private int chocolate;
    private int sugar;
    private int milk;
    private int coffee;

	protected void setUp() throws Exception {
		i1 = new Inventory();
		r1 = new Recipe();
        i2 = new Inventory();
        r2 = new Recipe();
        r3 = new Recipe();
        i3 = new Inventory();
		
		super.setUp();
	}
	
	public void getChocolate() {
		chocolate = i1.getChocolate();
		assertEquals(15, chocolate); 
	}
	
	public void getSugar() {
		sugar = i1.getSugar();
		assertEquals(15, sugar);  
	}
	
	public void getMilk() {
		milk = i1.getMilk();
		assertEquals(15, milk);
	}
	
	public void getCoffee() {
		coffee = i1.getCoffee();
		assertEquals(15, coffee);
	}
	public void testSetChocolateLTZero() {
        i1.setChocolate(-1);
        chocolate = i1.getChocolate();
        assertEquals(15,chocolate);
	}
	
	public void testSetChocolateZero() {
		i1.setChocolate(0);
        chocolate = i1.getChocolate();
        assertEquals(0,chocolate);
	}
	
	public void testSetChocolateGTZero() {
		i1.setChocolate(1);
        chocolate = i1.getChocolate();
        assertEquals(1,chocolate);
	}
	
	public void testAddChocolateInvalid() {
		// Test invalid string input. Should throw InventoryException.
        try{
            i1.addChocolate("seven");
            chocolate = i1.getChocolate();
        }
        catch(InventoryException e){

            assertNotSame("Input for chocolate must be a positive int", e);
            assertTrue("Input for chocolate must be a positive int", chocolate >= 0);
        }
	}
	
	public void testAddChocolateLTZero() {
		// Test negative value input. Should throw InventoryException.
        try{
	        i1.addChocolate("-1");
	        chocolate = i1.getChocolate();
        }
        catch(InventoryException e){
            assertTrue("Input for coffee must be a positive int", chocolate >= 0);
        }
	}
	
	public void testAddChocolateGTZero() {
        // Test valid input
        try {
			i1.addChocolate("2");
		} catch (InventoryException e) {
			fail("InventoryException should not be thrown");
		}
        
        chocolate = i1.getChocolate();
        assertEquals(17, chocolate);
	}

    public void testAddChocInvalidChar() {
        String fakeChoc = "abc";
        try {
            i1.addSugar(fakeChoc);
            fail("InventoryException should be thrown");
        } catch (InventoryException e) {
        }
        assertEquals(15, i1.getChocolate());
    }

    public void testAddChocNegative() {
        String fakeChoc = "-8";
        try {
            i1.addChocolate(fakeChoc);
        } catch (InventoryException e) {
        }
        assertEquals(15, i1.getChocolate());
    }

	public void testSetCoffeeZero() {
		// Test setting to 0
        i1.setCoffee(0);
        coffee = i1.getCoffee();
        assertEquals(0, coffee);
	}
	
	public void testSetCoffeeGTZero() {
		// Test input > 0
        i1.setCoffee(1);
        coffee = i1.getCoffee();
        assertEquals(1, coffee);
	}
	
	public void testSetCoffeeLTZero() {
        // Test input < 0
        i1.setChocolate(-1);
        coffee = i1.getCoffee();
        assertEquals(15, coffee);
	}
	
	public void testAddCoffeeInvalid() {
		// Test invalid string input. Should throw InventoryException.
        try{
            i1.addCoffee("two");
            chocolate = i1.getCoffee();
        }
        catch(InventoryException e){

            assertNotSame("Input for chocolate must be a positive int", e);
            assertTrue("Input for coffee must be a positive int", coffee >=0);
        }
	}
	
	public void testAddCoffeeLTZero() {
		// Test input < 0
        try{
            i1.addCoffee("-1");
            coffee = i1.getCoffee();
        }
        catch(InventoryException e){
            assertTrue("Units of coffee must be a positive integer", coffee == 0);
        }
	}
	
	public void testAddCoffee() {
        // Test valid input
        try {
			i1.addCoffee("2");
		} catch (InventoryException e) {
			fail("InventoryException should not be thrown");
		}
	}

    public void testAddCoffeeInvalidChar() {
        String fakeCoffee = "abc";
        try {
            i1.addSugar(fakeCoffee);
            fail("InventoryException should be thrown");
        } catch (InventoryException e) {
        }
        assertEquals(15, i1.getCoffee());
    }

    public void testAddCoffeeNegative() {
        String fakeCoffee = "-8";
        try {
            i1.addCoffee(fakeCoffee);
        } catch (InventoryException e) {
        }
        assertEquals(15, i1.getCoffee());
    }

	public void testGetCoffee() {
		coffee = i1.getCoffee();
        assertEquals(15, coffee);
	}
	
	public void testSetMilkZero() {
		// Test input = 0
        i1.setMilk(0);
        milk = i1.getMilk();
        assertEquals(0,milk);
	}
	
	public void testSetMilkGTZero() {
		// Test input > 0
        i1.setMilk(1);
        milk = i1.getMilk();
        assertEquals(1,milk);
	}
	
	public void testSetMilkLTZero() {
        // Test input < 0
        i1.setMilk(-1);
        milk = i1.getMilk();
        assertEquals(15,milk);
	}
	
	public void testAddMilkInvalid() {
		// Test invalid string input. Should throw InventoryException.
        try{
            i1.addMilk("two");
            milk = i1.getMilk();
        }
        catch(InventoryException e){

            assertNotSame("Input for milk must be a positive int",e);
            assertTrue("Input for milk must be a positive int", milk >= 0);
        }
	}
	
	public void testAddMilkLTZero() {
		// Test input < 0
        try{
            i1.addMilk("-1");
            milk = i1.getMilk();
        }
        catch(InventoryException e){
            assertTrue("Input for milk must be a positive int", milk <= 0);
        }
	}
	
	public void testAddMilk() {
        // Test valid input
        try {
			i1.addMilk("2");
		} catch (InventoryException e) {
			fail("InventoryException should not be thrown");
		}
        milk = i1.getMilk();
        assertEquals(17,milk);
	}

    public void testAddMilkInvalidChar() {
        String fakeMilk = "abc";
        try {
            i1.addSugar(fakeMilk);
            fail("InventoryException should be thrown");
        } catch (InventoryException e) {
        }
        assertEquals(15, i1.getMilk());
    }

    public void testAddMilkNegative() {
        String fakeMilk = "-8";
        try {
            i1.addMilk(fakeMilk);
        } catch (InventoryException e) {
        }
        assertEquals(15, i1.getMilk());
    }
	
	public void testSetSugarZero() {
		// Test input = 0
        i1.setSugar(0);
        sugar = i1.getSugar();
        assertEquals(0,sugar);
	}
	
	public void testSetSugarGTZero() {
		// Test input > 0
        i1.setSugar(1);
        sugar = i1.getSugar();
        assertEquals(1,sugar);
	}
	
	public void testSetSugarLTZero() {
        // Test input < 0
        i1.setSugar(-1);
        sugar = i1.getSugar();
        assertEquals(15,sugar);
	}
	
	public void testAddSugarInvalid() {
		// Test invalid string input. Should throw InventoryException
        try{
            i1.addSugar("two");
            sugar = i1.getSugar();
        }
        catch(InventoryException e){
            assertNotSame("Input for sugar ", e);
        }
	}

    public void testAddSugarInvalidChar() {
        String fakeSugar = "abc";
        try {
            i1.addSugar(fakeSugar);
            fail("InventoryException should be thrown");
        } catch (InventoryException e) {
        }
        assertEquals(15, i1.getSugar());
    }

    public void testAddSugarNegative() {
        String fakeSugar = "-8";
        try {
            i1.addSugar(fakeSugar);
        } catch (InventoryException e) {
        }
        assertEquals(7, i1.getSugar());
    }
	
	public void testAddSugarLTZero() {
		//Check for the equality operator for the lower boundary input value = -1. Expected to receive an exception message.
        try{
            i1.addSugar("-1");
            sugar = i1.getSugar();
        }
        catch(InventoryException e){
            assertTrue("Input for sugar must be a positive int", sugar == 0);
        }
	}
	
	public void testAddSugar() {
        // Test valid input
        try {
			i1.addSugar("2");
		} catch (InventoryException e) {
			fail("InventoryException should not be thrown");
		}
        sugar = i1.getSugar();
        assertEquals(17,sugar);
	}

	public void testToString() {
	    Inventory invent = new Inventory();
	    invent.setChocolate(4);
	    invent.setMilk(2);
	    invent.setSugar(3);
	    invent.setCoffee(1);

	    assertEquals("Coffee: 1\nMilk: 2\nSugar: 3\nChocolate: 4\n", invent.toString());
    }
	
	public void testEnoughIngredients() {
		r1 = new Recipe();
        i2 = new Inventory();
        String recipeName = "";
        
        int sugarNeeded = 0;
        int coffeeNeeded = 0;
        int chocolateNeeded = 0;
        int milkNeeded = 0;
        int price = 0;

        try{
            r1.setPrice("5");
            r1.setAmtSugar("25");
            r1.setAmtCoffee("20");
            r1.setAmtMilk("30");
            r1.setAmtChocolate("15");

            price = r1.getPrice();
            sugarNeeded = r1.getAmtSugar();
            milkNeeded = r1.getAmtMilk();
            chocolateNeeded = r1.getAmtChocolate();
            coffeeNeeded = r1.getAmtCoffee();

            boolean checkIngredients = i2.enoughIngredients(r1);

            assertFalse(checkIngredients);
        }
        catch(RecipeException e){
            assertTrue("Input for price must be > 0", price <= 0);
            assertTrue("Input for chocolate must be > 0", chocolateNeeded <= 0);
            assertTrue("Input for sugar must be > 0", sugarNeeded <= 0);
            assertTrue("Input for coffee must be > 0", coffeeNeeded <= 0);
            assertTrue("Input for milk must be > 0", milk <= 0);
        }


        int previoupricerice = price;

        try{
            //Check for varied string input values.
            r1.setName("Recipe2");
            recipeName = r1.getName();

            r1.setPrice("5.51");
            price = r1.getPrice();

        }
        catch(RecipeException e){
            assertEquals("Recipe2", recipeName);
            assertEquals(previoupricerice, price);
        }

        try{
            //Check varying string input values
            r1.setName("Recipe3");
            recipeName = r1.getName();

            r1.setPrice("3/4");
            price = r1.getPrice();

            assertEquals(0, price);
            assertEquals("Recipe3", recipeName);

        }
        catch(RecipeException e){
            assertEquals("Recipe3", recipeName);
            assertEquals(previoupricerice, price);
        }

        try{
            //Check for values within the current inventory limits.
            r1.setName("Recipe4");
            r1.setPrice("10");
            r1.setAmtSugar("2");
            r1.setAmtCoffee("5");
            r1.setAmtMilk("3");
            r1.setAmtChocolate("1");

            recipeName = r1.getName();
            price = r1.getPrice();
            sugarNeeded = r1.getAmtSugar();
            milkNeeded = r1.getAmtMilk();
            chocolateNeeded = r1.getAmtChocolate();
            coffeeNeeded = r1.getAmtCoffee();

            boolean check2 = i2.enoughIngredients(r1);
            assertTrue(check2);  //Recipe does not require more quantity than available inventory for each item.

        }
        catch(RecipeException e){
            assertEquals("Recipe4",recipeName);
            assertTrue("Input for price must be > 0", price <=0 );
            assertTrue("Input for chocolate must be > 0",chocolateNeeded<=0);
            assertTrue("Input for sugar must be > 0", sugarNeeded <= 0);
            assertTrue("Input for coffee must be > 0", coffeeNeeded <= 0);
            assertTrue("Input for milk must be > 0", milkNeeded <= 0);
        }
	}
	
	public void testUseIngredients() {
        r2.setName("Recipe1");
        String recipeName = r2.getName();
        int price = 0;
        int milk = 0;
        int chocolate = 0;
        int coffee = 0;
        int sugar = 0;

        try{
            r2.setPrice("9");
            price = r2.getPrice();

            r2.setAmtMilk("5");
            milk = r2.getAmtMilk();

            r2.setAmtChocolate("10");
            chocolate = r2.getAmtChocolate();

            r2.setAmtCoffee("5");
            coffee = r2.getAmtCoffee();

            r2.setAmtSugar("4");
            sugar = r2.getAmtSugar();

            boolean check01 = i1.enoughIngredients(r2);
            assertTrue(check01);

            boolean check02 = i1.useIngredients(r2);
            assertTrue(check02);
        }
        catch(RecipeException e){
            assertEquals("Recipe1",recipeName);
            assertTrue("Input for price must be > 0", price <= 0);
            assertTrue("Input for chocolate must be > 0", chocolate <= 0);
            assertTrue("Input for sugar must be > 0", sugar <= 0);
            assertTrue("Input for coffee must be > 0", coffee <= 0);
            assertTrue("Input for milk must be > 0", milk <= 0);
        }

	}
	
	public void testUseIngredientsNoChange() {
		r3 = new Recipe();
        i3 = new Inventory();

        r3.setName("Recipe2");
        String recipeName2 = r2.getName();
        int price2 = 0;
        int milk2 = 0;
        int chocolate2 = 0;
        int coffee2 = 0;
        int sugar2 = 0;

        try{
            r3.setPrice("9");
            price2 = r3.getPrice();

            r3.setAmtMilk("500");
            milk2 = r3.getAmtMilk();

            r3.setAmtChocolate("100");
            chocolate2 = r3.getAmtChocolate();

            r3.setAmtCoffee("500");
            coffee2 = r3.getAmtCoffee();

            r3.setAmtSugar("400");
            sugar2 = r3.getAmtSugar();

            boolean check01 = i3.enoughIngredients(r3);
            assertFalse(check01);

            boolean check02 = i3.useIngredients(r3);
            assertFalse(check02);
        }
        catch(RecipeException e){
            assertEquals("Recipe2",recipeName2);
            assertTrue("Input for price must be > 0", price2 <= 0);
            assertTrue("Input for chocolate must be > 0", chocolate2 <= 0);
            assertTrue("Input for sugar must be > 0", sugar2 <= 0);
            assertTrue("Input for coffee must be > 0", coffee2 <= 0);
            assertTrue("Input for milk must be > 0", milk2 <= 0);
        }
	}
	
	public void testR2Price() {
		// Test for correct ingredient values after using them
	    assertEquals(0,r2.getPrice());
	}
	
	public void testI1Milk() {
		assertEquals(15,i1.getMilk());
	}
	
	public void testI1Choc() {
		assertEquals(15,i1.getChocolate());
	    
	}
	
	 public void testI1Sugar() {
		 assertEquals(15,i1.getSugar());
		    
	 }
	 
	 public void testI1Coffee() {
		 assertEquals(15,i1.getCoffee());
	 }
	 
	 public void testR3Price() {
			// Test for correct ingredient values after using them
		    assertEquals(0,r3.getPrice());
		}
		
		public void testI3Milk() {
			assertEquals(15,i3.getMilk());
		}
		
		public void testI3Choc() {
			assertEquals(15,i3.getChocolate());
		    
		}
		
		 public void testI3Sugar() {
			 assertEquals(15,i3.getSugar());
			    
		 }
		 
		 public void testI3Coffee() {
			 assertEquals(15,i3.getCoffee());
		 }

}

