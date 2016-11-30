/**
 * SchedulingFactorySoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.tws.ws.services.TWS_Scheduling;

import com.ibm.tws.bean.StaticConst;

public class SchedulingFactorySoapBindingStub extends org.apache.axis.client.Stub implements com.ibm.tws.ws.services.TWS_Scheduling.SchedulingFactory {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[8];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("submitJobStream");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "engineName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "jsKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "schedTime"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "alias"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "ArrayOf_xsd_string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "submitJobStreamReturn"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "string"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "InvalidArgumentsFault"),
                      "com.ibm.tws.ws.faults.TWS_Faults.InvalidArgumentsFaultType",
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "InvalidArgumentsFaultType"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "OperationFailedFault"),
                      "com.ibm.tws.ws.faults.TWS_Faults.OperationFailedFaultType",
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "OperationFailedFaultType"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "ObjectNotFoundFault"),
                      "com.ibm.tws.ws.faults.TWS_Faults.ObjectNotFoundFaultType",
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "ObjectNotFoundFaultType"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "EngineNotMasterFault"),
                      "com.ibm.tws.ws.faults.TWS_Faults.EngineNotMasterFaultType",
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "EngineNotMasterFaultType"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "TransportFault"),
                      "com.ibm.tws.ws.faults.TWS_Faults.TransportFaultType",
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "TransportFaultType"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "SecurityFault"),
                      "com.ibm.tws.ws.faults.TWS_Faults.SecurityFaultType",
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "SecurityFaultType"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "LockingFault"),
                      "com.ibm.tws.ws.faults.TWS_Faults.LockingFaultType",
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "LockingFaultType"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("submitJobStreamWithVarSub");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "engineName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "jsKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "schedTime"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "deadlineTime"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "priority"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "description"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "groupName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "ownerName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "ownerDescription"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "authorityGroup"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "dependeciesResolution"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "variableTable"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "variablesToBeSubstituted"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "ArrayOf_types_Property"), com.ibm.tws.ws.types.TWS_Types.Property[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "Property"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "ArrayOf_xsd_string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "submitJobStreamWithVarSubReturn"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "string"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "InvalidArgumentsFault"),
                      "com.ibm.tws.ws.faults.TWS_Faults.InvalidArgumentsFaultType",
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "InvalidArgumentsFaultType"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "OperationFailedFault"),
                      "com.ibm.tws.ws.faults.TWS_Faults.OperationFailedFaultType",
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "OperationFailedFaultType"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "ObjectNotFoundFault"),
                      "com.ibm.tws.ws.faults.TWS_Faults.ObjectNotFoundFaultType",
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "ObjectNotFoundFaultType"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "EngineNotMasterFault"),
                      "com.ibm.tws.ws.faults.TWS_Faults.EngineNotMasterFaultType",
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "EngineNotMasterFaultType"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "TransportFault"),
                      "com.ibm.tws.ws.faults.TWS_Faults.TransportFaultType",
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "TransportFaultType"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "SecurityFault"),
                      "com.ibm.tws.ws.faults.TWS_Faults.SecurityFaultType",
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "SecurityFaultType"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "LockingFault"),
                      "com.ibm.tws.ws.faults.TWS_Faults.LockingFaultType",
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "LockingFaultType"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("editSubmitJobStreamWithVarSub");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "engineName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "jsKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "schedTime"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "deadlineTime"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "priority"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "description"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "groupName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "ownerName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "ownerDescription"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "authorityGroup"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "dependeciesResolution"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "variableTable"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "jobsList"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "ArrayOf_types_ZOSJob"), com.ibm.tws.ws.types.TWS_Types.ZOSJob[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "ZOSJob"));
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "dependecyLst"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "ArrayOf_types_Dependency"), com.ibm.tws.ws.types.TWS_Types.Dependency[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "Dependency"));
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "variablesToBeSubstituted"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "ArrayOf_types_Property"), com.ibm.tws.ws.types.TWS_Types.Property[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "Property"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "ArrayOf_xsd_string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "editSubmitJobStreamWithVarSubReturn"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "string"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "InvalidArgumentsFault"),
                      "com.ibm.tws.ws.faults.TWS_Faults.InvalidArgumentsFaultType",
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "InvalidArgumentsFaultType"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "OperationFailedFault"),
                      "com.ibm.tws.ws.faults.TWS_Faults.OperationFailedFaultType",
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "OperationFailedFaultType"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "ObjectNotFoundFault"),
                      "com.ibm.tws.ws.faults.TWS_Faults.ObjectNotFoundFaultType",
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "ObjectNotFoundFaultType"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "EngineNotMasterFault"),
                      "com.ibm.tws.ws.faults.TWS_Faults.EngineNotMasterFaultType",
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "EngineNotMasterFaultType"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "TransportFault"),
                      "com.ibm.tws.ws.faults.TWS_Faults.TransportFaultType",
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "TransportFaultType"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "SecurityFault"),
                      "com.ibm.tws.ws.faults.TWS_Faults.SecurityFaultType",
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "SecurityFaultType"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "LockingFault"),
                      "com.ibm.tws.ws.faults.TWS_Faults.LockingFaultType",
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "LockingFaultType"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("editSubmitJobStreamWithJobVarSub");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "engineName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "jsKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "schedTime"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "deadlineTime"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "priority"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "description"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "groupName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "ownerName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "ownerDescription"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "authorityGroup"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "dependeciesResolution"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "variableTable"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "jobsList"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "ArrayOf_types_ZOSJob"), com.ibm.tws.ws.types.TWS_Types.ZOSJob[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "ZOSJob"));
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "dependecyLst"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "ArrayOf_types_Dependency"), com.ibm.tws.ws.types.TWS_Types.Dependency[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "Dependency"));
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "variablesToBeSubstituted"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "ArrayOf_types_Property"), com.ibm.tws.ws.types.TWS_Types.Property[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "Property"));
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "jobVariablesToBeSubstituted"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "ArrayOf_types_JobVariableList"), com.ibm.tws.ws.types.TWS_Types.JobVariableList[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "JobVariableList"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "ArrayOf_xsd_string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "editSubmitJobStreamWithJobVarSubReturn"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "string"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "InvalidArgumentsFault"),
                      "com.ibm.tws.ws.faults.TWS_Faults.InvalidArgumentsFaultType",
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "InvalidArgumentsFaultType"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "OperationFailedFault"),
                      "com.ibm.tws.ws.faults.TWS_Faults.OperationFailedFaultType",
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "OperationFailedFaultType"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "ObjectNotFoundFault"),
                      "com.ibm.tws.ws.faults.TWS_Faults.ObjectNotFoundFaultType",
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "ObjectNotFoundFaultType"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "EngineNotMasterFault"),
                      "com.ibm.tws.ws.faults.TWS_Faults.EngineNotMasterFaultType",
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "EngineNotMasterFaultType"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "TransportFault"),
                      "com.ibm.tws.ws.faults.TWS_Faults.TransportFaultType",
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "TransportFaultType"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "SecurityFault"),
                      "com.ibm.tws.ws.faults.TWS_Faults.SecurityFaultType",
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "SecurityFaultType"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "LockingFault"),
                      "com.ibm.tws.ws.faults.TWS_Faults.LockingFaultType",
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "LockingFaultType"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("submitJob");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "engineName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "jobKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "alias"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "submitJobReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "InvalidArgumentsFault"),
                      "com.ibm.tws.ws.faults.TWS_Faults.InvalidArgumentsFaultType",
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "InvalidArgumentsFaultType"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "OperationFailedFault"),
                      "com.ibm.tws.ws.faults.TWS_Faults.OperationFailedFaultType",
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "OperationFailedFaultType"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "ObjectNotFoundFault"),
                      "com.ibm.tws.ws.faults.TWS_Faults.ObjectNotFoundFaultType",
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "ObjectNotFoundFaultType"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "EngineNotMasterFault"),
                      "com.ibm.tws.ws.faults.TWS_Faults.EngineNotMasterFaultType",
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "EngineNotMasterFaultType"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "TransportFault"),
                      "com.ibm.tws.ws.faults.TWS_Faults.TransportFaultType",
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "TransportFaultType"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "SecurityFault"),
                      "com.ibm.tws.ws.faults.TWS_Faults.SecurityFaultType",
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "SecurityFaultType"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "LockingFault"),
                      "com.ibm.tws.ws.faults.TWS_Faults.LockingFaultType",
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "LockingFaultType"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("submitAdHocJob");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "engineName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "job"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "JobToSubmit"), com.ibm.tws.ws.types.TWS_Types.JobToSubmit.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "submitAdHocJobReturn"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "InvalidArgumentsFault"),
                      "com.ibm.tws.ws.faults.TWS_Faults.InvalidArgumentsFaultType",
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "InvalidArgumentsFaultType"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "OperationFailedFault"),
                      "com.ibm.tws.ws.faults.TWS_Faults.OperationFailedFaultType",
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "OperationFailedFaultType"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "ObjectNotFoundFault"),
                      "com.ibm.tws.ws.faults.TWS_Faults.ObjectNotFoundFaultType",
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "ObjectNotFoundFaultType"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "TransportFault"),
                      "com.ibm.tws.ws.faults.TWS_Faults.TransportFaultType",
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "TransportFaultType"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "SecurityFault"),
                      "com.ibm.tws.ws.faults.TWS_Faults.SecurityFaultType",
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "SecurityFaultType"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "LockingFault"),
                      "com.ibm.tws.ws.faults.TWS_Faults.LockingFaultType",
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "LockingFaultType"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryJobStreams");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "engineName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "filter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "ArrayOf_types_FilterCriteria"), com.ibm.tws.ws.types.TWS_Types.FilterCriteria[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "FilterCriteria"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "ArrayOf_types_JobStreamInstance"));
        oper.setReturnClass(com.ibm.tws.ws.types.TWS_Types.JobStreamInstance[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "queryJobStreamsReturn"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "JobStreamInstance"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "InvalidArgumentsFault"),
                      "com.ibm.tws.ws.faults.TWS_Faults.InvalidArgumentsFaultType",
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "InvalidArgumentsFaultType"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "OperationFailedFault"),
                      "com.ibm.tws.ws.faults.TWS_Faults.OperationFailedFaultType",
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "OperationFailedFaultType"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "ObjectNotFoundFault"),
                      "com.ibm.tws.ws.faults.TWS_Faults.ObjectNotFoundFaultType",
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "ObjectNotFoundFaultType"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "TransportFault"),
                      "com.ibm.tws.ws.faults.TWS_Faults.TransportFaultType",
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "TransportFaultType"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "SecurityFault"),
                      "com.ibm.tws.ws.faults.TWS_Faults.SecurityFaultType",
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "SecurityFaultType"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "LockingFault"),
                      "com.ibm.tws.ws.faults.TWS_Faults.LockingFaultType",
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "LockingFaultType"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryJobs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "engineName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "filter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "ArrayOf_types_FilterCriteria"), com.ibm.tws.ws.types.TWS_Types.FilterCriteria[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "FilterCriteria"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "ArrayOf_types_JobInstance"));
        oper.setReturnClass(com.ibm.tws.ws.types.TWS_Types.JobInstance[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "queryJobsReturn"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "JobInstance"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "InvalidArgumentsFault"),
                      "com.ibm.tws.ws.faults.TWS_Faults.InvalidArgumentsFaultType",
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "InvalidArgumentsFaultType"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "OperationFailedFault"),
                      "com.ibm.tws.ws.faults.TWS_Faults.OperationFailedFaultType",
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "OperationFailedFaultType"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "ObjectNotFoundFault"),
                      "com.ibm.tws.ws.faults.TWS_Faults.ObjectNotFoundFaultType",
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "ObjectNotFoundFaultType"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "TransportFault"),
                      "com.ibm.tws.ws.faults.TWS_Faults.TransportFaultType",
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "TransportFaultType"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "SecurityFault"),
                      "com.ibm.tws.ws.faults.TWS_Faults.SecurityFaultType",
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "SecurityFaultType"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "LockingFault"),
                      "com.ibm.tws.ws.faults.TWS_Faults.LockingFaultType",
                      new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "LockingFaultType"), 
                      true
                     ));
        _operations[7] = oper;

    }

    public SchedulingFactorySoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public SchedulingFactorySoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public SchedulingFactorySoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-BaseFaults", ">BaseFaultType>Description");
            cachedSerQNames.add(qName);
            cls = com.ibm.tws.ws.faults.TWS_BaseFaults.BaseFaultTypeDescription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-BaseFaults", "BaseFaultType");
            cachedSerQNames.add(qName);
            cls = com.ibm.tws.ws.faults.TWS_BaseFaults.BaseFaultType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "EngineNotMasterFaultType");
            cachedSerQNames.add(qName);
            cls = com.ibm.tws.ws.faults.TWS_Faults.EngineNotMasterFaultType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "InvalidArgumentsFaultType");
            cachedSerQNames.add(qName);
            cls = com.ibm.tws.ws.faults.TWS_Faults.InvalidArgumentsFaultType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "LockingFaultType");
            cachedSerQNames.add(qName);
            cls = com.ibm.tws.ws.faults.TWS_Faults.LockingFaultType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "ObjectNotFoundFaultType");
            cachedSerQNames.add(qName);
            cls = com.ibm.tws.ws.faults.TWS_Faults.ObjectNotFoundFaultType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "OperationFailedFaultType");
            cachedSerQNames.add(qName);
            cls = com.ibm.tws.ws.faults.TWS_Faults.OperationFailedFaultType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "SecurityFaultType");
            cachedSerQNames.add(qName);
            cls = com.ibm.tws.ws.faults.TWS_Faults.SecurityFaultType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "TransportFaultType");
            cachedSerQNames.add(qName);
            cls = com.ibm.tws.ws.faults.TWS_Faults.TransportFaultType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://faults.ws.tws.ibm.com/TWS-Faults", "UnsupportedOperationFaultType");
            cachedSerQNames.add(qName);
            cls = com.ibm.tws.ws.faults.TWS_Faults.UnsupportedOperationFaultType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "ArrayOf_types_Dependency");
            cachedSerQNames.add(qName);
            cls = com.ibm.tws.ws.types.TWS_Types.Dependency[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "Dependency");
            qName2 = new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "Dependency");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "ArrayOf_types_FilterCriteria");
            cachedSerQNames.add(qName);
            cls = com.ibm.tws.ws.types.TWS_Types.FilterCriteria[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "FilterCriteria");
            qName2 = new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "FilterCriteria");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "ArrayOf_types_JobInstance");
            cachedSerQNames.add(qName);
            cls = com.ibm.tws.ws.types.TWS_Types.JobInstance[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "JobInstance");
            qName2 = new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "JobInstance");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "ArrayOf_types_JobStreamInstance");
            cachedSerQNames.add(qName);
            cls = com.ibm.tws.ws.types.TWS_Types.JobStreamInstance[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "JobStreamInstance");
            qName2 = new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "JobStreamInstance");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "ArrayOf_types_JobVariableList");
            cachedSerQNames.add(qName);
            cls = com.ibm.tws.ws.types.TWS_Types.JobVariableList[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "JobVariableList");
            qName2 = new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "JobVariableList");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "ArrayOf_types_Property");
            cachedSerQNames.add(qName);
            cls = com.ibm.tws.ws.types.TWS_Types.Property[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "Property");
            qName2 = new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "Property");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "ArrayOf_types_ZOSJob");
            cachedSerQNames.add(qName);
            cls = com.ibm.tws.ws.types.TWS_Types.ZOSJob[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "ZOSJob");
            qName2 = new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "ZOSJob");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "ArrayOf_xsd_string");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "string");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "Dependency");
            cachedSerQNames.add(qName);
            cls = com.ibm.tws.ws.types.TWS_Types.Dependency.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "FilterCriteria");
            cachedSerQNames.add(qName);
            cls = com.ibm.tws.ws.types.TWS_Types.FilterCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "JobInstance");
            cachedSerQNames.add(qName);
            cls = com.ibm.tws.ws.types.TWS_Types.JobInstance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "JobStreamInstance");
            cachedSerQNames.add(qName);
            cls = com.ibm.tws.ws.types.TWS_Types.JobStreamInstance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "JobToSubmit");
            cachedSerQNames.add(qName);
            cls = com.ibm.tws.ws.types.TWS_Types.JobToSubmit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "JobVariableList");
            cachedSerQNames.add(qName);
            cls = com.ibm.tws.ws.types.TWS_Types.JobVariableList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "Property");
            cachedSerQNames.add(qName);
            cls = com.ibm.tws.ws.types.TWS_Types.Property.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "ZOSJob");
            cachedSerQNames.add(qName);
            cls = com.ibm.tws.ws.types.TWS_Types.ZOSJob.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public java.lang.String[] submitJobStream(java.lang.String engineName, java.lang.String jsKey, java.util.Calendar schedTime, java.lang.String alias) throws java.rmi.RemoteException, com.ibm.tws.ws.faults.TWS_Faults.InvalidArgumentsFaultType, com.ibm.tws.ws.faults.TWS_Faults.OperationFailedFaultType, com.ibm.tws.ws.faults.TWS_Faults.ObjectNotFoundFaultType, com.ibm.tws.ws.faults.TWS_Faults.EngineNotMasterFaultType, com.ibm.tws.ws.faults.TWS_Faults.TransportFaultType, com.ibm.tws.ws.faults.TWS_Faults.SecurityFaultType, com.ibm.tws.ws.faults.TWS_Faults.LockingFaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setUsername(StaticConst.username);
        _call.setPassword(StaticConst.password);
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "submitJobStream"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {engineName, jsKey, schedTime, alias});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.tws.ws.faults.TWS_Faults.InvalidArgumentsFaultType) {
              throw (com.ibm.tws.ws.faults.TWS_Faults.InvalidArgumentsFaultType) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.tws.ws.faults.TWS_Faults.OperationFailedFaultType) {
              throw (com.ibm.tws.ws.faults.TWS_Faults.OperationFailedFaultType) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.tws.ws.faults.TWS_Faults.ObjectNotFoundFaultType) {
              throw (com.ibm.tws.ws.faults.TWS_Faults.ObjectNotFoundFaultType) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.tws.ws.faults.TWS_Faults.EngineNotMasterFaultType) {
              throw (com.ibm.tws.ws.faults.TWS_Faults.EngineNotMasterFaultType) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.tws.ws.faults.TWS_Faults.TransportFaultType) {
              throw (com.ibm.tws.ws.faults.TWS_Faults.TransportFaultType) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.tws.ws.faults.TWS_Faults.SecurityFaultType) {
              throw (com.ibm.tws.ws.faults.TWS_Faults.SecurityFaultType) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.tws.ws.faults.TWS_Faults.LockingFaultType) {
              throw (com.ibm.tws.ws.faults.TWS_Faults.LockingFaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String[] submitJobStreamWithVarSub(java.lang.String engineName, java.lang.String jsKey, java.util.Calendar schedTime, java.util.Calendar deadlineTime, java.lang.String priority, java.lang.String description, java.lang.String groupName, java.lang.String ownerName, java.lang.String ownerDescription, java.lang.String authorityGroup, java.lang.String dependeciesResolution, java.lang.String variableTable, com.ibm.tws.ws.types.TWS_Types.Property[] variablesToBeSubstituted) throws java.rmi.RemoteException, com.ibm.tws.ws.faults.TWS_Faults.InvalidArgumentsFaultType, com.ibm.tws.ws.faults.TWS_Faults.OperationFailedFaultType, com.ibm.tws.ws.faults.TWS_Faults.ObjectNotFoundFaultType, com.ibm.tws.ws.faults.TWS_Faults.EngineNotMasterFaultType, com.ibm.tws.ws.faults.TWS_Faults.TransportFaultType, com.ibm.tws.ws.faults.TWS_Faults.SecurityFaultType, com.ibm.tws.ws.faults.TWS_Faults.LockingFaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setUsername(StaticConst.username);
        _call.setPassword(StaticConst.password);
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "submitJobStreamWithVarSub"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {engineName, jsKey, schedTime, deadlineTime, priority, description, groupName, ownerName, ownerDescription, authorityGroup, dependeciesResolution, variableTable, variablesToBeSubstituted});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.tws.ws.faults.TWS_Faults.InvalidArgumentsFaultType) {
              throw (com.ibm.tws.ws.faults.TWS_Faults.InvalidArgumentsFaultType) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.tws.ws.faults.TWS_Faults.OperationFailedFaultType) {
              throw (com.ibm.tws.ws.faults.TWS_Faults.OperationFailedFaultType) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.tws.ws.faults.TWS_Faults.ObjectNotFoundFaultType) {
              throw (com.ibm.tws.ws.faults.TWS_Faults.ObjectNotFoundFaultType) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.tws.ws.faults.TWS_Faults.EngineNotMasterFaultType) {
              throw (com.ibm.tws.ws.faults.TWS_Faults.EngineNotMasterFaultType) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.tws.ws.faults.TWS_Faults.TransportFaultType) {
              throw (com.ibm.tws.ws.faults.TWS_Faults.TransportFaultType) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.tws.ws.faults.TWS_Faults.SecurityFaultType) {
              throw (com.ibm.tws.ws.faults.TWS_Faults.SecurityFaultType) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.tws.ws.faults.TWS_Faults.LockingFaultType) {
              throw (com.ibm.tws.ws.faults.TWS_Faults.LockingFaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String[] editSubmitJobStreamWithVarSub(java.lang.String engineName, java.lang.String jsKey, java.util.Calendar schedTime, java.util.Calendar deadlineTime, java.lang.String priority, java.lang.String description, java.lang.String groupName, java.lang.String ownerName, java.lang.String ownerDescription, java.lang.String authorityGroup, java.lang.String dependeciesResolution, java.lang.String variableTable, com.ibm.tws.ws.types.TWS_Types.ZOSJob[] jobsList, com.ibm.tws.ws.types.TWS_Types.Dependency[] dependecyLst, com.ibm.tws.ws.types.TWS_Types.Property[] variablesToBeSubstituted) throws java.rmi.RemoteException, com.ibm.tws.ws.faults.TWS_Faults.InvalidArgumentsFaultType, com.ibm.tws.ws.faults.TWS_Faults.OperationFailedFaultType, com.ibm.tws.ws.faults.TWS_Faults.ObjectNotFoundFaultType, com.ibm.tws.ws.faults.TWS_Faults.EngineNotMasterFaultType, com.ibm.tws.ws.faults.TWS_Faults.TransportFaultType, com.ibm.tws.ws.faults.TWS_Faults.SecurityFaultType, com.ibm.tws.ws.faults.TWS_Faults.LockingFaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setUsername(StaticConst.username);
        _call.setPassword(StaticConst.password);
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "editSubmitJobStreamWithVarSub"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {engineName, jsKey, schedTime, deadlineTime, priority, description, groupName, ownerName, ownerDescription, authorityGroup, dependeciesResolution, variableTable, jobsList, dependecyLst, variablesToBeSubstituted});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.tws.ws.faults.TWS_Faults.InvalidArgumentsFaultType) {
              throw (com.ibm.tws.ws.faults.TWS_Faults.InvalidArgumentsFaultType) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.tws.ws.faults.TWS_Faults.OperationFailedFaultType) {
              throw (com.ibm.tws.ws.faults.TWS_Faults.OperationFailedFaultType) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.tws.ws.faults.TWS_Faults.ObjectNotFoundFaultType) {
              throw (com.ibm.tws.ws.faults.TWS_Faults.ObjectNotFoundFaultType) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.tws.ws.faults.TWS_Faults.EngineNotMasterFaultType) {
              throw (com.ibm.tws.ws.faults.TWS_Faults.EngineNotMasterFaultType) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.tws.ws.faults.TWS_Faults.TransportFaultType) {
              throw (com.ibm.tws.ws.faults.TWS_Faults.TransportFaultType) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.tws.ws.faults.TWS_Faults.SecurityFaultType) {
              throw (com.ibm.tws.ws.faults.TWS_Faults.SecurityFaultType) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.tws.ws.faults.TWS_Faults.LockingFaultType) {
              throw (com.ibm.tws.ws.faults.TWS_Faults.LockingFaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String[] editSubmitJobStreamWithJobVarSub(java.lang.String engineName, java.lang.String jsKey, java.util.Calendar schedTime, java.util.Calendar deadlineTime, java.lang.String priority, java.lang.String description, java.lang.String groupName, java.lang.String ownerName, java.lang.String ownerDescription, java.lang.String authorityGroup, java.lang.String dependeciesResolution, java.lang.String variableTable, com.ibm.tws.ws.types.TWS_Types.ZOSJob[] jobsList, com.ibm.tws.ws.types.TWS_Types.Dependency[] dependecyLst, com.ibm.tws.ws.types.TWS_Types.Property[] variablesToBeSubstituted, com.ibm.tws.ws.types.TWS_Types.JobVariableList[] jobVariablesToBeSubstituted) throws java.rmi.RemoteException, com.ibm.tws.ws.faults.TWS_Faults.InvalidArgumentsFaultType, com.ibm.tws.ws.faults.TWS_Faults.OperationFailedFaultType, com.ibm.tws.ws.faults.TWS_Faults.ObjectNotFoundFaultType, com.ibm.tws.ws.faults.TWS_Faults.EngineNotMasterFaultType, com.ibm.tws.ws.faults.TWS_Faults.TransportFaultType, com.ibm.tws.ws.faults.TWS_Faults.SecurityFaultType, com.ibm.tws.ws.faults.TWS_Faults.LockingFaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setUsername(StaticConst.username);
        _call.setPassword(StaticConst.password);
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "editSubmitJobStreamWithJobVarSub"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {engineName, jsKey, schedTime, deadlineTime, priority, description, groupName, ownerName, ownerDescription, authorityGroup, dependeciesResolution, variableTable, jobsList, dependecyLst, variablesToBeSubstituted, jobVariablesToBeSubstituted});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.tws.ws.faults.TWS_Faults.InvalidArgumentsFaultType) {
              throw (com.ibm.tws.ws.faults.TWS_Faults.InvalidArgumentsFaultType) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.tws.ws.faults.TWS_Faults.OperationFailedFaultType) {
              throw (com.ibm.tws.ws.faults.TWS_Faults.OperationFailedFaultType) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.tws.ws.faults.TWS_Faults.ObjectNotFoundFaultType) {
              throw (com.ibm.tws.ws.faults.TWS_Faults.ObjectNotFoundFaultType) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.tws.ws.faults.TWS_Faults.EngineNotMasterFaultType) {
              throw (com.ibm.tws.ws.faults.TWS_Faults.EngineNotMasterFaultType) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.tws.ws.faults.TWS_Faults.TransportFaultType) {
              throw (com.ibm.tws.ws.faults.TWS_Faults.TransportFaultType) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.tws.ws.faults.TWS_Faults.SecurityFaultType) {
              throw (com.ibm.tws.ws.faults.TWS_Faults.SecurityFaultType) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.tws.ws.faults.TWS_Faults.LockingFaultType) {
              throw (com.ibm.tws.ws.faults.TWS_Faults.LockingFaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * for distribuited environment only
     */
    public java.lang.String submitJob(java.lang.String engineName, java.lang.String jobKey, java.lang.String alias) throws java.rmi.RemoteException, com.ibm.tws.ws.faults.TWS_Faults.InvalidArgumentsFaultType, com.ibm.tws.ws.faults.TWS_Faults.OperationFailedFaultType, com.ibm.tws.ws.faults.TWS_Faults.ObjectNotFoundFaultType, com.ibm.tws.ws.faults.TWS_Faults.EngineNotMasterFaultType, com.ibm.tws.ws.faults.TWS_Faults.TransportFaultType, com.ibm.tws.ws.faults.TWS_Faults.SecurityFaultType, com.ibm.tws.ws.faults.TWS_Faults.LockingFaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setUsername(StaticConst.username);
        _call.setPassword(StaticConst.password);
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "submitJob"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {engineName, jobKey, alias});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.tws.ws.faults.TWS_Faults.InvalidArgumentsFaultType) {
              throw (com.ibm.tws.ws.faults.TWS_Faults.InvalidArgumentsFaultType) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.tws.ws.faults.TWS_Faults.OperationFailedFaultType) {
              throw (com.ibm.tws.ws.faults.TWS_Faults.OperationFailedFaultType) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.tws.ws.faults.TWS_Faults.ObjectNotFoundFaultType) {
              throw (com.ibm.tws.ws.faults.TWS_Faults.ObjectNotFoundFaultType) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.tws.ws.faults.TWS_Faults.EngineNotMasterFaultType) {
              throw (com.ibm.tws.ws.faults.TWS_Faults.EngineNotMasterFaultType) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.tws.ws.faults.TWS_Faults.TransportFaultType) {
              throw (com.ibm.tws.ws.faults.TWS_Faults.TransportFaultType) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.tws.ws.faults.TWS_Faults.SecurityFaultType) {
              throw (com.ibm.tws.ws.faults.TWS_Faults.SecurityFaultType) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.tws.ws.faults.TWS_Faults.LockingFaultType) {
              throw (com.ibm.tws.ws.faults.TWS_Faults.LockingFaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }


    /**
     * for distribuited environment only
     */
    public java.lang.String submitAdHocJob(java.lang.String engineName, com.ibm.tws.ws.types.TWS_Types.JobToSubmit job) throws java.rmi.RemoteException, com.ibm.tws.ws.faults.TWS_Faults.InvalidArgumentsFaultType, com.ibm.tws.ws.faults.TWS_Faults.OperationFailedFaultType, com.ibm.tws.ws.faults.TWS_Faults.ObjectNotFoundFaultType, com.ibm.tws.ws.faults.TWS_Faults.TransportFaultType, com.ibm.tws.ws.faults.TWS_Faults.SecurityFaultType, com.ibm.tws.ws.faults.TWS_Faults.LockingFaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setUsername(StaticConst.username);
        _call.setPassword(StaticConst.password);
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "submitAdHocJob"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {engineName, job});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.tws.ws.faults.TWS_Faults.InvalidArgumentsFaultType) {
              throw (com.ibm.tws.ws.faults.TWS_Faults.InvalidArgumentsFaultType) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.tws.ws.faults.TWS_Faults.OperationFailedFaultType) {
              throw (com.ibm.tws.ws.faults.TWS_Faults.OperationFailedFaultType) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.tws.ws.faults.TWS_Faults.ObjectNotFoundFaultType) {
              throw (com.ibm.tws.ws.faults.TWS_Faults.ObjectNotFoundFaultType) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.tws.ws.faults.TWS_Faults.TransportFaultType) {
              throw (com.ibm.tws.ws.faults.TWS_Faults.TransportFaultType) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.tws.ws.faults.TWS_Faults.SecurityFaultType) {
              throw (com.ibm.tws.ws.faults.TWS_Faults.SecurityFaultType) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.tws.ws.faults.TWS_Faults.LockingFaultType) {
              throw (com.ibm.tws.ws.faults.TWS_Faults.LockingFaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.ibm.tws.ws.types.TWS_Types.JobStreamInstance[] queryJobStreams(java.lang.String engineName, com.ibm.tws.ws.types.TWS_Types.FilterCriteria[] filter) throws java.rmi.RemoteException, com.ibm.tws.ws.faults.TWS_Faults.InvalidArgumentsFaultType, com.ibm.tws.ws.faults.TWS_Faults.OperationFailedFaultType, com.ibm.tws.ws.faults.TWS_Faults.ObjectNotFoundFaultType, com.ibm.tws.ws.faults.TWS_Faults.TransportFaultType, com.ibm.tws.ws.faults.TWS_Faults.SecurityFaultType, com.ibm.tws.ws.faults.TWS_Faults.LockingFaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setUsername(StaticConst.username);
        _call.setPassword(StaticConst.password);
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "queryJobStreams"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {engineName, filter});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ibm.tws.ws.types.TWS_Types.JobStreamInstance[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ibm.tws.ws.types.TWS_Types.JobStreamInstance[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.ibm.tws.ws.types.TWS_Types.JobStreamInstance[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.tws.ws.faults.TWS_Faults.InvalidArgumentsFaultType) {
              throw (com.ibm.tws.ws.faults.TWS_Faults.InvalidArgumentsFaultType) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.tws.ws.faults.TWS_Faults.OperationFailedFaultType) {
              throw (com.ibm.tws.ws.faults.TWS_Faults.OperationFailedFaultType) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.tws.ws.faults.TWS_Faults.ObjectNotFoundFaultType) {
              throw (com.ibm.tws.ws.faults.TWS_Faults.ObjectNotFoundFaultType) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.tws.ws.faults.TWS_Faults.TransportFaultType) {
              throw (com.ibm.tws.ws.faults.TWS_Faults.TransportFaultType) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.tws.ws.faults.TWS_Faults.SecurityFaultType) {
              throw (com.ibm.tws.ws.faults.TWS_Faults.SecurityFaultType) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.tws.ws.faults.TWS_Faults.LockingFaultType) {
              throw (com.ibm.tws.ws.faults.TWS_Faults.LockingFaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.ibm.tws.ws.types.TWS_Types.JobInstance[] queryJobs(java.lang.String engineName, com.ibm.tws.ws.types.TWS_Types.FilterCriteria[] filter) throws java.rmi.RemoteException, com.ibm.tws.ws.faults.TWS_Faults.InvalidArgumentsFaultType, com.ibm.tws.ws.faults.TWS_Faults.OperationFailedFaultType, com.ibm.tws.ws.faults.TWS_Faults.ObjectNotFoundFaultType, com.ibm.tws.ws.faults.TWS_Faults.TransportFaultType, com.ibm.tws.ws.faults.TWS_Faults.SecurityFaultType, com.ibm.tws.ws.faults.TWS_Faults.LockingFaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        
        _call.setUsername(StaticConst.username);
        _call.setPassword(StaticConst.password);
        
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://services.ws.tws.ibm.com/TWS-Scheduling", "queryJobs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {engineName, filter});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.ibm.tws.ws.types.TWS_Types.JobInstance[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.ibm.tws.ws.types.TWS_Types.JobInstance[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.ibm.tws.ws.types.TWS_Types.JobInstance[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.tws.ws.faults.TWS_Faults.InvalidArgumentsFaultType) {
              throw (com.ibm.tws.ws.faults.TWS_Faults.InvalidArgumentsFaultType) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.tws.ws.faults.TWS_Faults.OperationFailedFaultType) {
              throw (com.ibm.tws.ws.faults.TWS_Faults.OperationFailedFaultType) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.tws.ws.faults.TWS_Faults.ObjectNotFoundFaultType) {
              throw (com.ibm.tws.ws.faults.TWS_Faults.ObjectNotFoundFaultType) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.tws.ws.faults.TWS_Faults.TransportFaultType) {
              throw (com.ibm.tws.ws.faults.TWS_Faults.TransportFaultType) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.tws.ws.faults.TWS_Faults.SecurityFaultType) {
              throw (com.ibm.tws.ws.faults.TWS_Faults.SecurityFaultType) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.ibm.tws.ws.faults.TWS_Faults.LockingFaultType) {
              throw (com.ibm.tws.ws.faults.TWS_Faults.LockingFaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
