import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test 
	public void testReverseInPlace1() {
    int[] input1 = {1,2,3};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{3,2,1}, input1); 
	}

  @Test 
	public void testReverseInPlace2() {
    int[] input1 = {1,2,3,4};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{4,3,2,1}, input1); 
	}

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed1() {
    int[] input1 = {1,2,3};
    assertArrayEquals(new int[]{3,2,1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverageWithoutLowest(){
    double[] input1 = {1.0};
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input1), 0.1);
  }

  @Test
  public void testAverageWithoutLowest1(){
    double[] input1 = {1.0, 2.0, 4.0};
    assertEquals(3.0, ArrayExamples.averageWithoutLowest(input1), 0.1);
  }

  @Test
  public void testAverageWithoutLowest2(){
    double[] input1 = {1.0, 1.0, 1.0};
    assertEquals(1.0, ArrayExamples.averageWithoutLowest(input1), 0.1);
  }
  
  @Test
  public void testAverageWithoutLowest3(){
    double[] input1 = {2,5,4,7,2,4};
    assertEquals(4.4, ArrayExamples.averageWithoutLowest(input1), 0.1);
  }

}
