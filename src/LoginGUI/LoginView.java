package LoginGUI;

import javax.swing.*;
import javax.xml.crypto.Data;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import LoginGUI.*;

public class LoginView extends JFrame {
    private JPanel loginPanel;
    private JTextField usernameTextField;
    private JLabel usernameLabel;
    private JTextField passwordTextField;
    private JLabel passwordLabel;
    private JButton loginButton;
    private JButton registerButton;

    public LoginView(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(loginPanel);
        this.pack();

        loginButton.addActionListener(new ActionListener() {
            LoginController tryLogin;
            User tryUser;
            @Override
            public void actionPerformed(ActionEvent e) {
                String username;
                String password;

                username = usernameTextField.getText().trim(); //menghilangkan spasi
                password = passwordTextField.getText().trim();

                this.tryUser = new User(username, password);
                this.tryLogin = new LoginController();

                //this.tryUser yang pertama  => itu isinya input
                this.tryUser = tryLogin.loginProcess(this.tryUser);
                //tryLogin.loginProcess(this.tryUser) => ini memasukkan input username dan password , nanti hasilnya adalah data dari User

                if(tryUser != null){
                    //Mengakhiri view
                    setVisible(false);
                    MainView tampil = new MainView("MainView" ,tryUser);
                    tampil.setVisible(true);
                }
            }
        });
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegisterView redirect = new RegisterView("Regis");
                redirect.setVisible(true);
                setVisible(false);
            }
        });
    }

    public User getData(int index){
        LoginController getUser = new LoginController();

        return  getUser.dataBase.userTable.get(index);
    }


    public static void main(String[] args){
        JFrame frame = new LoginView("Login Preview");
        frame.setVisible(true);
    }
}
