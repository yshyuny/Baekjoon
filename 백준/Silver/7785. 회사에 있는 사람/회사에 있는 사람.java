import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<String, String> map = new HashMap<String, String>();
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			String state = st.nextToken();

			if (map.containsKey(name)) {
				map.remove(name);
			} else {
				map.put(name, state);
			}
		}

		ArrayList<String> list = new ArrayList<String>(map.keySet());
		Collections.sort(list, Collections.reverseOrder());
		
		for(var li : list) {
			sb.append(li + "\n");
		}
        System.out.print(sb);
	}
}