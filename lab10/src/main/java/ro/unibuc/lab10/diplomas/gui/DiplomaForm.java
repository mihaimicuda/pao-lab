package ro.unibuc.lab10.diplomas.gui;

import ro.unibuc.lab10.diplomas.model.Diploma;
import ro.unibuc.lab10.diplomas.model.Specialization;
import ro.unibuc.lab10.diplomas.service.DiplomaService;

import javax.swing.*;

public class DiplomaForm {
    private JPanel rootPanel;
    private JLabel seriesLb1;
    private JTextField seriesTxt;
    private JTextField graduatedTxt;
    private JLabel graduateLbl;
    private JTextField yearTxt;
    private JLabel yearLbl;
    private JLabel facultyLbl;
    private JTextField facultyTxt;
    private JLabel specializationLbl;
    private JComboBox specializationCombo;
    private JLabel gradeLbl;
    private JTextField gradeTxt;
    private JButton addDiplomaButton;
    private JList diplomaList;

    private ComboBoxModel<Specialization> specializationComboBoxModel;
    private ListModel<Diploma> diplomaListModel;

    private DiplomaService diplomaService = new DiplomaService();

    public DiplomaForm() {
        specializationComboBoxModel = new DefaultComboBoxModel<>(Specialization.values());
        specializationCombo.setModel(specializationComboBoxModel);

        diplomaListModel = new DefaultListModel<>();
        diplomaList.setModel(diplomaListModel);
        displayDiplomas();

        addDiplomaButton.addActionListener(e -> {
            String series = seriesTxt.getText();
            String graduate = gradeTxt.getText();
            int year = Integer.parseInt(yearTxt.getText());
            String faculty = facultyTxt.getText();
            Specialization specialization = (Specialization) specializationCombo.getSelectedItem();
            double grade = Double.parseDouble(gradeTxt.getText());

            diplomaService.save(new Diploma(series, graduate, year, faculty, specialization, grade));

            clearComponents();
        });
    }

    private void displayDiplomas() {
        diplomaService.getAll().forEach(diploma -> diplomaListModel.);
    }

    private void clearComponents() {
        seriesTxt.setText("");
        gradeTxt.setText("");
        yearTxt.setText("");
        graduatedTxt.setText("");
        facultyTxt.setText("");
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
