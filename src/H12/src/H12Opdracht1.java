import java.applet.*;
import java.awt.*;

public class H12Opdracht1 extends Applet {
    double[] getal;
    double totaal;



    public void init() {
        getal = new double[10];

    }

    public void paint(Graphics g) {
        getal[0] = 6.9;
        getal[1] = 4.5;
        getal[2] = 9.1;
        getal[3] = 1.4;
        getal[4] = 5.6;
        getal[5] = 7.4;
        getal[6] = 3.3;
        getal[7] = 4.9;
        getal[8] = 5.5;
        getal[9] = 4.2;

        totaal = 0;

        for (int teller = 0; teller < getal.length; teller ++) {
            g.drawString("" + getal[teller], 50, 20 * teller + 20);
            totaal += getal [teller];
        }
        g.drawString("het gemiddelde =" + totaal/getal.length, 50,20 * (getal.length) + 20);
    }
}