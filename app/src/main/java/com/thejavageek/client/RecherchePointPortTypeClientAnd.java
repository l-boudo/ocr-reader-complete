package com.thejavageek.client;

public class RecherchePointPortTypeClientAnd {
    public static void test(){
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

        RecherchePointV20 serveur = new RecherchePointV20();
        RecherchePointPortType service = serveur.getRecherchePointPort();
        try{
            //System.out.println(service.consulterDonneesTechniquesContractuelles("23258900141855","enedis1@wonest.com",true).getId());
            System.out.println("PENG");
            ObjectFactory obj =  new ObjectFactory();
            CriteresType criterers = obj.createCriteresType();
            AdresseInstallationType adresse = new AdresseInstallationType();
            adresse.setCodePostal("94200");
            adresse.setCodeInseeCommune("94041");
            adresse.setNumeroEtNomVoie("39 avenue danielle casanova");
            criterers.setAdresseInstallation(adresse);
            PointsType p = service.rechercherPoint(criterers,"homologation@wonest.com");
            System.out.println("DONE");
            System.out.println(p.getPoint().get(0).id);
        }
        catch(Exception error) {
            System.out.println("Something went wrong.");
            System.out.println(error);
//			MessageBox.Show("Custom Error Text "+error.Message);
            //console.error(error);
            // expected output: ReferenceError: nonExistentFunction is not defined
            // Note - error messages will vary depending on browser
        }
    }
}
