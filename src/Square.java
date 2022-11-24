public class Square extends Rectangle {
    public double side;
    Square(){
    }
    Square(double side){
        this.setSide(side);
    }
    Square(double side, String color, boolean lleno){
        this.setSide(side);
        this.setColor(color);
        this.setLleno(lleno);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
