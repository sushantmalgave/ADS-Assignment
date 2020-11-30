import java.util.*;
class ArrayListDemo
{
    public static void main (String args[])
    {
        ArrrayList <String> strList = new ArrayList <String>();
        strList.add("Ram");
        strList.add("Shyam");
        strList.add("Sita");
        strList.add("Gita");
        strList.add("Mohit");
        System.out.println("Dispaly using for-each");
        for(String s :strList)
     {
        System.out.println(s);
     }
     
     
     
     
    }
}

