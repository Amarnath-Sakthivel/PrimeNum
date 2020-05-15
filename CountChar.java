import java.lang.reflect.Array;
import java.util.*;

public class CountChar {
    static String CountChar(int input1) {

        String s = String.valueOf(input1);
        char[] arr = s.toCharArray();
        String primeNumbers="", duplicate="";
        int sum=0,count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='2' || arr[i]=='3' || arr[i]=='5' || arr[i]=='7') {
                    primeNumbers += arr[i];
                    sum+=(Character.getNumericValues(arr[i]));
                }
                else{
                    count++;
                    }
        }
        if(count==arr.length) {
            System.out.println(arr[0]+":"+arr[(arr.length)-1]);  // print first : last character
        }
        else {
            System.out.println(primeNumbers+":"+String.valueOf(sum));
           }
        return null;

        }
        public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("input1:");
        int input1=sc.nextInt();
        CountChar(input1);
        }
    }






















