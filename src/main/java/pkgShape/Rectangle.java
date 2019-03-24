package pkgShape;

public class Rectangle extends Shape implements Comparable{
	
	private int iWidth;
	
	private int iLength;
	
	public Rectangle(int width, int length) throws Exception {
		
		super();
		
		if ((length<=0)||(width<=0)) {
			throw new IllegalArgumentException();
		}
		
		this.iWidth=width;
		
		this.iLength=length;
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
		
		return this.iLength*this.iWidth;		
	}
	
	public double perimeter() throws Exception{
		
		return (2*this.iWidth)+(2*this.iLength);
	}
	
	@Override
	public int compareTo(Object obj) {
		
		Rectangle rec=(Rectangle) obj;
		
		int rec_1_area=(int) this.area();
		
		int rec_2_area=(int) rec.area();
		
		return rec_1_area-rec_2_area;
		
	}

}
