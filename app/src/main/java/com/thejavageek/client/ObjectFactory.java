
package com.thejavageek.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.thejavageek.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Body_QNAME = new QName("http://schemas.xmlsoap.org/soap/envelope/", "Body");
    private final static QName _RechercherPoint_QNAME = new QName("http://www.enedis.fr/sge/b2b/services/rechercherpoint/v2.0", "rechercherPoint");
    private final static QName _Envelope_QNAME = new QName("http://schemas.xmlsoap.org/soap/envelope/", "Envelope");
    private final static QName _Entete_QNAME = new QName("http://www.enedis.fr/sge/b2b/technique/v1.0", "entete");
    private final static QName _Fault_QNAME = new QName("http://schemas.xmlsoap.org/soap/envelope/", "Fault");
    private final static QName _Acquittement_QNAME = new QName("http://www.enedis.fr/sge/b2b/technique/v1.0", "acquittement");
    private final static QName _Erreur_QNAME = new QName("http://www.enedis.fr/sge/b2b/technique/v1.0", "erreur");
    private final static QName _RechercherPointResponse_QNAME = new QName("http://www.enedis.fr/sge/b2b/services/rechercherpoint/v2.0", "rechercherPointResponse");
    private final static QName _Header_QNAME = new QName("http://schemas.xmlsoap.org/soap/envelope/", "Header");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.thejavageek.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RechercherPointResponseType }
     * 
     */
    public RechercherPointResponseType createRechercherPointResponseType() {
        return new RechercherPointResponseType();
    }

    /**
     * Create an instance of {@link RechercherPointType }
     * 
     */
    public RechercherPointType createRechercherPointType() {
        return new RechercherPointType();
    }

    /**
     * Create an instance of {@link CriteresType }
     * 
     */
    public CriteresType createCriteresType() {
        return new CriteresType();
    }

    /**
     * Create an instance of {@link PointType }
     * 
     */
    public PointType createPointType() {
        return new PointType();
    }

    /**
     * Create an instance of {@link PointsType }
     * 
     */
    public PointsType createPointsType() {
        return new PointsType();
    }

    /**
     * Create an instance of {@link AdresseInstallationType }
     * 
     */
    public AdresseInstallationType createAdresseInstallationType() {
        return new AdresseInstallationType();
    }

    /**
     * Create an instance of {@link DisjoncteurCalibreType }
     * 
     */
    public DisjoncteurCalibreType createDisjoncteurCalibreType() {
        return new DisjoncteurCalibreType();
    }

    /**
     * Create an instance of {@link RelaisCommandeTypeType }
     * 
     */
    public RelaisCommandeTypeType createRelaisCommandeTypeType() {
        return new RelaisCommandeTypeType();
    }

    /**
     * Create an instance of {@link AcheminementTarifType }
     * 
     */
    public AcheminementTarifType createAcheminementTarifType() {
        return new AcheminementTarifType();
    }

    /**
     * Create an instance of {@link MesureOrigineType }
     * 
     */
    public MesureOrigineType createMesureOrigineType() {
        return new MesureOrigineType();
    }

    /**
     * Create an instance of {@link ConsommationTypeType }
     * 
     */
    public ConsommationTypeType createConsommationTypeType() {
        return new ConsommationTypeType();
    }

    /**
     * Create an instance of {@link DemandeMediaType }
     * 
     */
    public DemandeMediaType createDemandeMediaType() {
        return new DemandeMediaType();
    }

    /**
     * Create an instance of {@link AffaireClotureMotifType }
     * 
     */
    public AffaireClotureMotifType createAffaireClotureMotifType() {
        return new AffaireClotureMotifType();
    }

    /**
     * Create an instance of {@link PrejudiceNatureType }
     * 
     */
    public PrejudiceNatureType createPrejudiceNatureType() {
        return new PrejudiceNatureType();
    }

    /**
     * Create an instance of {@link TensionLivraisonType }
     * 
     */
    public TensionLivraisonType createTensionLivraisonType() {
        return new TensionLivraisonType();
    }

    /**
     * Create an instance of {@link AffaireEtatType }
     * 
     */
    public AffaireEtatType createAffaireEtatType() {
        return new AffaireEtatType();
    }

    /**
     * Create an instance of {@link LigneFraisType }
     * 
     */
    public LigneFraisType createLigneFraisType() {
        return new LigneFraisType();
    }

    /**
     * Create an instance of {@link BilanContinuiteFournitureCoupureTypeType }
     * 
     */
    public BilanContinuiteFournitureCoupureTypeType createBilanContinuiteFournitureCoupureTypeType() {
        return new BilanContinuiteFournitureCoupureTypeType();
    }

    /**
     * Create an instance of {@link GrandeurPhysiqueType }
     * 
     */
    public GrandeurPhysiqueType createGrandeurPhysiqueType() {
        return new GrandeurPhysiqueType();
    }

    /**
     * Create an instance of {@link DispositifComptageParticulariteType }
     * 
     */
    public DispositifComptageParticulariteType createDispositifComptageParticulariteType() {
        return new DispositifComptageParticulariteType();
    }

    /**
     * Create an instance of {@link RattachementTypeType }
     * 
     */
    public RattachementTypeType createRattachementTypeType() {
        return new RattachementTypeType();
    }

    /**
     * Create an instance of {@link SituationContractuelleGestionModeType }
     * 
     */
    public SituationContractuelleGestionModeType createSituationContractuelleGestionModeType() {
        return new SituationContractuelleGestionModeType();
    }

    /**
     * Create an instance of {@link TourneeType }
     * 
     */
    public TourneeType createTourneeType() {
        return new TourneeType();
    }

    /**
     * Create an instance of {@link ConsuelMotifNonExigibiliteType }
     * 
     */
    public ConsuelMotifNonExigibiliteType createConsuelMotifNonExigibiliteType() {
        return new ConsuelMotifNonExigibiliteType();
    }

    /**
     * Create an instance of {@link CommuneFranceType }
     * 
     */
    public CommuneFranceType createCommuneFranceType() {
        return new CommuneFranceType();
    }

    /**
     * Create an instance of {@link InterventionPeriodeTypeType }
     * 
     */
    public InterventionPeriodeTypeType createInterventionPeriodeTypeType() {
        return new InterventionPeriodeTypeType();
    }

    /**
     * Create an instance of {@link PointAppartenanceRegroupementTurpeType }
     * 
     */
    public PointAppartenanceRegroupementTurpeType createPointAppartenanceRegroupementTurpeType() {
        return new PointAppartenanceRegroupementTurpeType();
    }

    /**
     * Create an instance of {@link IntensiteType }
     * 
     */
    public IntensiteType createIntensiteType() {
        return new IntensiteType();
    }

    /**
     * Create an instance of {@link ReclamationTypeType }
     * 
     */
    public ReclamationTypeType createReclamationTypeType() {
        return new ReclamationTypeType();
    }

    /**
     * Create an instance of {@link FinaliteType }
     * 
     */
    public FinaliteType createFinaliteType() {
        return new FinaliteType();
    }

    /**
     * Create an instance of {@link TensionType }
     * 
     */
    public TensionType createTensionType() {
        return new TensionType();
    }

    /**
     * Create an instance of {@link ZoneQualiteDesserteType }
     * 
     */
    public ZoneQualiteDesserteType createZoneQualiteDesserteType() {
        return new ZoneQualiteDesserteType();
    }

    /**
     * Create an instance of {@link ActiviteType }
     * 
     */
    public ActiviteType createActiviteType() {
        return new ActiviteType();
    }

    /**
     * Create an instance of {@link PrestationMotifNonFacturationType }
     * 
     */
    public PrestationMotifNonFacturationType createPrestationMotifNonFacturationType() {
        return new PrestationMotifNonFacturationType();
    }

    /**
     * Create an instance of {@link RattachementPointRoleType }
     * 
     */
    public RattachementPointRoleType createRattachementPointRoleType() {
        return new RattachementPointRoleType();
    }

    /**
     * Create an instance of {@link MesureNatureType }
     * 
     */
    public MesureNatureType createMesureNatureType() {
        return new MesureNatureType();
    }

    /**
     * Create an instance of {@link DemandeTechniqueTypeType }
     * 
     */
    public DemandeTechniqueTypeType createDemandeTechniqueTypeType() {
        return new DemandeTechniqueTypeType();
    }

    /**
     * Create an instance of {@link MontantType }
     * 
     */
    public MontantType createMontantType() {
        return new MontantType();
    }

    /**
     * Create an instance of {@link RecevabilitePremiereMiseEnServicePourEssaiMotifType }
     * 
     */
    public RecevabilitePremiereMiseEnServicePourEssaiMotifType createRecevabilitePremiereMiseEnServicePourEssaiMotifType() {
        return new RecevabilitePremiereMiseEnServicePourEssaiMotifType();
    }

    /**
     * Create an instance of {@link DemandeCommunicationDistributeurTypeType }
     * 
     */
    public DemandeCommunicationDistributeurTypeType createDemandeCommunicationDistributeurTypeType() {
        return new DemandeCommunicationDistributeurTypeType();
    }

    /**
     * Create an instance of {@link OperationType }
     * 
     */
    public OperationType createOperationType() {
        return new OperationType();
    }

    /**
     * Create an instance of {@link TransformateurPrecisionClasseType }
     * 
     */
    public TransformateurPrecisionClasseType createTransformateurPrecisionClasseType() {
        return new TransformateurPrecisionClasseType();
    }

    /**
     * Create an instance of {@link DisjoncteurNatureType }
     * 
     */
    public DisjoncteurNatureType createDisjoncteurNatureType() {
        return new DisjoncteurNatureType();
    }

    /**
     * Create an instance of {@link LimiteurTypeType }
     * 
     */
    public LimiteurTypeType createLimiteurTypeType() {
        return new LimiteurTypeType();
    }

    /**
     * Create an instance of {@link CompteurIntensiteNominaleType }
     * 
     */
    public CompteurIntensiteNominaleType createCompteurIntensiteNominaleType() {
        return new CompteurIntensiteNominaleType();
    }

    /**
     * Create an instance of {@link RelevePlageType }
     * 
     */
    public RelevePlageType createRelevePlageType() {
        return new RelevePlageType();
    }

    /**
     * Create an instance of {@link PrestationCasType }
     * 
     */
    public PrestationCasType createPrestationCasType() {
        return new PrestationCasType();
    }

    /**
     * Create an instance of {@link AlimentationModeApresCompteurType }
     * 
     */
    public AlimentationModeApresCompteurType createAlimentationModeApresCompteurType() {
        return new AlimentationModeApresCompteurType();
    }

    /**
     * Create an instance of {@link PrestationOptionType }
     * 
     */
    public PrestationOptionType createPrestationOptionType() {
        return new PrestationOptionType();
    }

    /**
     * Create an instance of {@link LignesFraisType }
     * 
     */
    public LignesFraisType createLignesFraisType() {
        return new LignesFraisType();
    }

    /**
     * Create an instance of {@link DemandeDiverseReseauTypeType }
     * 
     */
    public DemandeDiverseReseauTypeType createDemandeDiverseReseauTypeType() {
        return new DemandeDiverseReseauTypeType();
    }

    /**
     * Create an instance of {@link CalendrierType }
     * 
     */
    public CalendrierType createCalendrierType() {
        return new CalendrierType();
    }

    /**
     * Create an instance of {@link DomaineTensionType }
     * 
     */
    public DomaineTensionType createDomaineTensionType() {
        return new DomaineTensionType();
    }

    /**
     * Create an instance of {@link DemandeChangementFrnCorrectifMotifType }
     * 
     */
    public DemandeChangementFrnCorrectifMotifType createDemandeChangementFrnCorrectifMotifType() {
        return new DemandeChangementFrnCorrectifMotifType();
    }

    /**
     * Create an instance of {@link TransformateurCourantPositionType }
     * 
     */
    public TransformateurCourantPositionType createTransformateurCourantPositionType() {
        return new TransformateurCourantPositionType();
    }

    /**
     * Create an instance of {@link GroupePeriodeMobileType }
     * 
     */
    public GroupePeriodeMobileType createGroupePeriodeMobileType() {
        return new GroupePeriodeMobileType();
    }

    /**
     * Create an instance of {@link RecevabiliteMotifRefusType }
     * 
     */
    public RecevabiliteMotifRefusType createRecevabiliteMotifRefusType() {
        return new RecevabiliteMotifRefusType();
    }

    /**
     * Create an instance of {@link PointEtatContractuelType }
     * 
     */
    public PointEtatContractuelType createPointEtatContractuelType() {
        return new PointEtatContractuelType();
    }

    /**
     * Create an instance of {@link ReleveMediaType }
     * 
     */
    public ReleveMediaType createReleveMediaType() {
        return new ReleveMediaType();
    }

    /**
     * Create an instance of {@link CourrierModeleType }
     * 
     */
    public CourrierModeleType createCourrierModeleType() {
        return new CourrierModeleType();
    }

    /**
     * Create an instance of {@link MesureDeclencheurType }
     * 
     */
    public MesureDeclencheurType createMesureDeclencheurType() {
        return new MesureDeclencheurType();
    }

    /**
     * Create an instance of {@link InterventionPlanificationHorsDelaiMotifType }
     * 
     */
    public InterventionPlanificationHorsDelaiMotifType createInterventionPlanificationHorsDelaiMotifType() {
        return new InterventionPlanificationHorsDelaiMotifType();
    }

    /**
     * Create an instance of {@link FraisType }
     * 
     */
    public FraisType createFraisType() {
        return new FraisType();
    }

    /**
     * Create an instance of {@link ReleveTraitementModeType }
     * 
     */
    public ReleveTraitementModeType createReleveTraitementModeType() {
        return new ReleveTraitementModeType();
    }

    /**
     * Create an instance of {@link AffaireAnnulationMotifType }
     * 
     */
    public AffaireAnnulationMotifType createAffaireAnnulationMotifType() {
        return new AffaireAnnulationMotifType();
    }

    /**
     * Create an instance of {@link ReclamationSousTypeType }
     * 
     */
    public ReclamationSousTypeType createReclamationSousTypeType() {
        return new ReclamationSousTypeType();
    }

    /**
     * Create an instance of {@link CompteurTensionNominaleType }
     * 
     */
    public CompteurTensionNominaleType createCompteurTensionNominaleType() {
        return new CompteurTensionNominaleType();
    }

    /**
     * Create an instance of {@link ResidenceTypeType }
     * 
     */
    public ResidenceTypeType createResidenceTypeType() {
        return new ResidenceTypeType();
    }

    /**
     * Create an instance of {@link BilanContinuiteFournitureTypeType }
     * 
     */
    public BilanContinuiteFournitureTypeType createBilanContinuiteFournitureTypeType() {
        return new BilanContinuiteFournitureTypeType();
    }

    /**
     * Create an instance of {@link PlageHeuresCreusesType }
     * 
     */
    public PlageHeuresCreusesType createPlageHeuresCreusesType() {
        return new PlageHeuresCreusesType();
    }

    /**
     * Create an instance of {@link RectificationMotifType }
     * 
     */
    public RectificationMotifType createRectificationMotifType() {
        return new RectificationMotifType();
    }

    /**
     * Create an instance of {@link PrestationRealisationType }
     * 
     */
    public PrestationRealisationType createPrestationRealisationType() {
        return new PrestationRealisationType();
    }

    /**
     * Create an instance of {@link CompteurSousTypeType }
     * 
     */
    public CompteurSousTypeType createCompteurSousTypeType() {
        return new CompteurSousTypeType();
    }

    /**
     * Create an instance of {@link UsageChantierType }
     * 
     */
    public UsageChantierType createUsageChantierType() {
        return new UsageChantierType();
    }

    /**
     * Create an instance of {@link LongueurType }
     * 
     */
    public LongueurType createLongueurType() {
        return new LongueurType();
    }

    /**
     * Create an instance of {@link MesureTypeType }
     * 
     */
    public MesureTypeType createMesureTypeType() {
        return new MesureTypeType();
    }

    /**
     * Create an instance of {@link AlimentationSecoursModeBasculeType }
     * 
     */
    public AlimentationSecoursModeBasculeType createAlimentationSecoursModeBasculeType() {
        return new AlimentationSecoursModeBasculeType();
    }

    /**
     * Create an instance of {@link FaisabiliteResultatType }
     * 
     */
    public FaisabiliteResultatType createFaisabiliteResultatType() {
        return new FaisabiliteResultatType();
    }

    /**
     * Create an instance of {@link CoordonnesGpsType }
     * 
     */
    public CoordonnesGpsType createCoordonnesGpsType() {
        return new CoordonnesGpsType();
    }

    /**
     * Create an instance of {@link StructureComptageType }
     * 
     */
    public StructureComptageType createStructureComptageType() {
        return new StructureComptageType();
    }

    /**
     * Create an instance of {@link CreneauHoraireType }
     * 
     */
    public CreneauHoraireType createCreneauHoraireType() {
        return new CreneauHoraireType();
    }

    /**
     * Create an instance of {@link ClasseTemporelleType }
     * 
     */
    public ClasseTemporelleType createClasseTemporelleType() {
        return new ClasseTemporelleType();
    }

    /**
     * Create an instance of {@link EquipementElectriqueRegimeProprieteType }
     * 
     */
    public EquipementElectriqueRegimeProprieteType createEquipementElectriqueRegimeProprieteType() {
        return new EquipementElectriqueRegimeProprieteType();
    }

    /**
     * Create an instance of {@link AdresseAfnorType }
     * 
     */
    public AdresseAfnorType createAdresseAfnorType() {
        return new AdresseAfnorType();
    }

    /**
     * Create an instance of {@link StructureTarifaireContexteUtilisationType }
     * 
     */
    public StructureTarifaireContexteUtilisationType createStructureTarifaireContexteUtilisationType() {
        return new StructureTarifaireContexteUtilisationType();
    }

    /**
     * Create an instance of {@link ClientFinalCategorieType }
     * 
     */
    public ClientFinalCategorieType createClientFinalCategorieType() {
        return new ClientFinalCategorieType();
    }

    /**
     * Create an instance of {@link FaisabiliteMotifImpossibiliteType }
     * 
     */
    public FaisabiliteMotifImpossibiliteType createFaisabiliteMotifImpossibiliteType() {
        return new FaisabiliteMotifImpossibiliteType();
    }

    /**
     * Create an instance of {@link PeriodiciteType }
     * 
     */
    public PeriodiciteType createPeriodiciteType() {
        return new PeriodiciteType();
    }

    /**
     * Create an instance of {@link MesureStatutType }
     * 
     */
    public MesureStatutType createMesureStatutType() {
        return new MesureStatutType();
    }

    /**
     * Create an instance of {@link InterventionRealisationEtatType }
     * 
     */
    public InterventionRealisationEtatType createInterventionRealisationEtatType() {
        return new InterventionRealisationEtatType();
    }

    /**
     * Create an instance of {@link PrestationFacturationType }
     * 
     */
    public PrestationFacturationType createPrestationFacturationType() {
        return new PrestationFacturationType();
    }

    /**
     * Create an instance of {@link AlimentationEtatType }
     * 
     */
    public AlimentationEtatType createAlimentationEtatType() {
        return new AlimentationEtatType();
    }

    /**
     * Create an instance of {@link PointAppartenanceRegroupementHebergeurDecomptantType }
     * 
     */
    public PointAppartenanceRegroupementHebergeurDecomptantType createPointAppartenanceRegroupementHebergeurDecomptantType() {
        return new PointAppartenanceRegroupementHebergeurDecomptantType();
    }

    /**
     * Create an instance of {@link DemandeDiverseComptageTypeType }
     * 
     */
    public DemandeDiverseComptageTypeType createDemandeDiverseComptageTypeType() {
        return new DemandeDiverseComptageTypeType();
    }

    /**
     * Create an instance of {@link InterventionDemandeMotifRefusType }
     * 
     */
    public InterventionDemandeMotifRefusType createInterventionDemandeMotifRefusType() {
        return new InterventionDemandeMotifRefusType();
    }

    /**
     * Create an instance of {@link RecevabiliteResultatType }
     * 
     */
    public RecevabiliteResultatType createRecevabiliteResultatType() {
        return new RecevabiliteResultatType();
    }

    /**
     * Create an instance of {@link GeneriqueType }
     * 
     */
    public GeneriqueType createGeneriqueType() {
        return new GeneriqueType();
    }

    /**
     * Create an instance of {@link InterventionEtatType }
     * 
     */
    public InterventionEtatType createInterventionEtatType() {
        return new InterventionEtatType();
    }

    /**
     * Create an instance of {@link DemandeObjetType }
     * 
     */
    public DemandeObjetType createDemandeObjetType() {
        return new DemandeObjetType();
    }

    /**
     * Create an instance of {@link InterventionReplanificationMotifType }
     * 
     */
    public InterventionReplanificationMotifType createInterventionReplanificationMotifType() {
        return new InterventionReplanificationMotifType();
    }

    /**
     * Create an instance of {@link InterventionDeplanificationMotifType }
     * 
     */
    public InterventionDeplanificationMotifType createInterventionDeplanificationMotifType() {
        return new InterventionDeplanificationMotifType();
    }

    /**
     * Create an instance of {@link DemandeDiverseQualiteFournitureTypeType }
     * 
     */
    public DemandeDiverseQualiteFournitureTypeType createDemandeDiverseQualiteFournitureTypeType() {
        return new DemandeDiverseQualiteFournitureTypeType();
    }

    /**
     * Create an instance of {@link SecteurGeographiqueType }
     * 
     */
    public SecteurGeographiqueType createSecteurGeographiqueType() {
        return new SecteurGeographiqueType();
    }

    /**
     * Create an instance of {@link DispositifParticulierLimitationPerturbationsType }
     * 
     */
    public DispositifParticulierLimitationPerturbationsType createDispositifParticulierLimitationPerturbationsType() {
        return new DispositifParticulierLimitationPerturbationsType();
    }

    /**
     * Create an instance of {@link AffaireModificationMotifRefusType }
     * 
     */
    public AffaireModificationMotifRefusType createAffaireModificationMotifRefusType() {
        return new AffaireModificationMotifRefusType();
    }

    /**
     * Create an instance of {@link ProductionAutonomeCouplageModeType }
     * 
     */
    public ProductionAutonomeCouplageModeType createProductionAutonomeCouplageModeType() {
        return new ProductionAutonomeCouplageModeType();
    }

    /**
     * Create an instance of {@link FraudeOuDysfonctionnementnMethodeFacturationType }
     * 
     */
    public FraudeOuDysfonctionnementnMethodeFacturationType createFraudeOuDysfonctionnementnMethodeFacturationType() {
        return new FraudeOuDysfonctionnementnMethodeFacturationType();
    }

    /**
     * Create an instance of {@link ApplicationType }
     * 
     */
    public ApplicationType createApplicationType() {
        return new ApplicationType();
    }

    /**
     * Create an instance of {@link NonPriseEnCompteAutoreleveMotifType }
     * 
     */
    public NonPriseEnCompteAutoreleveMotifType createNonPriseEnCompteAutoreleveMotifType() {
        return new NonPriseEnCompteAutoreleveMotifType();
    }

    /**
     * Create an instance of {@link ReleveQualificationType }
     * 
     */
    public ReleveQualificationType createReleveQualificationType() {
        return new ReleveQualificationType();
    }

    /**
     * Create an instance of {@link DemandeDiverseInformationsTypeType }
     * 
     */
    public DemandeDiverseInformationsTypeType createDemandeDiverseInformationsTypeType() {
        return new DemandeDiverseInformationsTypeType();
    }

    /**
     * Create an instance of {@link DureeType }
     * 
     */
    public DureeType createDureeType() {
        return new DureeType();
    }

    /**
     * Create an instance of {@link CoupureLocalisationType }
     * 
     */
    public CoupureLocalisationType createCoupureLocalisationType() {
        return new CoupureLocalisationType();
    }

    /**
     * Create an instance of {@link FraudeOuDysfonctionnementMethodeCalculType }
     * 
     */
    public FraudeOuDysfonctionnementMethodeCalculType createFraudeOuDysfonctionnementMethodeCalculType() {
        return new FraudeOuDysfonctionnementMethodeCalculType();
    }

    /**
     * Create an instance of {@link CircuitTempoType }
     * 
     */
    public CircuitTempoType createCircuitTempoType() {
        return new CircuitTempoType();
    }

    /**
     * Create an instance of {@link RelaisNatureType }
     * 
     */
    public RelaisNatureType createRelaisNatureType() {
        return new RelaisNatureType();
    }

    /**
     * Create an instance of {@link AffaireAnnulationMotifRefusType }
     * 
     */
    public AffaireAnnulationMotifRefusType createAffaireAnnulationMotifRefusType() {
        return new AffaireAnnulationMotifRefusType();
    }

    /**
     * Create an instance of {@link ActiviteSecteurType }
     * 
     */
    public ActiviteSecteurType createActiviteSecteurType() {
        return new ActiviteSecteurType();
    }

    /**
     * Create an instance of {@link CentreGeographiqueType }
     * 
     */
    public CentreGeographiqueType createCentreGeographiqueType() {
        return new CentreGeographiqueType();
    }

    /**
     * Create an instance of {@link InterventionNonRealisationMotifType }
     * 
     */
    public InterventionNonRealisationMotifType createInterventionNonRealisationMotifType() {
        return new InterventionNonRealisationMotifType();
    }

    /**
     * Create an instance of {@link EquipementElectriqueLocalisationType }
     * 
     */
    public EquipementElectriqueLocalisationType createEquipementElectriqueLocalisationType() {
        return new EquipementElectriqueLocalisationType();
    }

    /**
     * Create an instance of {@link CoupureMotifType }
     * 
     */
    public CoupureMotifType createCoupureMotifType() {
        return new CoupureMotifType();
    }

    /**
     * Create an instance of {@link ProgrammeCircuitChauffageTempoType }
     * 
     */
    public ProgrammeCircuitChauffageTempoType createProgrammeCircuitChauffageTempoType() {
        return new ProgrammeCircuitChauffageTempoType();
    }

    /**
     * Create an instance of {@link PrestationMotifNonRealisationType }
     * 
     */
    public PrestationMotifNonRealisationType createPrestationMotifNonRealisationType() {
        return new PrestationMotifNonRealisationType();
    }

    /**
     * Create an instance of {@link AcceptabiliteResultatType }
     * 
     */
    public AcceptabiliteResultatType createAcceptabiliteResultatType() {
        return new AcceptabiliteResultatType();
    }

    /**
     * Create an instance of {@link IntervenantTypeType }
     * 
     */
    public IntervenantTypeType createIntervenantTypeType() {
        return new IntervenantTypeType();
    }

    /**
     * Create an instance of {@link PointSegmentClienteleType }
     * 
     */
    public PointSegmentClienteleType createPointSegmentClienteleType() {
        return new PointSegmentClienteleType();
    }

    /**
     * Create an instance of {@link FaisabiliteReserveMotifType }
     * 
     */
    public FaisabiliteReserveMotifType createFaisabiliteReserveMotifType() {
        return new FaisabiliteReserveMotifType();
    }

    /**
     * Create an instance of {@link OffreTypeType }
     * 
     */
    public OffreTypeType createOffreTypeType() {
        return new OffreTypeType();
    }

    /**
     * Create an instance of {@link ClientPrioritaireTypeType }
     * 
     */
    public ClientPrioritaireTypeType createClientPrioritaireTypeType() {
        return new ClientPrioritaireTypeType();
    }

    /**
     * Create an instance of {@link AffaireNatureModificationType }
     * 
     */
    public AffaireNatureModificationType createAffaireNatureModificationType() {
        return new AffaireNatureModificationType();
    }

    /**
     * Create an instance of {@link DemandeMiseEnServiceCorrectiveMotifType }
     * 
     */
    public DemandeMiseEnServiceCorrectiveMotifType createDemandeMiseEnServiceCorrectiveMotifType() {
        return new DemandeMiseEnServiceCorrectiveMotifType();
    }

    /**
     * Create an instance of {@link DysfonctionnementNatureType }
     * 
     */
    public DysfonctionnementNatureType createDysfonctionnementNatureType() {
        return new DysfonctionnementNatureType();
    }

    /**
     * Create an instance of {@link ProgrammeCircuitEauTempoType }
     * 
     */
    public ProgrammeCircuitEauTempoType createProgrammeCircuitEauTempoType() {
        return new ProgrammeCircuitEauTempoType();
    }

    /**
     * Create an instance of {@link FraudeNatureType }
     * 
     */
    public FraudeNatureType createFraudeNatureType() {
        return new FraudeNatureType();
    }

    /**
     * Create an instance of {@link TransformateurCalibreType }
     * 
     */
    public TransformateurCalibreType createTransformateurCalibreType() {
        return new TransformateurCalibreType();
    }

    /**
     * Create an instance of {@link ReleveModeType }
     * 
     */
    public ReleveModeType createReleveModeType() {
        return new ReleveModeType();
    }

    /**
     * Create an instance of {@link PrestationFicheType }
     * 
     */
    public PrestationFicheType createPrestationFicheType() {
        return new PrestationFicheType();
    }

    /**
     * Create an instance of {@link TransformateurCouplageType }
     * 
     */
    public TransformateurCouplageType createTransformateurCouplageType() {
        return new TransformateurCouplageType();
    }

    /**
     * Create an instance of {@link AffaireStatutType }
     * 
     */
    public AffaireStatutType createAffaireStatutType() {
        return new AffaireStatutType();
    }

    /**
     * Create an instance of {@link PuissanceType }
     * 
     */
    public PuissanceType createPuissanceType() {
        return new PuissanceType();
    }

    /**
     * Create an instance of {@link AcquittementType }
     * 
     */
    public AcquittementType createAcquittementType() {
        return new AcquittementType();
    }

    /**
     * Create an instance of {@link EnteteType }
     * 
     */
    public EnteteType createEnteteType() {
        return new EnteteType();
    }

    /**
     * Create an instance of {@link ErreurType }
     * 
     */
    public ErreurType createErreurType() {
        return new ErreurType();
    }

    /**
     * Create an instance of {@link ResultatType }
     * 
     */
    public ResultatType createResultatType() {
        return new ResultatType();
    }

    /**
     * Create an instance of {@link InfoFonctionnellesType }
     * 
     */
    public InfoFonctionnellesType createInfoFonctionnellesType() {
        return new InfoFonctionnellesType();
    }

    /**
     * Create an instance of {@link InfoDemandeurType }
     * 
     */
    public InfoDemandeurType createInfoDemandeurType() {
        return new InfoDemandeurType();
    }

    /**
     * Create an instance of {@link Header }
     * 
     */
    public Header createHeader() {
        return new Header();
    }

    /**
     * Create an instance of {@link Fault }
     * 
     */
    public Fault createFault() {
        return new Fault();
    }

    /**
     * Create an instance of {@link Envelope }
     * 
     */
    public Envelope createEnvelope() {
        return new Envelope();
    }

    /**
     * Create an instance of {@link Body }
     * 
     */
    public Body createBody() {
        return new Body();
    }

    /**
     * Create an instance of {@link Detail }
     * 
     */
    public Detail createDetail() {
        return new Detail();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Body }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/envelope/", name = "Body")
    public JAXBElement<Body> createBody(Body value) {
        return new JAXBElement<Body>(_Body_QNAME, Body.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RechercherPointType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.enedis.fr/sge/b2b/services/rechercherpoint/v2.0", name = "rechercherPoint")
    public JAXBElement<RechercherPointType> createRechercherPoint(RechercherPointType value) {
        return new JAXBElement<RechercherPointType>(_RechercherPoint_QNAME, RechercherPointType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Envelope }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/envelope/", name = "Envelope")
    public JAXBElement<Envelope> createEnvelope(Envelope value) {
        return new JAXBElement<Envelope>(_Envelope_QNAME, Envelope.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnteteType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.enedis.fr/sge/b2b/technique/v1.0", name = "entete")
    public JAXBElement<EnteteType> createEntete(EnteteType value) {
        return new JAXBElement<EnteteType>(_Entete_QNAME, EnteteType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Fault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/envelope/", name = "Fault")
    public JAXBElement<Fault> createFault(Fault value) {
        return new JAXBElement<Fault>(_Fault_QNAME, Fault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcquittementType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.enedis.fr/sge/b2b/technique/v1.0", name = "acquittement")
    public JAXBElement<AcquittementType> createAcquittement(AcquittementType value) {
        return new JAXBElement<AcquittementType>(_Acquittement_QNAME, AcquittementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErreurType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.enedis.fr/sge/b2b/technique/v1.0", name = "erreur")
    public JAXBElement<ErreurType> createErreur(ErreurType value) {
        return new JAXBElement<ErreurType>(_Erreur_QNAME, ErreurType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RechercherPointResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.enedis.fr/sge/b2b/services/rechercherpoint/v2.0", name = "rechercherPointResponse")
    public JAXBElement<RechercherPointResponseType> createRechercherPointResponse(RechercherPointResponseType value) {
        return new JAXBElement<RechercherPointResponseType>(_RechercherPointResponse_QNAME, RechercherPointResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Header }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/envelope/", name = "Header")
    public JAXBElement<Header> createHeader(Header value) {
        return new JAXBElement<Header>(_Header_QNAME, Header.class, null, value);
    }

}
