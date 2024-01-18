import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	int N = Integer.parseInt(br.readLine());
	String[][] arr = new String[N][2];

	for (int i=0; i < N; i++) {
	StringTokenizer st = new StringTokenizer(br.readLine()); // String[] st = br.readLine().split(" ");
	arr[i][0] = st.nextToken(); // arr[i][0] = st[0];
	arr[i][1] = st.nextToken(); // arr[i][0] = st[1];
	}

	Arrays.sort(arr, (s1,s2)-> { 
		if(s1[0] == s2[0]) {
			return 1;  
     /*
    만약에 나이가 같다면 먼저 들어온 사람이 우선순위가 돼야 하므로 반환 값은 1
    이게 무슨 의미인가?? 
    ㄴ이거는 compare의 특성으로 만약에 양수라면 앞에 있는 s1이 먼저 정렬되고 음수이면
    ㄴs2가 먼저 정렬이 되는 형식
    */

                    
		}
		
		else {
		 return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
		}
	});

	StringBuilder sb = new StringBuilder();
	
	for(int i =0; i < N; i++) {

	sb.append(arr[i][0] + " " + arr[i][1] + "\n");
	}

	System.out.print(sb);





	}

}
	