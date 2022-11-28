package UniversidadNacional;

import javax.swing.*;
import java.awt.*;

public class Pitagoras extends JInternalFrame {
    private double hipotenusa, catetoA, catetoB;
    private JButton btnBorrar, btnCalcular, btnSalir;
    private JLabel lblLadoA, lblLadoB, lblHipotenusa;
    private JTextField txtHipotenusa, txtLadoA, txtLadoB;

    public Pitagoras() {
        initComponents();

        btnCalcular.addActionListener(evt -> {
            SettingInfo();
            CalcularHipotenusa(catetoA, catetoB);
        });

        btnBorrar.addActionListener(evt -> ClearFields());

        btnSalir.addActionListener(evt -> Exit());
    }

    private void initComponents() {
        setTitle("Calcular hipotenusa");
        setBackground(new Color(240,245,255));

        btnSalir = new JButton();
        lblLadoA = new JLabel();
        lblLadoB = new JLabel();
        lblHipotenusa = new JLabel();
        txtLadoA = new JTextField();
        txtLadoB = new JTextField();
        txtHipotenusa = new JTextField();
        btnCalcular = new JButton();
        btnBorrar = new JButton();

        lblLadoA.setText("Lado A");
        lblLadoB.setText("Lado B");
        lblHipotenusa.setText("Hipotenusa");
        btnCalcular.setText("Calcular");
        btnBorrar.setText("Borrar");
        btnSalir.setText("Salir");
        lblLadoA.setFont(new Font("Segoe UI", Font.PLAIN, 24));
        lblLadoB.setFont(new Font("Segoe UI", Font.PLAIN, 24));
        lblHipotenusa.setFont(new Font("Segoe UI", Font.PLAIN, 24));
        btnSalir.setFont(new Font("Segoe UI", Font.PLAIN, 24));
        btnBorrar.setFont(new Font("Segoe UI", Font.PLAIN, 24));
        btnCalcular.setFont(new Font("Segoe UI", Font.PLAIN, 24));
        txtLadoA.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        txtLadoB.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        txtHipotenusa.setFont(new Font("Segoe UI", Font.PLAIN, 22));
        txtHipotenusa.setEditable(false);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSalir)
                                .addGap(55, 55, 55))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(55, 55, 55)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addComponent(lblHipotenusa)
                                                        .addComponent(lblLadoB)
                                                        .addComponent(lblLadoA))
                                                .addGap(95, 95, 95)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtHipotenusa, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtLadoB, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtLadoA, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(55, 55, 55)
                                                .addComponent(btnCalcular)
                                                .addGap(50, 50, 50)
                                                .addComponent(btnBorrar)))
                                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(60, 60, 65)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lblLadoA)
                                                        .addComponent(txtLadoA, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addGap(20, 20, 20)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lblLadoB)
                                                        .addComponent(txtLadoB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addGap(23, 23, 23)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lblHipotenusa)
                                                        .addComponent(txtHipotenusa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE))
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btnCalcular)
                                                        .addComponent(btnBorrar)
                                                        .addComponent(btnSalir))
                                                .addGap(25, 25, 25))))
        );
        pack();
    }

    private void Exit() {
        this.dispose();
    }

    private void ClearFields() {
        hipotenusa = 0;
        catetoA = 0;
        catetoB = 0;
        txtLadoA.setText("");
        txtLadoB.setText("");
        txtHipotenusa.setText("");
    }

    private void SettingInfo() {
        catetoA = Double.parseDouble(txtLadoA.getText());
        catetoB = Double.parseDouble(txtLadoB.getText());
    }

    private void CalcularHipotenusa(double ladoA, double ladoB) {
        hipotenusa = Math.sqrt(Math.pow(ladoA, 2) + Math.pow(ladoB, 2));
        txtHipotenusa.setText(String.valueOf(String.format("%.2f", hipotenusa)));
    }
}
