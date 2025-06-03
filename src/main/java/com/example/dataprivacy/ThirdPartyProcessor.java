package src.main.java.com.example.dataprivacy;
/**
 * Enum defining third-party companies and services that may process personal data.
 * Simplified version with essential processors only.
 */
public enum ThirdPartyProcessor {
    
    // Shipping and Logistics
    DHL("DHL", "Shipping and logistics"),
    FEDEX("FedEx", "Shipping and logistics"),
    UPS("UPS", "Shipping and logistics"),
    DPD("DPD", "Shipping and logistics"),
    
    // Payment Processors
    STRIPE("Stripe", "Payment processing"),
    PAYPAL("PayPal", "Payment processing"),
    ADYEN("Adyen", "Payment processing"),
    KLARNA("Klarna", "Payment processing"),
    
    // Analytics and BI
    GOOGLE_ANALYTICS("Google Analytics", "Web analytics"),
    POWER_BI("Microsoft Power BI", "Business intelligence"),
    
    // Customer Support
    ZENDESK("Zendesk", "Customer support"),
    SALESFORCE("Salesforce", "CRM and support"),
    
    // Marketing and Communication
    MAILCHIMP("Mailchimp", "Email marketing"),
    SENDGRID("SendGrid", "Email delivery"),
    
    // Identity Verification
    JUMIO("Jumio", "Identity verification"),
    ONFIDO("Onfido", "Identity verification"),
    
    // Tax and Compliance
    AVALARA("Avalara", "Tax calculation"),
    
    // Other
    OTHER("Other", "Third-party processor");
    
    private final String displayName;
    private final String serviceType;
    
    ThirdPartyProcessor(String displayName, String serviceType) {
        this.displayName = displayName;
        this.serviceType = serviceType;
    }
    
    public String getDisplayName() {
        return displayName;
    }
    
    public String getServiceType() {
        return serviceType;
    }
}