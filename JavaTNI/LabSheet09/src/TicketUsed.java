import javax.swing.*;

public class TicketUsed {
    public static String show_movie_list(Ticket[] tickets) {
        return "T001: " + tickets[0].getMovie().toString() +
                "\nT002: " + tickets[1].getMovie().toString() +
                "\nT003: " + tickets[2].getMovie().toString();
    }

    public static void main(String[] args) {
        boolean is_loop = false;

        Ticket[] tickets = new Ticket[]{
                new Ticket("T001", new Movie("Titanic", 120, "PG-13"), "12:00", "B7", 280),
                new Ticket("T002", new Movie("Pokemon", 102, "PG"), "11:00", "G11", 240),
                new Ticket("T003", new Movie("Silent Hill", 125, "R-13"), "14:30", "H2", 240)
        };

        while (!is_loop) {
            int choice = JOptionPane.showConfirmDialog(null,
                    "Do you want to book or use a ticket?",
                    "Ticket",
                    JOptionPane.YES_NO_OPTION);

            if (choice == JOptionPane.YES_OPTION) {
                String ticket_id = JOptionPane.showInputDialog(show_movie_list(tickets) +
                        "\n" +
                        "\nEnter a ticket id for booking:");

                if (ticket_id.equalsIgnoreCase("T001")) {
                    String menu = JOptionPane.showInputDialog("T001: " + tickets[0].getMovie().toString() +
                            "\n" +
                            "\nPress 1 to book a ticket" +
                            "\nPress 2 to use a ticket" +
                            "\nPress 3 to see a ticket status" +
                            "\n" +
                            "\nEnter a menu:");

                    if (menu.equals("1")) {
                        JOptionPane.showMessageDialog(null,
                                tickets[0].bookTicket() +
                                        "\n--------------------" +
                                        "\n" + tickets[0].toString());
                    } else if (menu.equals("2")) {
                        JOptionPane.showMessageDialog(null,
                                tickets[0].useTicket() +
                                        "\n--------------------" +
                                        "\n" + tickets[0].toString());
                    } else if (menu.equals("3")) {
                        JOptionPane.showMessageDialog(null, tickets[0].toString());
                    }
                } else if (ticket_id.equalsIgnoreCase("T002")) {
                    String menu = JOptionPane.showInputDialog("T002: " + tickets[1].getMovie().toString() +
                            "\n" +
                            "\nPress 1 to book a ticket" +
                            "\nPress 2 to use a ticket" +
                            "\nPress 3 to see a ticket status" +
                            "\n" +
                            "\nEnter a menu:");

                    if (menu.equals("1")) {
                        JOptionPane.showMessageDialog(null,
                                tickets[1].bookTicket() +
                                        "\n--------------------" +
                                        "\n" + tickets[1].toString());
                    } else if (menu.equals("2")) {
                        JOptionPane.showMessageDialog(null,
                                tickets[1].useTicket() +
                                        "\n--------------------" +
                                        "\n" + tickets[1].toString());
                    } else if (menu.equals("3")) {
                        JOptionPane.showMessageDialog(null, tickets[0].toString());
                    }
                } else if (ticket_id.equalsIgnoreCase("T003")) {
                    String menu = JOptionPane.showInputDialog("T003: " + tickets[2].getMovie().toString() +
                            "\n" +
                            "\nPress 1 to book a ticket" +
                            "\nPress 2 to use a ticket" +
                            "\nPress 3 to see a ticket status" +
                            "\n" +
                            "\nEnter a menu:");

                    if (menu.equals("1")) {
                        JOptionPane.showMessageDialog(null,
                                tickets[2].bookTicket() +
                                        "\n--------------------" +
                                        "\n" + tickets[2].toString());
                    } else if (menu.equals("2")) {
                        JOptionPane.showMessageDialog(null,
                                tickets[2].useTicket() +
                                        "\n--------------------" +
                                        "\n" + tickets[2].toString());
                    } else if (menu.equals("3")) {
                        JOptionPane.showMessageDialog(null, tickets[0].toString());
                    }
                }
            } else {
                is_loop = true;
            }
        }
    }
}
