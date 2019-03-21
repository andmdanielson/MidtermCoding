package pkgShape;

import static org.junit.Assert.*;

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

}
