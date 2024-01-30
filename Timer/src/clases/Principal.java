package clases;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author Josue
 */
public class Principal {

    public static void main(String[] args) {

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Tick");
            }
        };

        Timer timer = new Timer(1000, actionListener); // Cada 1000 ms (1 segundo)
        timer.start();

        while (timer.isRunning()) {
        }

        timer.stop();

    }
}
