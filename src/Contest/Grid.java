package Contest;

import java.util.Scanner;

public class Grid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t,n,m,i,j,k,l,flag=0;
        // Test case
        t = sc.nextInt();
        while(t-->0)
        {
            n = sc.nextInt();
            m = sc.nextInt();
            int a[][] = new int[n][m];
            // Input
            for(i=0;i<n;i++)
            {
                for(j=0;j<m;j++)
                {
                    a[i][j] = sc.nextInt();
                }
            }
            // Logic
            for(i=0;i<n;i++)
            {
                for(j=0;j<m;j++)
                {
                    if(a[i][j]==0)
                    {
                        flag=1;
                        break;
                    }
                }
                if(flag==1)
                {
                    break;
                }
            }
            if(flag==1)
            {
                System.out.println("YES");
                break;
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}
