#!/usr/bin/perl

use SOAP::Lite;

my $url = 'http://127.0.0.1:8888/hello?wsdl';

my $service = SOAP::Lite->service($url);

print $service->ditBonjour('toto');