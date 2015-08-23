# Whois server list API

This is a JAVA API for accessing the
[whois-server-list](https://github.com/whois-server-list/whois-server-list).


# Installation

This package is available in Maven central:

```xml
<dependency>
        <groupId>de.malkusch.whois-server-list.api.v1</groupId>
        <artifactId>whois-server-list-api</artifactId>
        <version>1.1.0</version>
</dependency>
```


# Usage

This API is just a compilation of JAXB generated domain model classes:

 * [`DomainList`](http://whois-server-list.github.io/whois-server-list-api/apidocs/de/malkusch/whoisServerList/api/v1/model/DomainList.html)

 * [`WhoisServer`](http://whois-server-list.github.io/whois-server-list-api/apidocs/de/malkusch/whoisServerList/api/v1/model/WhoisServer.html)

 * [`Domain`](http://whois-server-list.github.io/whois-server-list-api/apidocs/de/malkusch/whoisServerList/api/v1/model/domain/Domain.html)

 * [`TopLevelDomain`](http://whois-server-list.github.io/whois-server-list-api/apidocs/de/malkusch/whoisServerList/api/v1/model/domain/TopLevelDomain.html)

You can use
[`DomainListFactory`](http://whois-server-list.github.io/whois-server-list-api/apidocs/de/malkusch/whoisServerList/api/v1/DomainListFactory.html)
for downloading and unmarshaling the whois server list:

```java
DomainListFactory factory = new DomainListFactory();
DomainList domainList = factory.download();
```


# License and author

Markus Malkusch <markus@malkusch.de> is the author of this project.
This project is free and under the WTFPL.

## Donations

If you like this project and feel generous donate a few Bitcoins here:
[1335STSwu9hST4vcMRppEPgENMHD2r1REK](bitcoin:1335STSwu9hST4vcMRppEPgENMHD2r1REK)

[![Build Status](https://travis-ci.org/whois-server-list/whois-server-list-api.svg)](https://travis-ci.org/whois-server-list/whois-server-list-api)
