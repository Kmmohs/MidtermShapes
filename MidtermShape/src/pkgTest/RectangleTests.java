package pkgTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;

import pkgShape.Rectangle;

class RectangleTests {
	
	@Test
	public void constructionTest() {
		Rectangle A = new Rectangle(1, 2);
		assertTrue(A instanceof Rectangle);
	}
	
	@Test
	public void getterAndSetterTest() {
		//iWidth
		Rectangle A = new Rectangle(1, 2);
		assertEquals(1, A.getiWidth());
		A.setiWidth(2);
		assertEquals("Width should be 1 (getterAndSetterTest_Width)", (Integer) 2, (Integer) A.getiWidth());
		
		//iLength
		assertEquals(2, A.getiLength());
		A.setiLength(1);
		assertEquals("Length should be 1 (getterAndSetterTest_Length)",(Integer) 1, (Integer) A.getiLength());
	}
	
	@Test
	public void areaTest() {
		Rectangle A = new Rectangle(3, 2);
		assertTrue("Area should be 6 (areaTest)", 6 == A.area());
	}
	
	@Test
	public void perimeterTest() {
		Rectangle A = new Rectangle(3, 2);
		assertTrue("Perimeter should be 10 (perimeterTest)", 10 == A.perimeter());
	}
	
	@Test
	public void compareToTest() {
		Rectangle A = new Rectangle(2, 3);
		Rectangle B = new Rectangle(3, 4);
		assertTrue("A should be smaller than B (compareToTest)", A.compareTo(B) <= -1);
	}
}
