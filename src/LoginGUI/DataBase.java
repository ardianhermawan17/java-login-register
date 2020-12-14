package LoginGUI;

import java.util.ArrayList;

public class DataBase {
    public static DataBase instance;
    ArrayList<User> userTable = new ArrayList<User>();

    //TODO : WIKI Singleton JAVA
    //Singleton pattern
    public static DataBase getInstance(){
        if(instance == null){
            instance = new DataBase();
        }
        return instance;
    }

    public ArrayList<User> getUserTable() {
        return userTable;
    }

    public void setUserTable(ArrayList<User> userTable) {
        this.userTable = userTable;
    }
}
