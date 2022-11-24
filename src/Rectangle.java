public class Rectangle extends Shape{
    public double ancho;
    public double largo;
    Rectangle(){
    }
    Rectangle(double ancho, double largo){
    }
    Rectangle(double ancho, double largo, String color, boolean lleno){
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }
}
