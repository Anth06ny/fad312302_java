package main.beans;

public class HouseBean {
    //Attributs
    private int width;
    private int length;

    //méthode instance



    public int getArea(){
         return width * length;
    }

    //GETTER SETTER
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

}
