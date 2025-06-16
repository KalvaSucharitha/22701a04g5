class Main {
    public static void main(String[] args) {
       int[] nums={10,19,2,1,3,5,6};
       int target=19;
       int index=-1;
       for(int i=0; i<nums.length; i++){
           if(target==nums[i])
           index=i;
       }
       System.out.println(index == -1?"element not found":"element found at index"+index);
       }
}