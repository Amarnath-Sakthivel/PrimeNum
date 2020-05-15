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
                }
            else if(arr[i]!='2' || arr[i]!='3' || arr[i]!='5' || arr[i]!='7'){
                count++;
            }

        }
        if(count==arr.length) {
            System.out.println(arr[0]+":"+arr[(arr.length)-1]);  // print first : last character
        }


        else {
            char[] array=primeNumbers.toCharArray();
            int len=array.length;
            for (int i = 0; i < len; i++)
        {
            for (int j = i+1; j < len; j++)
            {
                if(array[i] == array[j])
                {
                    array[j] = array[len-1];
                    len--;
                    j--;
                }
            }
        }
        char[] array1 = Arrays.copyOf(array, len);
            for (int i = 0; i < array1.length; i++)
        {
            duplicate+=array1[i];
            sum+=(Character.getNumericValue(array[i]));    // change character to numerical value and sum it.
        }
            System.out.println(duplicate+ ":" + String.valueOf(sum)); // print prime numbers : its sum

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






















