public class Main {
    public static void main(String[] args) {
     MovablePoint move1 = new MovablePoint(2,3,22,22);
        System.out.println("Move down");  move1.moveDown();
        System.out.println("Move up"); move1.moveUp();
        System.out.println("Move left"); move1.moveLeft();
        System.out.println(" Move right");move1.moveRight();
    }
}