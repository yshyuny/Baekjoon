import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int n = Integer.parseInt(br.readLine());
        
	    int arr[] = new int[n];
	    StringTokenizer st = new StringTokenizer(br.readLine());
        

	for(int i = 0; i < n; i++) {
	arr[i] = Integer.parseInt(st.nextToken());
	}
       
	int arrsort[] = arr.clone();
	int cnt = 0; 
	Arrays.sort(arrsort);

	HashMap<Integer, Integer> hashmap = new HashMap<>();
	for(int value : arrsort) {
	if(!hashmap.containsKey(value)) {
	hashmap.put(value, cnt);
	cnt++;
	}}
               

	StringBuilder sb = new StringBuilder();

	for(int value2 : arr) {

	 sb.append(hashmap.get(value2) + " ");
	}

	System.out.println(sb);


	}

}