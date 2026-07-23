class Solution {
    static ArrayList<Integer> leaders(int arr[]) 
    {
  
        
        // Better -> TC-O(n) , SC- O(n)
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        int maxFromRight = arr[n-1];
        list.add(maxFromRight);
        
        for(int i=(n-2);i>=0;i--)
        {
            if(arr[i] >= maxFromRight)
            {
                maxFromRight = arr[i];
                list.add(maxFromRight);
            }
        }
        Collections.reverse(list); 
        return list;
        
        
    }
}