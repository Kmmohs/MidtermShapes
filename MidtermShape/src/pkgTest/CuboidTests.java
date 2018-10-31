package pkgTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Collections;

import org.junit.jupiter.api.Test;

import pkgShape.Cuboid;

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
		
		Cuboid B = new Cuboid(2, 2, 2);
		Cuboid C = new Cuboid(3, 3, 3);
		Cuboid A = new Cuboid(1, 1, 1);
		
		ArrayList<Cuboid> arr = new ArrayList<Cuboid>(3);
		arr.add(A);
		arr.add(C);
		arr.add(B);
		
		ArrayList<Cuboid> sortedArr = new ArrayList<Cuboid>(3);
		sortedArr.add(A);
		sortedArr.add(B);
		sortedArr.add(C);
		
		Collections.sort(arr, new Cuboid.SortByArea());
		assertTrue(arr.equals(sortedArr));
		
		ArrayList<Cuboid> sortedArr2 = new ArrayList<Cuboid>(3);
		
		sortedArr2.add(new Cuboid(1,2,3));
		sortedArr2.add(C);
		sortedArr2.add(A);
		
		assertFalse(arr.equals(sortedArr2));
		
		//boolean isSortedArea = false;
//		for (Object arrElement: arr) {
//			for(Object sortedArrElement: sortedArr) {
//				if (arrElement == sortedArrElement) {
//					isSortedArea = true;
//				}
//				else {
//					isSortedArea = false;
//					break;
//				}
//			}
//		}
//		
//		assertTrue("A should be smaller than B should be smaller than C (SortByAreaTest_SurfaceArea)", isSortedArea);
		
//Does not work:
//		Arrays.deepEquals(arr,  sortedArr);
//		org.junit.Assert.assertArrayEquals(arr, sortedArr);
//		assertArrayEquals("A should be smaller than B (SortByAreaTest_SurfaceArea)", arr, sortedArr);
	}
	
	@Test
	public void SortByVolumeTest() {
		
		Cuboid B = new Cuboid(2, 2, 2);
		Cuboid C = new Cuboid(3, 3, 3);
		Cuboid A = new Cuboid(1, 1, 1);
		
		ArrayList<Cuboid> arr = new ArrayList<Cuboid>(3);
		arr.add(A);
		arr.add(C);
		arr.add(B);
		
		Collections.sort(arr, new Cuboid.SortByArea());
		
		Cuboid c1 = arr.get(0);
		Cuboid c2 = arr.get(1);
		Cuboid c3 = arr.get(2);
		
		assertTrue(c1.equals(A));
		assertTrue(c2.equals(B));
		assertTrue(c3.equals(C));
		
		//false test array
		ArrayList<Cuboid> sortedArr2 = new ArrayList<Cuboid>(3);
		
		sortedArr2.add(new Cuboid(1,2,3));
		sortedArr2.add(C);
		sortedArr2.add(A);
		
		//Switch to a simpler comparison
		assertFalse(arr.equals(sortedArr2));
		
/*		for (Object arrElement: arr) {
			for(Object sortedArrElement: sortedArr) {
				if (arrElement == sortedArrElement) {
					isSortedVol = true;
				}
				else {
					isSortedVol = false;
					break;
				}
			}
		}*/

//Does not work
//		public void SortByVolumeTest() {
//			Cuboid A = new Cuboid(1, 2, 4);
//			Cuboid B = new Cuboid(3, 1, 2);
//			assertTrue("B should be smaller than A (SortByAreaTest_SurfaceArea)", Collections.sort([A,B], new /*Cuboid.*/SortByVolume());
//	}

		//assertTrue("A should be smaller than B should be smaller than C (SortByAreaTest_SurfaceArea)", isSortedVol);
	}
}
