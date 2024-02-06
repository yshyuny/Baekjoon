import java.util.*;

class Balloon {
    int index; // 번호
    int value; // 풍선에 적힌 값
    
    public Balloon(int index, int value) {
        this.index = index;
        this.value = value;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Deque<Balloon> dq = new ArrayDeque<>(); // LinkedList는 시간 초과 나기 때문에 ArrayDeque 사용
        StringBuilder sb = new StringBuilder();
        
        for(int i = 1; i <= n; i++) {
            int value = sc.nextInt();
            dq.add(new Balloon(i, value));
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