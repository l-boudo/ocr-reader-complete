package com.soap;


import android.util.Log;

import java.io.IOException;
import java.io.InputStream;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.SoapFault;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManagerFactory;

public class SoapTest {
    public class Constante {
        public static final String SOAP_ACTION = "https://sge-homologation-b2b.enedis.fr/RecherchePoint/RecherchePointV2.0";
        public static final String METHOD_NAME = "rechercherPoint";
        public static final String NAMESPACE = "http://www.enedis.fr/sge/b2b/services";
        public static final String URL = "https://sge-homologation-b2b.enedis.fr/RecherchePoint/v2.0?wsdl";
        public static final String LOGIN_USER = "loginUtilisateur";
        public static final String KEY_SONG = "song";
    }
    public static void run2(String truststore,String keystore ) throws SoapFault, NoSuchAlgorithmException, KeyManagementException {

        SoapObject request = new SoapObject(Constante.NAMESPACE,
                Constante.METHOD_NAME);
        request.addProperty(Constante.LOGIN_USER, "homologation@wonest.com");
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
            Log.e("ERROR","message",e);
            //e.printStackTrace();
        }// Next task is to get Response and format that response
        SoapObject obj;
        obj = (SoapObject) envelope.getResponse();

//      System.out.println(obj);


    }
}
