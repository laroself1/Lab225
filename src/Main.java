public class Main {
    public static void main(String[] args) {
        int a=5;
        int b = 10;
        double R = 5.0;
A object = new A();
        System.out.println("площадь круга: "+object.calcSquare(R));
        System.out.println("площадь квадрата: " + object.calcSquare(a));
        System.out.println("площадь прямоугольника: "+ object.calcSquare(a,b));  }}
