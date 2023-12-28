import java.util.HashMap;
import java.util.Scanner;
class TwoSum{
    public static void main(String[] args) {
        // create result array to display index of two number
        int[] result=new int[2];

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of an array :");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.print("\nEnter the elements of an array :");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("\nEnter the targer value in an array :");
        int targer=sc.nextInt();

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0; i<n; i++){
            map.put(arr[i],i);
        }

        // if current is equal to target value
        for(int i=0; i<n; i++){
            if(arr[i]==targer && map.containsKey(0)){
                result[0]=i;
                result[1]=map.get(0);
                break;
            }
            else if(map.containsKey(targer-arr[i])){
                // if non repeating element
                if(targer-arr[i]>i){
                    result[0]=i;
                    result[1]=map.get(targer-arr[i]);
                    break;
                }
            }else{
                result[0]=-1;
                result[1]=-1;
            }
        }

        System.out.println("Two Sum index values are: [" +result[0]+","+result[1]+"]");
    }
}