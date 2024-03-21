public class Roman {
    private String arabaSevdası;
    private String sahsultan;
    private String demir;


    public String getArabaSevdası() {
        return arabaSevdası;
    }

    public void setArabaSevdası(String arabaSevdası) {
        this.arabaSevdası = arabaSevdası;
    }

    public String getSahsultan() {
        return sahsultan;
    }

    public void setSahsultan(String sahsultan) {
        this.sahsultan = sahsultan;
    }

    public String getDemir() {
        return demir;
    }

    public void setDemir(String demir) {
        this.demir = demir;
    }

    public void Roman(String arabaSevdası, String sahsultan, String demir) {
        this.arabaSevdası = arabaSevdası;
        this.sahsultan = sahsultan;
        this.demir = demir;

    }

}