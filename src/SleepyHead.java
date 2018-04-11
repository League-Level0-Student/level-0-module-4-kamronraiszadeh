//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday=false;
        boolean     isVacation=false;
        
        /*
         * Ask the user for these values using
         JOptionPane.showConfirmDialog(null, "is it a weekday?", "",
         * JOptionPane.YES_NO_OPTION);
         */
    int answer = JOptionPane.showConfirmDialog(null, "is it a weekday");
  
    if (answer==0) {
		isWeekday=true;
	}
    else if (answer==1) {
    	isWeekday=false;
	}
   
     answer = JOptionPane.showConfirmDialog(null, "is it a vacation");
    
     if (answer==0) {
		isVacation=true;
	}
     
     else if (answer==1) {
    	 isVacation=false;
	}
     
     if (isVacation||!isWeekday) {
		System.out.println("sleep in");
	}
     
     else if (isWeekday) {
		System.out.println("get up lazy bones");
	}
     
     else if (isVacation) {
		System.out.println("sleep in");
	}
    /*
         * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!” If it is a weekday, and we are on vacation,
         * print “sleep in”.
         */
    }
}
