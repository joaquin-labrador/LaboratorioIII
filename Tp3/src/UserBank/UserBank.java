package UserBank;
import java.util.UUID;
public class UserBank {
    private UUID idUser;
    private String userName;
    private char gender;

    public UserBank() {
    }

    public UserBank( String userName, char gender) {
        this.idUser = UUID.randomUUID();
        this.userName = userName;
        this.gender = gender;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return "UserBank {" +
                "idUser :  " + idUser +
                ", userName :  '" + userName + '\'' +
                ", gender : " + gender +
                '}';
    }
}
