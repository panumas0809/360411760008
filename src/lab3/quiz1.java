package lab3;

public class quiz1 {
    public static void main(String[] args) {
        int count=0;
        int sum=0;
        for (int x = 500; x < 1000; x++) {
            //statement for
            if (x%3==0 && x%6==0) {
                System.out.print(x + " ");
                count++;
                sum+=x;//sum=sum+x;
            }
            }
      System.out.println("Number of value is"+count);
        System.out.println("The summation is"+sum);
        System.out.println("The average value is"+(sum/count));









    }//main




}//calls
