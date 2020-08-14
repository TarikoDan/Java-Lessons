package lesson2_Composition_Agrigation.Task3_Request;

public class Passport {
    private String series;
    private int number;
    private String serviceIssues;

    public Passport() {
    }

    public Passport(String series, int number, String serviceIssues) {
        this.series = series;
        this.number = number;
        this.serviceIssues = serviceIssues;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getServiceIssues() {
        return serviceIssues;
    }

    public void setServiceIssues(String serviceIssues) {
        this.serviceIssues = serviceIssues;
    }

    @Override
    public String toString() {
        return "Passport{ " +
                series.toUpperCase() +
                "/" + number +
                ", vydanyj:_'" + serviceIssues + '\'' +
                '}';
    }
}
