import java.util.Scanner;

public class CakeOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Birthday Cake's Details:");

        System.out.print("Enter a message on cake: ");
        String message = sc.nextLine();

        System.out.print("Enter a flavor: ");
        String flavor = sc.nextLine();

        System.out.print("How many pound: ");
        double pound = Double.parseDouble(sc.nextLine());

        BirthdayCake order1 = new BirthdayCake(message, pound, flavor, 350);

        System.out.println(order1.toString());

        System.out.println();

        System.out.println("Cup Cake's Details:");

        System.out.print("Enter a flavor: ");
        String cupcake_flavor = sc.nextLine();

        System.out.print("How many piece: ");
        int piece = sc.nextInt();

        CupCake order2 = new CupCake(piece, cupcake_flavor, 65);

        System.out.println(order2.toString());

        System.out.println();

        System.out.println("Total price = " + ((order1.getUnitPrice() * pound) + (order2.getUnitPrice() * piece)));
    }
}
