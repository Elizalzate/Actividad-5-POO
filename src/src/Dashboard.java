import Figuras.DashboardFiguras;
import Notas.Notas;
import UniversidadNacional.VentanaPrincipal;

import javax.swing.*;

public class Dashboard extends JFrame {
    private JPanel frmInicio;
    private JButton btnMenus, btnNotas, btnFiguras;


    public Dashboard() {
        btnMenus.addActionListener(e -> {
            VentanaPrincipal menus = new VentanaPrincipal();
            menus.loadForm();
        });
        btnNotas.addActionListener(e -> {
            Notas notas = new Notas();
            notas.loadForm();
        });
        btnFiguras.addActionListener(e -> {
            DashboardFiguras figuras = new DashboardFiguras();
            figuras.loadForm();
        });
    }

    public void loadForm() {
        setContentPane(new Dashboard().frmInicio);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
    }
}
