interface MatchState {
    void startMatch();

    void cancelMatch(String reason);
}

class MatchInProgressState implements MatchState {
    @Override
    public void startMatch() {
        System.out.println("Go, we'll watch an exciting 90 minutes");
    }

    @Override
    public void cancelMatch(String reason) {
        System.out.println("That's it for today, until then, it's goodbye");
    }
}

class MatchCancelledState implements MatchState {
    private final String reason;

    public MatchCancelledState(String reason) {
        this.reason = reason;
    }
    @Override
    public void startMatch() {
    }
    @Override
    public void cancelMatch(String reason) {
        System.out.println("Match was cancelled due to " + this.reason);
    }
}
