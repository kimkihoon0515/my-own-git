package New.Git.Practice;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        int a;
        a=in.nextInt();
        in.close();
        int result;
        for(int i=1;i<10;i++)
        {
            result = a *i;
            System.out.println(a+"*"+i+"="+result);
        }
    }
}
