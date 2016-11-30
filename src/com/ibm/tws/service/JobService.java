package com.ibm.tws.service;

import java.rmi.RemoteException;

import com.ibm.tws.ws.faults.TWS_Faults.InvalidArgumentsFaultType;
import com.ibm.tws.ws.faults.TWS_Faults.LockingFaultType;
import com.ibm.tws.ws.faults.TWS_Faults.ObjectNotFoundFaultType;
import com.ibm.tws.ws.faults.TWS_Faults.OperationFailedFaultType;
import com.ibm.tws.ws.faults.TWS_Faults.SecurityFaultType;
import com.ibm.tws.ws.faults.TWS_Faults.TransportFaultType;
import com.ibm.tws.ws.types.TWS_Types.FilterCriteria;
import com.ibm.tws.ws.types.TWS_Types.JobInstance;
import com.ibm.tws.ws.types.TWS_Types.JobStreamInstance;

public interface JobService {

	JobInstance[] queryJobs() throws InvalidArgumentsFaultType, OperationFailedFaultType, ObjectNotFoundFaultType,
			TransportFaultType, SecurityFaultType, LockingFaultType, RemoteException;

	JobInstance[] queryJobs(String engineName, FilterCriteria[] filter) throws InvalidArgumentsFaultType, OperationFailedFaultType, ObjectNotFoundFaultType,
	TransportFaultType, SecurityFaultType, LockingFaultType, RemoteException;

	JobStreamInstance[] queryJobStreams(String engineName, FilterCriteria[] filter) throws InvalidArgumentsFaultType, OperationFailedFaultType, ObjectNotFoundFaultType,	
	TransportFaultType, SecurityFaultType, LockingFaultType, RemoteException;
		
}
