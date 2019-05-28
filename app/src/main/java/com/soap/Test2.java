package com.soap;

import java.io.IOException;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.SoapFault;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;
import org.xmlpull.v1.XmlPullParserException;

public class Test2 {
    public class Constante {
        public static final String SOAP_ACTION = "http://www.enedis.fr/sge/b2b/services/RecherchePointV2.0";
        public static final String METHOD_NAME = "rechercherPoint";
        public static final String NAMESPACE = "http://www.enedis.fr/sge/b2b/services";
        public static final String URL = "http://localhost:8082/test/services/RecherchePointPort?wsdl";
        //public static final String URL = "http://2019wsdltest.orgfree.com/apiv1.asmx";

        public static final String KEY_ARTIST = "artist";
        public static final String KEY_SONG = "song";
    }
    public static void run2() throws SoapFault {
        String trustkeystore = "/home/x1-l/PIMA/enedis_certificat/newTrustStore.jks";
        String keystore = "/home/x1-l/PIMA/my_certificat/keystore.jks";

        String truststorepass = "chenshuo";
        String storepass = "chenshuo";
        String storetype = "JKS";

        String[][] props = {
//new version of certification, which will replace by 24/04/2019
                {"javax.net.ssl.trustStore", trustkeystore},
                {"javax.net.ssl.trustStorePassword", truststorepass},
                {"javax.net.ssl.trustStoreType", storetype},
                {"javax.net.ssl.keyStore", keystore},
                {"javax.net.ssl.keyStorePassword", storepass},
                {"javax.net.ssl.keyStoreType", storetype}
        };
        for (String[] prop : props) {
            System.getProperties().setProperty(prop[0], prop[1]);
        }
        SoapObject request = new SoapObject(Constante.NAMESPACE,
                Constante.METHOD_NAME);
        request.addProperty(Constante.KEY_ARTIST, "U2");
        request.addProperty(Constante.KEY_SONG, "One");
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(
                SoapEnvelope.VER11);
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
