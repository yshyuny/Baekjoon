import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int e = Integer.parseInt(br.readLine());

if(e>=90){ 

System.out.println("A");

}

else if(e>=80){ 

System.out.println("B");

}


else if(e>=70){ 

System.out.println("C");

}

else if(e>=60){ 

System.out.println("D");

}

else {
System.out.println("F");


}
} }
	