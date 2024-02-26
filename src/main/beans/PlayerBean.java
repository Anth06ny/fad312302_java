package main.beans;

public class PlayerBean {

    private String name;
    private int score;

    private boolean cheater;

    private CupBean cup = new CupBean();

    public PlayerBean(String name) {
        this.name = name;
    }




    public void setCheater(boolean cheater) {
        this.cheater = cheater;

        cup = new CupBean(cheater);
    }

    //Méthodes
    public void roll() {
        cup.roll();
    }

    public void add1Point() {
        score++;
    }

    //GETTER / SETTER

    public boolean isCheater() {
        return cheater;
    }

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
