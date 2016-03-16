package test.cpbr_9;

public class itemRow {

    private String hora;
    private String title;
    private String palco;

    public itemRow(String hora, String title, String palco) {
        this.hora = hora;
        this.title = title;
        this.palco = palco;
    }

    public void setHora(String h) {this.hora = h;}
    public String getHora() {return hora;}

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {this.title = title;}

    public String getPalco() {
        return palco;
    }
    public void setPalco(String p) {
        this.palco = p;
    }
}
