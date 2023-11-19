public class FootballTeamFactory {
    private FootballTeamFactory() {
    }

    public static FootballTeam createTeam(String teamName, String country) {
        FootballTeam team = new FootballTeam(teamName, country);
        TeamManager.getInstance().addTeam(teamName, country);
        return team;
    }

    public static FootballTeam createTeamFromUserInput(String teamIdentifier) {
        System.out.println("Enter the name of " + teamIdentifier + ":");
        String teamName = FootballTeamManager.scanner.nextLine();
        System.out.println("Enter the country of " + teamIdentifier + ":");
        String teamCountry = FootballTeamManager.scanner.nextLine();
        return createTeam(teamName, teamCountry);
    }
}
