package UserBank;

import java.util.UUID;
import java.util.ArrayList;
import java.util.Date;

public class UserBank {
    private UUID idUser;
    private String userName;
    private char gender;
    private final ArrayList<String> bankingHistory = new ArrayList<String>();

    public UserBank() {
    }

    public void setHisotrial(boolean op, double money) {
        if (op) {
            bankingHistory.add("Deposit +" + money + " at " + new Date() + "\n");
        } else {
            bankingHistory.add("Retire " + money + " at " + new Date() + "\n");
        }
    }

    public ArrayList<String> getBankingHistory() {
        return bankingHistory;
    }

    public UserBank(String userName, char gender) {
        this.idUser = UUID.randomUUID();
        this.userName = userName;
        this.gender = gender;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return "UserBank {" + "idUser :  " + idUser + ", userName :  '" + userName + '\'' + ", gender : " + gender + '}';
    }
}
