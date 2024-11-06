public class MovablePoint implements Movable{
    private int x;
    private int y;
    private int ySpeed;
    private int xSpeed;

    public MovablePoint(int x, int y, int ySpeed, int xSpeed) {
        this.x = x;
        this.y = y;
        this.ySpeed = ySpeed;
        this.xSpeed = xSpeed;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getySpeed() {
        return ySpeed;
    }

    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    @Override
    public void moveUp() {
        System.out.println( y+=ySpeed);    }

    @Override
    public void moveDown() {
        System.out.println(  y-=ySpeed);

    }

    @Override
    public void moveLeft() {
        System.out.println( x-=xSpeed);
    }

    @Override
    public void moveRight() {
        System.out.println(  x+=xSpeed);
    }
}
