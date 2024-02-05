import java.io.*;
import java.util.*;

public class Main {
 
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		Deque<Integer> q = new ArrayDeque<>();
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		while(N-- > 0) {
			st = new StringTokenizer(br.readLine()," ");	 
			
			switch(st.nextToken()) {

			case "push" : 
            // offer는 큐의 맨 뒤에 요소를 추가한다.
			q.offer(Integer.parseInt(st.nextToken()));
			break;
			
			case "pop" : 
                 /*
				 *  poll은 가장 앞에 있는 요소를 삭제하며
				 *  삭제할 원소가 없을 경우 예외를 던지는 것이 아닌 null을 반환한다.
				 */
			if(q.isEmpty())
			sb.append(-1).append("\n");
			else 
			sb.append(q.poll()).append("\n");
			break;
			

			case "size" : 
			sb.append(q.size()).append("\n");
            break;        
                  
			case "empty" : 
			if(q.isEmpty())
			sb.append(1).append("\n");
			else 
			sb.append(0).append("\n");
			break;
			


			case "front" :
            // peek()은 큐에 꺼낼 요소가 없을 경우 null을 반환한다.
			if(q.isEmpty())
			sb.append(-1).append("\n");
			else 
			sb.append(q.peek()).append("\n");
			break;
			

			 

			case "back" : 
             // peekLast()은 큐에 꺼낼 요소가 없을 경우 null을 반환한다.
			if(q.isEmpty())
			sb.append(-1).append("\n");
			else 
			sb.append(q.peekLast()).append("\n");
			break;
			}
		}
		System.out.println(sb);
	}
}