package jbasic_day2;
 public class SumOfNaturalNumbers {

     public static void main(String[] args) {
         SumOfNaturalNumbers sum = new SumOfNaturalNumbers();
         System.out.println(sum.sumUsingForLoop(5));
         System.out.println(sum.sumUsingWhileLoop(5));

     }

    int sum = 0;
    public int sumUsingForLoop(int n) {
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public int sumUsingWhileLoop(int n) {
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum = sum + i;
            i++;
        }
        return sum;
    }



}
