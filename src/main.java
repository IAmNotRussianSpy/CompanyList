import javafx.util.Pair;

import java.util.ArrayList;

public class main {
    public static void main(String args[]) {
        Company company1 = new Company("ABB", "ABB", "48 123 456 789", "Street 1", "City 1", "55555", "Polish", "PL", "AABB");
        Company company2 = new Company("Zab", "Zabka", "48 987 654 321", "Street 2", "City 1", "44444", "Polish", "PL", "Fresh-Market");
        Company company3 = new Company("Com", "Comarch", "48 274 819 947", "Street 3", "City 2", "93720", "English", "EN", "AGH");
        Company company4 = new Company("Zar", "Zara", "48 829 173 293", "Street 4", "City 3", "92749", "Spanish", "ES", "Inditex");
        Company company5 = new Company("Aud", "Audi", "64 489 398 934", "Street 5", "City 4", "72904", "German", "DE", "Volkswagen");
        CompanyList listOfCompanies = new CompanyList();
        listOfCompanies.addCompany(company1);
        listOfCompanies.addCompany(company2);
        listOfCompanies.addCompany(company3);
        listOfCompanies.addCompany(company4);
        listOfCompanies.addCompany(company5);
        listOfCompanies.sortByName();
        ArrayList<Company> searchedCity = listOfCompanies.searchByCity("City 1");
        ArrayList<Pair> languageSorted = listOfCompanies.getLanguages();
        listOfCompanies.removeById("Zar");
    }
}
