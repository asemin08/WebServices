package eu.ensup.webservices.allan.interceptor;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.io.IOException;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SoapMessageHandler implements SOAPHandler<SOAPMessageContext> {


    @Override
    public Set<QName> getHeaders() {
        return null;
    }

    @Override
    public boolean handleMessage(SOAPMessageContext context) {
        SOAPMessage msg = context.getMessage();

        try {
            msg.writeTo(System.out);
        } catch (SOAPException | IOException e) {
            Logger.getLogger(SoapMessageHandler.class.getName()).log(Level.SEVERE, null, e);
        }
        return true;
    }

    @Override
    public boolean handleFault(SOAPMessageContext context) {
        return false;
    }

    @Override
    public void close(MessageContext context) {

    }
}
