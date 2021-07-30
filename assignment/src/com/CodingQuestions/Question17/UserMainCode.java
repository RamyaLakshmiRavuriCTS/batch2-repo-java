import java.util.Scanner;

public class UserMainCode {
     public static int findMaxDistance(int[] a)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int max=0,index=0;
        for(int i=0;i<n;i++)
        {
            int d=Math.abs(a[i]-a[i+1]);
            if(d>max)
            {
                max=d;
                if(a[i]>a[i+1])
                {
                    index=i;
                }
                else
                {
                    index=i+1;
                }
            }
        }
        return index;
    }}


