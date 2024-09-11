import sun.security.krb5.internal.Ticket;

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
    public void getBalance() {
        System.out.println("Your balance is £" + balance);
    }

    /*
    Receive money from a customer and add to balance.
    if customer mistypes amount or amount is 0 then outputs message
     */
    public void insertMoney (int addamount) {
        if (addamount > 0) {
            balance = balance + addamount;
        }
        else {
            System.out.println("Add a positive amount. £"+addamount+" is not positive.");
        }
    }

    //prints out customers ticket and change remaining
    public void printTicket() {
        if (balance >= price){
            System.out.println("Ticket name");
            System.out.println("Ticket cost: £" + price);
            //Update the total money collected
            total=total+price;
            balance=balance-price;
            System.out.println("£"+balance+" Change remaining");
        }
        //lets customer know if the balance is too low for the ticket
        else {
            System.out.println("You need to add £"+(price-balance));
        }
    }

    //Refunds balance before ticket purchase
    public int refundBalance() {
        int refundamount;
        refundamount = balance;
        balance = 0;
        return refundamount;
    }

    public static void main(String[] args) {
        TicketMachine ticket = new TicketMachine(12);
        ticket.insertMoney(50);
        ticket.printTicket();
        ticket.getBalance();

    }



}




