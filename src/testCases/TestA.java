package testCases;

import org.testng.annotations.Test;

public class TestA 
{
  @Test
  public void demo() 
  {
	  System.out.println("----------------------1st TestCase----------------------");
	  for (int i = 0; i < 10; i++) 
	  {
		  System.out.println(i+"ClassA===Hello TestNG Jenkins===");
	  }
  }
}
