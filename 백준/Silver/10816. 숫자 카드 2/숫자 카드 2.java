import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    HashMap<Integer, Integer> map = new HashMap<>(); 
	int N = Integer.parseInt(br.readLine());
	StringTokenizer st = new StringTokenizer(br.readLine());
	for(int i = 0; i < N; i++) {
	int x = Integer.parseInt(st.nextToken());

	map.put(x, map.getOrDefault(x, 0) + 1);
	}

	int M = Integer.parseInt(br.readLine());
	
	StringBuilder sb = new StringBuilder(); 
    st = new StringTokenizer(br.readLine());
	for(int i = 0; i < M; i++) {
	int y = Integer.parseInt(st.nextToken());

	sb.append(map.getOrDefault(y, 0)).append(' ');
	}
	System.out.println(sb);
}
}
