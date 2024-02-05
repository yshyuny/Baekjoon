import java.io.*;
import java.util.*;

class Main {
public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<Integer>(); //스택 생성
		int N = Integer.parseInt(br.readLine());


		for(int i = 0; i < N; i++) {
		
		int stacknum =Integer.parseInt(br.readLine());

		if(stacknum==0) {
		stack.pop();
	}

		else {


		stack.push(stacknum);
	}

}		


	int sum =0;

	for(int i = 0; i < stack.size(); i++) {


	sum +=stack.get(i);


	}
		

    System.out.println(sum);

	}
}