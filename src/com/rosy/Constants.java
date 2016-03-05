package com.rosy;


/**
 * Constant values used throughout the application.
 *
 * <p>
 * <a href="Constants.java.html"><i>View Source</i></a>
 * </p>
 *
 * @author <a href="mailto:matt@raibledesigns.com">Matt Raible</a>
 */
public class Constants {
    //~ Static fields/initializers =============================================

    /** The name of the ResourceBundle used in this application */
    public static final String BUNDLE_KEY = "ApplicationResources";

    /** The encryption algorithm key to be used for passwords */
    public static final String ENC_ALGORITHM = "algorithm";

    /** A flag to indicate if passwords should be encrypted */
    public static final String ENCRYPT_PASSWORD = "encryptPassword";

    /** File separator from System properties */
    public static final String FILE_SEP = System.getProperty("file.separator");

    /** User home from System properties */
    public static final String USER_HOME = System.getProperty("user.home") + FILE_SEP;

    /** The name of the configuration hashmap stored in application scope. */
    public static final String CONFIG = "appConfig";

    
    public static final String  APP_CONTEXT_HIBERNATE= "WEB-INF/applicationContext-hibernate.xml";
    public static final String  APP_CONTEXT_SERVICE= "WEB-INF/applicationContext-service.xml";
    public static final String  APP_CONTEXT_RESOURCE= "WEB-INF/applicationContext-resources.xml";
    /** 
     * Session scope attribute that holds the locale set by the user. By setting this key
     * to the same one that Struts uses, we get synchronization in Struts w/o having
     * to do extra work or have two session-level variables.
     */ 
    public static final String PREFERRED_LOCALE_KEY = "org.apache.struts.action.LOCALE";
    
    public static final String ACTION = "1";
    
    /**
     * The request scope attribute under which an editable user form is stored
     */
    public static final String USER_KEY = "userForm";

    /**
     * The request scope attribute that holds the user list
     */
    public static final String USER_LIST = "userList";

    /**
     * The request scope attribute for indicating a newly-registered user
     */
    public static final String REGISTERED = "registered";

    /**
     * The name of the Administrator role, as specified in web.xml
     */
    public static final String ADMIN_ROLE = "admin";

    /**
     * The name of the User role, as specified in web.xml
     */
    public static final String USER_ROLE = "user";

    /**
     * The name of the user's role list, a request-scoped attribute
     * when adding/editing a user.
     */
    public static final String USER_ROLES = "userRoles";

    /**
     * The name of the available roles list, a request-scoped attribute
     * when adding/editing a user.
     */
    public static final String AVAILABLE_ROLES = "availableRoles";

    /**
     * The name of the CSS Theme setting.
     */
    public static final String CSS_THEME = "csstheme";
    
    public static final String UPLOAD_PATH ="WEB-INF\\upload"+ FILE_SEP;
    
    public static final String TEMP_PATH ="temp"+ FILE_SEP;
    
  //Attachment-START
    /**
     * The request scope attribute that holds the attachment form.
     */
    public static final String ATTACHMENT_KEY = "attachmentForm";

    /**
     * The request scope attribute that holds the attachment list
     */
    public static final String ATTACHMENT_LIST = "attachmentList";
    public static final String ATTACHMENT_CACHE__LIST = "attachmentCacheList";
//Attachment-END
    
  //ApcaOrganization-START
      /**
       * The request scope attribute that holds the apcaOrganization form.
       */
      public static final String APCAORGANIZATION_KEY = "apcaOrganizationForm";

      /**
       * The request scope attribute that holds the apcaOrganization list
       */
      public static final String APCAORGANIZATION_LIST = "apcaOrganizationList";
  //ApcaOrganization-END
      
    //PendingRequest-START
      /**
       * The request scope attribute that holds the pendingRequest form.
       */
      public static final String PENDINGREQUEST_KEY = "pendingRequestForm";

      /**
       * The request scope attribute that holds the pendingRequest list
       */
      public static final String PENDINGREQUEST_LIST = "pendingRequestList";
  //PendingRequest-END

  //SysLog-START
      /**
       * The request scope attribute that holds the sysLog form.
       */
      public static final String SYSLOG_KEY = "sysLogForm";

