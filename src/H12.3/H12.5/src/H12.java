import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class H12 extends Applet {

    int array[] = {10, 20, 30, 40, 50};
    TextField tekstvak;
    Label label;
    int getal;
    boolean gevonden;
    Button knop;

    public void init() {
        knop = new Button("OK");
        knop.addActionListener(new Listener());

        label = new Label("Zoek naar een getal");

        tekstvak = new TextField("", 10);
        tekstvak.addActionListener(new Listener());

        add(label);
        add(tekstvak);
        add(knop);
    }

    public void paint(Graphics g) {
        setBackground(Color.lightGray);
        if (gevonden == true) {
            g.drawString("Gevonden: " + getal, 10, 40);
        } else {
            g.drawString("Niet gevonden", 10, 40);
        }

    }

    class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String output = tekstvak.getText();
            getal = Integer.parseInt(output);
            int teller = 0;
            gevonden = false;
            while (teller < array.length) {
                if (array[teller] == getal) {
                    gevonden = true;
                    break;
                }
                teller++;
            }
            repaint();
        }
    }
}
