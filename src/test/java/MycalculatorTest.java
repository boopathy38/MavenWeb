import static org.junit.Assert.*;

import org.junit.Test;

import com.jenk.Mycalculator;

public class MycalculatorTest {

	@Test
	public void test1() {
		assertEquals(10, new Mycalculator().getSum(5,5));
		
	}
	@Test
	public void test2() {
		assertEquals(5, new Mycalculator().getSum(2,3));
		
	}
	
	@Test
	public void test3() {
		assertEquals(5, new Mycalculator().getDiff(10,5));
		
	}
	@Test
	public void test4() {
		assertEquals(0, new Mycalculator().getDiff(5,5));
		
	}
}
