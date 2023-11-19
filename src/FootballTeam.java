public class FootballTeam {
    private String teamName;
    private String country;

    public FootballTeam(String teamName, String country) {
        this.teamName = teamName;
        this.country = country;
    }

    public void displayTeamInfo() {
        System.out.println("Team: " + teamName + ", Country: " + country);
    }

    public String getTeamName() {
        return teamName;
    }
}
