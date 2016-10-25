import java.io.*;
import java.util.Scanner;

public class Runner
	{
	
		
		public static void main(String[] args) throws FileNotFoundException
			{
				Scanner file = new Scanner( new File( "creditCardNumbers.txt" ) );
				
				for(int i = 0; i< 100; i++){
				long num = file.nextLong();
				System.out.println(num);
					while(num > 0) {
					long digit = num % 10;
					digit = num / 10;
					digit = num %10;
					System.out.println(digit);
					digit = num % 10;
					
					System.out.println(digit);
					break;
	

				
			}
				}
			
	}
		public static void stepOne() throws FileNotFoundException
			{
			Scanner file = new Scanner( new File( "creditCardNumbers.txt" ) );
			long numSelection = file.nextLong();
			while(numSelection > 0) {
				long digit = numSelection % 10;
				digit = digit /10;
				System.out.println(digit);
				break;
			}
			
			
			
		}
}
		
