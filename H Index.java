class Solution {
    public int hIndex(int[] citations) {
        int[] count = new int[citations.length + 1];
    
        for (int c: citations)
            if (c > citations.length) 
                count[citations.length]++;
            else 
                count[c]++;
    
    
        int total = 0;
        for (int i = citations.length; i >= 0; i--){
            total += count[i];
            if (total >= i)
                return i;
        }
    
        return 0;
    }
}
