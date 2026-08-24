class Solution {

    void rearrange(ArrayList<Integer> arr) {

        int n = arr.size();

        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();

        // Separate positive and negative numbers
        for (int i = 0; i < n; i++) {

            if (arr.get(i) >= 0) {
                positive.add(arr.get(i));
            } else {
                negative.add(arr.get(i));
            }
        }

        arr.clear();

        int p = 0;
        int neg = 0;

        // Positive first, then negative
        while (p < positive.size() && neg < negative.size()) {

            arr.add(positive.get(p++));
            arr.add(negative.get(neg++));
        }

        // Add remaining positive numbers
        while (p < positive.size()) {
            arr.add(positive.get(p++));
        }

        // Add remaining negative numbers
        while (neg < negative.size()) {
            arr.add(negative.get(neg++));
        }
    }
}