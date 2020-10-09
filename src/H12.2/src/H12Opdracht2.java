import java.awt.*;
import java.applet.*;

public class H12Opdracht2 extends Applet {

    public void init() {
        Button[] knop = new Button[26];
        int teller;
        for(teller = 0; teller < knop.length; teller++) {
            knop[teller] = new Button("" + teller);
            add(knop[teller]);
        }
    }

    public void paint(Graphics g) {
        setBackground(Color.red);
    }
}