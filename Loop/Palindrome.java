public class Palindrome {
    public static void main(String[] args) {
        int num=552 ;
        int temp=num;
        int reverse= 0;

        while(num!=0){
            int digit= num%10;
            reverse = reverse*10+ digit;
            num=num/10;
        }
        if(temp==reverse) // main condition 
            {
            System.out.println(" The given number "+ temp+" is a Palidrome" );
        }
        else{
            System.out.println("the given number: "+temp+ " is not a Palindrome" );
        }
    }
    
}
