package New.Git.Practice;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        int H = in.nextInt();
        int M = in.nextInt();
        in.close();
        if(M<45)
        {
            H--;
            M=M+15;
            if(H<0)
            {
                H=23;
            }
            System.out.println(H+" "+M);
        }
        else{
            System.out.println(H+" "+(M-45));
        }
    }
}
