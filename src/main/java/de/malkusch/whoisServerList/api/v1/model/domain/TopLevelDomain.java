package de.malkusch.whoisServerList.api.v1.model.domain;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

/**
 * Top level domain.
 *
 * @author markus@malkusch.de
 * @see <a href="bitcoin:1335STSwu9hST4vcMRppEPgENMHD2r1REK">Donations</a>
 */
public final class TopLevelDomain extends Domain {

    /**
     * The registration service.
     */
    private URL registrationService;

    /**
     * The domain state, may be null.
     */
    private State state;

    /**
     * The country code, may be null.
     */
    private String countryCode;

    /**
     * The sub domains.
     */
    @XmlElement(name = "domain")
    private List<Domain> domains = new ArrayList<>();

    /**
     * Returns the ISO 3166-1 tld country code.
     *
     * @return the ISO 3166-1 tld country code, or null
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the ISO 3166-1 country code.
     *
     * @param countryCode  the ISO 3166-1 tld country code, may be null
     */
    public void setCountryCode(final String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * Returns the sub domains.
     *
     * @return the sub domains, not null
     */
    public List<Domain> getDomains() {
        return domains;
    }

    /**
     * Sets the sub domains.
     *
     * @param domains  the sub domains, not null
     */
    public void setDomains(final List<Domain> domains) {
        this.domains = domains;
    }

    /**
     * Returns the URL of the registration service.
     *
     * @return the registration service, maybe null
     */
    public URL getRegistratonService() {
        return registrationService;
    }

    /**
     * Sets the URL of the registration service.
     *
     * @param registrationService the registration service, may be null
     */
    public void setRegistratonService(final URL registrationService) {
        this.registrationService = registrationService;
    }

    /**
     * Gets the domain state.
     *
     * @return the domain state, or null
     */
    public State getState() {
        return state;
    }

    /**
     * Sets the domain state.
     *
     * @param state  the domain state, or null
     */
    public void setState(final State state) {
        this.state = state;
    }

}
