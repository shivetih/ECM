/**
 * NewWSDLFileSOAPImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.NewWSDLFile;

public class NewWSDLFileSOAPImpl implements org.example.www.NewWSDLFile.NewWSDLFile_PortType{
    public void newOperation(java.lang.String in, javax.xml.rpc.holders.StringHolder out, javax.xml.rpc.holders.StringHolder newPart) throws java.rmi.RemoteException {
    	System.out.println(in);
    	out.value = new java.lang.String();
        newPart.value = new java.lang.String();
    }

}
