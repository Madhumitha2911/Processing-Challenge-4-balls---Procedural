import processing.core.PApplet;

public class FourBallsChallenge extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 15;
    int ballOnePosition =0;
    int ballTwoPosition =0;
    int ballThreeEPosition =0;
    int ballFourPosition =0;

    public static void main(String[] args) {
        PApplet.main("FourBallsChallenge",args);
    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }


    @Override
    public void draw() {
        ellipse(ballFourPosition, ballHeight(4),DIAMETER,DIAMETER);
        ballFourPosition+=4;
        ellipse(ballThreeEPosition, ballHeight(3),DIAMETER,DIAMETER);
        ballThreeEPosition+=3;
        ellipse(ballTwoPosition, ballHeight(2),DIAMETER,DIAMETER);
        ballTwoPosition+=2;
        ellipse(ballOnePosition, ballHeight(1), DIAMETER,DIAMETER);
        ballOnePosition++;
    }

    private float ballHeight(int ballNo) {
        return (float) ((HEIGHT * ballNo) / 5.0);
    }
}
