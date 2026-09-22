class Solution {
    int[] tree;

    public int lengthOfLIS(int[] nums, int k) {

        int maxValue = 100000;
        tree = new int[4 * maxValue];

        int ans = 0;

        for (int x : nums) {

            int left = Math.max(1, x - k);
            int right = x - 1;

            int best = query(1, 1, maxValue, left, right);

            int current = best + 1;

            update(1, 1, maxValue, x, current);

            ans = Math.max(ans, current);
        }

        return ans;
    }

    private int query(int node, int start, int end,
                      int left, int right) {

        if (right < start || end < left) {
            return 0;
        }

        if (left <= start && end <= right) {
            return tree[node];
        }

        int mid = (start + end) / 2;

        int a = query(node * 2, start, mid, left, right);
        int b = query(node * 2 + 1, mid + 1, end, left, right);

        return Math.max(a, b);
    }

    private void update(int node, int start, int end,
                        int index, int value) {

        if (start == end) {
            tree[node] = Math.max(tree[node], value);
            return;
        }

        int mid = (start + end) / 2;

        if (index <= mid) {
            update(node * 2, start, mid, index, value);
        } else {
            update(node * 2 + 1, mid + 1, end, index, value);
        }

        tree[node] = Math.max(tree[node * 2],
                              tree[node * 2 + 1]);
    }
}