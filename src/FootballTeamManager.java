import java.util.Scanner;

public class FootballTeamManager {
    private static int availableTickets = 300;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        TeamManager teamManager = TeamManager.getInstance();
        EventNotifier eventNotifier = new EventNotifier();
        TeamShop teamShop = new TeamShop();

        TicketAdapter ticketAdapter = new TicketShopAdapter(teamShop);

        FootballTeam teamA = FootballTeamFactory.createTeamFromUserInput("TeamA");

        FootballTeam teamB = FootballTeamFactory.createTeamFromUserInput("TeamB");

        System.out.println("Enter the date of the event:");
        String currentEvent = scanner.nextLine();
        teamManager.setCurrentEvent(currentEvent);

        teamA.displayTeamInfo();
        teamB.displayTeamInfo();
        System.out.println("Match between " + teamA.getTeamName() + " and " + teamB.getTeamName() +
                " will be on " + teamManager.getCurrentEvent());

        eventNotifier.addObserver(new MatchEventObserver());

        eventNotifier.notifyObservers(teamManager.getCurrentEvent());

        FootballStrategy runStrategyTeamA = new RunStrategy();
        FootballStrategy defendStrategyTeamB = new DefendStrategy();

        System.out.println("Enter the color for TeamA's form:");
        String runColorTeamA = scanner.nextLine();
        System.out.println("Enter the boots type for TeamA:");
        String runBootTypeTeamA = scanner.nextLine();

        FootballStrategy coloredRunStrategyTeamA = new ColorDecorator(runStrategyTeamA, runColorTeamA);
        FootballStrategy bootedRunStrategyTeamA = new BootsDecorator(coloredRunStrategyTeamA, runBootTypeTeamA);

        System.out.println("Enter the color for TeamB's form:");
        String defendColorTeamB = scanner.nextLine();
        System.out.println("Enter the boots type for TeamB:");
        String defendBootTypeTeamB = scanner.nextLine();

        FootballStrategy coloredDefendStrategyTeamB = new ColorDecorator(defendStrategyTeamB, defendColorTeamB);
        FootballStrategy bootedDefendStrategyTeamB = new BootsDecorator(coloredDefendStrategyTeamB, defendBootTypeTeamB);

        bootedRunStrategyTeamA.execute();
        bootedDefendStrategyTeamB.execute();

        System.out.println("Enter the number of tickets to buy for TeamA:");
        int ticketsToBuyTeamA = scanner.nextInt();
        ticketAdapter.buyTicket("TeamA", ticketsToBuyTeamA);
        availableTickets -= ticketsToBuyTeamA;

        System.out.println("Enter the number of tickets to sell for TeamB:");
        int ticketsToSellTeamB = scanner.nextInt();
        ticketAdapter.sellTicket("TeamB", ticketsToSellTeamB);
        availableTickets -= ticketsToSellTeamB;

        System.out.println("Available Tickets: " + availableTickets);

        Player player = createPlayer();

        player.displayPreview();

        MatchState matchState = null;

        System.out.println("Are you ready for a great match? (Choose 1 to start match, or 2 to cancel it)");
        int userChoice = scanner.nextInt();

        if (userChoice == 1) {
            matchState = new MatchInProgressState();
        } else if (userChoice == 2) {
            System.out.println("What is the reason to cancel the match?");
            scanner.nextLine();
            String cancelReason = scanner.nextLine();
            matchState = new MatchCancelledState(cancelReason);
        }

        if (matchState != null) {
            matchState.startMatch();
            System.out.println("Write 1 to stop the match:");
            int stopChoice = scanner.nextInt();

            if (stopChoice == 1) {
                matchState.cancelMatch(null);
            }
        }
        scanner.close();
    }
    private static FootballTeam createTeamFromUserInput(String teamIdentifier) {
        System.out.println("Enter the name of " + teamIdentifier + ":");
        String teamName = scanner.nextLine();
        System.out.println("Enter the country of " + teamIdentifier + ":");
        String teamCountry = scanner.nextLine();
        return TeamFactory.createTeam(teamName, teamCountry);
    }
    private static void displayStrategyInfo(FootballStrategy strategy) {
        if (strategy instanceof ColorDecorator) {
            System.out.println("Color Decorator Strategy: " + ((ColorDecorator) strategy).getColor());
        } else if (strategy instanceof BootsDecorator) {
            System.out.println("Boots Decorator Strategy: " + ((BootsDecorator) strategy).getBootType());
        } else {
            System.out.println("Base Strategy");
        }
    }
    private static Player createPlayer() {
        System.out.println("Enter player's name:");
        scanner.nextLine();
        String playerName = scanner.nextLine();

        System.out.println("Enter player's surname:");
        String playerSurname = scanner.nextLine();

        System.out.println("Choose player's position (1. Striker, 2. Defender, 3. Goalkeeper):");
        int playerPositionChoice = scanner.nextInt();

        Position playerPosition = switch (playerPositionChoice) {
            case 1 -> Position.STRIKER;
            case 2 -> Position.DEFENDER;
            case 3 -> Position.GOALKEEPER;
            default -> throw new IllegalArgumentException("Invalid player position choice");
        };

        System.out.println("Enter player's football team:");
        scanner.nextLine();
        String playerFootballTeam = scanner.nextLine();

        return new Player(playerName, playerSurname, playerPosition, playerFootballTeam);
    }
}
