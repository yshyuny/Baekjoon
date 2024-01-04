import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	int sum = 0;
	int middleNum = 0;
	
	int arr[] = new int[5];

	for(int i = 0; i < arr.length; i++) { //배열 길이는 () 안붙임 ~
	 arr[i] = Integer.parseInt(br.readLine());
	 sum += arr[i];
	}

	Arrays.sort(arr);

	int avg =  sum/5;
	middleNum = arr[2];

	System.out.println(avg + "\n" + middleNum);
	
	






}}