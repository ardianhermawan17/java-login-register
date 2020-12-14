package LoginGUI;

public class RegisterController {
    DataBase dataBase;

    RegisterController(){
        this.dataBase = DataBase.getInstance();
    }

    public void registerProcess(User user){
        //Menambah ke arrayList fungsi .add() => untuk menambahkan ke array list
        dataBase.getUserTable().add(user);
    }
}
