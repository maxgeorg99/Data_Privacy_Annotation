package src.main.java.com.example.dataprivacy;
/**
 * Enum defining categories of personal data being processed.
 * Helps classify data types for appropriate handling and protection measures.
 */
public enum DataCategory {
    
    /** Basic identifying information (name, email, phone) */
    IDENTITY("Identity information"),
    
    /** Financial information (bank details, tax numbers, payment info) */
    FINANCIAL("Financial information"),
    
    /** Contact information (address, phone, email) */
    CONTACT("Contact information"),
    
    /** Demographic information (age, gender, nationality) */
    DEMOGRAPHIC("Demographic information"),
    
    /** Employment related data */
    EMPLOYMENT("Employment information"),
    
    /** Health related data (sensitive under GDPR Article 9) */
    HEALTH("Health information"),
    
    /** Biometric data (sensitive under GDPR Article 9) */
    BIOMETRIC("Biometric data"),
    
    /** Location and tracking data */
    LOCATION("Location data"),
    
    /** Behavioral and preference data */
    BEHAVIORAL("Behavioral data"),
    
    /** Communication content (messages, emails) */
    COMMUNICATION("Communication content"),
    
    /** Technical data (IP addresses, device info) */
    TECHNICAL("Technical data"),
    
    /** Commercial transaction data */
    TRANSACTION("Transaction data"),
    
    /** Legal and compliance related data */
    LEGAL("Legal information"),
    
    /** Educational information */
    EDUCATION("Educational information"),
    
    /** Family and relationship data */
    FAMILY("Family information");
    
    private final String description;
    
    DataCategory(String description) {
        this.description = description;
    }
    
    public String getDescription() {
        return description;
    }
    
    /**
     * Checks if this data category is considered sensitive under GDPR Article 9
     */
    public boolean isSensitiveCategory() {
        return this == HEALTH || this == BIOMETRIC;
    }
}