/**
 * SchedulingFactoryService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.tws.ws.services.TWS_Scheduling;

public interface SchedulingFactoryService extends javax.xml.rpc.Service {

/**
 * for distribuited env, the default location is:
 * 		https://localhost:31116/PlanServicesWeb/services/SchedulingFactory
 * 
 * 	for z/OS env, the default location is:
 * 		https://localhost:31126/zPlanServicesWeb/services/SchedulingFactory
 */
    public java.lang.String getSchedulingFactoryAddress();

    public com.ibm.tws.ws.services.TWS_Scheduling.SchedulingFactory getSchedulingFactory() throws javax.xml.rpc.ServiceException;

    public com.ibm.tws.ws.services.TWS_Scheduling.SchedulingFactory getSchedulingFactory(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
