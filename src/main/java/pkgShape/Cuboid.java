package pkgShape;

import java.util.Comparator;

public class Cuboid extends Rectangle implements Comparable{
	
	private int iDepth;
	
	
	public Cuboid(int width, int length, int depth) throws Exception{
		
		super(width,length);
		
		if(depth<=0) {
			throw new IllegalArgumentException();
		}
		
		this.iDepth=depth;
		
	}
	
	public int getiDepth() {
		return iDepth;
	}

	public void setiDepth(int iDepth) {
		this.iDepth = iDepth;
	}
	
	public double volume() {
		
		return getiWidth()*getiLength()*this.iDepth;
	}
	
	@Override
	public double area() {
		int length=getiLength();
		int width=getiWidth();
		int depth=this.iDepth;
		
		int surface_area=2*(length*width)+2*(length*depth)+2*(depth*width);
		
		return surface_area;
	}
	
	@Override
	public double perimeter() throws Exception{
		
		throw new UnsupportedOperationException();
		
	}
	
	@Override
	public int compareTo(Object obj) {
		
		Cuboid cube=(Cuboid) obj;
		
		int cube_1_vol=(int) this.volume();
		int cube_2_vol=(int) cube.volume();
		
		return cube_1_vol-cube_2_vol;
		
	}
	
	public class SortByArea implements Comparator<Cuboid>{
		
		SortByArea() {
			super();
		}
		
		public int compare(Cuboid one, Cuboid two) {
			return (int) (one.area()-two.area());
		}
	}
	
	public class SortByVolume implements Comparator<Cuboid>{
		
		SortByVolume(){
			
		}
		
		public int compare(Cuboid one, Cuboid two) {
			return (int) (one.volume()-two.volume());
		}
		
	}

}




