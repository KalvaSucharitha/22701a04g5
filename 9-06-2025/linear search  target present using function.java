class Main {
    public static void main(String[] args) {
       System.out.println(linearsearch(new int[] {10,19,2,3,1,5,9},2));
       System.out.println(linearsearch(new int[] {10,19,2,3,1,5,9},10));
       System.out.println(linearsearch(new int[] {10,19,2,3,1,5,9},19));
       }
       public static int linearsearch (int[] nums,int target){
           for(int i=0; i<nums.length; i++){
               if(target==nums[i]){
                   return i;
               }
           }
           return -1;
       }
}