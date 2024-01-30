import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        HashMap<Integer, String> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        for(int i = 1; i <= n; i++) {
            String name = br.readLine();
            map1.put(i, name);
            map2.put(name, i);
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= m; i++) {
                String digit = br.readLine();
                if(isNum(digit)) {
                    sb.append(map1.get(Integer.parseInt(digit)) + "\n");     
                }else {
                    sb.append(map2.get(digit)+"\n");
                }
        }
        
            System.out.println(sb);
            
            
            
        }
        
        public static boolean isNum(String str) {
            for (int i = 0; i < str.length(); i++) {
                if(!Character.isDigit(str.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
        
}
        
        
        
        /*
        while(m --> 0) {
			String findStr = br.readLine();
			if(isStringNumber(findStr)) { // 숫자(인덱스)를 입력받은 경우
				int index = Integer.parseInt(findStr);
				sb.append(nameArr[index]);
			}
			else {	// 문자를 입력받은 경우
				sb.append(nameMap.get(findStr));
			}
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
	    }
        
        
        public static boolean isStringNumber(String s) {
	   try {
	       Double.parseDouble(s); // 문제는 정수만 받으니 Integer.parseInt(s); 가능
	       return true;
	   }
	   catch (NumberFormatException e) {
	       return false;
	   }
	}
}
        
        */