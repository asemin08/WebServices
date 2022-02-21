#!/usr/bin/ruby

require 'soap/wsdlDriver'

wsdl_usl = 'http://127.0.0.1:8888/hello?wsdl'

service = SOAP::WSDLDriverFactory.new(wsdl_usl).create_rpc_driver

service.wiredump_file_base = 'soapmsgs'

resultat = service.ditBonjour('toto')

puts "Resultat : #{resultat}"