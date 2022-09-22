package Latihan;

import javax.swing.JOptionPane;

public class No2KataTerakhirPOptionPane {
  public static void main(String[] args) {
    String word = "";
    word = JOptionPane.showInputDialog("Bahasa inggris Selamat Tinggal :");
    
    String word2 = "";
    word2 = JOptionPane.showInputDialog("Bahasa inggris dan :");

    //output
    String output = word + " " + word2 + " hello";

    JOptionPane.showMessageDialog(null, output);
  }
}
