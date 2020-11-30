import java.util.Scanner;

public class TowerOfHanoi{

    public static void TowerOFHanoi(int n,int src,int dest,int mid)
    {
        if(n==1)
        {
            System.out.println("Disks from "+ src+ " +to "+ dest);
        }
        else
        {
            TowerOFHanoi(n-1,src,dest,mid);
            System.out.println("Disk are:"+n+" from " +src+" to "+dest);
            TowerOFHanoi(n-1,mid,src,dest);
        }

    }
    public static void main(String []args)
    {
     Scanner sc=new Scanner(System.in);
     int disk=sc.nextInt();
     TowerOFHanoi(disk,5,7,6);
    }
}
