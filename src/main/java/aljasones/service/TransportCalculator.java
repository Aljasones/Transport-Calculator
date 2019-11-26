package aljasones.service;
import aljasones.model.Box;

public class TransportCalculator {
    int costOnKg;
    int costOnKm;

    public TransportCalculator(int costOnKg, int costOnKm) {
        this.costOnKg = costOnKg;
        this.costOnKm = costOnKm;
    }


    public int cost (Box box, int km) {
        return (box.getWeightInKg() * costOnKg) + (km * costOnKm);
    }
}
