package ca.mcmaster.se2aa4.island.team306;

import java.util.ArrayList;
import java.util.List;

public class DecisionQueue {
    private List<Decision> decisions;

    public DecisionQueue(){
        this.decisions = new ArrayList<>();
    }

    public void enqueue(Decision decision){
        this.decisions.add(decision);
    }

    public Decision dequeue(){
        return decisions.removeFirst();
    }

    public void clear(){
        this.decisions.clear();
    }

    public int length(){
        return decisions.size();
    }

    public boolean isEmpty(){
        return decisions.isEmpty();
    }
}

