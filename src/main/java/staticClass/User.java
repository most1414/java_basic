package staticClass;

public class User {
    public static int globalId = 1;
    private int userId;
    private String login;
    private String password;

    public User(String x, String x1) {

    }

    public static void incrementGlobalId(){
        globalId++;
    }
    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
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
}
