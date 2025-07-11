package strategy;

import model.Borrowing;

public interface PenaltyCalculationStrategy {
    double calculatePenalty(Borrowing borrowing);
}
