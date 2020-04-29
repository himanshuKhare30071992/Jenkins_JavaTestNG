package testCases;

import org.testng.annotations.Test;

public class TestB 
{
  @Test
  public void demo() 
  {
	  System.out.println("----------------------2nd TestCase----------------------");
	  for (int i = 10; i < 20; i++) 
	  {
		  System.out.println(i+"B===Hello TestNG Jenkins===");
	  }
  }
}
