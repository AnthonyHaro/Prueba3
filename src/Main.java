import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("EL BUEN BUHO");
        frame.setContentPane(new Transaccion().transaccion);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}