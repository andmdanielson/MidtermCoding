package pkgShape;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import pkgShape.Cuboid;

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
	
	@Test
	public void sortByVolume_test() throws Exception {
		System.out.println("Sort By Volume");
		
		Cuboid a=new Cuboid(2,3,1);
		Cuboid b=new Cuboid(3,4,1);
		Cuboid c=new Cuboid(6,8,5);
		Cuboid d=new Cuboid(18,5,12);
		
		ArrayList<Cuboid> prisms=new ArrayList<Cuboid>();
		ArrayList<Cuboid> sorted=new ArrayList<Cuboid>();
		
		prisms.add(b);
		prisms.add(d);
		prisms.add(a);
		prisms.add(c);
		
		for (Cuboid p: prisms)
		{
			System.out.println(p.volume());
		}
		
		System.out.println("*****************************************");
		
		sorted.add(a);
		sorted.add(b);
		sorted.add(c);
		sorted.add(d);
		
		Collections.sort(prisms, a.new SortByVolume());
		
		for (Cuboid p: prisms)
		{
			System.out.println(p.volume());
		}
		
		System.out.println("*****************************************");
		
		assertEquals(prisms,sorted);
	}
	
	@Test
	public void sortByArea_test() throws Exception {
		System.out.println("Sort By Surface Area");
		
		Cuboid a=new Cuboid(3,5,1);
		Cuboid b=new Cuboid(4,5,2);
		Cuboid c=new Cuboid(2,8,7);
		Cuboid d=new Cuboid(6,8,5);
		
		ArrayList<Cuboid> prisms=new ArrayList<Cuboid>();
		ArrayList<Cuboid> sorted=new ArrayList<Cuboid>();
		
		prisms.add(b);
		prisms.add(d);
		prisms.add(a);
		prisms.add(c);
		
		for (Cuboid p: prisms)
		{
			System.out.println(p.area());
		}
		
		System.out.println("*****************************************");
		
		sorted.add(a);
		sorted.add(b);
		sorted.add(c);
		sorted.add(d);
		
		Collections.sort(prisms, a.new SortByArea());
		
		for (Cuboid p: prisms)
		{
			System.out.println(p.area());
		}
		
		System.out.println("*****************************************");
		
		assertEquals(prisms,sorted);
	}


}
