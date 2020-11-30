import java.util.Scanner;
public class BubbleSort {

    public static void main(String []args)
    {
        int i,n ,temp,j;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the elements in array");
        n=sc.nextInt();
        int array[]=new int[n] ;
        System.out.println("Enter the array elements");
            for(i=0;i<n;i++)
            {
                array[i]=sc.nextInt();
            }
            for(i=0;i<n;i++)  //outer loop is for no of passes
            {
                for(j=0;j<n-i-1;j++) //inner loop is executed every [ass
                {
                    if(array[j]>array[j+1])
                    {
                        temp=array[j];
                        array[j]=array[j+1];
                        array[j+1]=temp;

                    }

                }
            }

            for(i=0;i<n;i++) {
                System.out.print(array[i]+" ");
            }

    }

}
