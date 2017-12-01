/***
* Example JUnit testing class for Circle1 (and Circle)
*
* - must have your classpath set to include the JUnit jarfiles
* - to run the test do:
*     java org.junit.runner.JUnitCore Circle1Test
* - note that the commented out main is another way to run tests
* - note that normally you would not have print statements in
*   a JUnit testing class; they are here just so you see what is
*   happening. You should not have them in your test cases.
***/

import org.junit.*;

public class Circle2Test
{
   // Data you need for each test case
   private Circle2 circle2;

// 
// Stuff you want to do before each test case
//
@Before
public void setup()
{
   System.out.println("\nTest starting...");
   circle2 = new Circle2(1,1,1);
}

//
// Stuff you want to do after each test case
//
@After
public void teardown()
{
   System.out.println("\nTest finished.");
}
//
// Test a simple construction
//
@Test
public void simpleStruct(){
	Circle t = new Circle2(4,1,1);
	Assert.assertTrue( t.center.x == 4 && t.center.y == 1 && t.radius == 1);
}

//
// Test a simple intersection
//
@Test
public void simpleItersection()
{
   //circle2 = x = 1,y = 1,r = 1
   Circle2 c2 = new Circle2(3,2,1 );
   boolean inter = circle2.intersects(c2);
   Assert.assertTrue( inter == false );
}

@Test
public void simpleIntersection1(){
	Circle2 c2 = new Circle2(3,2,2);
	boolean inter = circle2.intersects(c2);
	Assert.assertTrue(inter == true);


}

/*** NOT USED
public static void main(String args[])
{
   try {
      org.junit.runner.JUnitCore.runClasses(
               java.lang.Class.forName("Circle1Test"));
   } catch (Exception e) {
      System.out.println("Exception: " + e);
   }
}
***/

}

