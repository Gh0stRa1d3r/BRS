import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
/**
 *
 * @author Bentley
 */
public class LoginFrame extends JFrame {
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 800;
    
    private JLabel userLabel;
    private JTextField userField;
    private JLabel passLabel;
    private JPasswordField passField;
    private JButton loginButton;
    
    public LoginFrame(){
        createTextFields();
        createButton();
        createPanel();
        
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }
    
    private void createTextFields(){
        userLabel = new JLabel("User Name: ");
        final int FIELD_WIDTH = 10;
        userField = new JTextField(FIELD_WIDTH);
        userField.setText("");
        
        passLabel = new JLabel("Password: ");
        passField = new JPasswordField(FIELD_WIDTH);
    }
    
    private void createButton(){
        loginButton = new JButton("Login");
        ActionListener listener = new LoginListener();
        loginButton.addActionListener(listener);
    }
    
    private void createPanel(){
        JPanel panel = new JPanel();
        panel.add(userLabel);
        panel.add(userField);
        panel.add(passLabel);
        panel.add(passField);
        panel.add(loginButton);
        add(panel);
    }
    
    class LoginListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            
        }
    }
}
