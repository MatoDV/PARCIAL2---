public abstract class Shape {
    public String color;

    public boolean lleno;

    Shape(){
    }
    Shape(String color,boolean lleno){
        this.setColor(color);
        this.setLleno(lleno);
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isLleno() {
        return lleno;
    }

    public void setLleno(boolean lleno) {
        this.lleno = lleno;
    }
}
