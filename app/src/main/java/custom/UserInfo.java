package custom;

import android.widget.TextView;

public class UserInfo {
    private TextView t;
    private String no_serie;
    private int conso_hc;
    private int conso_hp;
    private String placeholder;
    private boolean lock = false;
    public UserInfo( TextView t){
        this.t = t;
    }

    public String getNo_serie() {
        return no_serie;
    }

    public void setNo_serie(String no_serie) {
        if (!lock) {
            this.no_serie = no_serie;
            update();
        }
    }
    public int getConso_hc() {
        return conso_hc;
    }

    public void setConso_hc(int conso_hc) {
        if (!lock) {
            this.conso_hc = conso_hc;
            update();
        }

    }

    public int getConso_hp() {
        return conso_hp;
    }

    public void setConso_hp(int conso_hp) {
        if (!lock){
            this.conso_hp = conso_hp;
            update();
        }
    }

    public String getPlaceholder() {
        return placeholder;
    }

    public void setPlaceholder() {
        this.placeholder = placeholder;
    }

    @Override
    public String toString() {
        return "HC:"+conso_hc+" HP:"+conso_hp+" NO:"+no_serie;
    }

    public void update(){
        t.setText(this.toString());
    }

    public void placeholder() {
        this.conso_hc=7500;
        this.conso_hp=2500;
        this.no_serie="B123456W";
        update();
    }
    public boolean setLock(){
        lock=!lock;
        return lock;
    }
}