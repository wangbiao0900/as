package bean;

import java.io.Serializable;

public class CpContentBean implements Serializable {
    private String cpId;
    private String cpName;
    private String gameName;

    public String getCpId() {
        return cpId;
    }

    public void setCpId(String cpId) {
        this.cpId = cpId;
    }

    public String getCpName() {
        return cpName;
    }

    public void setCpName(String cpName) {
        this.cpName = cpName;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public CpContentBean(String cpId, String cpName, String gameName) {
        this.cpId = cpId;
        this.cpName = cpName;
        this.gameName = gameName;
    }
}
