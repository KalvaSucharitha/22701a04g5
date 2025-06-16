class Main {
    public static void main(String[] args) {
      int num=6;
      int count=0;
      for(int i=1;i<num;i++){
          if(num%i==0){
              count++;
          }
      }
      if(count==3){
          System.out.println("number has 3 divisiors");
      }
      else{
          System.out.println("number no has 3 divisiors");
      }
    }
}  