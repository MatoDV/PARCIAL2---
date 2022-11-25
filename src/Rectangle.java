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
    @Override
    double getArea(){
        double area = largo * ancho;
        return area;
    }

    @Override
    double getPerimetro(){
        double perimetro = 2*largo + 2*ancho;
        return perimetro;
    }

    @Override
    public String toString() {
            return "Rectangulo{" +
                    "ancho=" + ancho + "largo="+largo+
                    ", color='" + color + "" +
            ", lleno=" + lleno +
                    ", area=" + getArea() +
                    ", perimetro=" + getPerimetro() +
                    '}';
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
