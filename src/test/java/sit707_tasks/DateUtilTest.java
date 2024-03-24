package sit707_tasks;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;


/**
 * @author Ahsan Habib
 */
public class DateUtilTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "221270936";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Seth";
		Assert.assertNotNull("Student name is null", studentName);
	}

	@Test
	public void testMaxJanuary31ShouldIncrementToFebruary1() {
		// January max boundary area: max+1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldIncrementToFebruary1 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(1, date.getDay());
	}
	
	@Test
	public void testMaxJanuary31ShouldDecrementToJanuary30() {
		// January max boundary area: max-1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldDecrementToJanuary30 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(1, date.getMonth());
	}
	
	@Test
	public void testNominalJanuary() {
		int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        DateUtil date = new DateUtil(rand_day_1_to_31, 1, 2024);
        System.out.println("testJanuaryNominal > " + date);
        date.increment();
        System.out.println(date);
	}
	
	/*
	 * Complete below test cases.
	 */
	
	@Test
	public void testMinJanuary1ShouldIncrementToJanuary2() {
	    // January min boundary area: min+1
	    DateUtil date = new DateUtil(1, 1, 2024);
	    System.out.println("Min January 1 Should Increment To January 2 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(2, date.getDay());
	    Assert.assertEquals(1, date.getMonth());
	}
	@Test
	public void testMinJanuary1ShouldDecrementToDecember31() {
	    // January min boundary area: min-1
	    DateUtil date = new DateUtil(1, 1, 2024);
	    System.out.println("Min January 1 Should Decrement To December 31 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(31, date.getDay());
	    Assert.assertEquals(12, date.getMonth());
	}
	
	/*
	 * Write tests for rest months of year 2024.
	 */
	@Test
	public void testNextDate1B() {
	    // Test case ID: 1B
	    // Given input: 1 June 1994
	    // Expected next date: 2 June 1994
	    DateUtil date = new DateUtil(1, 6, 1994);
	    System.out.println("1B: 1 June 1994 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(2, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void testNextDate2B() {
	    // Test case ID: 2B
	    // Given input: 2 June 1994
	    // Expected next date: 3 June 1994
	    DateUtil date = new DateUtil(2, 6, 1994);
	    System.out.println("2B: 2 June 1994 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(3, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}

	// Remaining test cases for calculating the next date according to the table
	@Test
	public void testNextDate3B() {
	    // Test case ID: 3B
	    // Given input: 15 June 1994
	    // Expected next date: 16 June 1994
	    DateUtil date = new DateUtil(15, 6, 1994);
	    System.out.println("3B: 15 June 1994 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void testNextDate4B() {
	    // Test case ID: 4B
	    // Given input: 30 June 1994
	    // Expected next date: 1 July 1994
	    DateUtil date = new DateUtil(30, 6, 1994);
	    System.out.println("4B: 30 June 1994 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(7, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void testNextDate5B() {
	    // Test case ID: 5B
	    // Given input: 31 June 1994
	    // Expected next date: Invalid Date
	    DateUtil date = new DateUtil(31, 6, 1994);
	    System.out.println("5B: 31 June 1994 > " + date);
	    // Should return Error
	}

	@Test
	public void testNextDate6B() {
	    // Test case ID: 6B
	    // Given input: 15 January 1994
	    // Expected next date: 16 January 1994
	    DateUtil date = new DateUtil(15, 1, 1994);
	    System.out.println("6B: 15 January 1994 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(1, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}
	@Test
	public void testNextDate7B() {
	    // Test case ID: 7B
	    // Given input: 15 February 1994
	    // Expected next date: 16 February 1994
	    DateUtil date = new DateUtil(15, 2, 1994);
	    System.out.println("7B: 15 February 1994 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(2, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void testNextDate8B() {
	    // Test case ID: 8B
	    // Given input: 15 November 1994
	    // Expected next date: 16 November 1994
	    DateUtil date = new DateUtil(15, 11, 1994);
	    System.out.println("8B: 15 November 1994 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(11, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void testNextDate9B() {
	    // Test case ID: 9B
	    // Given input: 15 December 1994
	    // Expected next date: 16 December 1994
	    DateUtil date = new DateUtil(15, 12, 1994);
	    System.out.println("9B: 15 December 1994 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(12, date.getMonth());
	    Assert.assertEquals(1994, date.getYear());
	}

	@Test
	public void testNextDate10B() {
	    // Test case ID: 10B
	    // Given input: 15 June 1700
	    // Expected next date: 16 June 1700
	    DateUtil date = new DateUtil(15, 6, 1700);
	    System.out.println("10B: 15 June 1700 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1700, date.getYear());
	}

	@Test
	public void testNextDate11B() {
	    // Test case ID: 11B
	    // Given input: 15 June 1701
	    // Expected next date: 16 June 1701
	    DateUtil date = new DateUtil(15, 6, 1701);
	    System.out.println("11B: 15 June 1701 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(1701, date.getYear());
	}

	@Test
	public void testNextDate12B() {
	    // Test case ID: 12B
	    // Given input: 15 June 2023
	    // Expected next date: 16 June 2023
	    DateUtil date = new DateUtil(15, 6, 2023);
	    System.out.println("12B: 15 June 2023 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(2023, date.getYear());
	}

	@Test
	public void testNextDate13B() {
	    // Test case ID: 13B
	    // Given input: 15 June 2024
	    // Expected next date: 16 June 2024
	    DateUtil date = new DateUtil(15, 6, 2024);
	    System.out.println("13B: 15 June 2024 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(16, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(2024, date.getYear());
	}
}
