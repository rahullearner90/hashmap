import java.util.*;

public class NonRepeatingChar {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String :");
        String str=sc.nextLine();

        // construction of Hash Table
        HashMap<Character,Integer> map=new HashMap<>();
        
        for(int i=0; i<str.length(); i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
            else{
                map.put(str.charAt(i),1);
            }
        }

        int result=-1;
        for(int i=0; i<str.length(); i++){
            if(map.get(str.charAt(i)) == 1){
                System.out.println("The non Repeating character index is: "+i);
                result = 1;
                break;
            }
        }

        if(result == -1){
            System.out.println("NO non-Repeating character present in the String.");
        }

    }
}
