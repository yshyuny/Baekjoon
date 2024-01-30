import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashSet<String> set = new HashSet<>(); 
        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String tmp = br.readLine();
            if(set.contains(tmp)){
                result.add(tmp);
            }
        }

        Collections.sort(result);

        StringBuilder sb =new StringBuilder();
        sb.append(result.size());
        System.out.println(sb);
        //System.out.println(result.size()); //배열 "리스트"의 경우 size
        StringBuilder sb1 =new StringBuilder();
        for (String s : result) {
            sb1.append(s+"\n");
        }
        System.out.println(sb1);
    }
}