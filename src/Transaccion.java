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

        public Transaccion() {buttonGroup = new ButtonGroup();
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

            }
        });
        RETIRORadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        VISUALIZARSUSALDORadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(VISUALIZARSUSALDORadioButton);
                frame.dispose();

                JFrame frames = new JFrame("TU SALDO ES");
                frames.setContentPane(new Saldo().saldo);
                frames.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frames.setSize(300, 300);
                frames.pack();
                frame.setLocationRelativeTo(null);
                frames.setVisible(true);
            }
        });
    }
}
