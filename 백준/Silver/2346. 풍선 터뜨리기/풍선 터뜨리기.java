import java.util.*;
import java.io.*;

class Balloon{
	int index;
	int value;

public Balloon(int index, int value) {
	this.index = index;
	this.value = value;
	}
}


public class Main {
	public static void main(String[] args) throws IOException {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int n = Integer.parseInt(br.readLine());

	Deque<Balloon> dq = new ArrayDeque<>(); //LinkedList는 메모리 초과로 ArrayDeque를 써야함
	StringBuilder sb = new StringBuilder();

	StringTokenizer st = new StringTokenizer(br.readLine());
	for(int i=1; i <=n; i++)  {
	
	 dq.offer(new Balloon(i, Integer.parseInt(st.nextToken())));
	}

	while(!dq.isEmpty()) {
            // 덱의 맨앞의 풍선 번호 저장
            sb.append(dq.getFirst().index + " ");
            
            // 맨앞의 풍선 꺼내서 적힌 값 변수에 저장
            int num = dq.poll().value;
            
            // 더이상 덱에 풍선이 없다면 종료
            if(dq.isEmpty()) {
                break;
            }
            
            // 풍선에 적혀있던 값이 양수인 경우 
            if(num > 0) {
                for(int i = 0; i < num - 1; i++) { // 앞에서 poll 메소드 사용해서 자동으로 -1 되었기 때문에 num보다 1 작게 이동해야 함
                    dq.addLast(dq.pollFirst());
                }
            } else {
                for(int i = 0; i < Math.abs(num); i++) {
                    dq.addFirst(dq.pollLast());
                }
            }
        }
        
        System.out.println(sb);
    }
}