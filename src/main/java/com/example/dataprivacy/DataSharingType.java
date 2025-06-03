package src.main.java.com.example.dataprivacy;
/**
 * Enum defining the type of relationship and data sharing with third parties.
 * Simplified version focusing on essential sharing types.
 */
public enum DataSharingType {
    
    /** Data is processed by a third party on our behalf (data processor relationship) */
    PROCESSOR("Data Processor - processes on our behalf"),
    
    /** Data is transferred for specific service fulfillment */
    SERVICE_FULFILLMENT("Service Fulfillment - necessary for contract execution"),
    
    /** Data is shared for legal compliance or regulatory requirements */
    LEGAL_REQUIREMENT("Legal Requirement - mandatory disclosure"),
    
    /** Data is shared with explicit user consent */
    CONSENT_BASED("Consent-based sharing");
    
    private final String description;
    
    DataSharingType(String description) {
        this.description = description;
    }
    
    public String getDescription() {
        return description;
    }
}