package src.main.java.com.example.dataprivacy;
/**
 * Enum defining data subject rights under GDPR that apply to personal data.
 * Helps track which rights are applicable to specific data fields.
 */
public enum SubjectRights {
    
    /** Right to access personal data (Article 15) */
    ACCESS("Right of access"),
    
    /** Right to rectify inaccurate personal data (Article 16) */
    RECTIFICATION("Right to rectification"),
    
    /** Right to erasure / "right to be forgotten" (Article 17) */
    ERASURE("Right to erasure"),
    
    /** Right to restrict processing (Article 18) */
    RESTRICTION("Right to restriction of processing"),
    
    /** Right to data portability (Article 20) */
    PORTABILITY("Right to data portability"),
    
    /** Right to object to processing (Article 21) */
    OBJECTION("Right to object"),
    
    /** Right not to be subject to automated decision-making (Article 22) */
    NO_AUTOMATED_DECISION("Right to avoid automated decision-making"),
    
    /** Right to withdraw consent */
    WITHDRAW_CONSENT("Right to withdraw consent");
    
    private final String description;
    
    SubjectRights(String description) {
        this.description = description;
    }
    
    public String getDescription() {
        return description;
    }
    
    public String getArticleReference() {
        switch (this) {
            case ACCESS: return "Article 15";
            case RECTIFICATION: return "Article 16";
            case ERASURE: return "Article 17";
            case RESTRICTION: return "Article 18";
            case PORTABILITY: return "Article 20";
            case OBJECTION: return "Article 21";
            case NO_AUTOMATED_DECISION: return "Article 22";
            case WITHDRAW_CONSENT: return "Article 7(3)";
            default: return "";
        }
    }
}