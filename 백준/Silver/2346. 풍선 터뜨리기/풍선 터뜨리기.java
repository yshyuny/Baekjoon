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

	Deque<Balloon> dq = new ArrayDeque<>();
	StringBuilder sb = new StringBuilder();

	StringTokenizer st =new StringTokenizer(br.readLine());
	for(int i=1; i <=n; i++)  {
	
	 dq.offer(new Balloon(i, Integer.parseInt(st.nextToken())));
	}

	while(!dq.isEmpty()) {

	sb.append(dq.getFirst().index + " ");

	int num = dq.poll().value;

	if(dq.isEmpty()) {
		break;
	}

	if(num > 0) {

	for(int i=0; i < num-1; i++) {
		dq.offerLast(dq.pollFirst());
	}

	}else { 
	for(int i=0; i < Math.abs(num); i++) {
		dq.offerFirst(dq.pollLast());
	}
}
}

System.out.println(sb);
}
}
