package example;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public void testMultiplication() {
		Dollar five = new Dollar(5);
		assertEquals(new Dollar(10), five.times(2));		
		assertEquals(new Dollar(15), five.times(3));
	}
	
	public void assertEquals(Dollar a, Dollar b) {

	}
	
	public void testEquality() {
		assertTrue(new Dollar(5).equals(new Dollar(5)));
		assertFalse(new Dollar(6).equals(new Dollar(6)));
	}
	
	void assertTrue(Object what) {

	}

	void assertFalse(Object what) {

	}
}
