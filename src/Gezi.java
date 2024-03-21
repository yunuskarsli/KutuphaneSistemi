public class Gezi {
    private  String seyehatname;
    private  String yolda;
    private  String patagonya;

    public String getSeyehatname() {
        return seyehatname;
    }

    public void setSeyehatname(String seyehatname) {
        this.seyehatname = seyehatname;
    }

    public String getYolda() {
        return yolda;
    }

    public void setYolda(String yolda) {
        this.yolda = yolda;
    }

    public String getPatagonya() {
        return patagonya;
    }

    public void setPatagonya(String patagonya) {
        this.patagonya = patagonya;
    }

    public void Gezi(String seyehatname, String yolda, String patagonya) {
        this.seyehatname = seyehatname;
        this.yolda = yolda;
        this.patagonya = patagonya;


    }
}