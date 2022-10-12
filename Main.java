public class Main {
    public static void main(String[] args) {
        Point point = new Point(20,30);
        System.out.println(point);
        point.setXY(10,20);
        System.out.println(point);
        point = new MovablePoint(point.getX(),point.getY(),10,20);
        System.out.println(point);
        ((MovablePoint) point).move();
        System.out.println(point);
        MovablePoint movablePoint = new MovablePoint(20,20);
        System.out.println(movablePoint);
        movablePoint.move();
        System.out.println(movablePoint);

    }
}