package LoginGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainView extends JFrame{
    private JPanel MainView;
    private JTextField nameTextField;
    private JLabel nameLabel;
    private JLabel phoneLabel;
    private JTextField phoneTextField;
    private JTextField addressTextField;
    private JLabel Address;
    private JButton logoutButton;

    User output;
    LoginView getUser = new LoginView("Ardian");

    public MainView(String title, User user){
        super(title);

        output = user;
        nameTextField.setText(output.getName());
        phoneTextField.setText(output.getPhone());
        addressTextField.setText(output.getAddress());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(MainView);
        this.pack();


        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Selamat Anda Berhasil Logout");
                LoginView newLogin = new LoginView("New Login");
                setVisible(false);
                newLogin.setVisible(true);
            }
        });
    }
}
