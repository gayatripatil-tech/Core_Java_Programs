class RevesreOfNo{
public static void main (String [] args)
{
    int num= 45;
    System.out.println("The number is "+num);
    int temp=num;
    int rev=0;

    while(num!=0){

        int digit = num%10;
         rev= rev*10+digit;
         num= num/10;

    }
    System.out.println("Given num is "+ temp +" the reverse of a given number is : " + rev);

}    

}