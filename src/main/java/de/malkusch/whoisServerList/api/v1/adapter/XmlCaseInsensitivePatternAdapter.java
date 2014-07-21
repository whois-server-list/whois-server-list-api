package de.malkusch.whoisServerList.api.v1.adapter;

import java.util.regex.Pattern;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * Case insensitive Pattern adapter.
 *
 * @author markus@malkusch.de
 * @see <a href="bitcoin:1335STSwu9hST4vcMRppEPgENMHD2r1REK">Donations</a>
 */
public final class XmlCaseInsensitivePatternAdapter
        extends XmlAdapter<String, Pattern> {

    @Override
    public Pattern unmarshal(final String pattern) {
        return Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
    }

    @Override
    public String marshal(final Pattern pattern) {
        return pattern.pattern();
    }

}
