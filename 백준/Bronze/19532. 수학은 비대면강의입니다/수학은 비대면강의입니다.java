import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
        StringTokenizer st = new StringTokenizer(br.readLine());


        //첫번째 식
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        // 두번째 식
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());

        //각각의 x, y가 -999 <= x, y <= 999이기 때문에
        for(int i = -999; i <= 999; i++) { 
            for(int j = -999; j <= 999; j++) {
                if(a*i + b*j  == c){ // ax + by 가 C이고(x = i, y = j)
                    if(d*i + e*j  == f) { // dx + ey가 f일 때(x = i, y = j)
                        System.out.println(i + " " + j);
                        break;
                    }
                }
            }
        }
      

    }
}