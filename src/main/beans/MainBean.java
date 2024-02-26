package main.beans;

public class MainBean {

    public static void main(String[] args) {


        PartyBean pb = new PartyBean("Toto", "tata");

        for (int i = 0; i < 3; i++) {
            pb.getJ1().roll();
            if (pb.getJ1().getCup().getScoreDices() >= 7) {
                pb.getJ1().add1Point();
            }

            pb.getJ2().roll();
            if (pb.getJ2().getCup().getScoreDices() >= 7) {
                pb.getJ2().add1Point();
            }


            pb.add1Round();
        }


        PlayerBean winner = pb.winner();
        if(winner != null) {
            System.out.print(winner.getName() + " a gagné : ");
        }
        else {
            System.out.print("Egalité : ");
        }

        System.out.println(pb.getJ1().getScore() + " - " + pb.getJ2().getScore());

    }
}
