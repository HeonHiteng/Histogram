package histogram;
import java.util.Scanner;

public class Histogram {

	public static void main(String[] args) {
		
		//Write a program that creates a histogram that allows you to visually inspect the frequency distribution of a set of values. The program will generate number randomly between 1 and 100; then produce a chart similar to the one below indicates how many input values fell in the range 1 to 10, 11 to 20, and so on. Print one asterisk for each value entered.
		
		Scanner input=new Scanner(System.in);
		final int MAXRANGE=10;
		final int MINRANGE=1;
		final int RANGE=10;
		int[] list= new int[MAXRANGE];
		for(int i=0;i<list.length;i++) {
			list[i]=0;
		}
		System.out.println("Enter a list of integer between 1 to 100");
		System.out.println("Enter an integer out of the range to stop it");
		System.out.println("Enter an integer:");
		int value=input.nextInt();
		while(value>=MINRANGE && value<=(MAXRANGE*RANGE)) {
			list[(value-1)/RANGE] = list[(value-1)/RANGE]+1;
			System.out.println("Enter an integer:");
			value = input.nextInt();
			
		}
		System.out.println("Here is your histogram.");
		for(int i=0;i<list.length;i++) {
			System.out.print(" "+(i*RANGE+1)+"-"+(i+1)*RANGE + "\t|");
			for(int j=0;j<list[i];j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
