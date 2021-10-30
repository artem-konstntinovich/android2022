package accountexample;


public class User extends Person {
    // variable in class is field
    private String login;
    private String password;
    //если не изменны оба и всегда
    //функция для начального создания объекта
    //называется конструктором
    //и ее имя создается по правилу
    //Имя класса = имя конструктора
    public User (String Name,String Login, String Password)
    {
        super(Name);// вызов конструктора родителя
        //вызвал Person(Name)
        login = Login;
        password = Password;
    }
    
    //правило вывода на экран
    @Override
    public String toString() {
        return super.toString() + "login = " + login + ", password = " + password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void changePassword(String newPassword, String oldPassword)
    {
        if ( oldPassword == this.password )
        {
          this.password = newPassword;
        }
    }
    
}
