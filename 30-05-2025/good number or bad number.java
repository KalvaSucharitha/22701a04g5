class Main {
    public static void main(String[] args) {
      int num=45210;
      int temp=num;
      int rev=0;
      int count1=0; int count2=0;
      while(temp>0){
          int rem=temp%10;
          temp=temp/10;
          count1++;
          rev=(rev*10)+rem;
        }
      System.out.println("reverse of" +num+ "="+rev);
      int n=rev;
      while(n!=0){
          n=n/10;
          count2++;
        }
      if(count1==count2){ 
          System.out.println("good number");
        }
        else{
          System.out.println("bad number");
        }
    }
}