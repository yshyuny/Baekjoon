import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		Queue<Integer> q = new LinkedList<Integer>();
		Stack<Integer> st = new Stack<>();
		
		StringTokenizer stz = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			q.offer(Integer.parseInt(stz.nextToken()));
		}

		int start = 1;


		while(!q.isEmpty()) { 
			if(q.peek() == start) {
				q.poll(); 
				start++;
			}
			else if(!st.isEmpty() && st.peek() == start) {

				st.pop();
                start++;
			}
			else {
			 st.push(q.poll());
			
			}
		}

		while(!st.isEmpty()) {

		if(st.peek() == start) {
		 st.pop();
		 start++;
		}
		else{
		 System.out.println("Sad");
		return;
		}
	}

 System.out.println("Nice");
		



		


}

}
