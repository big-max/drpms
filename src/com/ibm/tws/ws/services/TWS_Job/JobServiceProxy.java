package com.ibm.tws.ws.services.TWS_Job;

public class JobServiceProxy implements com.ibm.tws.ws.services.TWS_Job.JobService {
  private String _endpoint = null;
  private com.ibm.tws.ws.services.TWS_Job.JobService jobService = null;
  
  public JobServiceProxy() {
    _initJobServiceProxy();
  }
  
  public JobServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initJobServiceProxy();
  }
  
  private void _initJobServiceProxy() {
    try {
      jobService = (new com.ibm.tws.ws.services.TWS_Job.JobServiceServiceLocator()).getJobService();
      if (jobService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)jobService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)jobService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (jobService != null)
      ((javax.xml.rpc.Stub)jobService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.ibm.tws.ws.services.TWS_Job.JobService getJobService() {
    if (jobService == null)
      _initJobServiceProxy();
    return jobService;
  }
  
  public void cancel(java.lang.String engineName, java.lang.String jobId, boolean isPending) throws java.rmi.RemoteException, com.ibm.tws.ws.faults.TWS_Faults.InvalidArgumentsFaultType, com.ibm.tws.ws.faults.TWS_Faults.OperationFailedFaultType, com.ibm.tws.ws.faults.TWS_Faults.ObjectNotFoundFaultType, com.ibm.tws.ws.faults.TWS_Faults.TransportFaultType, com.ibm.tws.ws.faults.TWS_Faults.SecurityFaultType, com.ibm.tws.ws.faults.TWS_Faults.LockingFaultType{
    if (jobService == null)
      _initJobServiceProxy();
    jobService.cancel(engineName, jobId, isPending);
  }
  
  public java.lang.String getOutput(java.lang.String engineName, java.lang.String jobId) throws java.rmi.RemoteException, com.ibm.tws.ws.faults.TWS_Faults.InvalidArgumentsFaultType, com.ibm.tws.ws.faults.TWS_Faults.OperationFailedFaultType, com.ibm.tws.ws.faults.TWS_Faults.ObjectNotFoundFaultType, com.ibm.tws.ws.faults.TWS_Faults.TransportFaultType, com.ibm.tws.ws.faults.TWS_Faults.SecurityFaultType, com.ibm.tws.ws.faults.TWS_Faults.LockingFaultType{
    if (jobService == null)
      _initJobServiceProxy();
    return jobService.getOutput(engineName, jobId);
  }
  
  public void kill(java.lang.String engineName, java.lang.String jobId) throws java.rmi.RemoteException, com.ibm.tws.ws.faults.TWS_Faults.InvalidArgumentsFaultType, com.ibm.tws.ws.faults.TWS_Faults.OperationFailedFaultType, com.ibm.tws.ws.faults.TWS_Faults.ObjectNotFoundFaultType, com.ibm.tws.ws.faults.TWS_Faults.TransportFaultType, com.ibm.tws.ws.faults.TWS_Faults.SecurityFaultType, com.ibm.tws.ws.faults.TWS_Faults.LockingFaultType{
    if (jobService == null)
      _initJobServiceProxy();
    jobService.kill(engineName, jobId);
  }
  
  public void releaseAllDependencies(java.lang.String engineName, java.lang.String jobId) throws java.rmi.RemoteException, com.ibm.tws.ws.faults.TWS_Faults.InvalidArgumentsFaultType, com.ibm.tws.ws.faults.TWS_Faults.OperationFailedFaultType, com.ibm.tws.ws.faults.TWS_Faults.ObjectNotFoundFaultType, com.ibm.tws.ws.faults.TWS_Faults.TransportFaultType, com.ibm.tws.ws.faults.TWS_Faults.SecurityFaultType, com.ibm.tws.ws.faults.TWS_Faults.LockingFaultType{
    if (jobService == null)
      _initJobServiceProxy();
    jobService.releaseAllDependencies(engineName, jobId);
  }
  
  public void setProperties(java.lang.String engineName, java.lang.String jobId, com.ibm.tws.ws.types.TWS_Types.Property[] properties) throws java.rmi.RemoteException, com.ibm.tws.ws.faults.TWS_Faults.InvalidArgumentsFaultType, com.ibm.tws.ws.faults.TWS_Faults.OperationFailedFaultType, com.ibm.tws.ws.faults.TWS_Faults.ObjectNotFoundFaultType, com.ibm.tws.ws.faults.TWS_Faults.TransportFaultType, com.ibm.tws.ws.faults.TWS_Faults.SecurityFaultType, com.ibm.tws.ws.faults.TWS_Faults.LockingFaultType{
    if (jobService == null)
      _initJobServiceProxy();
    jobService.setProperties(engineName, jobId, properties);
  }
  
  public com.ibm.tws.ws.types.TWS_Types.JobInstance getProperties(java.lang.String engineName, java.lang.String jobId) throws java.rmi.RemoteException, com.ibm.tws.ws.faults.TWS_Faults.InvalidArgumentsFaultType, com.ibm.tws.ws.faults.TWS_Faults.OperationFailedFaultType, com.ibm.tws.ws.faults.TWS_Faults.ObjectNotFoundFaultType, com.ibm.tws.ws.faults.TWS_Faults.TransportFaultType, com.ibm.tws.ws.faults.TWS_Faults.SecurityFaultType, com.ibm.tws.ws.faults.TWS_Faults.LockingFaultType{
    if (jobService == null)
      _initJobServiceProxy();
    return jobService.getProperties(engineName, jobId);
  }
  
  
}