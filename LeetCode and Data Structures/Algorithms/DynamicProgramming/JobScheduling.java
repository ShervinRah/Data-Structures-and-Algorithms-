package DynamicProgramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
 
// A class to store a Job
class Job
{
    int start, finish, profit;
 
    Job(int start, int finish, int profit)
    {
        this.start = start;
        this.finish = finish;
        this.profit = profit;
    }
}
 
public class JobScheduling
{
    // Function to perform a binary search on the given jobs, which are sorted
    // by finish time. The function returns the index of the last job, which
    // doesn't conflict with the given job, i.e., whose finish time is
    // less than or equal to the given job's start time.
    public static int findLastNonConflictingJob(List<Job> jobs, int n)
    {
        // search space
        int low = 0, high = n;
 
        // iterate till the search space is exhausted
        while (low <= high)
        {
            int mid = (low + high) / 2;
            if (jobs.get(mid).finish <= jobs.get(n).start)
            {
                if (jobs.get(mid + 1).finish <= jobs.get(n).start) {
                    low = mid + 1;
                }
                else {
                    return mid;
                }
            }
            else {
                high = mid - 1;
            }
        }
 
        // return the negative index if no non-conflicting job is found
        return -1;
    }
 
    // Function to find the maximum profit of non-overlapping jobs using DP
    public static int findMaxProfit(List<Job> jobs)
    {
        // sort jobs in increasing order of their finish times
        Collections.sort(jobs, Comparator.comparingInt(x -> x.finish));
 
        // get the number of jobs
        int n = jobs.size();
 
        // base case
        if (n == 0) {
            return 0;
        }
 
        // construct a lookup table where the i'th index stores the maximum profit
        // for the first `i` jobs
        int[] maxProfit = new int[n];
 
        // maximum profit gained by including the first job
        maxProfit[0] = jobs.get(0).profit;
 
        // fill the `maxProfit[]` table in a bottom-up manner from the second index
        for (int i = 1; i < n; i++)
        {
            // find the index of the last non-conflicting job with the current job
            int index = findLastNonConflictingJob(jobs, i);
 
            // include the current job with its non-conflicting jobs
            int incl = jobs.get(i).profit;
            if (index != -1) {
                incl = incl + maxProfit[index];
            }
 
            // store the maximum profit by including or excluding the current job
            maxProfit[i] = Math.max(incl, maxProfit[i - 1]);
        }
 
        // return maximum profit
        return maxProfit[n - 1];
    }
 
    public static void main(String[] args)
    {
        List<Job> jobs = Arrays.asList(
                new Job( 0, 3, 3 ),
                new Job( 1, 4, 2 ),
                new Job( 0, 5, 4 ),
                new Job( 3, 6, 1 ),
                new Job( 4, 7, 2 ),
                new Job( 3, 9, 5 ),
                new Job( 5, 10, 2),
                new Job( 8, 10, 1)
        );
 
        System.out.print("The maximum profit is " + findMaxProfit(jobs));
    }
}