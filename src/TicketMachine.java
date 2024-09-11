public class TicketMachine {
    private int price;
    private int balance;
    private int total;

    public TicketMachine(int ticketCost) {
        // The price of a ticket from this machine.
        price = ticketCost;
        // The amount of money on the ticket.
        balance = 0;
        // The total amount of money collected by this machine.
        total = 0;
    }

    //Returns the price of the ticket.
    public int getPrice() {
        return price;
    }

    //Returns the balance on the ticket
    public int getBalance() {
        return balance;
    }

    /*
    Receive money from a customer and add to tickets balance.
     */
    public void insertMoney (int amount) {
        balance = balance + amount;
    }
}

