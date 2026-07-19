class Solution {
    ArrayList<Integer> findMissing(int[] a, int[] b) {
        // code here
          HashSet<Integer>set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i<b.length;i++){
            set.add(b[i]);
        }
        for(int num : a){
            if(!set.contains(num)){
                list.add(num);
            }
        }
        return list;
    }
}