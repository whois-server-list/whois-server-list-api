package de.malkusch.whoisServerList.api.v1.model.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import org.apache.commons.lang3.ObjectUtils;

import de.malkusch.whoisServerList.api.v1.model.ListObject;
import de.malkusch.whoisServerList.api.v1.model.WhoisServer;

/**
 * Domain.
 *
 * @author markus@malkusch.de
 * @see <a href="bitcoin:1335STSwu9hST4vcMRppEPgENMHD2r1REK">Donations</a>
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Domain extends ListObject<Domain> {

    /**
     * The whois servers for this domain, may be empty.
     */
    @XmlElement(name = "whoisServer")
    private List<WhoisServer> whoisServers = new ArrayList<>();

    /**
     * The domain name.
     */
    @XmlAttribute
    private String name;

    /**
     * The created date, may be null.
     */
    private Date created;

    /**
     * The changed date, may be null.
     */
    private Date changed;

    /**
     * Domain state.
     *
     * @author markus@malkusch.de
     * @see <a href="bitcoin:1335STSwu9hST4vcMRppEPgENMHD2r1REK">Donations</a>
     */
    public static enum State {
        /**
         * The domain is active.
         */
        ACTIVE,

        /**
         * The domain is inactive.
         */
        INACTIVE,

        /**
         * The domain is new.
         */
        NEW;
    }

    /**
     * Returns the domain name.
     *
     * @return the domain name
     */
    public final String getName() {
        return name;
    }

    /**
     * Sets the domain name.
     *
     * @param name  the domain name
     */
    public final void setName(final String name) {
        this.name = name;
    }

    @Override
    public final String toString() {
        return name;
    }

    /**
     * Returns the whois servers.
     *
     * @return the whois servers
     */
    public final List<WhoisServer> getWhoisServers() {
        return whoisServers;
    }

    /**
     * Sets the whois servers.
     *
     * @param whoisServers  the whois servers
     */
    public final void setWhoisServers(final List<WhoisServer> whoisServers) {
        this.whoisServers = whoisServers;
    }

    /**
     * Returns the created date.
     *
     * @return the created date, or null
     */
    public final Date getCreated() {
        return ObjectUtils.clone(created);
    }

    /**
     * Sets the created date.
     *
     * @param created the created date, may be null
     */
    public final void setCreated(final Date created) {
        this.created = ObjectUtils.clone(created);
    }

    /**
     * Returns the changed date.
     *
     * @return the changed date, or null
     */
    public final Date getChanged() {
        return ObjectUtils.clone(changed);
    }

    /**
     * Sets the changed date.
     *
     * @param changed  the changed date, or null
     */
    public final void setChanged(final Date changed) {
        this.changed = ObjectUtils.clone(changed);
    }

}
