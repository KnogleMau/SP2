//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class LibaryRoyaltyCalculator {
    public static void main(String[] args) {
Author a1 = new Author("Jacob Flemming");
a1.addTitle(new PrintedBook("Historien om forfatter", "SKØN", 500, 1000));
a1.addTitle(new AudioBook("How to live life", "TI", 150, 1000));
a1.addTitle(new PrintedBook("Der var engang" ,"SKØN", 400, 1500));

        System.out.println("Jacob Flemming: " + String.format("%.2f", a1.calculateTotalPay()) + " kr");
    }
}