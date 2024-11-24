package pe.edu.i21722519.utils;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.i21722519.entities.City;
import pe.edu.i21722519.entities.Country;
import pe.edu.i21722519.entities.CountryLanguage;
import pe.edu.i21722519.entities.CountryLanguagePk;

import java.util.Arrays;

public class JPAPersist {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("world");
        EntityManager em = emf.createEntityManager();

        Country country = new Country("WAK", "Wakanda", "Africa", "South Africa", 1235.00, 1245, 123154334,78.1, 423312.23, 412312.3, "Wakanda", "Republic", "Athenea", 123, "WK", null, null);

        City city1 = new City(null, "Pibe", "Pibe", 1234, country);
        City city2 = new City(null, "Athenea", "Athenea", 4213, country);
        City city3 = new City(null, "Noah", "Noah", 5434, country);

        CountryLanguagePk languagePk1 = new CountryLanguagePk(country.getCode(), "Spanish Wakanda");
        CountryLanguagePk languagePk2 = new CountryLanguagePk(country.getCode(), "English Wakanda");

        CountryLanguage language1 = new CountryLanguage(languagePk1, "T", 20.5, country);
        CountryLanguage language2 = new CountryLanguage(languagePk2, "T", 20.5, country);

        country.setCities(Arrays.asList(city1, city2, city3));
        country.setLanguages(Arrays.asList(language1, language2));

        em.getTransaction().begin();
        em.persist(country);
        em.getTransaction().commit();

    }
}
