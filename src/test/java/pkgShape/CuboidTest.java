package pkgShape;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuboidTest {

	@Test (expected=IllegalArgumentException.class)
	public void Cuboid_test1() throws Exception {
		Cuboid prism=new Cuboid(-5,4,8);
	}
	
	@Test (expected=IllegalArgumentException.class)
	public void Cuboid_test2() throws Exception {
		Cuboid prism=new Cuboid(5,-4,8);
	}
	
	@Test (expected=IllegalArgumentException.class)
	public void Cuboid_test3() throws Exception{
		Cuboid prism=new Cuboid(5,4,-8);
	}
	
	@Test 
	public void setiDepth_test() {
		int depth;
		try {
			Cuboid prism=new Cuboid(5,4,8);
			prism.setiDepth(2);
			depth=prism.getiDepth();
		} catch(Exception e) {
			depth=-5;
		}
		
		assertTrue(depth==2);
	}
	
	@Test 
	public void getiDepth_test() {
		int depth;
		try {
			Cuboid prism=new Cuboid(5,4,8);
			depth=prism.getiDepth();
		} catch(Exception e) {
			depth=-5;
		}
		
		assertTrue(depth==8);
	}
	
	@Test
	public void volume_test() throws Exception{
		Cuboid prism=new Cuboid(5,4,8);
		assertTrue(prism.volume()==160);
	}
	
	@Test
	public void area_test() throws Exception{
		Cuboid prism=new Cuboid(2,3,4);
		assertTrue(prism.area()==52);
	}
	
	@Test (expected=UnsupportedOperationException.class)
	public void perimeter_test() throws Exception{
		Cuboid prism=new Cuboid(5,4,8);
		prism.perimeter();
	}

}
