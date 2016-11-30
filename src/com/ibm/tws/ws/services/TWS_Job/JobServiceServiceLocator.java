/**
 * JobServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.tws.ws.services.TWS_Job;

public class JobServiceServiceLocator extends org.apache.axis.client.Service implements com.ibm.tws.ws.services.TWS_Job.JobServiceService {

/**
 * for distribuited env, the default location is:
 * 		https://localhost:31116/PlanServicesWeb/services/JobService
 * 
 * 	for z/OS env, the default location is:
 * 		https://localhost:31126/zPlanServicesWeb/services/JobService
 */

    public JobServiceServiceLocator() {
    }


    public JobServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public JobServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for JobService
    private java.lang.String JobService_address = "https://localhost:31116/PlanServicesWeb/services/JobService";

    public java.lang.String getJobServiceAddress() {
        return JobService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String JobServiceWSDDServiceName = "JobService";

    public java.lang.String getJobServiceWSDDServiceName() {
        return JobServiceWSDDServiceName;
    }

    public void setJobServiceWSDDServiceName(java.lang.String name) {
        JobServiceWSDDServiceName = name;
    }

    public com.ibm.tws.ws.services.TWS_Job.JobService getJobService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(JobService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getJobService(endpoint);
    }

    public com.ibm.tws.ws.services.TWS_Job.JobService getJobService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.ibm.tws.ws.services.TWS_Job.JobServiceSoapBindingStub _stub = new com.ibm.tws.ws.services.TWS_Job.JobServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getJobServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setJobServiceEndpointAddress(java.lang.String address) {
        JobService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.ibm.tws.ws.services.TWS_Job.JobService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.ibm.tws.ws.services.TWS_Job.JobServiceSoapBindingStub _stub = new com.ibm.tws.ws.services.TWS_Job.JobServiceSoapBindingStub(new java.net.URL(JobService_address), this);
                _stub.setPortName(getJobServiceWSDDServiceName());
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
        if ("JobService".equals(inputPortName)) {
            return getJobService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Job", "JobServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Job", "JobService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("JobService".equals(portName)) {
            setJobServiceEndpointAddress(address);
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
