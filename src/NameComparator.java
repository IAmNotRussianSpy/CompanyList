import java.util.Comparator;

public class NameComparator implements Comparator<Company> {
    /*@Override
    public int compare(Company x, Company y){
        return x.getName().toLowerCase().compareTo(y.getAddress().getCity().toLowerCase());
    }*/
    public int compare(Company x, Company y) {
        return x.getName().compareToIgnoreCase(y.getName());
    }
}
