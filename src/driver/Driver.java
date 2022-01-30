package driver;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Driver
{
   public static void main(String[] args)
   {
      if (args.length < 3 || !args[1].equals("-d")){
         System.out.println("Please execute command : java Driver.java <csv-file-name> -d <date>");
         return;
      }

      try
      {
         String result[] = calculateMostActiveCookie(args[0], args[2]);

         if(result.length == 0)
         {
            System.out.println("Something went wrong, please check given inputs..!");
            return;
         }

         System.out.println("Most Active cookies : ");
         for (String s : result) {
            System.out.println(s);
         }
      }
      catch (IOException e)
      {
         System.out.println("Exception occurred : " + e.getMessage());
      }

   }

   public static String[] calculateMostActiveCookie(final String fileName, final String date) throws IOException
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

      return maxKey.toArray(new String[0]);
   }
}


