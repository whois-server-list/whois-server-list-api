package de.malkusch.whoisServerList.api.v1.adapter;

import java.util.regex.Pattern;

import static org.junit.Assert.*;

import org.junit.Test;

public class XmlCaseInsensitivePatternAdapterTest {

    @Test
    public void testMarshal() {
        XmlCaseInsensitivePatternAdapter adapter
                = new XmlCaseInsensitivePatternAdapter();

        assertEquals("test", adapter.marshal(Pattern.compile("test")));
    }

    @Test
    public void testUnmarshal() {
        XmlCaseInsensitivePatternAdapter adapter
        = new XmlCaseInsensitivePatternAdapter();

        assertEquals("test", adapter.unmarshal("test").pattern());
    }

}
