package lesson1.maraphon.obstacle;

import lesson1.maraphon.competitors.Competitor;

public class CrossRoad extends Obstacle {
    private int length;

    public CrossRoad(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.run(length);
    }
}
