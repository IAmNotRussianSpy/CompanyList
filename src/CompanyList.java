import javafx.util.Pair;

import java.util.ArrayList;

public class CompanyList {

    private ArrayList<Company> companiesListed;

    public CompanyList() {
        this.companiesListed = new ArrayList<>();
    }

    public void addCompany(Company company) {
        this.companiesListed.add(company);
    }

    public ArrayList<Company> searchByCity(String city) {
        ArrayList<Company> citySearchResult = new ArrayList<>();
        for (Company x : this.companiesListed) {
            if (((Company) x).getAddress().getCity() == city) {
                citySearchResult.add(x);
            }
        }
        return citySearchResult;
    }

    public void sortByName() {
        this.companiesListed.sort(Company::compareTo);
    }

    public void removeById(String id) {
        this.companiesListed.removeIf(company -> company.getId().equals(id));
    }

    public ArrayList<Pair> getLanguages() {
        ArrayList<Pair> languagesFound = new ArrayList<>();
        for (Company x : companiesListed) {
            Pair<String, String> languageAndCode = new Pair<>(x.getLanguage(), x.getLanguageCode());
            if (!languagesFound.contains(languageAndCode)) {
                languagesFound.add(languageAndCode);
            }
        }
        return languagesFound;
    }

}
