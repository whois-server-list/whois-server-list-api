package de.malkusch.whoisServerList.api.v1.model;

import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.PatternAwareEqualsBuilder;


/**
 * An object of the list.
 *
 * @author markus@malkusch.de
 * @param <T> the implementing ListObject type
 * @see <a href="bitcoin:1335STSwu9hST4vcMRppEPgENMHD2r1REK">Donations</a>
 */
public abstract class ListObject<T extends ListObject<T>> implements Cloneable {

    /**
     * The source of this object.
     */
    private Source source;

    /**
     * Returns the source of this object.
     *
     * @return the source
     */
    public final Source getSource() {
        return source;
    }

    /**
     * Sets the source of this object.
     *
     * @param source  the source
     */
    public final void setSource(final Source source) {
        this.source = source;
    }

    @Override
    public final boolean equals(final Object obj) {
        return PatternAwareEqualsBuilder.reflectionEquals(this, obj);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @SuppressWarnings("unchecked")
    @Override
    public final T clone() {
        try {
            return (T) super.clone();

        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);

        }
    }

}
