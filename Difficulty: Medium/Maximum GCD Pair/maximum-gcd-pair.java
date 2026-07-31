class Solution {
    static int maxGCD(int[] arr) {
        // code here
        int n = arr.length;
        int max = 0;
int ans = 1;
Map<Integer, Integer> mp = new HashMap<>();

// Populate the map and find the maximum element
for (int i = 0; i < n; i++) {
    mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
    max = Math.max(max, arr[i]);
}

// Start the loop from max down to 2
for (int i = max; i >= 2; i--) {
    int count = 0;
    
    // Check multiples of i
    for (int j = i; j <= max; j += i) {
        count += mp.getOrDefault(j, 0);
        if (count >= 2) {
            return i; // Return the largest i that divides at least two numbers
        }
    }
}

return ans;
    }
}