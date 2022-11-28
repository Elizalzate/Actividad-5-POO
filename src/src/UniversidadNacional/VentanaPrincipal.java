package UniversidadNacional;

import javax.swing.*;
//import java.util.logging.*;

public class VentanaPrincipal extends JFrame {

    private JDesktopPane myDesktopPane;
    private JMenuBar menuBarPrincipal;
    private JMenu archivo, pitagoras, ohm, acercaDe;
    private JMenuItem salir, calcularHipotenusa, calcularCorriente, calcularVoltaje, verAcercaDe;

    public VentanaPrincipal() {
        initComponents();
    }

    /*
        public static void main(String[] args) {
            try {
                for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                     UnsupportedLookAndFeelException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }

            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new VentanaPrincipal().setVisible(true);
                }
            });
        }
    */
    public void loadForm() {
        setTitle("Aplicación para la Universidad Nacional de Colombia");
        setExtendedState(MAXIMIZED_BOTH);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
    }

    private void CalcularCorriente() {
        CalcularCorriente corriente = new CalcularCorriente();
        myDesktopPane.add(corriente);
        corriente.setClosable(true);
        corriente.setVisible(true);
    }

    private void CalcularVoltaje() {
        CalcularVoltaje voltaje = new CalcularVoltaje();
        myDesktopPane.add(voltaje);
        voltaje.setClosable(true);
        voltaje.setVisible(true);
    }

    private void CalcularHipotenusa() {
        Pitagoras pitagoras = new Pitagoras();
        myDesktopPane.add(pitagoras);
        pitagoras.setClosable(true);
        pitagoras.setVisible(true);
    }

    private void VerAcercaDe() {
        AcercaDe acercaDe = new AcercaDe();
        myDesktopPane.add(acercaDe);
        acercaDe.setClosable(true);
        acercaDe.setVisible(true);
    }

    private void ExitMenuDashboard() {
        this.dispose();
    }


    private void initComponents() {
        myDesktopPane = new JDesktopPane();
        menuBarPrincipal = new JMenuBar();
        archivo = new JMenu();
        salir = new JMenuItem();
        pitagoras = new JMenu();
        calcularHipotenusa = new JMenuItem();
        ohm = new JMenu();
        calcularVoltaje = new JMenuItem();
        calcularCorriente = new JMenuItem();
        acercaDe = new JMenu();
        verAcercaDe = new JMenuItem();

        myDesktopPane.setBackground(new java.awt.Color(158, 215, 255));

        GroupLayout desktopLayout = new GroupLayout(myDesktopPane);
        myDesktopPane.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
                desktopLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
                desktopLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE)
        );

        menuBarPrincipal.add(archivo);
        menuBarPrincipal.add(pitagoras);
        menuBarPrincipal.add(ohm);
        menuBarPrincipal.add(acercaDe);

        archivo.setText("Archivo");
        salir.setText("Salir");
        archivo.add(salir);

        salir.addActionListener(evt -> ExitMenuDashboard());


        pitagoras.setText("Pitágoras");
        calcularHipotenusa.setText("Calcular hipotenusa");
        pitagoras.add(calcularHipotenusa);

        calcularHipotenusa.addActionListener(evt -> CalcularHipotenusa());


        ohm.setText("Ohm");
        calcularVoltaje.setText("Calcular voltaje");
        ohm.add(calcularVoltaje);

        calcularVoltaje.addActionListener(evt -> CalcularVoltaje());

        calcularCorriente.setText("Calcular corriente");
        calcularCorriente.addActionListener(evt -> CalcularCorriente());
        ohm.add(calcularCorriente);


        acercaDe.setText("Acerca de");
        verAcercaDe.setText("Ver acerca de");
        acercaDe.add(verAcercaDe);

        verAcercaDe.addActionListener(evt -> VerAcercaDe());


        setJMenuBar(menuBarPrincipal);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(myDesktopPane)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(myDesktopPane)
        );
        pack();
    }
}
