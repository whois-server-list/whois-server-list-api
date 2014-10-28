package de.malkusch.whoisServerList.api.v1;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import javax.annotation.PropertyKey;
import javax.annotation.concurrent.Immutable;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import de.malkusch.whoisServerList.api.v1.model.DomainList;

/**
 * Factory for the Whois Server List.
 *
 * @author markus@malkusch.de
 *
 * @see <a href="https://github.com/whois-server-list/whois-server-list">Whois
 *      Server List</a>
 * @see <a href="bitcoin:1335STSwu9hST4vcMRppEPgENMHD2r1REK">Donations</a>
 */
@Immutable
public final class DomainListFactory {

    /**
     * The configuration property for the server list url.
     */
    @PropertyKey
    public static final String PROPERTY_URL = "whoisserverlist.url";

    /**
     * The configuration property for the bundled server list file.
     */
    @PropertyKey
    public static final String PROPERTY_FILE = "whoisserverlist.file";

    /**
     * The bundled default configuration.
     */
    public static final String PROPERTYFILE = "/api.properties";

    /**
     * Returns the bundled default configuration.
     *
     * @return the bundled configuration
     */
    private static Properties getDefaults() {
        try {
            Properties defaults = new Properties();
            defaults.load(
                    DomainListFactory.class.getResourceAsStream(PROPERTYFILE));
            return defaults;

        } catch (IOException e) {
            throw new RuntimeException(e);

        }
    }

    /**
     * Builds a new server list from an URL.
     *
     * @param url  the server list url, not null
     * @return the server list
     * @throws JAXBException If unmarshalling failed
     */
    public DomainList build(final URL url) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(DomainList.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        return DomainList.class.cast(unmarshaller.unmarshal(url));
    }

    /**
     * Builds a new server list from the locally bundled server list.
     *
     * @return the server list
     */
    public DomainList build() {
        try {
            Properties defaults = getDefaults();
            URL localList
                = getClass().getResource(defaults.getProperty(PROPERTY_FILE));

            return build(localList);

        } catch (JAXBException e) {
            throw new RuntimeException(e);

        }
    }

    /**
     * Builds a new server list from default remote location.
     *
     * @return the server list
     * @throws JAXBException If unmarshalling failed
     */
    public DomainList download() throws JAXBException {
        try {
            Properties defaults = getDefaults();
            URL url = new URL(defaults.getProperty(PROPERTY_URL));
            return build(url);

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);

        }
    }

}
