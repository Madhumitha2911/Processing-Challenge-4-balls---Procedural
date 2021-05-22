import processing.core.PApplet;

public class FourBallsChallenge extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 15;

    public static void main(String[] args) {
        PApplet.main("FourBallsChallenge",args);
    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }


    @Override
    public void draw() {
        ellipse(0, ballHeight(4),DIAMETER,DIAMETER);
        ellipse(0, ballHeight(3),DIAMETER,DIAMETER);
        ellipse(0, ballHeight(2),DIAMETER,DIAMETER);
        ellipse(0, ballHeight(1), DIAMETER,DIAMETER);
    }

    private float ballHeight(int ballNo) {
        return (HEIGHT * ballNo) / 5;
    }
}
