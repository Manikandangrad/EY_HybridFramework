package day12;

import java.util.Iterator;
import java.util.Map;

public class TreeMap {
    public static void main(String[] args)
    {
        Map<String,String> tmap=new java.util.TreeMap<String,String>();
        tmap.put("Name","Manikandan");
        tmap.put("Degree","BCA");
        tmap.put("College","MAC");
        tmap.put("School","SRKBV");
        tmap.put("Place","KK");

        Iterator<String> iterator=tmap.keySet().iterator();
        while(iterator.hasNext())
        {
            String key=iterator.next();
            System.out.print(key+": ");
            System.out.println(tmap.get(key));
        }
    }
}
