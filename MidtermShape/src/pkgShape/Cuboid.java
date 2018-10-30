package pkgShape;

import java.util.Comparator;

public class Cuboid extends Rectangle implements Comparable<Object>{

	private int iDepth;

	public Cuboid(int width, int length, int depth) {
		super(width, length);
		this.iDepth = depth;
	}

	public int getiDepth() {
		return iDepth;
	}

	public void setiDepth(int iDepth) {
		this.iDepth = iDepth;
	}

	public double volume() {
		double volume = iDepth * super.area();
		return volume;
	}

	@Override
	public double area() {
		return (super.area()*2 + getiLength() * iDepth * 2 + getiWidth() * iDepth * 2);
	}
	
	@Override
	public double perimeter() throws UnsupportedOperationException {
		throw new UnsupportedOperationException("A Cuboid has no Perimeter");
	}
	
	@Override
	public int compareTo(Object o) throws UnsupportedOperationException{
		throw new UnsupportedOperationException("Must specify by Volume or by Surface Area");
	}
	
	public class SortByArea implements Comparator<Cuboid>{
		
		//public SortByArea() {}
		//could not see in unit tests because of default constructor package restrictions, but changing it also did nothing
		SortByArea() {}
		
		@Override
		public int compare(Cuboid arg0, Cuboid arg1) {
			
			if (arg0.area() > arg1.area()) {
				return 1;
			}
			else if (arg0.area() < arg1.area()) {
				return -1;
			}
			else {
				return 0;
			}
			
		}
	}
	
	public class SortByVolume implements Comparator<Cuboid>{
		
		//public SortByVolume(){}
		//could not see in unit tests because of default constructor package restrictions, but changing it also did nothing
		SortByVolume() {}
		
		@Override
		public int compare(Cuboid o1, Cuboid o2) {
			
			if (o1.volume() > o2.volume()) {
				return 1;
			}
			else if (o1.volume() < o2.volume()) {
				return -1;
			}
			else {
				return 0;
			}
			
		}
	}
	
}
