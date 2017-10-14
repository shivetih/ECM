/**
 * NewWSDLFile_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.NewWSDLFile;

public class NewWSDLFile_ServiceLocator extends org.apache.axis.client.Service implements org.example.www.NewWSDLFile.NewWSDLFile_Service {

    public NewWSDLFile_ServiceLocator() {
    }


    public NewWSDLFile_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public NewWSDLFile_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for NewWSDLFileSOAP
    private java.lang.String NewWSDLFileSOAP_address = "http://www.example.org/";

    public java.lang.String getNewWSDLFileSOAPAddress() {
        return NewWSDLFileSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String NewWSDLFileSOAPWSDDServiceName = "NewWSDLFileSOAP";

    public java.lang.String getNewWSDLFileSOAPWSDDServiceName() {
        return NewWSDLFileSOAPWSDDServiceName;
    }

    public void setNewWSDLFileSOAPWSDDServiceName(java.lang.String name) {
        NewWSDLFileSOAPWSDDServiceName = name;
    }

    public org.example.www.NewWSDLFile.NewWSDLFile_PortType getNewWSDLFileSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(NewWSDLFileSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getNewWSDLFileSOAP(endpoint);
    }

    public org.example.www.NewWSDLFile.NewWSDLFile_PortType getNewWSDLFileSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.example.www.NewWSDLFile.NewWSDLFileSOAPStub _stub = new org.example.www.NewWSDLFile.NewWSDLFileSOAPStub(portAddress, this);
            _stub.setPortName(getNewWSDLFileSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setNewWSDLFileSOAPEndpointAddress(java.lang.String address) {
        NewWSDLFileSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.example.www.NewWSDLFile.NewWSDLFile_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                org.example.www.NewWSDLFile.NewWSDLFileSOAPStub _stub = new org.example.www.NewWSDLFile.NewWSDLFileSOAPStub(new java.net.URL(NewWSDLFileSOAP_address), this);
                _stub.setPortName(getNewWSDLFileSOAPWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("NewWSDLFileSOAP".equals(inputPortName)) {
            return getNewWSDLFileSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.example.org/NewWSDLFile/", "NewWSDLFile");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.example.org/NewWSDLFile/", "NewWSDLFileSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("NewWSDLFileSOAP".equals(portName)) {
            setNewWSDLFileSOAPEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
