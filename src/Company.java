public class Company implements Comparable<Company> {

    private String id;
    private String name;
    private String phoneNumber;
    private Address address;
    private String language;
    private String languageCode;
    private String parentCompany;

    public Company(String id, String name, String phoneNumber, String street, String city, String zipCode, String language, String languageCode, String parentCompany) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = new Address(city, street, zipCode);
        this.language = language;
        this.languageCode = languageCode;
        this.parentCompany = parentCompany;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public String getLanguage() {
        return language;
    }

    public String getParentCompany() {
        return parentCompany;
    }

    @Override
    public int compareTo(Company o) {
        return name.compareToIgnoreCase(o.getName());
    }
}
