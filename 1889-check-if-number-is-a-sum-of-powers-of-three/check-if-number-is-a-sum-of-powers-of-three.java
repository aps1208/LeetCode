class Solution {
    public boolean checkPowersOfThree(int n) {
        String str=Integer.toString(n,3);
        return !str.contains("2");
    }
}