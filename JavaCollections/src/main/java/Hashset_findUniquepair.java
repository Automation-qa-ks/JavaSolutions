import java.util.HashSet;
import java.util.Scanner;

public class Hashset_findUniquepair {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int size=Integer.parseInt(sc.nextLine());
        HashSet <String> all=new HashSet<String>();

        for(int i=0;i<size;i++)
        {
System.out.println("enter value pairs");
            String input=sc.nextLine();
            all.add(sc.nextLine());

        }
        System.out.println(all.size());



    }


}
