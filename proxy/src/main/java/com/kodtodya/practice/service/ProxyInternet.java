package com.kodtodya.practice.service;

import java.util.Set;

public class ProxyInternet implements Internet
{
    private final static Internet internet = new RealInternet();
    private static Set<String> bannedSites;

    public ProxyInternet() {
        bannedSites = Set.of("abc.com", "def.com", "ijk.com", "lnm.com");
    }
      
    @Override
    public void connectTo(String serverHost) throws Exception
    {
        if(bannedSites.contains(serverHost.toLowerCase())) {
            throw new Exception("Access Denied");
        }
          
        internet.connectTo(serverHost);
    }
  
}