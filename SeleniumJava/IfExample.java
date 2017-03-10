package SeleniumJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfExample {

	public static void main(String[] args) throws NumberFormatException, IOException {

		InputStreamReader r=new InputStreamReader(System.in);  
		BufferedReader br=new BufferedReader(r);  
		System.out.println("Plese Enter Your ATM Pin Number....");
		int mPin=Integer.parseInt(br.readLine());
		int bpin=1234;
		
		if(mPin==bpin)
		{
			System.out.println("Please WithDraw you amount");
		}
		else
		{
			System.out.println("Please check ur pin ");
		}		
		

	}

}