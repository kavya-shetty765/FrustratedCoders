 
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
import java.util.*;
 
class FrustratedCoder{
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        
        for (int i = 0; i < n; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[i] > arr[j]) {
                    arr[j] = 99999;
                    break;
                }
            }
        }
        
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 99999) {
                sum += arr[i];
            }
        }
        
        System.out.println(sum);
    }
}