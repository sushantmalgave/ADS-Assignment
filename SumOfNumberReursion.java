import java.util.*;
public class SumOfNumberReursion {

    public static int sumOfNumber(int num)
    {
        if(num<0)
        {
            return 0;
        }
        else
            return num+sumOfNumber(num-1);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        System.out.println(sumOfNumber(num));


    }
}