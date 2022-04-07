package Practice;

import java.util.Stack;

public class MinimaSubarray {
    static class pair
    {
        int first, second;
        public pair(int first, int second)
        {
            this.first = first;
            this.second = second;
        }
    }
    static int sumSubarrayMins(int A[], int n)
    {
        int []left = new int[n];
        int []right = new int[n];

        Stack<pair> s1 = new Stack<pair>();
        Stack<pair> s2 = new Stack<pair>();

        // getting number of element strictly larger
        // than A[i] on Left.
        for (int i = 0; i < n; ++i)
        {
            int cnt = 1;

            // get elements from stack until element
            // greater than A[i] found
            while (!s1.isEmpty() &&
                    (s1.peek().first) > A[i])
            {
                cnt += s1.peek().second;
                s1.pop();
            }

            s1.push(new pair(A[i], cnt));
            left[i] = cnt;
        }

        // getting number of element larger
        // than A[i] on Right.
        for (int i = n - 1; i >= 0; --i)
        {
            int cnt = 1;

            // get elements from stack until element
            // greater or equal to A[i] found
            while (!s2.isEmpty() &&
                    (s2.peek().first) >= A[i])
            {
                cnt += s2.peek().second;
                s2.pop();
            }

            s2.push(new pair(A[i], cnt));
            right[i] = cnt;
        }

        int result = 0;

        // calculating required resultult
        for (int i = 0; i < n; ++i)
            result = (result + A[i] * left[i] *
                    right[i]);

        return result;
    }
    // Driver Code
    public static void main(String[] args)
    {
        int A[] = { 3, 1, 2, 4 };

        int n = A.length;

        // function call to get required result
        System.out.println(sumSubarrayMins(A, n));
    }
}
