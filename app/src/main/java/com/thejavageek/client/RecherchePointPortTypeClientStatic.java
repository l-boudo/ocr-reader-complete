package com.thejavageek.client;
//import javax.swing.*;
//import java.lang.*;

import android.util.Log;

public class RecherchePointPortTypeClientStatic {

	public static String recherchePDL(String adresseloc,String insee_code,String postal_code) {
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
		String point = null;
		RecherchePointV20 serveur = new RecherchePointV20();
		RecherchePointPortType service = serveur.getRecherchePointPort();
		try{
			//System.out.println(service.consulterDonneesTechniquesContractuelles("23258900141855","enedis1@wonest.com",true).getId());          
                        System.out.println("PENG");
			ObjectFactory obj =  new ObjectFactory();
			CriteresType criterers = obj.createCriteresType();
			AdresseInstallationType adresse = new AdresseInstallationType();
			adresse.setCodePostal(postal_code);
			adresse.setCodeInseeCommune(insee_code);
			adresse.setNumeroEtNomVoie(adresseloc);
			criterers.setAdresseInstallation(adresse);
                        PointsType p = service.rechercherPoint(criterers,"homologation@wonest.com");
			System.out.println("DONE");
                        System.out.println(p.getPoint().get(0).id);
			point = p.getPoint().get(0).id;
		}
		catch(Exception error) {
			Log.e("Error","Something went wrong.");
		              Log.e("Error",error.getMessage());
                      //System.out.println(error);
//			MessageBox.Show("Custom Error Text "+error.Message); 
 			//console.error(error);
			// expected output: ReferenceError: nonExistentFunction is not defined
			// Note - error messages will vary depending on browser
		}
		return point;
	}
}

