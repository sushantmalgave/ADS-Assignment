import java.util.Scanner;

public class FactRrcursion {

public static int FactNo(int num)
{
if(num<=0)
    return 0;
else
    return num*(num-1);
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        System.out.println(FactNo(num));

    }
}
