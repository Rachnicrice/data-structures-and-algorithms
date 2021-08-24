package code401challenges.GetEdge;

public class Trip {
    //instance variables
    Boolean direct;
    String cost;

    //constructor functions
    Trip (Boolean direct, String cost) {
        this.direct = direct;
        this.cost = cost;
    }

    Trip () {
        this.direct = false;
        this.cost = "$0";
    }
}
