package com.ibm.tws.ws.services.TWS_Scheduling;

public class SchedulingFactoryProxy implements com.ibm.tws.ws.services.TWS_Scheduling.SchedulingFactory {
  private String _endpoint = null;
  private com.ibm.tws.ws.services.TWS_Scheduling.SchedulingFactory schedulingFactory = null;
  
  public SchedulingFactoryProxy() {
    _initSchedulingFactoryProxy();
  }
  
  public SchedulingFactoryProxy(String endpoint) {
    _endpoint = endpoint;
    _initSchedulingFactoryProxy();
  }
  
  private void _initSchedulingFactoryProxy() {
    try {
      schedulingFactory = (new com.ibm.tws.ws.services.TWS_Scheduling.SchedulingFactoryServiceLocator()).getSchedulingFactory();
      if (schedulingFactory != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)schedulingFactory)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)schedulingFactory)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (schedulingFactory != null)
      ((javax.xml.rpc.Stub)schedulingFactory)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.ibm.tws.ws.services.TWS_Scheduling.SchedulingFactory getSchedulingFactory() {
    if (schedulingFactory == null)
      _initSchedulingFactoryProxy();
    return schedulingFactory;
  }
  
  public java.lang.String[] submitJobStream(java.lang.String engineName, java.lang.String jsKey, java.util.Calendar schedTime, java.lang.String alias) throws java.rmi.RemoteException, com.ibm.tws.ws.faults.TWS_Faults.InvalidArgumentsFaultType, com.ibm.tws.ws.faults.TWS_Faults.OperationFailedFaultType, com.ibm.tws.ws.faults.TWS_Faults.ObjectNotFoundFaultType, com.ibm.tws.ws.faults.TWS_Faults.EngineNotMasterFaultType, com.ibm.tws.ws.faults.TWS_Faults.TransportFaultType, com.ibm.tws.ws.faults.TWS_Faults.SecurityFaultType, com.ibm.tws.ws.faults.TWS_Faults.LockingFaultType{
    if (schedulingFactory == null)
      _initSchedulingFactoryProxy();
    return schedulingFactory.submitJobStream(engineName, jsKey, schedTime, alias);
  }
  
  public java.lang.String[] submitJobStreamWithVarSub(java.lang.String engineName, java.lang.String jsKey, java.util.Calendar schedTime, java.util.Calendar deadlineTime, java.lang.String priority, java.lang.String description, java.lang.String groupName, java.lang.String ownerName, java.lang.String ownerDescription, java.lang.String authorityGroup, java.lang.String dependeciesResolution, java.lang.String variableTable, com.ibm.tws.ws.types.TWS_Types.Property[] variablesToBeSubstituted) throws java.rmi.RemoteException, com.ibm.tws.ws.faults.TWS_Faults.InvalidArgumentsFaultType, com.ibm.tws.ws.faults.TWS_Faults.OperationFailedFaultType, com.ibm.tws.ws.faults.TWS_Faults.ObjectNotFoundFaultType, com.ibm.tws.ws.faults.TWS_Faults.EngineNotMasterFaultType, com.ibm.tws.ws.faults.TWS_Faults.TransportFaultType, com.ibm.tws.ws.faults.TWS_Faults.SecurityFaultType, com.ibm.tws.ws.faults.TWS_Faults.LockingFaultType{
    if (schedulingFactory == null)
      _initSchedulingFactoryProxy();
    return schedulingFactory.submitJobStreamWithVarSub(engineName, jsKey, schedTime, deadlineTime, priority, description, groupName, ownerName, ownerDescription, authorityGroup, dependeciesResolution, variableTable, variablesToBeSubstituted);
  }
  
  public java.lang.String[] editSubmitJobStreamWithVarSub(java.lang.String engineName, java.lang.String jsKey, java.util.Calendar schedTime, java.util.Calendar deadlineTime, java.lang.String priority, java.lang.String description, java.lang.String groupName, java.lang.String ownerName, java.lang.String ownerDescription, java.lang.String authorityGroup, java.lang.String dependeciesResolution, java.lang.String variableTable, com.ibm.tws.ws.types.TWS_Types.ZOSJob[] jobsList, com.ibm.tws.ws.types.TWS_Types.Dependency[] dependecyLst, com.ibm.tws.ws.types.TWS_Types.Property[] variablesToBeSubstituted) throws java.rmi.RemoteException, com.ibm.tws.ws.faults.TWS_Faults.InvalidArgumentsFaultType, com.ibm.tws.ws.faults.TWS_Faults.OperationFailedFaultType, com.ibm.tws.ws.faults.TWS_Faults.ObjectNotFoundFaultType, com.ibm.tws.ws.faults.TWS_Faults.EngineNotMasterFaultType, com.ibm.tws.ws.faults.TWS_Faults.TransportFaultType, com.ibm.tws.ws.faults.TWS_Faults.SecurityFaultType, com.ibm.tws.ws.faults.TWS_Faults.LockingFaultType{
    if (schedulingFactory == null)
      _initSchedulingFactoryProxy();
    return schedulingFactory.editSubmitJobStreamWithVarSub(engineName, jsKey, schedTime, deadlineTime, priority, description, groupName, ownerName, ownerDescription, authorityGroup, dependeciesResolution, variableTable, jobsList, dependecyLst, variablesToBeSubstituted);
  }
  
  public java.lang.String[] editSubmitJobStreamWithJobVarSub(java.lang.String engineName, java.lang.String jsKey, java.util.Calendar schedTime, java.util.Calendar deadlineTime, java.lang.String priority, java.lang.String description, java.lang.String groupName, java.lang.String ownerName, java.lang.String ownerDescription, java.lang.String authorityGroup, java.lang.String dependeciesResolution, java.lang.String variableTable, com.ibm.tws.ws.types.TWS_Types.ZOSJob[] jobsList, com.ibm.tws.ws.types.TWS_Types.Dependency[] dependecyLst, com.ibm.tws.ws.types.TWS_Types.Property[] variablesToBeSubstituted, com.ibm.tws.ws.types.TWS_Types.JobVariableList[] jobVariablesToBeSubstituted) throws java.rmi.RemoteException, com.ibm.tws.ws.faults.TWS_Faults.InvalidArgumentsFaultType, com.ibm.tws.ws.faults.TWS_Faults.OperationFailedFaultType, com.ibm.tws.ws.faults.TWS_Faults.ObjectNotFoundFaultType, com.ibm.tws.ws.faults.TWS_Faults.EngineNotMasterFaultType, com.ibm.tws.ws.faults.TWS_Faults.TransportFaultType, com.ibm.tws.ws.faults.TWS_Faults.SecurityFaultType, com.ibm.tws.ws.faults.TWS_Faults.LockingFaultType{
    if (schedulingFactory == null)
      _initSchedulingFactoryProxy();
    return schedulingFactory.editSubmitJobStreamWithJobVarSub(engineName, jsKey, schedTime, deadlineTime, priority, description, groupName, ownerName, ownerDescription, authorityGroup, dependeciesResolution, variableTable, jobsList, dependecyLst, variablesToBeSubstituted, jobVariablesToBeSubstituted);
  }
  
  public java.lang.String submitJob(java.lang.String engineName, java.lang.String jobKey, java.lang.String alias) throws java.rmi.RemoteException, com.ibm.tws.ws.faults.TWS_Faults.InvalidArgumentsFaultType, com.ibm.tws.ws.faults.TWS_Faults.OperationFailedFaultType, com.ibm.tws.ws.faults.TWS_Faults.ObjectNotFoundFaultType, com.ibm.tws.ws.faults.TWS_Faults.EngineNotMasterFaultType, com.ibm.tws.ws.faults.TWS_Faults.TransportFaultType, com.ibm.tws.ws.faults.TWS_Faults.SecurityFaultType, com.ibm.tws.ws.faults.TWS_Faults.LockingFaultType{
    if (schedulingFactory == null)
      _initSchedulingFactoryProxy();
    return schedulingFactory.submitJob(engineName, jobKey, alias);
  }
  
  public java.lang.String submitAdHocJob(java.lang.String engineName, com.ibm.tws.ws.types.TWS_Types.JobToSubmit job) throws java.rmi.RemoteException, com.ibm.tws.ws.faults.TWS_Faults.InvalidArgumentsFaultType, com.ibm.tws.ws.faults.TWS_Faults.OperationFailedFaultType, com.ibm.tws.ws.faults.TWS_Faults.ObjectNotFoundFaultType, com.ibm.tws.ws.faults.TWS_Faults.TransportFaultType, com.ibm.tws.ws.faults.TWS_Faults.SecurityFaultType, com.ibm.tws.ws.faults.TWS_Faults.LockingFaultType{
    if (schedulingFactory == null)
      _initSchedulingFactoryProxy();
    return schedulingFactory.submitAdHocJob(engineName, job);
  }
  
  public com.ibm.tws.ws.types.TWS_Types.JobStreamInstance[] queryJobStreams(java.lang.String engineName, com.ibm.tws.ws.types.TWS_Types.FilterCriteria[] filter) throws java.rmi.RemoteException, com.ibm.tws.ws.faults.TWS_Faults.InvalidArgumentsFaultType, com.ibm.tws.ws.faults.TWS_Faults.OperationFailedFaultType, com.ibm.tws.ws.faults.TWS_Faults.ObjectNotFoundFaultType, com.ibm.tws.ws.faults.TWS_Faults.TransportFaultType, com.ibm.tws.ws.faults.TWS_Faults.SecurityFaultType, com.ibm.tws.ws.faults.TWS_Faults.LockingFaultType{
    if (schedulingFactory == null)
      _initSchedulingFactoryProxy();
    return schedulingFactory.queryJobStreams(engineName, filter);
  }
  
  public com.ibm.tws.ws.types.TWS_Types.JobInstance[] queryJobs(java.lang.String engineName, com.ibm.tws.ws.types.TWS_Types.FilterCriteria[] filter) throws java.rmi.RemoteException, com.ibm.tws.ws.faults.TWS_Faults.InvalidArgumentsFaultType, com.ibm.tws.ws.faults.TWS_Faults.OperationFailedFaultType, com.ibm.tws.ws.faults.TWS_Faults.ObjectNotFoundFaultType, com.ibm.tws.ws.faults.TWS_Faults.TransportFaultType, com.ibm.tws.ws.faults.TWS_Faults.SecurityFaultType, com.ibm.tws.ws.faults.TWS_Faults.LockingFaultType{
    if (schedulingFactory == null)
      _initSchedulingFactoryProxy();
    return schedulingFactory.queryJobs(engineName, filter);
  }
  
  
}