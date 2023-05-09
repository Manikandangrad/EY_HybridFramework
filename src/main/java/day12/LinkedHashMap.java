package day12;

import java.util.Iterator;
import java.util.Map;

public class LinkedHashMap {
    public static void main(String[] args)
    {
        Map<String,String> lhmap=new java.util.LinkedHashMap<String,String>();
        lhmap.put("Name","Manikandan");
        lhmap.put("Degree","BCA");
        lhmap.put("College","MAC");
        lhmap.put("School","SRKBV");
        lhmap.put("Place","KK");

        Iterator<String> iterator=lhmap.keySet().iterator();
        while (iterator.hasNext())
        {
            String key=iterator.next();
            System.out.print(key+": ");
            System.out.println(lhmap.get(key));
        }
    }
}
