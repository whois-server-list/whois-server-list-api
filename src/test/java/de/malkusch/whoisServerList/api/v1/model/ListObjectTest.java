package de.malkusch.whoisServerList.api.v1.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.regex.Pattern;

import org.junit.Test;

public class ListObjectTest {

    @Test
    public void testEqualPattern() {
        WhoisServer server1 = new WhoisServer();
        server1.setAvailablePattern(Pattern.compile("test"));
        
        WhoisServer server2 = new WhoisServer();
        server2.setAvailablePattern(Pattern.compile("test"));
        
        assertEquals(server1, server2);
        
        WhoisServer server3 = new WhoisServer();
        server3.setAvailablePattern(Pattern.compile("test2"));
        
        assertNotEquals(server1, server3);
    }

}
