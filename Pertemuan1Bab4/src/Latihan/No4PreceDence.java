package Latihan;

public class No4PreceDence {
  public static void main(String[] args) {
    int a = 1;
    int b = 2;
    int c = 3;
    int d = 4;
    int e = 5;
    int f = 6;
    int g = 7;
    int h = 8;
    int i = 9;

    // no 1
    int tess = (((b ^ c) ^ d) - e);
    int tesss = (f - ((g * h) + i));
    System.out.println("(((b^c)^d)-e) =  " + tess);
    System.out.println("(f - ((g * h) + i)) =  " + tesss);

    System.out.println("hasilblom =  " + tess + tesss);
    System.out.println("hasilfinal =  " + (tess + tesss) / a);


  }
}
/*
 * a / b ^ c ^ d – e + f – g * h + i
 * 10 / 5 ^ c ^ d – e + f – g * h + i
 * 
 * 
 * 6%2*5+4/2+88-10
 * 
 * ((6%2)*5)+(4/2)+88-10;
 */