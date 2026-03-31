public class FibonacciSeries {
    public static void main(String[] args){
        int num=10;
        int first=0;
        int second =1;

        System.out.println(num+" fibonacci series of numbers:");

        for(int i=0;i<num;i++){
            System.out.print(first +" ");
            int next= first+second;
            first=second;
            second=next;

        }

    }
    
}
