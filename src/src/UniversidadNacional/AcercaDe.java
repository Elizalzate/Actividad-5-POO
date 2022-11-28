package UniversidadNacional;

import javax.swing.*;
import java.awt.*;

public class AcercaDe extends JInternalFrame {


    public AcercaDe() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Acerca de");
        setBackground(new Color(160,165,245));

        JButton btnSalir = new JButton();
        JScrollPane scrollPane = new JScrollPane();
        JTextArea txtAcercaDe = new JTextArea();


        btnSalir.setText("Salir");
        btnSalir.setFont(new Font("Segoe UI", Font.PLAIN, 30));
        btnSalir.addActionListener(evt -> Exit());

        txtAcercaDe.setColumns(22);
        txtAcercaDe.setRows(6);
        txtAcercaDe.setText("""
                Elízabeth Alzate Zapata\s
                ealzatez@unal.edu.co\s
                Programación Orientada a Objetos\s
                Universidad Nacional\s
                Sede Medellín\s
                Noviembre, 2022""");
        txtAcercaDe.setEditable(false);
        txtAcercaDe.setAutoscrolls(false);
        txtAcercaDe.setFont(new Font("Segoe UI", Font.BOLD, 24));
        txtAcercaDe.setBorder(BorderFactory.createLineBorder(new java.awt.Color(255, 255, 250), 15));
        scrollPane.setViewportView(txtAcercaDe);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(btnSalir, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(160, 160, 160)
                        )
                        .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        )
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(25, Short.MAX_VALUE)
                                .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 25, 30)
                                .addComponent(btnSalir)
                                .addGap(35, 35, 35)
                        )
        );
        pack();
    }
    private void Exit() {
        this.dispose();
    }

}
