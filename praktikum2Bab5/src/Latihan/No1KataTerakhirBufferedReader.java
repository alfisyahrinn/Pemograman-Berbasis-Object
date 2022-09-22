package Latihan;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class No1KataTerakhirBufferedReader {
  public static void main(String[] args) {
    BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
    String word = "";
    System.out.print("Bahasa inggris Selamat Tinggal :");

    try {
      word = dataIn.readLine();
    } catch (IOException e) {
      System.out.println("Error!");
    }

    String word2 = "";
    System.out.print("bahasa inggrisnya dan : ");

    try {
      word2 = dataIn.readLine();
    } catch (IOException e) {
      System.out.println("Error!");
    }
    String word3 = "";
    System.out.print("bahasa inggrisnya halo :");

    try {
      word3 = dataIn.readLine();
    } catch (IOException e) {
      System.out.println("Error!");
    }
    System.out.println(word + " " + word2 + " " + word3 + " ");
  }
}
