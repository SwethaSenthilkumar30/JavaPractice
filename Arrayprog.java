package basics;
import java.util.*;

public class Arrayprog {
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);

	        int n = scan.nextInt();
	        int[] arr = new int[n];

	        for (int i = 0; i < n; i++) {
	            arr[i] = scan.nextInt();
	        }

	        int index = 0;

	        for (int i = 1; i < n; i++) {
	            if (arr[i] != arr[index]) {
	                index++;
	                arr[index] = arr[i];
	            }
	        }

	        for (int i = 0; i <= index; i++) {
	            System.out.print(arr[i] + " ");
	        }

	        scan.close();
	    }
	
	

}
