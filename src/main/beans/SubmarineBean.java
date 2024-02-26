package main.beans;

public class SubmarineBean {

    //Attributs
    private String name;
    private int depth;

    public static void main(String[] args) {
        SubmarineBean s = new SubmarineBean();
        s.setName("Squall");
        s.dive();
        s.dive();
        s.rise();
        s.rise();
        s.rise();
        System.out.println(s.getName() + " " + s.getDepth());
    }


    //Méthode d'instance

    public void dive() {
        depth -= 50;
    }

    public void rise() {
        depth += 50;
        if(depth>= 0){
            depth = 0;
        }
    }

    //Getter setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepth() {
        return depth;
    }
}
