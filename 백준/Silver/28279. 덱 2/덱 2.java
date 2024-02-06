import java.util.*;
import java.io.*;


/*
1 X: 정수 X를 덱의 앞에 넣는다. (1 ≤ X ≤ 100,000)
2 X: 정수 X를 덱의 뒤에 넣는다. (1 ≤ X ≤ 100,000)
3: 덱에 정수가 있다면 맨 앞의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
4: 덱에 정수가 있다면 맨 뒤의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
5: 덱에 들어있는 정수의 개수를 출력한다.
6: 덱이 비어있으면 1, 아니면 0을 출력한다.
7: 덱에 정수가 있다면 맨 앞의 정수를 출력한다. 없다면 -1을 대신 출력한다.
8: 덱에 정수가 있다면 맨 뒤의 정수를 출력한다. 없다면 -1을 대신 출력한다.
*/

public class Main {
      public static void main(String[] args) throws IOException{
          
          BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
          int N = Integer.parseInt(br.readLine());
          StringBuilder sb = new StringBuilder();
          Deque<Integer> dq = new LinkedList<>(); // 데큐 ( 양방향 )
          
           StringTokenizer st;
          for(int i =0; i <N; i++) {
             
              st = new StringTokenizer(br.readLine());
              
              switch(Integer.parseInt(st.nextToken())){
                  case 1 : dq.offerFirst(Integer.parseInt(st.nextToken())); // offer or add
                                           break;
                  case 2 : dq.offerLast(Integer.parseInt(st.nextToken()));  // offer or add
                                           break;
                  case 3 : if(dq.isEmpty()) { sb.append(-1).append("\n");}
                           else {sb.append(dq.pollFirst()).append("\n");}
                            break;
                  case 4 : if(dq.isEmpty()) { sb.append(-1).append("\n");}  //poll은 큐안에 있는 것을 빼고 출력
                           else {sb.append(dq.pollLast()).append("\n");}
                              break;
                  case 5 : sb.append(dq.size()).append("\n"); // size() 크기 ~
                              break;
                  case 6 : if(dq.isEmpty()) { sb.append(1).append("\n");}
                           else {sb.append(0).append("\n");}
                            break;
                  case 7 : if(dq.isEmpty()) { sb.append(-1).append("\n");}
                           else {sb.append(dq.peekFirst()).append("\n");}   // peek는 빼지않고 그 숫자만 출력 
                            break;
                  case 8 : if(dq.isEmpty()) { sb.append(-1).append("\n");}
                           else {sb.append(dq.peekLast()).append("\n");} 
                            break;                       
                  
              }
              
              
              
              
              
              
          }
      
      
          System.out.print(sb);
      
      }
}