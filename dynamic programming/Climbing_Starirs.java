class Solution {
    int c=1;int result;
    HashMap<Integer, Integer> memo = new HashMap<Integer, Integer>();
    public int climbStairs(int n) {
        if(n < 2) {
        return 1;
    }
    if(memo.containsKey(n)) {
        c++;
        return memo.get(n);
        
    }
    c++;
    result = climbStairs(n-1) + climbStairs(n-2);
    memo.put(n,result);
        return result;
    }
}
