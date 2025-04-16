package application;

import java.util.Locale;
import java.util.Scanner;
import entities.gradesCalc;
public class program {

	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
       Locale.setDefault(Locale.US);
     
       gradesCalc x = new gradesCalc();
              
       System.out.print("Enter the name of the student:");
       x.name = sc.nextLine();
       System.out.print("Enter the first result:");
       x.nota1 = sc.nextDouble();
       System.out.print("Enter the second result:");
       x.nota2 = sc.nextDouble();
       System.out.print("Enter the third result:");
       x.nota3 = sc.nextDouble();
       
       System.out.printf("FINAL GRADE = %.2f", x.calcGrade());
       if (x.calcGrade() >= 60) {
    	   System.out.println();
    	   System.out.println("PASS");
       } else {
    	   System.out.println();
    	   System.out.println("FAILED");
    	   System.out.printf("MISSING %.2f", x.points());
    	   System.out.print(" POINTS");
       }
       
       
       
       
       
       
       
       
       
       sc.close();
	}

}
