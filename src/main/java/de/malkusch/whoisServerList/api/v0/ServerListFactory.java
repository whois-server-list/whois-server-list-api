package de.malkusch.whoisServerList.api.v0;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import net.jcip.annotations.Immutable;
import de.malkusch.whoisServerList.api.v0.model.Serverlist;

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
public final class ServerListFactory {

    /**
     * The configuration property for the server list url.
     */
    public static final String PROPERTY_URL = "whoisserverlist.url";
    
    /**
     * The configuration property for the bundled server list file.
     */
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
            defaults.load(ServerListFactory.class
                    .getResourceAsStream(PROPERTYFILE));
            return defaults;

        } catch (IOException e) {
            throw new RuntimeException(e);

        }
    }

    /**
     * Builds a new server list from an URL.
     * 
     * @param properties  the server list url, not null
     * @return the server list
     * @throws JAXBException If unmarshalling failed
     */
    public Serverlist build(URL url) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Serverlist.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        return Serverlist.class.cast(unmarshaller.unmarshal(url));
    }

    /**
     * Builds a new server list from the locally bundled server list.
     * 
     * @return the server list
     * @throws JAXBException If unmarshalling failed
     */
    public Serverlist build() {
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
    public Serverlist download() throws JAXBException {
        try {
            Properties defaults = getDefaults();
            URL url = new URL(defaults.getProperty(PROPERTY_URL));
            return build(url);
            
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
            
        }
    }

}
