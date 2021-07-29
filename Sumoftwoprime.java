import java.util.*;
import java.lang.*;
import java.io.*;
class Sumoftwoprime
{
    static int N=1000005;
    public static int prime[]=new int[N];
    public static void sieve()
    {
        for(int i=0;i<N;i++)
        {
            prime[i]=1;
        }
        prime[0]=0;
        prime[1]=0;
        for(int x=2;x*x<N;x++)
        {
            if(prime[x]==1)
            {
                for(int i=x*x;i<N;i+=x)
                {
                    prime[i]=0;
                }
            }
        }
    }
    public static void main(String args[]) throws java.lang.Exception
    {
        sieve();
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            int c=0;
            if(n%2==0)
            for(int i=2;i<n;i++)
            {
                if((prime[i]==1) && (prime[n-i]==1))
                {
                c=1;
                break;
                }
            }
            if(c==1)
            System.out.println("Deepa");
            else
            System.out.println("Arjit");
            t--;
        }
    }
}

output:

2
4
Deepa
8
Deepa
