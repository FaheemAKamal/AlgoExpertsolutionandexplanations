class Solution {
    public int findPairs(int[] nums, int k) {
        if(k < 0) return 0;
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            if(k == 0 && e.getValue() >= 2) ans++;
            else if(k != 0 && map.containsKey(e.getKey()+k)) ans++;
        }
        return ans;
    }
}
