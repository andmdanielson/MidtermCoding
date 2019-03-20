package pkgShape;

public class Cuboid extends Rectangle{
	
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

}
