public class Rectangle extends Shape{
    public double ancho;
    public double largo;
    Rectangle(){
    }
    Rectangle(double ancho, double largo){
        this.setAncho(ancho);
        this.setLargo(largo);
    }
    Rectangle(double ancho, double largo, String color, boolean lleno){
        this.setAncho(ancho);
        this.setLargo(largo);
        this.setColor(color);
        this.setLleno(lleno);
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
