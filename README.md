# Java Data Privacy Annotation Framework

A comprehensive, framework-agnostic annotation system for documenting personal data processing in Java applications. Designed for GDPR compliance, data lifecycle management, and automated privacy tooling.

## 🎯 Problem Statement

In modern marketplace applications, personal data is collected, processed, and shared with numerous third-party services. Critical questions arise:

- **Why** was this data collected?
- **When** and **where** was it collected?
- **For which purpose** is it being processed?
- **Does it need encryption** or special handling?
- **When can/should we delete it?**
- **Which third-party services** process this data?
- **Are we allowed to delete it** or must we keep it for compliance (e.g., 7 years for DAC7 tax records)?

### Real-World Example: Marketplace Tax Compliance

Consider a marketplace where customers enter tax numbers for EU DAC7 regulation compliance:
- Data must be retained for **1 years** 
- Requires **encryption**
- May be shared with **tax service providers** (Avalara) and reported to the government on a yearly basis.
- **Cannot be auto-deleted** due to legal requirements
- Related to **DAC7 reporting process**

Without proper documentation, this critical information exists only in developers' minds or scattered documentation.

## 💡 Solution

This framework provides a comprehensive `@DataPrivacyInfo` annotation that documents all essential privacy metadata directly at the entity field level, enabling:

✅ **Programmatic discovery** of all personal data
✅ **Automated compliance** monitoring  
✅ **GDPR Article 30** record generation
✅ **Privacy impact assessments**
✅ **Data lifecycle management**
✅ **Third-party processor tracking**

## 🚀 Quick Start

### Basic Usage

```java
public class MarketplaceUser {
    
    @DataPrivacyInfo(
        purpose = DataPurpose.TAX_COMPLIANCE,
        legalBasis = LegalBasis.LEGAL_OBLIGATION,
        dataCategory = DataCategory.FINANCIAL,
        retentionPeriod = RetentionPeriod.SEVEN_YEARS,
        encryptionRequired = true,
        thirdPartyProcessors = {ThirdPartyProcessor.AVALARA},
        notes = "DAC7 compliance"
    )
    private String taxNumber;
    
    @DataPrivacyInfo(
        purpose = DataPurpose.DELIVERY,
        legalBasis = LegalBasis.CONTRACT,
        dataCategory = DataCategory.CONTACT,
        retentionPeriod = RetentionPeriod.ONE_YEAR,
        thirdPartyProcessors = {ThirdPartyProcessor.DHL, ThirdPartyProcessor.UPS},
        dataSharingType = DataSharingType.SERVICE_FULFILLMENT
    )
    private String shippingAddress;
}
```

### Complete Example

See [`MarketplaceUser.java`](MarketplaceUser.java) for a comprehensive example showing various data types and their privacy annotations.

## 🔧 Usage Patterns

### Tax Compliance (DAC7 Example)
```java
@DataPrivacyInfo(
    purpose = DataPurpose.TAX_COMPLIANCE,
    legalBasis = LegalBasis.LEGAL_OBLIGATION,
    dataCategory = DataCategory.FINANCIAL,
    retentionPeriod = RetentionPeriod.SEVEN_YEARS,
    encryptionRequired = true,
    thirdPartyProcessors = {ThirdPartyProcessor.AVALARA},
    notes = "EU DAC7 regulation compliance"
)
private String taxNumber;
```

### Marketing with Consent
```java
@DataPrivacyInfo(
    purpose = DataPurpose.MARKETING,
    legalBasis = LegalBasis.CONSENT,
    dataCategory = DataCategory.CONTACT,
    retentionPeriod = RetentionPeriod.UNTIL_CONSENT_WITHDRAWAL,
    thirdPartyProcessors = {ThirdPartyProcessor.MAILCHIMP}
)
private String emailAddress;
```

### Payment Processing
```java
@DataPrivacyInfo(
    purpose = DataPurpose.PAYMENT_PROCESSING,
    legalBasis = LegalBasis.CONTRACT,
    dataCategory = DataCategory.FINANCIAL,
    retentionPeriod = RetentionPeriod.THREE_YEARS,
    encryptionRequired = true,
    thirdPartyProcessors = {ThirdPartyProcessor.STRIPE, ThirdPartyProcessor.PAYPAL},
    dataSharingType = DataSharingType.SERVICE_FULFILLMENT
)
private String bankAccountNumber;
```

## 🛠️ Building Privacy Tools

The framework enables building sophisticated privacy tooling:

### 1. Data Discovery
```java
// Find all personal data fields in an entity
List<Field> personalDataFields = Arrays.stream(MarketplaceUser.class.getDeclaredFields())
    .filter(field -> field.isAnnotationPresent(DataPrivacyInfo.class))
    .collect(Collectors.toList());
```

### 2. Retention Management
```java
// Find data eligible for deletion
List<Field> expiredData = personalDataFields.stream()
    .filter(field -> {
        DataPrivacyInfo info = field.getAnnotation(DataPrivacyInfo.class);
        return isExpired(info.retentionPeriod());
    })
    .collect(Collectors.toList());
```

### 3. Third-Party Audit
```java
// Generate third-party processor report
Map<ThirdPartyProcessor, List<String>> processorMap = personalDataFields.stream()
    .collect(Collectors.groupingBy(
        field -> field.getAnnotation(DataPrivacyInfo.class).thirdPartyProcessors(),
        Collectors.mapping(Field::getName, Collectors.toList())
    ));
```

## 📈 Benefits

### For Developers
- **Clear documentation** of data handling requirements
- **Reduced cognitive load** - privacy info at point of definition
- **IDE support** - autocomplete and validation
- **Consistent approach** across teams

### For Legal/Compliance Teams
- **Complete visibility** into data processing
- **Automated GDPR documentation**
- **Third-party processor tracking**
- **Audit trail** for compliance reviews

### For Operations
- **Automated data lifecycle** management
- **Privacy by design** enforcement
- **Risk assessment** capabilities
- **Incident response** support
