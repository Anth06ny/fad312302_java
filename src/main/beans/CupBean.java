package main.beans;

public class CupBean {

    //Attributs
    private DiceBean d1;
    private DiceBean d2 = new DiceBean();

    //Constructeur
    public CupBean() {
        this(false);
        //d1 = new DiceBean();
    }

    public CupBean(boolean cheat) {
        if (cheat) {
            d1 = new LoadedDiceBean(6);
        } else {
            d1 = new DiceBean();
        }
    }

    //méthode
    public void roll() {
        d1.roll();
        d2.roll();
    }

    public int getScoreDices() {
        return d1.getValue() + d2.getValue();
    }


    //getter / Setter
    public DiceBean getD1() {
        return d1;
    }

    public void setD1(DiceBean d1) {
        this.d1 = d1;
    }

    public DiceBean getD2() {
        return d2;
    }

    public void setD2(DiceBean d2) {
        this.d2 = d2;
    }
}
