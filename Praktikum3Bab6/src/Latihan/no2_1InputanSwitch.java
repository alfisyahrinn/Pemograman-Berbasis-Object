package Latihan;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class no2_1InputanSwitch {
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
    switch (userInt) {
      case 1:
        System.out.println("Mantap Kamu Milih : " + userInt);
        break;
      case 2:
        System.out.println("Mantap Kamu Milih : " + userInt);
        break;
      case 3:
        System.out.println("Mantap Kamu Milih : " + userInt);
        break;
      case 4:
        System.out.println("Mantap Kamu Milih : " + userInt);
        break;
      case 5:
        System.out.println("Mantap Kamu Milih : " + userInt);
        break;
      case 6:
        System.out.println("Mantap Kamu Milih : " + userInt);
        break;
      case 7:
        System.out.println("Mantap Kamu Milih : " + userInt);
        break;
      case 8:
        System.out.println("Mantap Kamu Milih : " + userInt);
        break;
      case 9:
        System.out.println("Mantap Kamu Milih : " + userInt);
        break;
      case 10:
        System.out.println("Mantap Kamu Milih : " + userInt);
        break;

      default:
        System.out.println("Invalid Number Masukkan 1-10 saja!");
        break;
    }
  }
}
