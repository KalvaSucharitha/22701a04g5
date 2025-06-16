class Main {
    public static void main(String[] args){
        int num=4563;
        int count=0;
        while(num!=0){
            int remainingNumber=num/10;
            count=count+1;
            num=remainingNumber;
        }
        System.out.println("number of digits are:"+count);
    }
}