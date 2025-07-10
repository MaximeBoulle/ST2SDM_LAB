package model;

import interfaces.PenaltyApplicable;
public class Penalty implements PenaltyApplicable {
    private double amount;
    private String reason;

    public Penalty(double amount, String reason) {
        this.amount = amount;
        this.reason = reason;
    }

    // Getters and setters
}