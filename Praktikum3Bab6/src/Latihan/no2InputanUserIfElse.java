package Latihan;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class no2InputanUserIfElse {
  public static void main(String[] args) {
    BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
    String user = "";

    try {
      System.out.print("masukkan angka dari 1-10 : ");
      user = dataIn.readLine();
    } catch (IOException e) {
      System.out.println("Error!");
    }

    int userInt;

    userInt = Integer.parseInt(user);
    if (userInt == 1) {
      System.out.println("Mantap Kamu Milih " + userInt);
    } else if (userInt == 2) {
      System.out.println("Mantap Kamu Milih " + userInt);
    } else if (userInt == 3) {
      System.out.println("Mantap Kamu Milih " + userInt);
    } else if (userInt == 4) {
      System.out.println("Mantap Kamu Milih " + userInt);
    } else if (userInt == 5) {
      System.out.println("Mantap Kamu Milih " + userInt);
    } else if (userInt == 6) {
      System.out.println("Mantap Kamu Milih " + userInt);
    } else if (userInt == 7) {
      System.out.println("Mantap Kamu Milih " + userInt);
    } else if (userInt == 8) {
      System.out.println("Mantap Kamu Milih " + userInt);
    } else if (userInt == 9) {
      System.out.println("Mantap Kamu Milih " + userInt);
    } else if (userInt == 10) {
      System.out.println("Mantap Kamu Milih " + userInt);
    } else {
      System.out.println("Masukkan angka dari 1-10 Saja!");
    }

  }
}
