class Solution {
    public long[] findElements(long arr[]) {
        // code here
        int length = arr.length;
        long result[] = new long[length-2];
        Arrays.sort(arr);
        System.arraycopy(arr, 0, result, 0, result.length);
        return result;
    }
}