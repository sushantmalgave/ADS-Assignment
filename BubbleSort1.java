import java.util.Scanner;
public class BubbleSort1 {


        Scanner sc;
        int[] a;
        static int n;
        BubbleSort1()
        {
            sc =new Scanner(System.in);
            System.out.println("Enter Size of array: ");
            n = sc.nextInt();
            System.out.println("enter Array elements");
            a = new int[n];
            int i;
            for(i=0; i<n; i++)
            {
                a[i]=sc.nextInt();
            }
            //.out.print(a[i]+" ");
        }
        public void sortingData()
        {
            for(int i=0; i<n-1; i++)  // total number of passes required is "9" for 10 elements.
            {
                for(int j=0; j<n-1-i; j++)
                {
                    if( a[j+1] > a[j] )
                    {
                        int temp=a[j];
                        a[j]=a[j+1];
                        a[j+1]=temp;
                    }
                }
            }

        }
        public void display()
        {
            //System.out.print("Input array is: "+this.a[i]);
            for(int i=0; i<n; i++)
            {
                System.out.print(a[i]+" ");
            }
        }
        public static void main(String args[])
        {
            BubbleSort1 b =new BubbleSort1();
            b.sortingData();
            b.display();
        }


}
