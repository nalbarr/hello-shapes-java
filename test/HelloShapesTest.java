import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import model.Shape;
import model.Square;
import model.Triangle;

public class HelloShapesTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSquare() {
		Double expected = 4.0;
		Square shape = new Square("square1", 2.0);
		Double size = shape.getSize();
		assertEquals(size, expected);
	}

	@Test
	public void testTriangle() {
		Double expected = 2.0;
		Triangle shape = new Triangle("triangle1", 2.0, 2.0);
		Double size = shape.getSize();
		assertEquals(size, expected);
	}

}
