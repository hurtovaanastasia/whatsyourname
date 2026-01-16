import java.util.Scanner;
void main() {
System.out.println("Как тебя зовут?");
Scanner in = new Scanner(System.in);
String name = in.nextLine();
System.out.println("Привет, " + name + "!");
}
