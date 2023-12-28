import java.util.HashMap;
import java.util.Map.Entry;
class HashMapFunction{
    public static void main(String args[]){
        HashMap<Integer,String> hashMap=new HashMap<>();
        // Functionality of put() function
        hashMap.put(1,"Priya");
        hashMap.put(2,"Rahul");
        hashMap.put(5,"Ram");
        hashMap.put(8,"Guddu");
        hashMap.put(10, "Kumar");

        // Functionality of get() function
        String result=hashMap.get(2);
        System.out.println(result);
        System.out.println(hashMap.get(1));

        // functionality of remove() function
        hashMap.remove(10);

        // Functionality of containKey() function
        hashMap.containsKey(5);

        // Functionality of entrySet() function
        System.out.println("Hash Map Entry Set is :");
        for(Entry<Integer, String> e : hashMap.entrySet()){
            System.out.println(e.getKey()+" : "+e.getValue());
        }
    }
}