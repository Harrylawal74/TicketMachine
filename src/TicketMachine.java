public class TicketMachine {
    private final int price;
    private int balance;
    private int total;

    public TicketMachine(int ticketCost) {
        // The price of a ticket from this machine.
        price = ticketCost;
        // The amount of money on the ticket.
        balance = 0;
        // The total amount of money collected by machine.
        total = 0;
    }

    //Returns the price of the ticket.
    public int getPrice() {
        return price;
    }

    //Returns the balance left in the machine
    public int getBalance() {
        return balance;
    }

    /*
    Receive money from a customer and add to balance.
     */
    public void insertMoney (int amount) {
        balance = balance + amount;
    }

    //prints out customers ticket
    public void printTicket() {
        System.out.println("Ticket name");
        System.out.println("Ticket cost: £" + price);
        System.out.println("Sorry no change");
        //Update the total money collected
        total=total+balance;

        //Reset balance to zero
        balance=0;

    }
}

