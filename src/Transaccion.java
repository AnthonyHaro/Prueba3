import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Transaccion {
    public JPanel transaccion;
    private JRadioButton VISUALIZARSUSALDORadioButton;
    private JRadioButton RETIRORadioButton;
    private JRadioButton DEPOSITORadioButton;
    private JRadioButton SALIRRadioButton;
    private ButtonGroup buttonGroup;

    public Transaccion() {
        buttonGroup = new ButtonGroup();
        buttonGroup.add(VISUALIZARSUSALDORadioButton);
        buttonGroup.add(RETIRORadioButton);
        buttonGroup.add(DEPOSITORadioButton);
        buttonGroup.add(SALIRRadioButton);
        SALIRRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "¡Muchas gracias por su visita!", "Gracias por Preferirnos", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
        });
        DEPOSITORadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(DEPOSITORadioButton);
                frame.dispose();

                JFrame frames = new JFrame("DEPOSITO");
                frames.setUndecorated(true);
                frames.setContentPane(new Deposito().depo);
                frames.setSize(400,350);
                frames.setLocationRelativeTo(null);
                frames.setVisible(true);
            }
        });
        RETIRORadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(VISUALIZARSUSALDORadioButton);
                frame.dispose();

                JFrame frames = new JFrame("RETIRO");
                frames.setUndecorated(true);
                frames.setContentPane(new Retiro().retir);
                frames.setSize(400,350);
                frames.setLocationRelativeTo(null);
                frames.setVisible(true);


            }
        });
        VISUALIZARSUSALDORadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(VISUALIZARSUSALDORadioButton);
                frame.dispose();
                JFrame frames = new JFrame("SALDO");
                frames.setUndecorated(true);
                frames.setContentPane(new Saldo().saldo);
                frames.setSize(400,350);
                frames.setLocationRelativeTo(null);
                frames.setVisible(true);
            }
        });
    }
}
