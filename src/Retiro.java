import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Retiro {
    public JPanel retir;
    private JTextField retitext;
    private JButton a1Button;
    private JButton a3Button;
    private JButton a2Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a0But;
    private JButton ingresarButton;
    private JButton MENUButton;

    public Retiro() {
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                retitext.setText(retitext.getText()+"1");
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                retitext.setText(retitext.getText()+"2");
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                retitext.setText(retitext.getText()+"3");
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                retitext.setText(retitext.getText()+"4");
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                retitext.setText(retitext.getText()+"5");
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                retitext.setText(retitext.getText()+"6");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                retitext.setText(retitext.getText()+"7");
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                retitext.setText(retitext.getText()+"8");
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                retitext.setText(retitext.getText()+"9");
            }
        });
        a0But.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                retitext.setText(retitext.getText()+"0");
            }
        });
        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                retitext.setText(retitext.getText());
                JOptionPane.showMessageDialog(null, "Su retiro fue exitoso", "Retiro exitoso", JOptionPane.INFORMATION_MESSAGE);
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
