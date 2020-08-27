package ArrayDemo;
/*
 * Print all the palindrome numbers from an array A of size 10
 */

import java.util.Scanner;
class Array_Palindrome
{
    int a[]=new int[10];
    void input()
    {
        Scanner sc=new Scanner(System.in);
        int i;
        System.out.println("Enter ten numbers ");
        for(i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
    }

    int reverse(int n)
    {
        int r,rev=0;
        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n/=10;
        }
        return rev;
    }

    boolean palindrome(int n)
    {
        return n==reverse(n);
    }

    void display()
    {
        int i,c=0;
        System.out.println("Palindrome Numbers are ");
        for(i=0;i<a.length;i++)
        {
            if(palindrome(a[i]))
            {
                System.out.println(a[i]);
                c=1;
            }
        }
        if(c==0)
            System.out.println("None");
    }

    public static void main()
    {
        Array_Palindrome ap=new Array_Palindrome();
        ap.input();
        ap.display();
    }
}