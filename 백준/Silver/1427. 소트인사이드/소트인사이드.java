import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	String s = br.readLine();
	char arr[] = s.toCharArray(); 
    //앞에 두줄 합쳐서 char arr[] = br.readLine().toCharArray();
    // toCharArray()란 String을 char 문자로 쪼개어 char배열에 순서대로 넣는 것


	Arrays.sort(arr);
 
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
 







}
}