      /**
       * The request scope attribute that holds the sysLog list
       */
      public static final String SYSLOG_LIST = "sysLogList";
  //SysLog-END

  //PartySpokesman-START
      /**
       * The request scope attribute that holds the partySpokesman form.
       */
      public static final String PARTYSPOKESMAN_KEY = "partySpokesmanForm";

      /**
       * The request scope attribute that holds the partySpokesman list
       */
      public static final String PARTYSPOKESMAN_LIST = "partySpokesmanList";
  //PartySpokesman-END

  //PartyInfo-START
      /**
       * The request scope attribute that holds the partyInfo form.
       */
      public static final String PARTYINFO_KEY = "partyInfoForm";

      /**
       * The request scope attribute that holds the partyInfo list
       */
      public static final String PARTYINFO_LIST = "partyInfoList";
  //PartyInfo-END

  //InspectMarket-START
      /**
       * The request scope attribute that holds the inspectMarket form.
       */
      public static final String INSPECTMARKET_KEY = "inspectMarketForm";

      /**
       * The request scope attribute that holds the inspectMarket list
       */
      public static final String INSPECTMARKET_LIST = "inspectMarketList";
  //InspectMarket-END

  //SceneCheck-START
      /**
       * The request scope attribute that holds the sceneCheck form.
       */
      public static final String SCENECHECK_KEY = "sceneCheckForm";

      /**
       * The request scope attribute that holds the sceneCheck list
       */
      public static final String SCENECHECK_LIST = "sceneCheckList";
  //SceneCheck-END

  //CaseReport-START
      /**
       * The request scope attribute that holds the caseReport form.
       */
      public static final String CASEREPORT_KEY = "caseReportForm";

      /**
       * The request scope attribute that holds the caseReport list
       */
      public static final String CASEREPORT_LIST = "caseReportList";
  //CaseReport-END

  //RegisterApproval-START
      /**
       * The request scope attribute that holds the registerApproval form.
       */
      public static final String REGISTERAPPROVAL_KEY = "registerApprovalForm";

      /**
       * The request scope attribute that holds the registerApproval list
       */
      public static final String REGISTERAPPROVAL_LIST = "registerApprovalList";
  //RegisterApproval-END

  //ForceWrit-START
      /**
       * The request scope attribute that holds the forceWrit form.
       */
      public static final String FORCEWRIT_KEY = "forceWritForm";

      /**
       * The request scope attribute that holds the forceWrit list
       */
      public static final String FORCEWRIT_LIST = "forceWritList";
  //ForceWrit-END

  //ExamProceeding-START
      /**
       * The request scope attribute that holds the examProceeding form.
       */
      public static final String EXAMPROCEEDING_KEY = "examProceedingForm";

      /**
       * The request scope attribute that holds the examProceeding list
       */
      public static final String EXAMPROCEEDING_LIST = "examProceedingList";
  //ExamProceeding-END

  //PropertyList-START
      /**
       * The request scope attribute that holds the propertyList form.
       */
      public static final String PROPERTYLIST_KEY = "propertyListForm";

      /**
       * The request scope attribute that holds the propertyList list
       */
      public static final String PROPERTYLIST_LIST = "propertyListList";
  //PropertyList-END

  //PropertyKeepList-START
      /**
       * The request scope attribute that holds the propertyKeepList form.
       */
      public static final String PROPERTYKEEPLIST_KEY = "propertyKeepListForm";

      /**
       * The request scope attribute that holds the propertyKeepList list
       */
      public static final String PROPERTYKEEPLIST_LIST = "propertyKeepListList";
  //PropertyKeepList-END

  //EnrolList-START
      /**
       * The request scope attribute that holds the enrolList form.
       */
      public static final String ENROLLIST_KEY = "enrolListForm";

      /**
       * The request scope attribute that holds the enrolList list
       */
      public static final String ENROLLIST_LIST = "enrolListList";
  //EnrolList-END

  //TransmitReturnReceipt-START
      /**
       * The request scope attribute that holds the transmitReturnReceipt form.
       */
      public static final String TRANSMITRETURNRECEIPT_KEY = "transmitReturnReceiptForm";

