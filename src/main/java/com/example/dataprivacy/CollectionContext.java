package src.main.java.com.example.dataprivacy;
/**
 * Enum defining the context in which personal data was collected.
 * Helps track the origin and circumstances of data collection for audit purposes.
 */
public enum CollectionContext {
    
    /** Data collected during user registration process */
    USER_REGISTRATION("User registration"),
    
    /** Data collected during account verification */
    ACCOUNT_VERIFICATION("Account verification"),
    
    /** Data collected during purchase/checkout process */
    CHECKOUT_PROCESS("Checkout process"),
    
    /** Data collected for KYC (Know Your Customer) procedures */
    KYC_PROCESS("KYC process"),
    
    /** Data collected through customer support interactions */
    CUSTOMER_SUPPORT("Customer support"),
    
    /** Data collected through marketing campaigns */
    MARKETING_CAMPAIGN("Marketing campaign"),
    
    /** Data collected through website forms */
    WEB_FORM("Web form"),
    
    /** Data collected through mobile application */
    MOBILE_APP("Mobile application"),
    
    /** Data collected through API integrations */
    API_INTEGRATION("API integration"),
    
    /** Data collected for tax compliance requirements */
    TAX_COMPLIANCE_FORM("Tax compliance form"),
    
    /** Data collected during onboarding process */
    ONBOARDING("Onboarding process"),
    
    /** Data collected through surveys */
    SURVEY("Survey"),
    
    /** Data imported from third-party sources */
    THIRD_PARTY_IMPORT("Third-party import"),
    
    /** Data collected automatically through system usage */
    AUTOMATIC_COLLECTION("Automatic collection");
    
    private final String description;
    
    CollectionContext(String description) {
        this.description = description;
    }
    
    public String getDescription() {
        return description;
    }
}