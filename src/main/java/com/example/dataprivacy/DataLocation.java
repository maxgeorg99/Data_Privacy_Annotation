package src.main.java.com.example.dataprivacy;
/**
 * Enum defining geographical locations where data processing is allowed.
 * Important for GDPR compliance and international data transfer restrictions.
 */
public enum DataLocation {
    
    /** European Union */
    EU("European Union"),
    
    /** European Economic Area */
    EEA("European Economic Area"),
    
    /** United States */
    US("United States"),
    
    /** United Kingdom */
    UK("United Kingdom"),
    
    /** Canada */
    CA("Canada"),
    
    /** Switzerland */
    CH("Switzerland"),
    
    /** Japan */
    JP("Japan"),
    
    /** Australia */
    AU("Australia"),
    
    /** Any location with adequacy decision */
    ADEQUACY_DECISION("Countries with adequacy decision"),
    
    /** Any location (requires additional safeguards) */
    GLOBAL("Global (with safeguards)");
    
    private final String description;
    
    DataLocation(String description) {
        this.description = description;
    }
    
    public String getDescription() {
        return description;
    }
    
    /**
     * Checks if this location is considered safe under GDPR without additional safeguards
     */
    public boolean isGDPRSafe() {
        return this == EU || this == EEA || this == ADEQUACY_DECISION;
    }
}