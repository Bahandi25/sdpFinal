interface TicketAdapter {
    void buyTicket(String team, int quantity);
    void sellTicket(String team, int quantity);
}

// Adaptee class
class TeamShop {
    public void purchaseTicket(String team, int quantity) {
        System.out.println("Purchased " + quantity + " tickets for " + team);
        // Add your actual implementation here
    }

    public void sellTeamMerchandise(String team, int quantity) {
        System.out.println("Sold " + quantity + " merchandise for " + team);
        // Add your actual implementation here
    }
}

// Adapter class
class TicketShopAdapter implements TicketAdapter {
    private TeamShop teamShop;

    public TicketShopAdapter(TeamShop teamShop) {
        this.teamShop = teamShop;
    }

    @Override
    public void buyTicket(String team, int quantity) {
        teamShop.purchaseTicket(team, quantity);
    }

    @Override
    public void sellTicket(String team, int quantity) {
        teamShop.sellTeamMerchandise(team, quantity);
    }
}