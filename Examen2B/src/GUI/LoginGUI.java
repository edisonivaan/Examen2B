package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGUI extends JFrame {
    private JLabel userLabel, passwordLabel;
    private JTextField userField;
    private JPasswordField passwordField;
    private JButton emojiButton;
    private JFrame icon;

    public LoginGUI() {
        // Configurar la ventana
        setTitle("Login");
        setSize(300, 150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setico
    
        JFrame ventana = new JFrame("Login");
        ImageIcon icono = new ImageIcon("C:/Users/Ivan/Pictures/Examen2B/src/images/logo-login.png");
        ventana.setIconImage(icono.getImage());

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
        panel.setLayout(new GridLayout(3, 2));
        panel.setBackground(Color.white);
        panel.add(userLabel);
        panel.add(userField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(new JLabel(""));
        panel.add(emojiButton);

        //Agregar el panel a la ventana de Log in
        getContentPane().add(panel);
        setVisible(true);
    }

    private void login() {
        String usuario = userField.getText();
        //Uso de .getPassword() para que aparezcan puntos en lugar de 
        //mostrar la contraseña
        String contra = new String(passwordField.getPassword());

        //Verificación de información de log-in
        if (usuario.equals("USUARIO") && contra.equals("CONTRASEÑA")) {
            JOptionPane.showMessageDialog(this, "Éxito de inicio de sesión");
        } else {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos");
        }
    }

    public static void main(String[] args) {
        new LoginGUI();
    }
}