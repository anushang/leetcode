class Solution {
    public int fib(int n) {
        HashMap<Integer,Integer>map= new HashMap<Integer,Integer>();

                if(n==0) return 0;
                if(n==1) return 1;
                if(map.get(n)!=null)
                {
                        return map.get(n);
                }
                else{
                        int v=fib(n-1)+fib(n-2);
                        map.put(n,v);
                        return v;
                }
    }
}
