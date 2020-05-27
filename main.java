import java.util.Scanner;

public class main{
    public static void main (String[] args) {

    	Time t1 = new Time(8,15,30);
    	System.out.print("Initial time t1 (alternate constructor invoked) ­ military format: ");
    	t1.printMilitary();
    	System.out.print("Initial time t1 (alternate constructor invoked) ­ standard format: ");
        t1.printStandard();

        Time t2 = new Time();
        t2.setTime(0,0,0);
        System.out.print("Initial time t2 (alternate constructor invoked) ­ military format: ");
        t2.printMilitary();
        System.out.print("Initial time t2 (alternate constructor invoked) ­ military format: ");
        t2.printStandard();

        t2.setTime(9,45,35);
        System.out.print("t2 after call to setTime ­ military format: ");
        t2.printMilitary();
        System.out.print("t2 after call to setTime ­ standard format: ");
        t2.printStandard();

        
        if(t1.equals(t2))
    		System.out.println("After call to equals: times are equal.");
    	else
    		System.out.println("After call to equals: times are NOT equal.");
    	if(t1.lessThan(t2))
    		System.out.println("After call to lessThan: t1 is less than t2.");
    	else
    		System.out.println("After call to lessThan: t1 is NOT less than t2.");
    	
    	
    	
    	System.out.print("Enter hours, minutes, and seconds: ");
    	int hours;
		int minutes;
		int seconds;
	    Scanner input = new Scanner(System.in);
		hours = input.nextInt(); 
    	minutes = input.nextInt(); 
    	seconds = input.nextInt();
    	
    	t1.setTime(hours, minutes, seconds);
    	System.out.print("New time t1 after call to setTime ­ standard format: ");
    	t1.printStandard();
   		System.out.println();
  		t1.advanceSecs();
  		System.out.print("New time t1 after call to increment ­ standard format: ");
    	t1.printStandard();
    	System.out.println();
    	t2.copy(t1);
    	System.out.print("New t2 after call to copy ­ standard format: ");
    	t2.printStandard();
    	System.out.println();
    	System.out.println("Test toString for t2: " + t2);
    			
    			


        
    }
}