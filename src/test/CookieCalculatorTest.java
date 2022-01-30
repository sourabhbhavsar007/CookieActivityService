package test;

import org.junit.Assert;
import org.junit.Test;

import driver.Driver;

public class CookieCalculatorTest
{

   /**
    *  Tests a successful case using the cookies.csv
    */
   @Test
   public void testCookiesSuccessfulCase() {
      try {
         String[] result = Driver.calculateMostActiveCookie("/Users/sourabh.bhavsar/Desktop/tdd/CookiesService/src/driver/cookies.csv", "2018-12-09");
         Assert.assertNotNull(result);
         Assert.assertEquals(1, result.length);
         Assert.assertEquals("abc", result[0]);
      } catch (Exception e) {
         Assert.assertNull(e);
      }
   }

   /**
    * Test where input file is invalid.
    */
   @Test
   public void testCookies_when_invalidFileName() {
      try {
         String[] result = Driver.calculateMostActiveCookie("/Users/sourabh.bhavsar/Desktop/tdd/CookiesService/src/driver/cookies.csv", "2018-12-09");
      } catch (Exception e) {
         Assert.assertNotNull(e);
      }
   }

   /**
    * Tests to check when date is invalid
    */
   @Test
   public void testCookies_when_invalidDate() {
      String[] result = null;
      try {
         result = Driver.calculateMostActiveCookie("/Users/sourabh.bhavsar/Desktop/tdd/CookiesService/src/driver/cookies.csv", "2022-12-12");
      } catch (Exception e) {
         Assert.assertNull(e);
      }
      Assert.assertNotNull(result);
      Assert.assertEquals(0, result.length);
   }
}
