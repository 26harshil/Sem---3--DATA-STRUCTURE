class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int left =0;
         int mid=0 ;
         int key=0;
        int right =nums.length-1;
        while(left<=right){
            if(target<nums[left]){
                return left;
            }
             if(target>left){
                key=left;
            }if(target>nums[left]){
                key = left+1;
            }
             mid = (left+right)/2;

            if(nums[mid]== target){
                return mid;
            }else{
                if(nums[mid]<target){
                    left =mid+1;
                }else{
                    right= mid-1;
                }
             }
           
            
           
        }
        return key;
        
    }
    
}
