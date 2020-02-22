package Interest;
import java.util.*;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;


public class Solution {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	
	 PrintStream pw=new PrintStream(new FileOutputStream (FileDescriptor.out));
 double amount;
 double InterestRate,Years;
 

   pw.print("Enter Amount");
  amount=sc.nextDouble();
   pw.print("Enter rate of interest");
   InterestRate=sc.nextDouble();
   pw.print("Enter number of years");
   Years=sc.nextDouble();
   InterestCalculation object=new InterestCalculation();
   
  object.calculate(amount, Years, InterestRate);
   
}
}
