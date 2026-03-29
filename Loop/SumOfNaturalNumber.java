import java.util.Scanner;
class SumOfNaturalNumber{

public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);	
	System.out.println("Enter natural no. to give sum : ");
	int num=sc.nextInt();  // initalization	
	int temp=num;  // num is replaceable so stored in local variable(temp)
	int i=1;
	int sum=0;
	
	
	while(i<=temp)// condition
	
	{      sum=sum+i;
		i++;  // upadation
	}
		System.out.println("Sum of first "+temp+" natural no.is:"+sum);
}
}