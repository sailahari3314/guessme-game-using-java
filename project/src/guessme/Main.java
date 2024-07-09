package guessme;
import java.util.Random;
import java.util.Scanner;
public class Main {

	public static void main(String args[]) {
		System.out.println("Welcome to Wonderland!");
		System.out.println("May I have your name: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println("Hello "+name);
		System.out.println("Shall we start");
		System.out.println("\t1.Yes");
		System.out.println("\t2.No");
		
		int choice = sc.nextInt();
		
		while(choice!=1) {
			System.out.println("Shall we start");
			System.out.println("\t1.yes");
			System.out.println("\t2.no");
			choice=sc.nextInt();
			
		}
		
		Random random=new Random();
			int x=random.nextInt()+1;
			System.out.println("please guess the number: ");
		    int userinput=sc.nextInt();
		    int timesTried=0;
		    boolean hasWon=false;
		    boolean shouldFinish=false;
		    while(!shouldFinish)
		    {
		    	timesTried++;
		    	
		    	if(timesTried<5) {
		    		if(userinput==x) {
		    			hasWon=true;
		    			shouldFinish=true;
		    		}else if(userinput>x) {
		    			
		    			System.out.println("guess lower");
		    			userinput=sc.nextInt();
		    		}else {
		    			System.out.println("guess higher");
		    			userinput=sc.nextInt();
		    		}
		    		
		    	}
		    	else {
		    		
		    		shouldFinish=true;
		    	}
		    	
		    }
		    if(hasWon) {
		    	System.out.println("Congrats!you have guessed");
		    }
		    else {
		    	System.out.println("game over");
		    	System.out.println("the number was:"+x);
		    }
	}
	
}
