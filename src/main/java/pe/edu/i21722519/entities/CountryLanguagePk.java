package pe.edu.i21722519.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Embeddable
public class CountryLanguagePk {

    private String CountryCode;
    private String Language;

    public CountryLanguagePk() {
    }

    public CountryLanguagePk(String countryCode, String language) {
        CountryCode = countryCode;
        Language = language;
    }

    @Override
    public String toString() {
        return "CountryLanguagePk{" +
                "CountryCode='" + CountryCode + '\'' +
                ", Language='" + Language + '\'' +
                '}';
    }

    public String getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(String countryCode) {
        CountryCode = countryCode;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String language) {
        Language = language;
    }
}
