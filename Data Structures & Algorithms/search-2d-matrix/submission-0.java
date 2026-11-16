class Solution {
    public boolean searchMatrix(int[][] matrix, int target) { 

        for(int i=0;i<matrix.length;i++) {

             int l = 0;
        int r = matrix[0].length-1;

        if(target >= matrix[i][l] && target <= matrix[i][r]) {
            while(l<=r) {
              int mid = (l+r)/2;
                if(matrix[i][mid] > target) {
                    r = mid -1;
                }
                else if(matrix[i][mid] < target){
                    l = mid+1;
                }
                else {
                    return true;
                }

            }
        }
        continue;

        }

        return false;
        
    }
}
