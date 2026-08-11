// Last updated: 8/11/2026, 2:21:52 PM
import java.util.*;

class Solution {
    private int[][] maxSt;
    private int[][] minSt;
    private int[] log;

    private long getValue(int l, int r) {
        int len = r - l + 1;
        int k = log[len];

        int mx = Math.max(maxSt[k][l],
                maxSt[k][r - (1 << k) + 1]);

        int mn = Math.min(minSt[k][l],
                minSt[k][r - (1 << k) + 1]);

        return (long) mx - mn;
    }

    public long maxTotalValue(int[] nums, int k) {
        int n = nums.length;

        log = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            log[i] = log[i / 2] + 1;
        }

        int m = log[n] + 1;

        maxSt = new int[m][n];
        minSt = new int[m][n];

        for (int i = 0; i < n; i++) {
            maxSt[0][i] = nums[i];
            minSt[0][i] = nums[i];
        }

        for (int j = 1; j < m; j++) {
            int len = 1 << j;

            for (int i = 0; i + len <= n; i++) {
                maxSt[j][i] = Math.max(
                        maxSt[j - 1][i],
                        maxSt[j - 1][i + (len >> 1)]
                );

                minSt[j][i] = Math.min(
                        minSt[j - 1][i],
                        minSt[j - 1][i + (len >> 1)]
                );
            }
        }

        PriorityQueue<long[]> pq =
                new PriorityQueue<>((a, b) ->
                        Long.compare(b[0], a[0]));

        for (int l = 0; l < n; l++) {
            long val = getValue(l, n - 1);
            pq.offer(new long[]{val, l, n - 1});
        }

        long ans = 0;

        while (k-- > 0) {
            long[] cur = pq.poll();

            long val = cur[0];
            int l = (int) cur[1];
            int r = (int) cur[2];

            ans += val;

            if (r > l) {
                int nr = r - 1;
                pq.offer(new long[]{
                        getValue(l, nr),
                        l,
                        nr
                });
            }
        }

        return ans;
    }
}