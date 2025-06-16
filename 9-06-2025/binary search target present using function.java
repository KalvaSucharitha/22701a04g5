class Main {
    public static void main(String[] args) {
        binarysearch(new int[] {1,2,3,8,9,10,19,20}, 3);
        binarysearch(new int[] {1,2,3,8,9,10,19,20}, 10);
        binarysearch(new int[] {1,2,3,8,9,10,19,20}, 20);
    }
    public static void binarysearch(int[] nums,int target){
       int left=0;
       int right=nums.length-1;
       int index=-1;
       while(left<=right){
           int mid=(left+right)/2;
           if(target>nums[mid]){
               left=mid+1;
           }
           else if(target<nums[mid]){
               right=mid-1;
           }else{
               index=mid;
               break;
           }
       }
       System.out.println(index==-1?"element is not found":"element is found at index:"+index);
    }
}
       
    