package eu.ensup.webservices.allan.interceptor;

import javax.xml.namespace.QName;
import javax.xml.soap.*;
import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.awt.*;
import java.io.IOException;
import java.util.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SoapMessageHandler implements SOAPHandler<SOAPMessageContext> {

    @Override
    public Set<QName> getHeaders() {
        return null;
    }

    @Override
    public boolean handleMessage(SOAPMessageContext context) {
        try{
            SOAPMessage msg = context.getMessage();
            SOAPPart part =  msg.getSOAPPart();
            SOAPEnvelope envelope = part.getEnvelope();
            SOAPHeader header = envelope.getHeader();

            //Ajout valeur au header
            SOAPElement el = header.addChildElement(envelope.createName("user", "toto","*"));
            el.setValue("UserTest");

            msg.saveChanges();
            Boolean isOutMessage = (Boolean) context.get (MessageContext.MESSAGE_OUTBOUND_PROPERTY);

            // Différencier le message d'entrée et de sortie
            if (isOutMessage.booleanValue()) {

                System.out.println("\nmessage sortie:");
            } else {
                System.out.println("\nmessage d'entree:");
            }
            System.out.println("\nReponse : "+ msg);

            //Lire le context du message
            msg.writeTo(System.out);


        } catch (Exception e) {
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
