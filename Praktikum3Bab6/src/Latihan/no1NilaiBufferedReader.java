package Latihan;

// java.io
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class no1NilaiBufferedReader {
  public static void main(String[] args) throws IOException {
    BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
    // int a;

    // System.out.println("masukkan nilai a");
    // try {
    // a = Integer.parseInt(dataIn.readLine());
    // } catch (IOException e) {
    // System.out.println("Error!");
    // }

    // // System.out.println(a);
    // System.out.println(a);

    String a = "";
    String b = "";
    String c = "";

    try {
      System.out.print("masukkan nilai pertama : ");
      a = dataIn.readLine();
      System.out.print("masukkan nilai kedua : ");
      b = dataIn.readLine();
      System.out.print("masukkan nilai ketiga : ");
      c = dataIn.readLine();
    } catch (IOException e) {
      System.out.println("Error!");
    }

    int pertama, kedua, ketiga, hasil;

    pertama = Integer.parseInt(a);
    kedua = Integer.parseInt(b);
    ketiga = Integer.parseInt(c);

    hasil = (pertama + kedua + ketiga);

    System.out.println("hasil " + hasil);
  }
}