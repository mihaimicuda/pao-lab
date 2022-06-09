package ro.unibuc.lab10.diplomas.gui;

import ro.unibuc.lab10.diplomas.model.Diploma;
import ro.unibuc.lab10.diplomas.model.Specialization;
import ro.unibuc.lab10.diplomas.service.DiplomaService;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ListModel;

public class DiplomaForm {
    private JPanel rootPanel;
    private JLabel seriesLbl;
    private JTextField seriesTxt;
    private JLabel graduateLbl;
    private JTextField graduateTxt;
    private JLabel yearLbl;
    private JTextField yearTxt;
    private JLabel facultyLbl;
    private JTextField facultyTxt;
    private JLabel specializationLbl;
    private JComboBox specializationCmb;
    private JLabel gradeLbl;
    private JTextField gradeTxt;
    private JButton addBtn;
    private JList diplomaList;

    private ComboBoxModel<Specialization> specializationComboBoxModel;
    private DefaultListModel<Diploma> diplomaListModel;

    private DiplomaService diplomaService = new DiplomaService();

    public DiplomaForm() {
        specializationComboBoxModel = new DefaultComboBoxModel<>(Specialization.values());
        specializationCmb.setModel(specializationComboBoxModel);

        diplomaListModel = new DefaultListModel<>();
        diplomaList.setModel(diplomaListModel);
        displayDiplomas();


        addBtn.addActionListener(e -> {
            String series = seriesTxt.getText();
            String graduate = graduateTxt.getText();
            int year = Integer.valueOf(yearTxt.getText());
            String faculty = facultyTxt.getText();
            Specialization specialization = (Specialization) specializationCmb.getSelectedItem();
            double grade = Double.valueOf(gradeTxt.getText());

            diplomaService.save(new Diploma(series, graduate, year, faculty, specialization, grade));

            clearComponents();

            displayDiplomas();
        });
    }

    private void displayDiplomas() {
        diplomaListModel.clear();
        diplomaService.getAll().forEach(diploma -> diplomaListModel.addElement(diploma));
    }

    private void clearComponents() {
        seriesTxt.setText("");
        graduateTxt.setText("");
        yearTxt.setText("");
        facultyTxt.setText("");
        specializationCmb.setSelectedIndex(0);
        gradeTxt.setText("");
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }
}