      /**
       * The request scope attribute that holds the transmitReturnReceipt list
       */
      public static final String TRANSMITRETURNRECEIPT_LIST = "transmitReturnReceiptList";
  //TransmitReturnReceipt-END

  //ReleaseForceWrit-START
      /**
       * The request scope attribute that holds the releaseForceWrit form.
       */
      public static final String RELEASEFORCEWRIT_KEY = "releaseForceWritForm";

      /**
       * The request scope attribute that holds the releaseForceWrit list
       */
      public static final String RELEASEFORCEWRIT_LIST = "releaseForceWritList";
  //ReleaseForceWrit-END

  //BusinessLicense-START
      /**
       * The request scope attribute that holds the businessLicense form.
       */
      public static final String BUSINESSLICENSE_KEY = "businessLicenseForm";

      /**
       * The request scope attribute that holds the businessLicense list
       */
      public static final String BUSINESSLICENSE_LIST = "businessLicenseList";
  //BusinessLicense-END

  //CheckItem-START
      /**
       * The request scope attribute that holds the checkItem form.
       */
      public static final String CHECKITEM_KEY = "checkItemForm";

      /**
       * The request scope attribute that holds the checkItem list
       */
      public static final String CHECKITEM_LIST = "checkItemList";
  //CheckItem-END

  //OtherCert-START
      /**
       * The request scope attribute that holds the otherCert form.
       */
      public static final String OTHERCERT_KEY = "otherCertForm";

      /**
       * The request scope attribute that holds the otherCert list
       */
      public static final String OTHERCERT_LIST = "otherCertList";
  //OtherCert-END

  //PunishExamine-START
      /**
       * The request scope attribute that holds the punishExamine form.
       */
      public static final String PUNISHEXAMINE_KEY = "punishExamineForm";

      /**
       * The request scope attribute that holds the punishExamine list
       */
      public static final String PUNISHEXAMINE_LIST = "punishExamineList";
  //PunishExamine-END

  //VerifyCheckup-START
      /**
       * The request scope attribute that holds the verifyCheckup form.
       */
      public static final String VERIFYCHECKUP_KEY = "verifyCheckupForm";

      /**
       * The request scope attribute that holds the verifyCheckup list
       */
      public static final String VERIFYCHECKUP_LIST = "verifyCheckupList";
  //VerifyCheckup-END

  //DiscussCaseRec-START
      /**
       * The request scope attribute that holds the discussCaseRec form.
       */
      public static final String DISCUSSCASEREC_KEY = "discussCaseRecForm";

      /**
       * The request scope attribute that holds the discussCaseRec list
       */
      public static final String DISCUSSCASEREC_LIST = "discussCaseRecList";
  //DiscussCaseRec-END

  //HearOfWitnesse-START
      /**
       * The request scope attribute that holds the hearOfWitnesse form.
       */
      public static final String HEAROFWITNESSE_KEY = "hearOfWitnesseForm";

      /**
       * The request scope attribute that holds the hearOfWitnesse list
       */
      public static final String HEAROFWITNESSE_LIST = "hearOfWitnesseList";
  //HearOfWitnesse-END

  //PerformCase-START
      /**
       * The request scope attribute that holds the performCase form.
       */
      public static final String PERFORMCASE_KEY = "performCaseForm";

      /**
       * The request scope attribute that holds the performCase list
       */
      public static final String PERFORMCASE_LIST = "performCaseList";
  //PerformCase-END

  //PunishDecisionBook-START
      /**
       * The request scope attribute that holds the punishDecisionBook form.
       */
      public static final String PUNISHDECISIONBOOK_KEY = "punishDecisionBookForm";

      /**
       * The request scope attribute that holds the punishDecisionBook list
       */
      public static final String PUNISHDECISIONBOOK_LIST = "punishDecisionBookList";
  //PunishDecisionBook-END

  //PunishDraft-START
      /**
       * The request scope attribute that holds the punishDraft form.
       */
      public static final String PUNISHDRAFT_KEY = "punishDraftForm";

