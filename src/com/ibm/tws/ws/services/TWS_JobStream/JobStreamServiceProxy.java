package com.ibm.tws.ws.services.TWS_JobStream;

public class JobStreamServiceProxy implements com.ibm.tws.ws.services.TWS_JobStream.JobStreamService {
  private String _endpoint = null;
  private com.ibm.tws.ws.services.TWS_JobStream.JobStreamService jobStreamService = null;
  
  public JobStreamServiceProxy() {
    _initJobStreamServiceProxy();
  }
  
  public JobStreamServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initJobStreamServiceProxy();
  }
  
  private void _initJobStreamServiceProxy() {
    try {
      jobStreamService = (new com.ibm.tws.ws.services.TWS_JobStream.JobStreamServiceServiceLocator()).getJobStreamService();
      if (jobStreamService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)jobStreamService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)jobStreamService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (jobStreamService != null)
      ((javax.xml.rpc.Stub)jobStreamService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.ibm.tws.ws.services.TWS_JobStream.JobStreamService getJobStreamService() {
    if (jobStreamService == null)
      _initJobStreamServiceProxy();
    return jobStreamService;
  }
  
  public void cancel(java.lang.String engineName, java.lang.String jobStreamId, boolean isPending) throws java.rmi.RemoteException, com.ibm.tws.ws.faults.TWS_Faults.InvalidArgumentsFaultType, com.ibm.tws.ws.faults.TWS_Faults.OperationFailedFaultType, com.ibm.tws.ws.faults.TWS_Faults.ObjectNotFoundFaultType, com.ibm.tws.ws.faults.TWS_Faults.TransportFaultType, com.ibm.tws.ws.faults.TWS_Faults.SecurityFaultType, com.ibm.tws.ws.faults.TWS_Faults.LockingFaultType{
    if (jobStreamService == null)
      _initJobStreamServiceProxy();
    jobStreamService.cancel(engineName, jobStreamId, isPending);
  }
  
  public void releaseAllDependencies(java.lang.String engineName, java.lang.String jobStreamId) throws java.rmi.RemoteException, com.ibm.tws.ws.faults.TWS_Faults.InvalidArgumentsFaultType, com.ibm.tws.ws.faults.TWS_Faults.OperationFailedFaultType, com.ibm.tws.ws.faults.TWS_Faults.ObjectNotFoundFaultType, com.ibm.tws.ws.faults.TWS_Faults.TransportFaultType, com.ibm.tws.ws.faults.TWS_Faults.SecurityFaultType, com.ibm.tws.ws.faults.TWS_Faults.LockingFaultType{
    if (jobStreamService == null)
      _initJobStreamServiceProxy();
    jobStreamService.releaseAllDependencies(engineName, jobStreamId);
  }
  
  public com.ibm.tws.ws.types.TWS_Types.JobInstance[] getJobsList(java.lang.String engineName, java.lang.String jobStreamId) throws java.rmi.RemoteException, com.ibm.tws.ws.faults.TWS_Faults.InvalidArgumentsFaultType, com.ibm.tws.ws.faults.TWS_Faults.OperationFailedFaultType, com.ibm.tws.ws.faults.TWS_Faults.ObjectNotFoundFaultType, com.ibm.tws.ws.faults.TWS_Faults.TransportFaultType, com.ibm.tws.ws.faults.TWS_Faults.SecurityFaultType, com.ibm.tws.ws.faults.TWS_Faults.LockingFaultType{
    if (jobStreamService == null)
      _initJobStreamServiceProxy();
    return jobStreamService.getJobsList(engineName, jobStreamId);
  }
  
  public java.lang.String setProperties(java.lang.String engineName, java.lang.String jobStreamId, com.ibm.tws.ws.types.TWS_Types.Property[] properties) throws java.rmi.RemoteException, com.ibm.tws.ws.faults.TWS_Faults.InvalidArgumentsFaultType, com.ibm.tws.ws.faults.TWS_Faults.OperationFailedFaultType, com.ibm.tws.ws.faults.TWS_Faults.ObjectNotFoundFaultType, com.ibm.tws.ws.faults.TWS_Faults.TransportFaultType, com.ibm.tws.ws.faults.TWS_Faults.SecurityFaultType, com.ibm.tws.ws.faults.TWS_Faults.LockingFaultType{
    if (jobStreamService == null)
      _initJobStreamServiceProxy();
    return jobStreamService.setProperties(engineName, jobStreamId, properties);
  }
  
  public com.ibm.tws.ws.types.TWS_Types.JobStreamInstance getProperties(java.lang.String engineName, java.lang.String jobStreamId) throws java.rmi.RemoteException, com.ibm.tws.ws.faults.TWS_Faults.InvalidArgumentsFaultType, com.ibm.tws.ws.faults.TWS_Faults.OperationFailedFaultType, com.ibm.tws.ws.faults.TWS_Faults.ObjectNotFoundFaultType, com.ibm.tws.ws.faults.TWS_Faults.TransportFaultType, com.ibm.tws.ws.faults.TWS_Faults.SecurityFaultType, com.ibm.tws.ws.faults.TWS_Faults.LockingFaultType{
    if (jobStreamService == null)
      _initJobStreamServiceProxy();
    return jobStreamService.getProperties(engineName, jobStreamId);
  }
  
  
}