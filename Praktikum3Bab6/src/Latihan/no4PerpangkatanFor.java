package Latihan;

public class no4PerpangkatanFor {
  public static void main(String[] args) {

    int hasil = 1;
    int nilai = 2;
    int pangkat = 5;
    for (int i = 1; i <= pangkat; i++) {
      hasil = hasil * nilai;
    }
    System.out.println(nilai + " ^ " + pangkat + " = " + hasil);
  }
}