      /**
       * The request scope attribute that holds the punishDraft list
       */
      public static final String PUNISHDRAFT_LIST = "punishDraftList";
  //PunishDraft-END

  //CaseInvestEndReport-START
      /**
       * The request scope attribute that holds the caseInvestEndReport form.
       */
      public static final String CASEINVESTENDREPORT_KEY = "caseInvestEndReportForm";

      /**
       * The request scope attribute that holds the caseInvestEndReport list
       */
      public static final String CASEINVESTENDREPORT_LIST = "caseInvestEndReportList";
  //CaseInvestEndReport-END

  //AffixToPunish-START
      /**
       * The request scope attribute that holds the affixToPunish form.
       */
      public static final String AFFIXTOPUNISH_KEY = "affixToPunishForm";

      /**
       * The request scope attribute that holds the affixToPunish list
       */
      public static final String AFFIXTOPUNISH_LIST = "affixToPunishList";
  //AffixToPunish-END

  //AdminApprize-START
      /**
       * The request scope attribute that holds the adminApprize form.
       */
      public static final String ADMINAPPRIZE_KEY = "adminApprizeForm";

      /**
       * The request scope attribute that holds the adminApprize list
       */
      public static final String ADMINAPPRIZE_LIST = "adminApprizeList";
  //AdminApprize-END

  //AmerceReceipt-START
      /**
       * The request scope attribute that holds the amerceReceipt form.
       */
      public static final String AMERCERECEIPT_KEY = "amerceReceiptForm";

      /**
       * The request scope attribute that holds the amerceReceipt list
       */
      public static final String AMERCERECEIPT_LIST = "amerceReceiptList";
  //AmerceReceipt-END

  //CaseCatalog-START
      /**
       * The request scope attribute that holds the caseCatalog form.
       */
      public static final String CASECATALOG_KEY = "caseCatalogForm";

      /**
       * The request scope attribute that holds the caseCatalog list
       */
      public static final String CASECATALOG_LIST = "caseCatalogList";
  //CaseCatalog-END
      
    //CheckupReport-START
      /**
       * The request scope attribute that holds the checkupReport form.
       */
      public static final String CHECKUPREPORT_KEY = "checkupReportForm";

      /**
       * The request scope attribute that holds the checkupReport list
       */
      public static final String CHECKUPREPORT_LIST = "checkupReportList";
  //CheckupReport-END

    //CheckupProxy-START
      /**
       * The request scope attribute that holds the checkupProxy form.
       */
      public static final String CHECKUPPROXY_KEY = "checkupProxyForm";

      /**
       * The request scope attribute that holds the checkupProxy list
       */
      public static final String CHECKUPPROXY_LIST = "checkupProxyList";
  //CheckupProxy-END

  //CheckProxyItem-START
      /**
       * The request scope attribute that holds the checkProxyItem form.
       */
      public static final String CHECKPROXYITEM_KEY = "checkProxyItemForm";

      /**
       * The request scope attribute that holds the checkProxyItem list
       */
      public static final String CHECKPROXYITEM_LIST = "checkProxyItemList";
  //CheckProxyItem-END

  //TransferCase-START
      /**
       * The request scope attribute that holds the transferCase form.
       */
      public static final String TRANSFERCASE_KEY = "transferCaseForm";

      /**
       * The request scope attribute that holds the transferCase list
       */
      public static final String TRANSFERCASE_LIST = "transferCaseList";
  //TransferCase-END

  //HandoverCase-START
      /**
       * The request scope attribute that holds the handoverCase form.
       */
      public static final String HANDOVERCASE_KEY = "handoverCaseForm";

      /**
       * The request scope attribute that holds the handoverCase list
       */
      public static final String HANDOVERCASE_LIST = "handoverCaseList";
  //HandoverCase-END

  //DerateOrPutOff-START
      /**
       * The request scope attribute that holds the derateOrPutOff form.
       */
      public static final String DERATEORPUTOFF_KEY = "derateOrPutOffForm";

      /**
       * The request scope attribute that holds the derateOrPutOff list
       */
      public static final String DERATEORPUTOFF_LIST = "derateOrPutOffList";
  //DerateOrPutOff-END

}
