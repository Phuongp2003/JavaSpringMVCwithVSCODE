package ptithcm.bean;

import javax.persistence.*;

@Entity
@Table(name = "TaiKhoan")
public class Account {
    @Id
    @GeneratedValue
    private Integer ID;// property
    private String USERNAME;// property
    private String PASSWORD;// property

    public Account() {
    };

    public Account(Integer ID, String USERNAME, String PASSWORD) {
        this.ID = ID;
        this.USERNAME = USERNAME;
        this.PASSWORD = PASSWORD;

    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }
}
