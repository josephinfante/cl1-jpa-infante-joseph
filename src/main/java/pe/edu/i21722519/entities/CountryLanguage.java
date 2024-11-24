package pe.edu.i21722519.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "countrylanguage")
public class CountryLanguage {

    @EmbeddedId
    private CountryLanguagePk countryLanguagePk;
    private String IsOfficial;
    private Double Percentage;

    @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
    @JoinColumn(name = "CountryCode", referencedColumnName = "Code")
    @MapsId("CountryCode")
    private Country country;

    public CountryLanguage() {
    }

    public CountryLanguage(CountryLanguagePk countryLanguagePk) {
        this.countryLanguagePk = countryLanguagePk;
    }

    public CountryLanguage(CountryLanguagePk countryLanguagePk, String isOfficial, Double percentage, Country country) {
        this.countryLanguagePk = countryLanguagePk;
        IsOfficial = isOfficial;
        Percentage = percentage;
        this.country = country;
    }

    @Override
    public String toString() {
        return "CountryLanguage{" +
                "countryLanguagePk=" + countryLanguagePk +
                ", IsOfficial='" + IsOfficial + '\'' +
                ", Percentage=" + Percentage +
                '}';
    }

    public CountryLanguagePk getCountryLanguagePk() {
        return countryLanguagePk;
    }

    public void setCountryLanguagePk(CountryLanguagePk countryLanguagePk) {
        this.countryLanguagePk = countryLanguagePk;
    }

    public String getIsOfficial() {
        return IsOfficial;
    }

    public void setIsOfficial(String isOfficial) {
        IsOfficial = isOfficial;
    }

    public Double getPercentage() {
        return Percentage;
    }

    public void setPercentage(Double percentage) {
        Percentage = percentage;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
