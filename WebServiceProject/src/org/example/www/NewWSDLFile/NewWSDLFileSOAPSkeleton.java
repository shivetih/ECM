/**
 * NewWSDLFileSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.NewWSDLFile;

public class NewWSDLFileSOAPSkeleton implements org.example.www.NewWSDLFile.NewWSDLFile_PortType, org.apache.axis.wsdl.Skeleton {
    private org.example.www.NewWSDLFile.NewWSDLFile_PortType impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "out"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NewPart"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("newOperation", _params, null);
        _oper.setElementQName(new javax.xml.namespace.QName("http://www.example.org/NewWSDLFile/", "NewOperation"));
        _oper.setSoapAction("http://www.example.org/NewWSDLFile/NewOperation");
        _myOperationsList.add(_oper);
        if (_myOperations.get("newOperation") == null) {
            _myOperations.put("newOperation", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("newOperation")).add(_oper);
    }

    public NewWSDLFileSOAPSkeleton() {
        this.impl = new org.example.www.NewWSDLFile.NewWSDLFileSOAPImpl();
    }

    public NewWSDLFileSOAPSkeleton(org.example.www.NewWSDLFile.NewWSDLFile_PortType impl) {
        this.impl = impl;
    }
    public void newOperation(java.lang.String in, javax.xml.rpc.holders.StringHolder out, javax.xml.rpc.holders.StringHolder newPart) throws java.rmi.RemoteException
    {
        impl.newOperation(in, out, newPart);
    }

}
