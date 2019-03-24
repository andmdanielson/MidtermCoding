package pkgShape;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

public class RectangleTest {

	@Test (expected=IllegalArgumentException.class)
	public void Rectangle_Test1() throws Exception{
			
		Rectangle rec=new Rectangle(-6,5);
		
	}
	
	@Test 
	public void Rectangle_Test2(){
		boolean except=false;
		try {
			Rectangle rec=new Rectangle(6,-5);
		} catch (IllegalArgumentException e) {
			except=true;
		} catch(Exception E) {
			except=false;
		}
		assertTrue(except);
	}
	
	@Test
	public void getiLength_Test() throws Exception {
		Rectangle rec=new Rectangle(6,8);
		
		assertTrue(rec.getiLength()==8);
	}
	
	@Test
	public void setiLength_Test() throws Exception {
		Rectangle rec=new Rectangle(6,8);
		rec.setiLength(5);
		assertTrue(rec.getiLength()==5);
	}
	
	@Test
	public void getiWidth_Test() throws Exception {
		Rectangle rec=new Rectangle(10,6);
		assertTrue(rec.getiWidth()==10);
	}
	
	@Test
	public void setiWidth_Test() throws Exception {
		Rectangle rec=new Rectangle(6,6);
		rec.setiWidth(2);
		assertTrue(rec.getiWidth()==2);
	}
	
	@Test
	public void area_Test() throws Exception {
		Rectangle rec=new Rectangle(5,7);
		assertTrue(rec.area()==35);
	}
	
	@Test
	public void perimeter_Test() throws Exception {
		Rectangle rec=new Rectangle(5,7);
		assertTrue(rec.perimeter()==24);
	}
	
	@Test
	public void compareTo_test() throws Exception {
		ArrayList<Rectangle> rec=new ArrayList<Rectangle>();
		ArrayList<Rectangle> sort=new ArrayList<Rectangle>();
		
		Rectangle a=new Rectangle(4,2);
		Rectangle b=new Rectangle(2,6);
		Rectangle c=new Rectangle(7,4);
		Rectangle d=new Rectangle(5,8);
		
		rec.add(b);
		rec.add(d);
		rec.add(a);
		rec.add(c);
		
		for (Rectangle r: rec)
		{
			System.out.println(r.area());
		}
		
		System.out.println("*****************************************");
		
		sort.add(a);
		sort.add(b);
		sort.add(c);
		sort.add(d);
		
		Collections.sort(rec);
		
		for (Rectangle r: rec)
		{
			System.out.println(r.area());
		}
		
		System.out.println("*****************************************");
		
		assertEquals(rec,sort);
		
		
	}

}
