class Solution {
    public int finalValueAfterOperations(String[] operations) {
       // int n = operations.length;
        int x=0;
        for(int i=0 ; i<operations.length ; i++){
            if(operations[i].charAt(0) == '+' || operations[i].charAt(2)=='+')
                x++;
            else{
                x--;
            }
        }
        return x;
    }
}