public class TestCircle {

    public void main(){
        Circle circleObj1 = new Circle(12.5);
        Circle circleObj2 = new Circle();
        Circle circleObj3 = new Circle(18.78, 0xFF0000);
        Circle circleObj4 = new Circle();

        System.out.println("circle1 has radius of " + circleObj1.getRadius() + " and area of " + circleObj1.getArea() + " and color(hex) " + Integer.toHexString((int)circleObj1.getColor()));
        System.out.println(circleObj1);

        System.out.println("circle2 has radius of " + circleObj2.getRadius() + " and area of " + circleObj2.getArea() + " and color(hex) " + Integer.toHexString((int)circleObj2.getColor()));
        System.out.println(circleObj2);

        System.out.println("circle3 has radius of " + circleObj3.getRadius() + " and area of " + circleObj3.getArea() + " and color(hex) " + Integer.toHexString((int)circleObj3.getColor()));
        System.out.println(circleObj3);

        circleObj4.setRadius(26.35);
        circleObj4.setColor(0xFFFF00);

        System.out.println("circle4 has radius of " + circleObj4.getRadius() + " and area of " + circleObj4.getArea() + " and color(hex) " + Integer.toHexString((int)circleObj4.getColor()));
        System.out.println(circleObj4);

    }
}
