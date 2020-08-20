package lesson2_Composition_Agrigation.ClassWork.Aug17_08.Login;

public class Client extends Person {
    private String login;
    private String password;

    public Client() {
    }

    public Client(int id, String name, int age, String login, String password) {
        super(id, name, age);
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Client{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                "} " + super.toString();
    }
}
