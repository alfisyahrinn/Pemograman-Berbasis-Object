package Latihan;

import javax.swing.JOptionPane;

public class no1_1no1NilaiJOptionPane {
  public static void main(String[] args) {
    String a = "";
    String b = "";
    String c = "";
    a = JOptionPane.showInputDialog("nilai pertama");
    int pertama = Integer.valueOf(a).intValue();
    b = JOptionPane.showInputDialog("nilai kedua");
    int kedua = Integer.valueOf(b).intValue();
    c = JOptionPane.showInputDialog("nilai ketiga");
    int ketiga = Integer.valueOf(c).intValue();

    int rata_rata = pertama + kedua + ketiga;
    String hasil = "";
    hasil += "Rata-rata nilai Anda adalah " + rata_rata + "\n";

    JOptionPane.showMessageDialog(null, hasil);
  }

}
