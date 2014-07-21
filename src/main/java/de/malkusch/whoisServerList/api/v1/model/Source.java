package de.malkusch.whoisServerList.api.v1.model;

/**
 * Source of an object.
 *
 * @author markus@malkusch.de
 * @see <a href="bitcoin:1335STSwu9hST4vcMRppEPgENMHD2r1REK">Donations</a>
 */
public enum Source {

    /**
     * A manual edit in the existing whois server list.
     */
    XML,

    /**
     * IANA's domain data base.
     *
     * @see <a href="http://www.iana.org/domains/root/db">IANA</a>
     */
    IANA,

    /**
     * The Public Suffix List.
     *
     * @see <a href="https://publicsuffix.org/">https://publicsuffix.org/</a>
     */
    PSL

}
