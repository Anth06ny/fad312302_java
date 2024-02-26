package main.beans;

public class PlayerBean {

    private String name;
    private int score;
    private CupBean cup = new CupBean();

    public PlayerBean(String name) {
        this.name = name;
    }

    //Méthodes
    public void roll() {
        cup.roll();
    }

    public void add1Point() {
        score++;
    }

    //GETTER / SETTER
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public CupBean getCup() {
        return cup;
    }

    public void setCup(CupBean cup) {
        this.cup = cup;
    }
}
