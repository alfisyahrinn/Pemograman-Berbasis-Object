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
    int rata = 0;
    try {
      rata = (Integer.parseInt(a) + Integer.parseInt(b) + Integer.parseInt(c)) / 3;
      String msg = "Rata-Rata = " + rata;
      if (rata >= 60) {
        JOptionPane.showMessageDialog(null, msg + " :-)");
      } else {
        JOptionPane.showMessageDialog(null, msg + " :-( ");
      }
    } catch (NumberFormatException nfe) {
      String msg = "DATA YANG DIINPUT TIDAK VALID!!";
      JOptionPane.showMessageDialog(null, msg);
    }

  }

}
