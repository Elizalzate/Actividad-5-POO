package UniversidadNacional;

import javax.swing.*;
import java.awt.*;

public class CalcularCorriente extends JInternalFrame {
    private double voltaje, corriente, resistencia;
    private JButton btnBorrar;
    private JButton btnCalcular;
    private JButton btnSalir;
    private JLabel lblVoltaje;
    private JLabel lblResistencia;
    private JLabel lblCorriente;
    private JTextField txtCorriente;
    private JTextField txtResistencia;
    private JTextField txtVoltaje;

    public CalcularCorriente() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Calcular corriente");
        setBackground(new Color(240,245,255));

        btnSalir = new JButton();
        lblVoltaje = new JLabel();
        lblResistencia = new JLabel();
        btnCalcular = new JButton();
        lblCorriente = new JLabel();
        txtVoltaje = new JTextField();
        txtResistencia = new JTextField();
        txtCorriente = new JTextField();
        btnBorrar = new JButton();

        lblVoltaje.setText("Voltaje");
        lblResistencia.setText("Resistencia");
        lblCorriente.setText("Corriente");
        btnCalcular.setText("Calcular");
        btnBorrar.setText("Borrar");
        btnSalir.setText("Salir");
        lblVoltaje.setFont(new Font("Segoe UI", Font.PLAIN, 24));
        lblCorriente.setFont(new Font("Segoe UI", Font.PLAIN, 24));
        lblResistencia.setFont(new Font("Segoe UI", Font.PLAIN, 24));
        txtVoltaje.setFont(new Font("Segoe UI", Font.PLAIN, 26));
        txtCorriente.setFont(new Font("Segoe UI", Font.PLAIN, 26));
        txtResistencia.setFont(new Font("Segoe UI", Font.PLAIN, 26));
        btnSalir.setFont(new Font("Segoe UI", Font.PLAIN, 24));
        btnBorrar.setFont(new Font("Segoe UI", Font.PLAIN, 24));
        btnCalcular.setFont(new Font("Segoe UI", Font.PLAIN, 24));
        txtCorriente.setEditable(false);

        btnCalcular.addActionListener(evt -> {
                    SettingInfo();
                    CalculaCorriente(voltaje, resistencia);
                }
        );
        btnBorrar.addActionListener(evt -> ClearFields());
        btnSalir.addActionListener(evt -> Exit());

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCalcular)
                                .addGap(40, 40, 40)
                                .addComponent(btnBorrar)
                                .addGap(40, 40, 40)
                                .addComponent(btnSalir)
                                .addGap(40, 40, 40))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(lblVoltaje)
                                        .addComponent(lblCorriente)
                                        .addComponent(lblResistencia)
                                )
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addComponent(txtResistencia, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtVoltaje, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtCorriente, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE))
                                                .addGap(34, 34, 34))
                                ))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblVoltaje)
                                        .addComponent(txtVoltaje, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblResistencia)
                                        .addComponent(txtResistencia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblCorriente)
                                        .addComponent(txtCorriente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(70,70,70))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnCalcular)
                                        .addComponent(btnBorrar)
                                        .addComponent(btnSalir)
                                )
                                .addGap(45, 45, 45)
                        )
        );

        pack();
    }

    private void Exit() {
        this.dispose();
    }

    private void SettingInfo() {
        this.voltaje = Double.parseDouble(txtVoltaje.getText());
        this.resistencia = Double.parseDouble(txtResistencia.getText());
    }

    private void ClearFields() {
        voltaje = 0;
        corriente = 0;
        resistencia = 0;
        txtCorriente.setText(null);
        txtVoltaje.setText(null);
        txtResistencia.setText(null);
    }

    private void CalculaCorriente(double voltaje, double resistencia) {
        corriente = voltaje / resistencia;
        txtCorriente.setText(String.valueOf(String.format("%.2f", corriente)));
    }

}
