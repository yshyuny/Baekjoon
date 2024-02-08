import java.util.*;
import java.io.*;


public class Main {
	public static void main(String[] args) throws IOException {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int n = Integer.parseInt(br.readLine());
	Deque<Integer> dq = new ArrayDeque<>();
	StringBuilder sb = new StringBuilder();
	
	StringTokenizer st = new StringTokenizer(br.readLine());
	int[] arr = new int[n];
	for(int i = 0; i < n; i++) {
		arr[i] = Integer.parseInt(st.nextToken());
	}
	
	st = new StringTokenizer(br.readLine());

	for(int i = 0; i < n; i++){
            int tmp = Integer.parseInt(st.nextToken());
            if(arr[i] == 0){
                dq.offer(tmp);
            } 
        }

	int m = Integer.parseInt(br.readLine());

	st = new StringTokenizer(br.readLine());
	for(int i = 0; i < m; i++) {
		dq.offerFirst(Integer.parseInt(st.nextToken()));
		sb.append(dq.pollLast()+" ");
	}
	   System.out.println(sb);
	}	
}	
	
	
	