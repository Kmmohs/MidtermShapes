package pkgTest;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import pkgShape.Cuboid;
import pkgShape.Rectangle;

class CuboidTests {
	
	@Test
	public void constructionTest() {
		Cuboid A = new Cuboid(1, 2, 3);
		assertTrue(A instanceof Cuboid);
	}
	
	@Test
	public void getterAndSetterTest() {
		//iWidth
		Cuboid A = new Cuboid(1, 2, 3);
		assertEquals("Width should be 1 (getterAndSetterTest_getter_Width)", 1, A.getiWidth());
		A.setiWidth(2);
		assertEquals("Width should be 2 (getterAndSetterTest_setter_Width)", (Integer) 2, (Integer) A.getiWidth());
		
		//iLength
		assertEquals("Length should be 2 (getterAndSetterTest_Length_getter)", 2, A.getiLength());
		A.setiLength(1);
		assertEquals("Length should be 1 (getterAndSetterTest_Length_setter)",(Integer) 1, (Integer) A.getiLength());
		
		//iDepth
		assertEquals("Depth should be 3 (getterAndSetterTest_Depth_getter)", 3, A.getiDepth());
		A.setiDepth(4);
		assertEquals("Depth should be 4 (getterAndSetterTest_Depth_setter)",(Integer) 4, (Integer) A.getiDepth());
	}
	
	@Test
	public void areaTest() {
		Cuboid A = new Cuboid(1, 2, 3);
		assertTrue("Surface Area should be 22 (areaTest)", 22 == A.area());
	}
	
//Does not work...?
//	//Exception UnsupportedOperationException = new Exception();
//	@Test(expected = UnsupportedOperationException.class)
//	public void perimeterTest() {
//		Cuboid A = new Cuboid(1, 2, 3);
//		A.perimeter();
//		//assertThrows(A.perimeter(), new UnsupportedOperationException(), "Perimeter should be UnsupportedOperationException");
//	}
	
	@Test
	public void perimeterTest() {
		
		boolean throwsError = false;

		try {
			Cuboid A = new Cuboid(1, 2, 3);
			A.perimeter();
		}
		catch (Exception UnsupportedOperationException) {
			throwsError = true;
		}

		assertTrue(throwsError);
	}

//Does not work...?
//	@Test(expected = UnsupportedOperationException.class)
//	public void compareToTest() {
//		Cuboid A = new Cuboid(1, 2, 3);
//		Cuboid B = new Cuboid(3, 1, 4);
//		A.compareTo(B);
//		//assertThrows(A.perimeter(), new UnsupportedOperationException(), "compareTo should be UnsupportedOperationException");
//	}
	
	@Test
	public void compareToTest() {
		
		boolean throwsError = false;
		
		try {
			Cuboid A = new Cuboid(1, 2, 3);
			Cuboid B = new Cuboid(3, 1, 4);
			A.compareTo(B);
		}
		catch (Exception UnsupportedOperationException) {
			throwsError = true;
		}
		assertTrue(throwsError);
	}
	
	@Test
	public void SortByAreaTest() {
		
		Cuboid A = new Cuboid(2, 2, 3);
		Cuboid B = new Cuboid(3, 1, 4);
		
		ArrayList<Cuboid> arr = new ArrayList<Cuboid>(2);
		arr.add(A);
		arr.add(B);
		
		ArrayList<Cuboid> sortedArr = new ArrayList<Cuboid>(2);
		arr.add(A);
		arr.add(B);
		
		Collections.sort(arr, new Cuboid.SortByArea());
		
		assertArrayEquals("A should be smaller than B (SortByAreaTest_SurfaceArea)", arr, sortedArr);
	}
	
	@Test
	public void SortByVolumeTest() {
		Cuboid A = new Cuboid(1, 2, 4);
		Cuboid B = new Cuboid(3, 1, 2);
		assertTrue("B should be smaller than A (SortByAreaTest_SurfaceArea)", Collections.sort([A,B], new /*Cuboid.*/SortByVolume());
	}
}