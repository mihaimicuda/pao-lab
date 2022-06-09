package ro.unibuc.lab10.diplomas.gui;

import javax.swing.JFrame;
import java.awt.Dimension;

public class DiplomaFrame extends JFrame {

    public DiplomaFrame() {
        setContentPane(new DiplomaForm().getRootPanel());
        setTitle("Diploma management");
        setSize(800, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}
