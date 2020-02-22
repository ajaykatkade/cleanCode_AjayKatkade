package Interest;
import java.util.*;
import java.io.*;
public class InterestCalculation  {
	
	 Scanner sc=new Scanner(System.in);
	 PrintStream pw=new PrintStream(new FileOutputStream(FileDescriptor.out));
  double simpleinterest,compoundinterest;
  
 
void calculate(double amt,double yrs,double rate)
{
	simpleinterest=(amt * yrs*rate)/100;
    compoundinterest=amt * Math.pow(1.0+rate/100.0,yrs) - amt;
    pw.print("Simple Interest is:");
    pw.print((int) simpleinterest);
    pw.print("Compound Interest is:");
    pw.print((int) compoundinterest); 
}
    
}
