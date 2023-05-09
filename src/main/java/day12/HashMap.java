package day12;
import java.util.Iterator;
import java.util.Map;
public class HashMap {
    public static void main(String[] args)
    {
        Map<String,String> hmap =new java.util.HashMap<String,String>();
        hmap.put("Name","Manikandan");
        hmap.put("Degree","BCA");
        hmap.put("College","MAC");
        hmap.put("School","SRKBV");
        hmap.put("Place","KK");

        System.out.println(hmap.get("Name"));
        System.out.println(hmap.get("Degree"));

        System.out.println("*******");

        Iterator<String> iterator=hmap.keySet().iterator();
        while(iterator.hasNext())
        {
            String key=iterator.next();
            System.out.print(key+": ");
            System.out.println(hmap.get(key));
        }
    }
}
