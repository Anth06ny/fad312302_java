package main.beans;

public class AirportBean {

    private PlaneBean place1;
    private PlaneBean place2;

    public static void main(String[] args) {
        PlaneBean a1 = new PlaneBean();
        a1.setName("A1");
        PlaneBean a2 = new PlaneBean();
        a1.setName("A2");

        AirportBean airportBean = new AirportBean();

        int nextPLace = airportBean.nextFreePlace();
        System.out.println(airportBean.park(a2, nextPLace));

        System.out.println(airportBean.park(a2, nextPLace));

        nextPLace = airportBean.nextFreePlace();
        System.out.println(airportBean.park(a1, nextPLace));

        airportBean.state();

        System.out.println(airportBean.nextFreePlace());


    }


    public void state() {
        System.out.print("Place1=");
        if (place1 == null) {
            System.out.println("vide");
        } else {
            System.out.println(place1.getName());
        }

        System.out.println("Place2=" + (place2 == null ? "vide" : place2.getName()));
    }

    public String park(PlaneBean plane, int position) {
        if (position == 1) {
            if (place1 == null) {
                place1 = plane;
                return "ok";
            } else {
                return "La place 1 est ocupée";
            }
        } else if (position == 2) {
            if (place2 == null) {
                place2 = plane;
                return "ok";
            } else {
                return "La place 2 est ocupée";
            }
        } else {
            return "Position incorrecte";
        }
    }

    public int nextFreePlace() {
        if (place1 == null) {
            return 1;
        } else if (place2 == null) {
            return 2;
        }

        return -1;
    }

}
