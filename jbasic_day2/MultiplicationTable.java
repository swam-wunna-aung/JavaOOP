package jbasic_day2;

public class MultiplicationTable {
    public static void main(String[] args) {
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        multiplicationTable.printMultiplicationTable(5);
    }


    public  void printMultiplicationTable(int n) {
    for (int i = 1; i <= n; i++) {
        System.out.println();
        for (int j = 1; j <= n; j++) {
            System.out.print(i + " x " + j + " = " + i * j+"  ");
        }
    }
    }

}
