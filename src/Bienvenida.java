import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bienvenida {
    JPanel bienvenido;
    private JPasswordField contra;
    private JButton a1Button;
    private JButton a3Button;
    private JButton a2Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton a0Button;
    private JButton button11;
    private JButton ingresarButton;
    private JButton SALIRButton;

    public Bienvenida() {
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contra.setText(contra.getText()+"1");
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contra.setText(contra.getText()+"2");
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contra.setText(contra.getText()+"3");
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contra.setText(contra.getText()+"4");
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contra.setText(contra.getText()+"5");
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contra.setText(contra.getText()+"6");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contra.setText(contra.getText()+"7");
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contra.setText(contra.getText()+"8");
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contra.setText(contra.getText()+"9");
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contra.setText(contra.getText()+"0");
            }
        });
        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String clave= contra.getText();
                    contra.setText("");
                    for (int i=1;i<clave.length();i++){
                        contra.setText(contra.getText()+clave.charAt(i-1));
                    }
                }catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pala= contra.getText();
                if (pala.equals("1234")){
                    JFrame frame=(JFrame) SwingUtilities.getWindowAncestor(ingresarButton);
                    frame.dispose();
                    JFrame frames = new JFrame("DEPOSITO");
                    frames.setUndecorated(true);
                    frames.setContentPane(new Transaccion().transaccion);
                    frames.setSize(400,350);
                    frames.setLocationRelativeTo(null);
                    frames.setVisible(true);
                }
                else{
                    contra.setText("");
                    JOptionPane.showMessageDialog(null, "La contraseña ingresada no es correcta", "Error", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        SALIRButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "¡Muchas gracias por su visita!", "Gracias por Preferirnos", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
        });
    }
}
