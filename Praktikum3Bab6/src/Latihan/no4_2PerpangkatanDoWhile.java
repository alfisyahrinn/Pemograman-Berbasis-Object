package Latihan;

public class no4_2PerpangkatanDoWhile {
  public static void main(String[] args) {
    int hasil = 1;
    int nilai = 2;
    int pangkat = 6;
    int i = 1;
    do {
      hasil = hasil * nilai;
      i++;
    } while (i <= pangkat);
    System.out.println(nilai + " ^ " + pangkat + " = " + hasil);
  }
}
