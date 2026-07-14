class Solution {
    int majorityElement(int arr[]) {
        int n = arr.length;
        HashMap<Integer,Integer>hm = new HashMap<>();
        for(int num:arr){
            hm.put(num,hm.getOrDefault(num,0)+1); // count frequency
            
            if(hm.get(num)>n/2) return num;
        }
        return -1;
    }
}