package pkgShape;

public class Rectangle extends Shape implements Comparable<Object>{
	
	private int iWidth;
	private int iLength;
	
	public Rectangle(int width, int length) {
		this.iLength = length;
		this.iWidth = width;
	}

	public int getiWidth() {
		return iWidth;
	}

	public void setiWidth(int iWidth) {
		this.iWidth = iWidth;
	}

	public int getiLength() {
		return iLength;
	}

	public void setiLength(int iLength) {
		this.iLength = iLength;
	}
	
	public double area() {
		return iLength * iWidth;
	}
	
	public double perimeter() {
		return 2 * (iLength + iWidth);
	}
	
	@Override
	public int compareTo(Object arg0) {
		return (int) (this.area() - ((Rectangle) arg0).area());
	}
}
