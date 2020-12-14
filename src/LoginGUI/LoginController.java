package LoginGUI;

import java.util.ArrayList;

public class LoginController {
    DataBase dataBase;

    LoginController(){
        this.dataBase = DataBase.getInstance();
    }

    public User loginProcess(User user){
        ArrayList<User> userTable = dataBase.getUserTable();

        //for( User dbUser : userTable) => ini looping untuk userTable, jadi seperti forEach , looping terus sampek entek
        for( User dbUser : userTable){
            if(dbUser.getUsername().equals(user.getUsername()) && dbUser.getPassword().equals(user.getPassword())){
                return dbUser;
            }
        }
        return null;
    }
}
