import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Deposito {
    private JTextField depotext;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a0Button;
    private JButton ingresarButton;
    public JPanel depo;
    private JButton MENUButton;

    public Deposito() {
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                depotext.setText(depotext.getText()+"1");
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                depotext.setText(depotext.getText()+"2");
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                depotext.setText(depotext.getText()+"3");
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                depotext.setText(depotext.getText()+"4");
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                depotext.setText(depotext.getText()+"5");
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                depotext.setText(depotext.getText()+"6");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                depotext.setText(depotext.getText()+"7");
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                depotext.setText(depotext.getText()+"8");
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                depotext.setText(depotext.getText()+"9");
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                depotext.setText(depotext.getText()+"0");
            }
        });
        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                depotext.setText(depotext.getText());
                JOptionPane.showMessageDialog(null, "Su deposto fue agregado correctamente", "Deposito correcto", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        MENUButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(MENUButton);
                frame.dispose();
                JFrame frames = new JFrame("QUE TRANSACCION VA A REALIZAR");
                frames.setContentPane(new Transaccion().transaccion);
                frames.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frames.pack();
                frame.setLocationRelativeTo(null);
                frames.setVisible(true);
            }
        });
    }
}
