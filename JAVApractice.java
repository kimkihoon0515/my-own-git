package New.Git.Practice;

import java.util.Scanner;

public class JAVApractice {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int a;
        a=in.nextInt();
        int sum;
        for(int i=0;i<a;i++)
        {
            int b,c;
            b=in.nextInt();
            c=in.nextInt();
            sum=b+c;
            System.out.println(sum);
        }
        in.close();
    }
}
