class Main {
    public static void main(String[] args) {
      int[]nums={25,75,100,125};
      int count=0;
      for(int i=1;i<nums.length;i++){
          if(nums[i]%2==0){
              count++;
          }
      }
      System.out.println("number of even numbers:"+count);
   }
 }s