class Solution {
    public boolean searchMatrix(int[][] matrix, int target) { 

        int l = 0;
        int rows = matrix.length;
        int column = matrix[0].length;
        int r = rows*column -1;

        while(l <= r) {
            int mid = l + (r-l)/2;
            int midValue = matrix[mid/column][mid%column];
            if(midValue > target) {
                r = mid-1;
            }
            else if(midValue < target) {
                l = mid+1;
            }
            else {
                return true;
            }

        }
        return false;


        
    }
}
