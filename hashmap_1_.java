
import java.util.*;

public class hashmap_1_ {
    public static void main(String[] args) {
        //syntax
        Map<String,Integer> mp=new HashMap<>();
        //Adding Elements
        mp.put("sudarshan", 19);
        mp.put("dhruv", 18);
        mp.put("love", 17);
        mp.put("sagar", 20);
        //Getting values of a key 
        System.out.println(mp.get("sudarshan"));//19
        System.out.println(mp.get("adi"));//null 
        //changing/updating value of a key
        mp.put("love",19);
        //remove pair 
        mp.remove("love");//it is remove
        mp.remove("dog");//null
        //checking if a key present
        System.out.println(mp.size());
        System.out.println(!mp.containsKey("sudarshan"));//true
        System.out.println(mp.containsKey("love"));//false
        //Adding a new entry only if the new key doesn't exist already
        mp.putIfAbsent("love", 19);//will enter
        mp.putIfAbsent("sudarshan", 19);//not enter 
        //get all keys
        System.out.println(mp.keySet());
        //get all values
        System.out.println(mp.values());
        //get all entries
        System.out.println(mp.entrySet());
        //traversing all entries 
        for(String key :mp.keySet()){
            System.out.printf("Age of %s is %d\n",key ,mp.get(key));
        }
    }
}
