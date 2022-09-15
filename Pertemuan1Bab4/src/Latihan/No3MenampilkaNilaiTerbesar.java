package Latihan;

public class No3MenampilkaNilaiTerbesar {
  public static void main(String[] args) {
    int number1 = 10;
    int number2 = 23;
    int number3 = 5;
    int big = 0;
    int big2 = 0;

    big = (number1 > number2) ? number1 : number2;
    big2 = (big > number3) ? big : number3;

    System.out.println(" number1 = " + number1);
    System.out.println(" number2 = " + number2);
    System.out.println(" number3 = " + number3);
    System.out.println("Nilai Terbesar Adalah = " + big2);
  }
}
