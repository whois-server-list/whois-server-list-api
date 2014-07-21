package de.malkusch.whoisServerList.api.v0;

import static org.junit.Assert.assertNotNull;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.bind.JAXBException;

import org.junit.Test;

import de.malkusch.whoisServerList.api.v0.model.Serverlist;

public class ServerListFactoryTest {

    @Test
    public void testBuildFromURL() throws JAXBException, MalformedURLException {
        ServerListFactory factory = new ServerListFactory();
        Serverlist list = factory.build(new URL("http://whois-server-list.github.io/whois-server-list/0.0.1/whois-server-list.xml"));

        assertNotNull(list);
    }

    @Test
    public void testBuild() throws JAXBException, MalformedURLException {
        ServerListFactory factory = new ServerListFactory();
        Serverlist list = factory.build();

        assertNotNull(list);
    }

    @Test
    public void testDownload() throws JAXBException, MalformedURLException {
        ServerListFactory factory = new ServerListFactory();
        Serverlist list = factory.download();

        assertNotNull(list);
    }

}
