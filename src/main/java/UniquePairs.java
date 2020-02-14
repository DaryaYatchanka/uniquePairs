import java.util.HashSet;

public class UniquePairs {

        static int getPairs(int a[], int n)
        {
            HashSet<Integer> checked1 = new HashSet<>();
            int unique[] = new int[n];

            unique[n - 1] = 0;

            int count = 0;
            for (int i = n - 1; i > 0; i--) {

                if (checked1.contains(a[i]))
                    unique[i - 1] = count;
                else
                    unique[i - 1] = ++count;

                checked1.add(a[i]);
            }

            HashSet<Integer> checked2 = new HashSet<Integer>();

            int answer = 0;
            for (int i = 0; i < n - 1; i++) {

                if (checked2.contains(a[i]))
                    continue;

                answer += unique[i];
                checked2.add(a[i]);
            }
            return answer;
        }

        // Driver code
        public static void main(String[] args)
        {
            int a[] = {1, 2, 3, 4};
            int n = a.length;

            // Print the count of unique pairs
            System.out.println(getPairs(a, n));
        }
    }
