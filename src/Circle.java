public class Circle extends Shape{
    public double radio;
    Circle(){
    }
    Circle(double radio){
        this.setRadio(radio);
    }
    Circle(double radio,String color,boolean lleno){
        this.setRadio(radio);
        this.setColor(color);
        this.setLleno(lleno);
    }
    @Override
    double getArea(){
        double area = radio * radio * Math.PI;
        return area;
    }

    @Override
    double getPerimetro(){
        double perimetro = 2*Math.PI*radio;
        return perimetro;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radio=" + radio +
                ", color='" + color + "" +
        ", lleno=" + lleno +
                ", area=" + getArea() +
                ", perimetro=" + getPerimetro() +
                '}';
    }


    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
