class Solution {
    public ArrayList<Integer> findSubarray(int arr[]) {

        ArrayList<Integer> ans = new ArrayList<>();
        int size = arr.length;

        boolean hasNonNegative = false;

        int bestSum = Integer.MIN_VALUE;
        int runningSum = 0;

        int bestLeft = -1;
        int bestRight = -1;
        int currentLeft = 0;

        for (int idx = 0; idx < size; idx++) {

            if (arr[idx] >= 0) {
                hasNonNegative = true;
                runningSum += arr[idx];

                if (runningSum > bestSum) {
                    bestSum = runningSum;
                    bestLeft = currentLeft;
                    bestRight = idx;
                } 
                else if (runningSum == bestSum && currentLeft == bestLeft) {
                    bestRight = idx;
                }

            } else {
                runningSum = 0;
                currentLeft = idx + 1;
            }
        }

        if (!hasNonNegative) {
            ans.add(-1);
            return ans;
        }

        for (int i = bestLeft; i <= bestRight; i++) {
            ans.add(arr[i]);
        }

        return ans;
    }
}

