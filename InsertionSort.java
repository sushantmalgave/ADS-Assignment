import java.util.Scanner;
public class InsertionSort {

    void insertionsort(int arr[],int n){

        int i,j,temp;
        for(i=1;i<n;i++)
        {
            temp=arr[i];
            j=i;
            while (j>0&&arr[j-1]>temp) {
                    arr[j] = arr[j-1];
                    j--;
                }

           arr[j]=temp;

        }


    }
}

class InsertionSortDemo
{
    public static void main(String []args)
    {
        int i,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter the no of elements in array");
         n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        InsertionSort is=new InsertionSort();
        is.insertionsort(arr,n);
        System.out.println();
        for(i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}