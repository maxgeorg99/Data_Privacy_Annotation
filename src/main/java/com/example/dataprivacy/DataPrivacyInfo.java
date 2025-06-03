package src.main.java.com.example.dataprivacy;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Simplified annotation to mark fields containing personal data.
 * 
 * Example usage:
 * @DataPrivacyInfo(
 *     purpose = DataPurpose.TAX_COMPLIANCE,
 *     legalBasis = LegalBasis.LEGAL_OBLIGATION,
 *     dataCategory = DataCategory.FINANCIAL,
 *     retentionPeriod = RetentionPeriod.SEVEN_YEARS,
 *     encryptionRequired = true,
 *     thirdPartyProcessors = {ThirdPartyProcessor.AVALARA}
 * )
 * private String taxNumber;
 */
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface DataPrivacyInfo {
    
    /**
     * The primary purpose for collecting this personal data
     */
    DataPurpose purpose();
    
    /**
     * Legal basis under GDPR for processing this data
     */
    LegalBasis legalBasis();
    
    /**
     * Category of personal data being processed
     */
    DataCategory dataCategory();
    
    /**
     * How long this data should be retained
     */
    RetentionPeriod retentionPeriod();
    
    /**
     * Whether this data requires encryption at rest and in transit
     */
    boolean encryptionRequired() default false;
    
    /**
     * Whether this data is considered sensitive under GDPR Article 9
     */
    boolean isSensitiveData() default false;
    
    /**
     * Third-party companies or services that process this data
     */
    ThirdPartyProcessor[] thirdPartyProcessors() default {};
    
    /**
     * Type of data sharing relationship with third parties
     */
    DataSharingType dataSharingType() default DataSharingType.PROCESSOR;
    
    /**
     * Additional notes or special handling instructions
     */
    String notes() default "";
}
