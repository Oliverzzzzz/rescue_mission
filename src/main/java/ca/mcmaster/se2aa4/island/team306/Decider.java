package ca.mcmaster.se2aa4.island.team306;

public class Decider {
    private Mover mover;
    private Radar radar;
    private Aborter aborter;
    private PhotoScanner photo;
    private Decision decision;
    private Direction jsonDirection;

    public Decider(){
        this.decision = Decision.ABORT;
    }

    public Decision getDecision(){
        updateDecision();
        return this.decision;
    }

    public Direction getJsonDirection(){
        return jsonDirection;
    }

    private void updateDecision(){
        boolean abortCheck = aborter.abort();
        boolean moveCheck = mover.move();
        boolean radarCheck = radar.scan();
        boolean photoCheck = photo.scan();
        this.decision = Decision.ABORT;
    }
}
