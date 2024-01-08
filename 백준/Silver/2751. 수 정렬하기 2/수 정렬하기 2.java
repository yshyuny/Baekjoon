/* 백준 2751번 수 정렬하기2 */
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> list = new ArrayList<>();
	
		for(int i = 0; i < N; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(list); //list에서 오름차순 정렬

		for(int i = 0; i < N; i++) { // for(int 변수명 : list) for문도 알아둘 것~
			sb.append(list.get(i)).append("\n"); //리스트에서 값 불러올때 list.get()
		}
		
		System.out.println(sb);
	}
}