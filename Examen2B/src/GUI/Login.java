import BusinessLogic.Encriptar;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {
    private JLabel userLabel, passwordLabel;
    private JTextField userField;
    private JPasswordField passwordField;
    private JButton emojiButton;
    private int ejIntentosLogin = 0;
    private final int EJ_MAXIMO_INTENTOS = 3;

    public Login() {
        // Configurar la ventana
        setTitle("Login");
        setSize(300, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Definir los elementos de la interfaz
        userLabel = new JLabel("Usuario:");
        passwordLabel = new JLabel("Contraseña:");
        userField = new JTextField(20);
        passwordField = new JPasswordField(20);
        emojiButton = new JButton();

        //Definir la imagen del icono
        ImageIcon emojiIcon = new ImageIcon("C:/Users/Ivan/Pictures/Examen2B/src/images/icon.png");
        emojiButton.setIcon(emojiIcon);

        emojiButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                login();
            }
        });

        //Configurar el panel y sus elementos
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1));
        panel.setBackground(Color.white);
        panel.add(userLabel);
        panel.add(userField);
        panel.add(passwordLabel);
        
        panel.add(passwordField);
        panel.add(emojiButton);

        //Agregar el panel a la ventana de Log in
        getContentPane().add(panel);
        setVisible(true);
    }

    private void login() {
        String ejUsuario = userField.getText();
        //Uso de .getPassword() para que aparezcan puntos en lugar de 
        //mostrar la contraseña
        String ejContra = new String(passwordField.getPassword());

        //Encriptación de la contraseña
        String ejEncrypted = Encriptar.ejEncriptarMD5(ejContra);

        //Verificación de información de log-in

        if ((ejUsuario.equals("edison.jimenez03@epn.edu.ec") && ejEncrypted.equals("02c50857b95537844acfd17adcfea503")) ||
                (ejUsuario.equals("profe") && ejEncrypted.equals("81dc9bdb52d04dc20036dbd8313ed055"))) {
            JOptionPane.showMessageDialog(this, "Inicio exitoso");
            dispose(); // cerrar la ventana
        } else {
            ejIntentosLogin++;
            if (ejIntentosLogin == EJ_MAXIMO_INTENTOS) {
                JOptionPane.showMessageDialog(this, "Se agotaron sus intentos");
                dispose(); // cerrar la ventana
            } else {
                JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos");
            }
    }
}
}