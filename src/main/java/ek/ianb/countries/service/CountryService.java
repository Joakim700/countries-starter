package ek.ianb.countries.service;

import ek.ianb.countries.model.Country;
import ek.ianb.countries.repository.CountryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    private final CountryRepository countryRepository;

    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public List<Country> findAllCountries() {
        return countryRepository.findAllCountries();
    }
}
