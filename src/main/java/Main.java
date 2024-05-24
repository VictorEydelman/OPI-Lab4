import Units.Dataon;
import beans.Bean;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Dataon dataon = new Dataon();
    System.out.println("Enter point:");
    System.out.println("x = ");
    dataon.setX(sc.nextDouble());
    System.out.println("y = ");
    dataon.setY(sc.nextDouble());
    System.out.println("r = ");
    dataon.setR(sc.nextDouble());
    String result = Bean.check(dataon.getX(),dataon.getY(),dataon.getR());
    System.out.println(result);
  }
}