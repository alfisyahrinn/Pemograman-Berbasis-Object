package Latihan;

public class no4_1PerpangkatanWhile {
  public static void main(String[] args) {
    int hasil = 1;
    int nilai = 2;
    int pangkat = 5;
    int i = 1;
    while (i <= pangkat) {
      hasil = hasil * nilai;
      i++;
    }
    System.out.println(nilai + " ^ " + pangkat + " = " + hasil);
  }
}
