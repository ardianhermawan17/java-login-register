package LoginGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import LoginGUI.*;

public class RegisterView extends JFrame{
    private JPanel registerPanel;
    private JLabel nameLabel;
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JLabel phoneLabel;
    private JLabel addressLabel;
    private JTextField nameTextField;
    private JTextField usernameTextField;
    private JTextField passwordTextField;
    private JTextField phoneTextField;
    private JTextField addressTextField;
    private JButton registerButton;

    public RegisterView(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(registerPanel);
        this.pack();


        registerButton.addActionListener(new ActionListener() {
            User registerUser;
            RegisterController userRegis;

            @Override
            public void actionPerformed(ActionEvent e) {

                String name;
                String username;
                String password;
                String phone;
                String address;

                name = nameTextField.getText().trim();
                username = usernameTextField.getText().trim();
                password = passwordTextField.getText().trim();
                phone = phoneTextField.getText().trim();
                address = addressTextField.getText().trim();

                this.registerUser = new User(username, password);
                registerUser.setPhone(phone);
                registerUser.setAddress(address);
                registerUser.setName(name);

                this.userRegis = new RegisterController();

                userRegis.registerProcess(this.registerUser);

                setVisible(false);
                LoginView redirect = new LoginView("Testing");
                redirect.setVisible(true);
            }
        });
    }
}
