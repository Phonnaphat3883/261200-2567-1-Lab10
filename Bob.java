public class Bob implements Runnable {
    private int positionX, positionY;
    private String penColor;
    public Bob(int positionX, int positionY, String penColor) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.penColor = penColor;
    }

    @Override
    public void run() {
        Turtle bob = new Turtle(this.positionX, this.positionY);
        bob.penColor(this.penColor);
        bob.speed(4);
        for (int i = 0; i < 4; i++) {
            bob.forward(100); 
            bob.left(90); 
        }

        for (int i = 0; i < 3; i++) {
            bob.forward(100);
            bob.left(120); 
        }

        for (int i = 0; i < 360; i++) {
            bob.forward(1); 
            bob.left(1); 
         }    
    }
}