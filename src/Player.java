class Player {
    private String name;
    private String surname;
    private Position position;
    private String footballTeam;

    public Player(String name, String surname, Position position, String footballTeam) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.footballTeam = footballTeam;
    }

    public void displayPreview() {
        System.out.println("Player Preview:");
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Position: " + position);
        System.out.println("Football Team: " + footballTeam);
    }
}

enum Position {
    STRIKER,
    DEFENDER,
    GOALKEEPER
}