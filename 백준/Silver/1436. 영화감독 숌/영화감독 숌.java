import java.util.*;
import java.io.*;
 
public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
 
		int num = 666;
		int count = 1;
        
		while(count != N) {
			num++;
			if(String.valueOf(num).contains("666")) { //contains함수를 쓰기위해서 String.valueOf() 사용
				count++;
			}
		}
		System.out.println(num);
	}
}