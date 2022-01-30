package calculator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CookieActivityCalculator
{
   public static void calculateMostActiveCookie(final String fileName, final String date) throws IOException
   {
      String line = "";
      String delimiter = ",";
      Map<String, Integer> map = new HashMap<>();
      BufferedReader br = new BufferedReader(new FileReader(fileName));
      
      while ((line = br.readLine()) != null) {

         String[] cookie = line.split(delimiter);
         if (cookie[1].contains(date)) {
            String currentCookie = cookie[0];
            if (!map.containsKey(currentCookie)) {
               map.put(currentCookie, 0);
            }
            map.put(currentCookie, map.get(currentCookie) + 1);
         }
      }
      int maxValue = Integer.MIN_VALUE;
      ArrayList<String> maxKey = new ArrayList<>();
      for (String key : map.keySet()) {
         if (map.get(key) >= maxValue) {

            maxValue = map.get(key);
            maxKey.add(key);
         }
      }

      System.out.println("Most Active Cookies : ");
      String result[] = maxKey.toArray(new String[0]);
      for (String s : result) {
         System.out.println(s);
      }
   }
}
