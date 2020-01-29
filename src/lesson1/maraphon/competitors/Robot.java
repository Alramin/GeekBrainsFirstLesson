package lesson1.maraphon.competitors;

public class Robot implements Competitor{
    String name;
    int maxRunDistance;
    int maxJumpHeigth;


    boolean active;

    public Robot(String name, int maxRunDistance, int maxJumpHeigth) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeigth = maxJumpHeigth;
        this.active = true;
    }

    public Robot(String name) {
        this(name,4000,14);

    }

    @Override
    public void run(int dist) {
        if (dist <= maxRunDistance) {
            System.out.println(name + " успешно пробежал");
        } else {
            System.out.println(name + " провалил тест на бег");
            active = false;
        }
    }

    @Override
    public void jump(int heigth) {
        if (heigth <= maxJumpHeigth) {
            System.out.println(name + " успешно перепрыгнул");
        } else {
            System.out.println(name + " провалил тест на прыжок");
            active = false;
        }
    }

   

    @Override
    public boolean isDistance() {
        return active;
    }

    @Override
    public void info() {
        System.out.println( name + " "+ active);
    }
}
