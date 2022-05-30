import java.util.*;
public class Main
{
	public static void main(String args[])
    {
        int a = 1;
        int b = 0;
        String s=null;
        int arr[]=new int[4];
        try {
            int i = a/b;
        }
        catch (ArithmeticException ex) {
            // getMessage() will print description
            // of exception(here / by zero)
            System.out.println(ex.getMessage());
        }
        System.out.println(arr[4]);//ArrayIndexOutOfBoundsException
        System.out.println(s.length());//null NullPointerException
    }
}
