class Main {
    public static void main(String[] args) {
      int num=42510;
      int sum=0;
      while(num!=0){
          int rem=num%10;
          sum=sum+rem;
          num=num/10;
      }
      System.out.println("sum of digits are:" +num+ "=" +sum);
      System.out.println((sum%2==0)?"even number":"odd number");
    }
}  