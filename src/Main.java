public class Main {
    public static void main(String[] args) {
    Shape circulo = new Circle(1.0,"red",true);

    Shape rectangulo = new Rectangle(1.0,1.0,"red",true);

    Shape cuadrado = new Square(1.0,"red",true);

        Shape s1 = new Circle(5.5, "red", false);
        //Shape s2 = new Shape();
        Shape s3 = new Rectangle(1.0, 2.0, "red", false);
        Shape s4 = new Square(6.6);



        System.out.println(circulo);
        System.out.println(rectangulo);
        System.out.println(cuadrado);

        System.out.println(s1);
        //System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}
