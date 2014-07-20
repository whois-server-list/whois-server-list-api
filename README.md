# Whois server list API

This is a JAVA API for accessing the
[whois-server-list](https://github.com/whois-server-list/whois-server-list).


# Installation

This package is available in Maven central:

```xml
<dependency>
        <groupId>de.malkusch.whois-server-list.api.v0</groupId>
        <artifactId>whois-server-list-api</artifactId>
        <version>0.0.1</version>
</dependency>
```


# Usage

This API is just a compilation of JAXB generated domain model classes:

 * [`ServerList`](http://whois-server-list.github.io/whois-server-list-api/apidocs/de/malkusch/whoisServerList/api/v0/model/Serverlist.html)

 * [`Server`](http://whois-server-list.github.io/whois-server-list-api/apidocs/de/malkusch/whoisServerList/api/v0/model/Server.html)

 * [`Domain`](http://whois-server-list.github.io/whois-server-list-api/apidocs/de/malkusch/whoisServerList/api/v0/model/Domain.html)

You can use
[`ServerListFactory`](http://whois-server-list.github.io/whois-server-list-api/apidocs/de/malkusch/whoisServerList/api/v0/ServerListFactory.html)
for downloading and unmarshalling the whois server list:

```java
ServerListFactory factory = new ServerListFactory();
Serverlist serverList = factory.download();
```


# License and author

Markus Malkusch <markus@malkusch.de> is the author of this project.
This project is free and under the GPL.

## Donations

If you like this project and feel generous donate a few Bitcoins here:
[1335STSwu9hST4vcMRppEPgENMHD2r1REK](bitcoin:1335STSwu9hST4vcMRppEPgENMHD2r1REK)

[![Build Status](https://travis-ci.org/whois-server-list/whois-server-list-api.svg)](https://travis-ci.org/whois-server-list/whois-server-list-api)
