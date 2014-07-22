package de.malkusch.whoisServerList.api.v1;

import static org.junit.Assert.assertNotNull;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.bind.JAXBException;

import org.junit.Ignore;
import org.junit.Test;

import de.malkusch.whoisServerList.api.v1.model.DomainList;

@Ignore
public class DomainListFactoryTest {

    @Test
    public void testBuildFromURL() throws JAXBException, MalformedURLException {
        DomainListFactory factory = new DomainListFactory();
        DomainList list = factory.build(new URL("http://whois-server-list.github.io/whois-server-list/1.0.0/whois-server-list.xml"));

        assertNotNull(list);
    }

    @Test
    public void testBuild() throws JAXBException, MalformedURLException {
        DomainListFactory factory = new DomainListFactory();
        DomainList list = factory.build();

        assertNotNull(list);
    }

    @Test
    public void testDownload() throws JAXBException, MalformedURLException {
        DomainListFactory factory = new DomainListFactory();
        DomainList list = factory.download();

        assertNotNull(list);
    }

}
