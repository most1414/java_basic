package staticClass;

public class User {
    public static int globalId = 1;
    private int userId;
    private String login;
    private String password;

    public static void incrementGlobalId(){
        globalId++;
    }

    public User (String login, String password){
        this.userId;
        this.login;
        this.password;
        incrementGlobalId();

    }

    public User(int userId, String login, String password) {
        this.userId = userId;
        this.login = login;
        this.password = password;
    }
}
