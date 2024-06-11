package example;

public class FuctionTest {
    public static void main(String[] args) {
      int num1 = 10;
      int num2 = 40;

      int sum = add(num1 ,num2);
      int sum2 = add(10,20);
       System.out.println(num1 + " + " + num2 + " = " + sum + " 입니다 ");

    }
    public static int add (int n1, int n2) {
        int result = n1 + n2;
        return result; //
    }
}



