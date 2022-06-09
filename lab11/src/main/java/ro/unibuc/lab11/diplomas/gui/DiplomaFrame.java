package ro.unibuc.lab11.diplomas.gui;

import javax.swing.JFrame;

public class DiplomaFrame extends JFrame {

    public DiplomaFrame() {
        setContentPane(new DiplomaForm().getRootPanel());
        setTitle("Diploma management");
        setSize(800, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}
