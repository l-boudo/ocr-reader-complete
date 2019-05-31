package custom;

import android.location.Location;
import android.util.Log;
import android.widget.TextView;

public class UserInfo {
    private TextView t;
    private TextView pdlt;

    private String pdl;
    private String[] infos;
    private Location location;
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
    public void setLocation(Location loc){
        this.location = loc;
    }
    public Location getLocation(){
        return location;
    }
    public String getMatricule(){
        int taille = no_serie.length();
        if(taille<14){
            return no_serie.substring(taille-3,taille);
        }
        return no_serie.substring(taille-5,taille-2);
    }

    public void setPdl(String pdl) {
        this.pdl = pdl;
        pdlt.setText("PDL => "+pdl);
    }
    public void setinfo(String ... infos ) {
        this.infos = infos;
        String out = "";
        out+=infos[0]+"\n";
        out+="PDL       : "+pdl+"\n";
        out+="Puissance : "+infos[1]+"\n";
        out+="Calibre   : "+infos[2]+"\n";
        out+="Tension    : "+infos[3]+"\n";
        Log.v("Info","Info K");
        pdlt.setText(out);
    }
    public void setPdlt(TextView pdlt){this.pdlt = pdlt;}
    public String getPdl() {
        return pdl;
    }
}
