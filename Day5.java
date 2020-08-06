class Solution {
    public boolean isPowerOfFour(int num) {
        long i = 1;
        while(i < num)
        {
            i *= 4;
        }

        return i == num;
    }
}
