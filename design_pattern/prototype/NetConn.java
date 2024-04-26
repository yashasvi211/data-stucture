package prototype;

public class NetConn {
    private String ip;
    private String impdata;

    public void setip(String ip) {
        this.ip = ip;
    }

    public String getImpData() {
        return impdata;
    }

    public void setImpData(String impdata) {
        this.impdata = impdata;
    }

    public void loadImpData() {
        this.impdata = "Data";
    }
}
