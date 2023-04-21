public class Circle {

    private double radius, color;

    public Circle(){
        this.radius = 7.5;
        this.color = 0xFFFFFF;
    }

    public Circle(double radius){
        this.radius = radius;
        this.color = 0x00FF00;
    }

    public Circle(double radius, double color){
        this.radius = radius;
        this.color = color;
    }

    public void setColor(double color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public double getArea(){
        return (Math.PI * Math.pow(this.radius, 2));
    }

    public double getColor() { return this.color; }

    @Override
    public String toString(){
        return "Circle: radius = " + this.getRadius() + " color(hex) = " + Integer.toHexString((int)this.getColor());
    }

}
