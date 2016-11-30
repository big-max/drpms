/**
 * JobService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.tws.ws.services.TWS_Job;

public interface JobService extends java.rmi.Remote {
    public void cancel(java.lang.String engineName, java.lang.String jobId, boolean isPending) throws java.rmi.RemoteException, com.ibm.tws.ws.faults.TWS_Faults.InvalidArgumentsFaultType, com.ibm.tws.ws.faults.TWS_Faults.OperationFailedFaultType, com.ibm.tws.ws.faults.TWS_Faults.ObjectNotFoundFaultType, com.ibm.tws.ws.faults.TWS_Faults.TransportFaultType, com.ibm.tws.ws.faults.TWS_Faults.SecurityFaultType, com.ibm.tws.ws.faults.TWS_Faults.LockingFaultType;
    public java.lang.String getOutput(java.lang.String engineName, java.lang.String jobId) throws java.rmi.RemoteException, com.ibm.tws.ws.faults.TWS_Faults.InvalidArgumentsFaultType, com.ibm.tws.ws.faults.TWS_Faults.OperationFailedFaultType, com.ibm.tws.ws.faults.TWS_Faults.ObjectNotFoundFaultType, com.ibm.tws.ws.faults.TWS_Faults.TransportFaultType, com.ibm.tws.ws.faults.TWS_Faults.SecurityFaultType, com.ibm.tws.ws.faults.TWS_Faults.LockingFaultType;
    public void kill(java.lang.String engineName, java.lang.String jobId) throws java.rmi.RemoteException, com.ibm.tws.ws.faults.TWS_Faults.InvalidArgumentsFaultType, com.ibm.tws.ws.faults.TWS_Faults.OperationFailedFaultType, com.ibm.tws.ws.faults.TWS_Faults.ObjectNotFoundFaultType, com.ibm.tws.ws.faults.TWS_Faults.TransportFaultType, com.ibm.tws.ws.faults.TWS_Faults.SecurityFaultType, com.ibm.tws.ws.faults.TWS_Faults.LockingFaultType;
    public void releaseAllDependencies(java.lang.String engineName, java.lang.String jobId) throws java.rmi.RemoteException, com.ibm.tws.ws.faults.TWS_Faults.InvalidArgumentsFaultType, com.ibm.tws.ws.faults.TWS_Faults.OperationFailedFaultType, com.ibm.tws.ws.faults.TWS_Faults.ObjectNotFoundFaultType, com.ibm.tws.ws.faults.TWS_Faults.TransportFaultType, com.ibm.tws.ws.faults.TWS_Faults.SecurityFaultType, com.ibm.tws.ws.faults.TWS_Faults.LockingFaultType;
    public void setProperties(java.lang.String engineName, java.lang.String jobId, com.ibm.tws.ws.types.TWS_Types.Property[] properties) throws java.rmi.RemoteException, com.ibm.tws.ws.faults.TWS_Faults.InvalidArgumentsFaultType, com.ibm.tws.ws.faults.TWS_Faults.OperationFailedFaultType, com.ibm.tws.ws.faults.TWS_Faults.ObjectNotFoundFaultType, com.ibm.tws.ws.faults.TWS_Faults.TransportFaultType, com.ibm.tws.ws.faults.TWS_Faults.SecurityFaultType, com.ibm.tws.ws.faults.TWS_Faults.LockingFaultType;
    public com.ibm.tws.ws.types.TWS_Types.JobInstance getProperties(java.lang.String engineName, java.lang.String jobId) throws java.rmi.RemoteException, com.ibm.tws.ws.faults.TWS_Faults.InvalidArgumentsFaultType, com.ibm.tws.ws.faults.TWS_Faults.OperationFailedFaultType, com.ibm.tws.ws.faults.TWS_Faults.ObjectNotFoundFaultType, com.ibm.tws.ws.faults.TWS_Faults.TransportFaultType, com.ibm.tws.ws.faults.TWS_Faults.SecurityFaultType, com.ibm.tws.ws.faults.TWS_Faults.LockingFaultType;
}
