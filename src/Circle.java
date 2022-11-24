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

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
