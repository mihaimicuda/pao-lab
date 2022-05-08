package ro.unibuc.lab10.diplomas.gui;

import javax.swing.*;
import java.awt.*;

public class DiplomaFrame extends JFrame {
    public DiplomaFrame(){
        setContentPane(new DiplomaForm().getRootPanel());
        setTitle("Diploma Management");
        setSize(800,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}
