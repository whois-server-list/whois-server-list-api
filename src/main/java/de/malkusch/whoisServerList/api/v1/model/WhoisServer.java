package de.malkusch.whoisServerList.api.v1.model;

import java.util.regex.Pattern;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import de.malkusch.whoisServerList.api.v1.adapter.XmlCaseInsensitivePatternAdapter;

/**
 * Whois server.
 *
 * @author markus@malkusch.de
 * @see <a href="bitcoin:1335STSwu9hST4vcMRppEPgENMHD2r1REK">Donations</a>
 */
@XmlAccessorType(XmlAccessType.FIELD)
public final class WhoisServer extends ListObject<WhoisServer> {

    /**
     * The whois default port.
     */
    public static final int DEFAULT_PORT = 43;

    /**
     * The host.
     */
    @XmlAttribute
    private String host;

    /**
     * The pattern for available domains.
     * This may be null.
     */
    @XmlJavaTypeAdapter(XmlCaseInsensitivePatternAdapter.class)
    private Pattern availablePattern;

    /**
     * Returns the whois server.
     *
     * @return the host, not null
     */
    public String getHost() {
        return host;
    }

    /**
     * Sets the whois server.
     *
     * @param host  the server, not null
     */
    public void setHost(final String host) {
        this.host = host;
    }

    /**
     * Returns the pattern for checking the server response
     * for an available domain.
     *
     * @return the available patter, may be null
     */
    public Pattern getAvailablePattern() {
        return availablePattern;
    }

    /**
     * Sets the pattern for checking the server response for
     * an available domain.
     *
     * @param availablePattern the available pattern, maybe null
     */
    public void setAvailablePattern(final Pattern availablePattern) {
        this.availablePattern = availablePattern;
    }

    @Override
    public String toString() {
        return getHost();
    }

}
