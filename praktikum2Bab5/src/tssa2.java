import javax.swing.JOptionPane;

public class tssa2 {
  public static void main(String[] args) {
    String name = "";
    name = JOptionPane.showInputDialog("please enter your name : ");

    String msg = "Hello " + name + "!";

    JOptionPane.showMessageDialog(null, msg);

  }
}
