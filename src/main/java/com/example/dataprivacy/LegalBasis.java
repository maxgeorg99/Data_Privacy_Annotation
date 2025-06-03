package src.main.java.com.example.dataprivacy;
/**
 * Enum defining the legal basis for processing personal data under GDPR Article 6.
 * This is crucial for demonstrating lawful processing of personal data.
 */
public enum LegalBasis {
    
    /** Data subject has given consent for processing (Article 6(1)(a)) */
    CONSENT("Consent of the data subject"),
    
    /** Processing is necessary for contract performance (Article 6(1)(b)) */
    CONTRACT("Performance of a contract"),
    
    /** Processing is necessary for legal obligation compliance (Article 6(1)(c)) */
    LEGAL_OBLIGATION("Compliance with legal obligation"),
    
    /** Processing is necessary to protect vital interests (Article 6(1)(d)) */
    VITAL_INTERESTS("Protection of vital interests"),
    
    /** Processing is necessary for public task performance (Article 6(1)(e)) */
    PUBLIC_TASK("Performance of public task"),
    
    /** Processing is necessary for legitimate interests (Article 6(1)(f)) */
    LEGITIMATE_INTERESTS("Legitimate interests of the controller");
    
    private final String description;
    
    LegalBasis(String description) {
        this.description = description;
    }
    
    public String getDescription() {
        return description;
    }
    
    public String getArticleReference() {
        switch (this) {
            case CONSENT: return "Article 6(1)(a)";
            case CONTRACT: return "Article 6(1)(b)";
            case LEGAL_OBLIGATION: return "Article 6(1)(c)";
            case VITAL_INTERESTS: return "Article 6(1)(d)";
            case PUBLIC_TASK: return "Article 6(1)(e)";
            case LEGITIMATE_INTERESTS: return "Article 6(1)(f)";
            default: return "";
        }
    }
}