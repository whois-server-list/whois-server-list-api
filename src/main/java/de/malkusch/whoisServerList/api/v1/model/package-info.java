/**
 * Domain model classes.
 *
 * @author markus@malkusch.de
 * @see <a href="bitcoin:1335STSwu9hST4vcMRppEPgENMHD2r1REK">Donations</a>
 */
@XmlJavaTypeAdapter(value = XmlCaseInsensitivePatternAdapter.class, type = java.util.regex.Pattern.class)
package de.malkusch.whoisServerList.api.v1.model;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import de.malkusch.whoisServerList.api.v1.adapter.XmlCaseInsensitivePatternAdapter;
