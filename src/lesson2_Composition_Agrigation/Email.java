package lesson2_Composition_Agrigation;

public class Email {
    private String site;
    private String login;
    private String password;

    public Email() {
    }

    public Email(String site, String login, String password) {
        this.site = site;
        this.login = login;
        this.password = password;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
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

//    public  void register(String login, String password) {
//        this.setLogin(login);
//        this.setPassword(password);
//    }

    public void logIn(String login, String password) {
        if (login.equals(this.login) && password.equals(this.password)) {
            System.out.println("You are logined successful on " + this.site);
        }else {
            System.out.println("incorrect login or password");
        }
    }

    @Override
    public String toString() {
        return "Email{" +
                "site='" + site + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
