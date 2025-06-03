package src.main.java.com.example.entity;

import src.main.java.com.example.dataprivacy.DataCategory;
import src.main.java.com.example.dataprivacy.DataPrivacyInfo;
import src.main.java.com.example.dataprivacy.DataPurpose;
import src.main.java.com.example.dataprivacy.DataSharingType;
import src.main.java.com.example.dataprivacy.LegalBasis;
import src.main.java.com.example.dataprivacy.RetentionPeriod;
import src.main.java.com.example.dataprivacy.ThirdPartyProcessor;

/**
 * Example entity demonstrating the simplified DataPrivacyInfo annotation.
 * Much more readable and manageable for developers.
 */
public class MarketplaceUser {
    
    @DataPrivacyInfo(
        purpose = DataPurpose.ACCOUNT_MANAGEMENT,
        legalBasis = LegalBasis.CONTRACT,
        dataCategory = DataCategory.IDENTITY,
        retentionPeriod = RetentionPeriod.UNTIL_CONTRACT_END
    )
    private String username;
    
    @DataPrivacyInfo(
        purpose = DataPurpose.IDENTITY_VERIFICATION,
        legalBasis = LegalBasis.CONTRACT,
        dataCategory = DataCategory.IDENTITY,
        retentionPeriod = RetentionPeriod.FIVE_YEARS,
        encryptionRequired = true
    )
    private String fullName;
    
    @DataPrivacyInfo(
        purpose = DataPurpose.TAX_COMPLIANCE,
        legalBasis = LegalBasis.LEGAL_OBLIGATION,
        dataCategory = DataCategory.FINANCIAL,
        retentionPeriod = RetentionPeriod.SEVEN_YEARS,
        encryptionRequired = true,
        thirdPartyProcessors = {ThirdPartyProcessor.AVALARA}
    )
    private String taxNumber;
    
    @DataPrivacyInfo(
        purpose = DataPurpose.PAYMENT_PROCESSING,
        legalBasis = LegalBasis.CONTRACT,
        dataCategory = DataCategory.FINANCIAL,
        retentionPeriod = RetentionPeriod.THREE_YEARS,
        encryptionRequired = true,
        thirdPartyProcessors = {ThirdPartyProcessor.STRIPE, ThirdPartyProcessor.PAYPAL},
        dataSharingType = DataSharingType.SERVICE_FULFILLMENT
    )
    private String bankAccountNumber;
    
    @DataPrivacyInfo(
        purpose = DataPurpose.DELIVERY,
        legalBasis = LegalBasis.CONTRACT,
        dataCategory = DataCategory.CONTACT,
        retentionPeriod = RetentionPeriod.ONE_YEAR,
        thirdPartyProcessors = {ThirdPartyProcessor.DHL, ThirdPartyProcessor.UPS},
        dataSharingType = DataSharingType.SERVICE_FULFILLMENT
    )
    private String shippingAddress;
    
    @DataPrivacyInfo(
        purpose = DataPurpose.MARKETING,
        legalBasis = LegalBasis.CONSENT,
        dataCategory = DataCategory.CONTACT,
        retentionPeriod = RetentionPeriod.UNTIL_CONSENT_WITHDRAWAL,
        thirdPartyProcessors = {ThirdPartyProcessor.MAILCHIMP}
    )
    private String emailAddress;
    
    @DataPrivacyInfo(
        purpose = DataPurpose.CUSTOMER_SERVICE,
        legalBasis = LegalBasis.LEGITIMATE_INTERESTS,
        dataCategory = DataCategory.CONTACT,
        retentionPeriod = RetentionPeriod.THREE_YEARS,
        thirdPartyProcessors = {ThirdPartyProcessor.ZENDESK}
    )
    private String supportHistory;
}