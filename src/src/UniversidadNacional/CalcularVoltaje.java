package UniversidadNacional;


import javax.swing.*;
import java.awt.*;

public class CalcularVoltaje extends JInternalFrame {
    private double corriente, resistencia, voltaje;
    private JButton btnCalcular, btnBorrar, btnSalir;
    private JLabel lblVoltaje, lblCorriente, lblResistencia;
    private JTextField txtVoltaje, txtCorriente, txtResistencia;

    public CalcularVoltaje() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Calcular voltaje");
        setBackground(new Color(240,245,255));

        btnSalir = new JButton();
        lblCorriente = new JLabel();
        lblResistencia = new JLabel();
        lblVoltaje = new JLabel();
        txtCorriente = new JTextField();
        txtResistencia = new JTextField();
        txtVoltaje = new JTextField();
        btnCalcular = new JButton();
        btnBorrar = new JButton();


        lblCorriente.setText("Corriente");
        lblResistencia.setText("Resistencia");
        lblVoltaje.setText("Voltaje");
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
        txtVoltaje.setEditable(false);


        btnCalcular.addActionListener(evt -> {
            SettingInfo();
            CalculaVoltaje(corriente, resistencia);
        });

        btnBorrar.addActionListener(evt -> ClearField());

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
                                        .addComponent(lblCorriente)
                                        .addComponent(lblResistencia)
                                        .addComponent(lblVoltaje)
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
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblResistencia)
                                        .addComponent(txtResistencia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblCorriente)
                                        .addComponent(txtCorriente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblVoltaje)
                                        .addComponent(txtVoltaje, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
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

    private void SettingInfo() {
        this.corriente = Double.parseDouble(txtCorriente.getText());
        this.resistencia = Double.parseDouble(txtResistencia.getText());
    }

    private void Exit() {
        this.dispose();
    }

    private void ClearField() {
        this.voltaje = 0;
        this.corriente = 0;
        this.resistencia = 0;
        txtVoltaje.setText("");
        txtCorriente.setText("");
        txtResistencia.setText("");
    }

    private void CalculaVoltaje(double corriente, double resistencia) {
        voltaje = corriente * resistencia;
        txtVoltaje.setText(String.valueOf(String.format("%.2f", voltaje)));
    }

}
