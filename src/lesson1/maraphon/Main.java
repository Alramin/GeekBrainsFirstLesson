package lesson1.maraphon;

import lesson1.maraphon.competitors.Cat;
import lesson1.maraphon.competitors.Competitor;
import lesson1.maraphon.competitors.Human;
import lesson1.maraphon.competitors.Robot;
import lesson1.maraphon.obstacle.CrossRoad;
import lesson1.maraphon.obstacle.Obstacle;
import lesson1.maraphon.obstacle.Wall;

public class Main {
    public static void main(String[] args) {
        Competitor[] competitors ={
                new Human("Vasia"),
                new Cat("Barsik"),
                new Robot("Bender")
        };
        Obstacle[] obstacles ={
                new Wall(5),
                new CrossRoad(500)
        };
        for ( Competitor c:competitors ) {
            for (Obstacle o:obstacles ) {
                o.doIt(c);
                if(!c.isDistance()){
                    break;
                }
            }
        }

        for (Competitor c:competitors) {
            c.info();
        }
    }
}
