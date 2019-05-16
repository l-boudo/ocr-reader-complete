package com.soap;

import java.io.IOException;

        import org.ksoap2.SoapEnvelope;
        import org.ksoap2.SoapFault;
        import org.ksoap2.serialization.SoapObject;
        import org.ksoap2.serialization.SoapSerializationEnvelope;
        import org.ksoap2.transport.HttpTransportSE;
        import org.xmlpull.v1.XmlPullParserException;

public class Test {
    public class Constante {
        public static final String SOAP_ACTION = "http://api.chartlyrics.com/SearchLyricDirect";
        public static final String METHOD_NAME = "SearchLyricDirect";
        public static final String NAMESPACE = "http://api.chartlyrics.com/";
        //public static final String URL = "http://api.chartlyrics.com/apiv1.asmx?wsdl";
        public static final String URL = "http://2019wsdltest.orgfree.com/apiv1.asmx";

        public static final String KEY_ARTIST = "artist";
        public static final String KEY_SONG = "song";
    }
    public static void run2() throws SoapFault {
        SoapObject request = new SoapObject(Constante.NAMESPACE,
                Constante.METHOD_NAME);
        request.addProperty(Constante.KEY_ARTIST, "U2");
        request.addProperty(Constante.KEY_SONG, "One");
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(
                SoapEnvelope.VER11);
        envelope.xsd = SoapSerializationEnvelope.XSD;
        envelope.enc = SoapSerializationEnvelope.ENC;
        envelope.dotNet = true;
        envelope.setOutputSoapObject(request);
        HttpTransportSE androidHttpTransport = new HttpTransportSE(
                Constante.URL);
        androidHttpTransport.debug=true;
        try {
            System.out.println(androidHttpTransport.getPath());
            System.out.println(androidHttpTransport.responseDump);
            System.out.println(androidHttpTransport.requestDump);

            // call the web service method
            androidHttpTransport.call(Constante.SOAP_ACTION, envelope);
        } catch (Exception e) {
            e.printStackTrace();
        }// Next task is to get Response and format that response
        SoapObject obj;
        obj = (SoapObject) envelope.getResponse();

//      System.out.println(obj);

        System.out.println(obj.getProperty("TrackId"));
        System.out.println(obj.getProperty("LyricChecksum"));
        System.out.println(obj.getProperty("LyricId"));
        System.out.println(obj.getProperty("LyricSong"));
        System.out.println(obj.getProperty("LyricArtist"));
        System.out.println(obj.getProperty("LyricUrl"));
        System.out.println(obj.getProperty("LyricCovertArtUrl"));
        System.out.println(obj.getProperty("LyricRank"));
        System.out.println(obj.getProperty("LyricCorrectUrl"));
        System.out.println(obj.getProperty("Lyric"));

    }

    public static void main(String[] args) {
        try {
            run2();
        } catch (SoapFault e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
