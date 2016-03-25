package de.malkusch.whoisServerList.api.v1.model;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import javax.annotation.Nullable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

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
     * The pattern for available domains. This may be null.
     */
    private Pattern availablePattern;

    /**
     * The optional query format in a printf style.
     */
    private String queryFormat;

    /**
     * The error patterns, may be empty.
     */
    @XmlElement(name = "errorPattern")
    private List<Pattern> errorPatterns = new ArrayList<>();

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
     * @param host
     *            the server, not null
     */
    public void setHost(final String host) {
        this.host = host;
    }

    /**
     * Sets the optional query format.
     *
     * @param queryFormat
     *            query format in C's printf style, or null
     */
    public void setQueryFormat(@Nullable final String queryFormat) {
        this.queryFormat = queryFormat;
    }

    /**
     * Returns the optional query format in a C printf style.
     * 
     * The placeholder %s will be replaced by the actual queried domain. E.g. a
     * format of "=%s" and a query for "example.net" would result in
     * "=example.net".
     * 
     * If the format is {@code null} the whois server accepts the unformatted
     * domain.
     * 
     * @return optional query format in C's printf style, or null
     */
    @Nullable
    public String getQueryFormat() {
        return queryFormat;
    }

    /**
     * Returns the pattern for checking the server response for an available
     * domain.
     *
     * @return the available pattern, may be null
     */
    public Pattern getAvailablePattern() {
        return availablePattern;
    }

    /**
     * Sets the pattern for checking the server response for an available
     * domain.
     *
     * @param availablePattern
     *            the available pattern, maybe null
     */
    public void setAvailablePattern(final Pattern availablePattern) {
        this.availablePattern = availablePattern;
    }

    /**
     * Returns the pattern for checking the server response for an error
     * response.
     *
     * @return the error patterns, may be empty.
     */
    public List<Pattern> getErrorPatterns() {
        return errorPatterns;
    }

    /**
     * Sets the error pattern for checking the server response for an error
     * response.
     *
     * @param errorPatterns
     *            the error patterns, maybe empty
     */
    public void setErrorPatterns(final List<Pattern> errorPatterns) {
        this.errorPatterns = errorPatterns;
    }

    @Override
    public String toString() {
        return getHost();
    }

}
