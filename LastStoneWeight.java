class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone: stones){
            pq.add(stone);
        }
        while(pq.size()>1){
            int stoneOne = pq.remove();
            int stoneTwo = pq.remove();
            if(stoneOne != stoneTwo){
                pq.add((stoneOne - stoneTwo));
            }
        }
        return pq.isEmpty() ? 0 : pq.remove();
    }
    
}
