package Latihan;

// java.io
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class no1NilaiBufferedReader {
  public static void main(String[] args) {
    BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
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

    int pertama, kedua, ketiga;
    float i, h, p, hasil;

    i = Float.parseFloat(a);
    h = Float.parseFloat(b);
    p = Float.parseFloat(c);
    // pertama = Integer.parseFloat(a);
    // kedua = Integer.parseFloat(b);
    // ketiga = Integer.parseFloat(c);

    hasil = (i + h + p) / 3;
    if (hasil > 60) {
      System.out.println(" Mantap :) Nilaimu : " + hasil);
    } else {
      System.out.println(" Wkwkwk :-( Nilaimu : " + hasil);
    }

  }
}
