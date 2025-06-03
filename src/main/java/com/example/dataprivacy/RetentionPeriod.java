package src.main.java.com.example.dataprivacy;
/**
 * Enum defining standard retention periods for personal data.
 * Provides common retention timeframes based on legal and business requirements.
 */
public enum RetentionPeriod {
    
    /** 30 days retention */
    THIRTY_DAYS("30 days", 1),
    
    /** 3 months retention */
    THREE_MONTHS("3 months", 3),
    
    /** 6 months retention */
    SIX_MONTHS("6 months", 6),
    
    /** 1 year retention */
    ONE_YEAR("1 year", 12),
    
    /** 2 years retention */
    TWO_YEARS("2 years", 24),
    
    /** 3 years retention */
    THREE_YEARS("3 years", 36),
    
    /** 5 years retention (common for financial records) */
    FIVE_YEARS("5 years", 60),
    
    /** 7 years retention (common for tax records like DAC7) */
    SEVEN_YEARS("7 years", 84),
    
    /** 10 years retention */
    TEN_YEARS("10 years", 120),
    
    /** Indefinite retention (requires special justification) */
    INDEFINITE("Indefinite", -1),
    
    /** Until consent withdrawal */
    UNTIL_CONSENT_WITHDRAWAL("Until consent withdrawal", -2),
    
    /** Until contract termination */
    UNTIL_CONTRACT_END("Until contract termination", -3);
    
    private final String description;
    private final int months;
    
    RetentionPeriod(String description, int months) {
        this.description = description;
        this.months = months;
    }
    
    public String getDescription() {
        return description;
    }
    
    public int getMonths() {
        return months;
    }
    
    public boolean isDefinitePeriod() {
        return months > 0;
    }
}