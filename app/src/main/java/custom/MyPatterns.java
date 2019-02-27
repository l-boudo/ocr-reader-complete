package custom;

import android.annotation.SuppressLint;
import android.util.Log;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyPatterns {
    public static final String PDL      = "(([0-9]){2} ){3}(([0-9]){6} )([0-9]){2}";
    public static final String HC       = "(( *[0-9] *){5})[^0-9]*HC[^0-9]*|HC[^0-9]*(( *[0-9] *){5})";
    public static final String HP       = "(( *[0-9] *){5})[^0-9]*HP[^0-9]*|HP[^0-9]*(( *[0-9] *){5})";

    public static final String CONSO    = "([^A-Za-z0-9]|[HCPNJ]|\\b)\\d{5}([^0-9]|\\b)";

    public static final String NOSERIE  = "(([\\d] *){2}([A-Z] *){2}([\\d] *){6})|(([A-Z] *)([\\d]){6})";
    public static final String NOSERIE2  = "[^0-9]*(\\d{6})[^0-9]*|(([\\d] *){2}([A-Z] *){2}([\\d] *){6})";

    public static final Pattern PPDL    = Pattern.compile( PDL);

    public static final Pattern PNOSERIE    = Pattern.compile( NOSERIE);
    public static final Pattern PHC     = Pattern.compile( HC );
    public static final Pattern PHP     = Pattern.compile( HP );

    public static final Pattern PCONSO     = Pattern.compile( CONSO );
    public static final Pattern PCONSO2     = Pattern.compile( "\\d{5}" );

    public static final Pattern Date     = Pattern.compile( "([0-9]{2} ){2}[0-9]{2}" );
    public static final Pattern Date2     = Pattern.compile( "LE [0-9]" );

    public static String TestPDL(String input){
        Matcher m = PPDL.matcher(input);
        return m.find() ? m.group(0).trim() : null;

    }
    public static String TestHC(String input){
        Matcher m = PHC.matcher(input);
        return m.find() ? m.group(0).trim() : null;
    }
    public static String TestHP(String input){
        Matcher m = PHP.matcher(input);
        return m.find() ?m.group(0).trim(): null ;
    }
    @SuppressLint("LongLogTag")
    public static String TestNOSERIE(String input){
        Matcher date = Date.matcher(input);
        Matcher date2 = Date2.matcher(input);
        if(date.find() || date2.find()) {
            return null;
        }
        Matcher m = PNOSERIE.matcher(DeleteSpaces(input));
        return m.find() ?DeleteSpaces(m.group()): null ;
    }
    @SuppressLint("LongLogTag")
    public static String TestCONSO(String input){
        Matcher pm = PCONSO.matcher(DeleteSpaces(input));
        if(pm.find()) {
            String inter = DeleteSpaces(input).replaceAll("[^\\d.]", "");
            Matcher m = PCONSO2.matcher(inter);
            return m.matches() ?m.group(): null ;
        }
        else {
            return null;
        }
    }

    public static String DeleteSpaces(String str){
        return str.replaceAll("\\s","");
    }
}
