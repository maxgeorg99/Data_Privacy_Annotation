package src.main.java.com.example.dataprivacy;
/**
 * Enum defining the primary purposes for collecting and processing personal data.
 * Simplified version focusing on essential business purposes.
 */
public enum DataPurpose {
    
    /** Tax compliance and reporting (e.g., DAC7, VAT reporting) */
    TAX_COMPLIANCE("Tax compliance and reporting"),
    
    /** Contract execution and fulfillment */
    CONTRACT_EXECUTION("Contract execution and fulfillment"),
    
    /** Customer service and support */
    CUSTOMER_SERVICE("Customer service and support"),
    
    /** Marketing and promotional activities */
    MARKETING("Marketing and promotional activities"),
    
    /** Fraud prevention and security */
    FRAUD_PREVENTION("Fraud prevention and security"),
    
    /** Account management and authentication */
    ACCOUNT_MANAGEMENT("Account management and authentication"),
    
    /** Payment processing */
    PAYMENT_PROCESSING("Payment processing"),
    
    /** Identity verification and KYC */
    IDENTITY_VERIFICATION("Identity verification and KYC"),
    
    /** Product delivery and logistics */
    DELIVERY("Product delivery and logistics"),
    
    /** Marketplace operations */
    MARKETPLACE_OPERATIONS("Marketplace operations");
    
    private final String description;
    
    DataPurpose(String description) {
        this.description = description;
    }
    
    public String getDescription() {
        return description;
    }
}