/**
 * ZOSJob.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.tws.ws.types.TWS_Types;

public class ZOSJob  implements java.io.Serializable {
    private java.lang.String action;

    private int jobNumber;

    private java.lang.String workstationName;

    private java.lang.String textDescription;

    private java.lang.String jobName;

    private int parallelServer;

    private long duration;

    private java.lang.String autoSubmit;

    private java.lang.String timeDependent;

    private java.lang.String centralizedScript;

    private java.util.Calendar inputArrivalTime;

    private int r1;

    private int r2;

    private java.lang.String internalStatus;

    public ZOSJob() {
    }

    public ZOSJob(
           java.lang.String action,
           int jobNumber,
           java.lang.String workstationName,
           java.lang.String textDescription,
           java.lang.String jobName,
           int parallelServer,
           long duration,
           java.lang.String autoSubmit,
           java.lang.String timeDependent,
           java.lang.String centralizedScript,
           java.util.Calendar inputArrivalTime,
           int r1,
           int r2,
           java.lang.String internalStatus) {
           this.action = action;
           this.jobNumber = jobNumber;
           this.workstationName = workstationName;
           this.textDescription = textDescription;
           this.jobName = jobName;
           this.parallelServer = parallelServer;
           this.duration = duration;
           this.autoSubmit = autoSubmit;
           this.timeDependent = timeDependent;
           this.centralizedScript = centralizedScript;
           this.inputArrivalTime = inputArrivalTime;
           this.r1 = r1;
           this.r2 = r2;
           this.internalStatus = internalStatus;
    }


    /**
     * Gets the action value for this ZOSJob.
     * 
     * @return action
     */
    public java.lang.String getAction() {
        return action;
    }


    /**
     * Sets the action value for this ZOSJob.
     * 
     * @param action
     */
    public void setAction(java.lang.String action) {
        this.action = action;
    }


    /**
     * Gets the jobNumber value for this ZOSJob.
     * 
     * @return jobNumber
     */
    public int getJobNumber() {
        return jobNumber;
    }


    /**
     * Sets the jobNumber value for this ZOSJob.
     * 
     * @param jobNumber
     */
    public void setJobNumber(int jobNumber) {
        this.jobNumber = jobNumber;
    }


    /**
     * Gets the workstationName value for this ZOSJob.
     * 
     * @return workstationName
     */
    public java.lang.String getWorkstationName() {
        return workstationName;
    }


    /**
     * Sets the workstationName value for this ZOSJob.
     * 
     * @param workstationName
     */
    public void setWorkstationName(java.lang.String workstationName) {
        this.workstationName = workstationName;
    }


    /**
     * Gets the textDescription value for this ZOSJob.
     * 
     * @return textDescription
     */
    public java.lang.String getTextDescription() {
        return textDescription;
    }


    /**
     * Sets the textDescription value for this ZOSJob.
     * 
     * @param textDescription
     */
    public void setTextDescription(java.lang.String textDescription) {
        this.textDescription = textDescription;
    }


    /**
     * Gets the jobName value for this ZOSJob.
     * 
     * @return jobName
     */
    public java.lang.String getJobName() {
        return jobName;
    }


    /**
     * Sets the jobName value for this ZOSJob.
     * 
     * @param jobName
     */
    public void setJobName(java.lang.String jobName) {
        this.jobName = jobName;
    }


    /**
     * Gets the parallelServer value for this ZOSJob.
     * 
     * @return parallelServer
     */
    public int getParallelServer() {
        return parallelServer;
    }


    /**
     * Sets the parallelServer value for this ZOSJob.
     * 
     * @param parallelServer
     */
    public void setParallelServer(int parallelServer) {
        this.parallelServer = parallelServer;
    }


    /**
     * Gets the duration value for this ZOSJob.
     * 
     * @return duration
     */
    public long getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this ZOSJob.
     * 
     * @param duration
     */
    public void setDuration(long duration) {
        this.duration = duration;
    }


    /**
     * Gets the autoSubmit value for this ZOSJob.
     * 
     * @return autoSubmit
     */
    public java.lang.String getAutoSubmit() {
        return autoSubmit;
    }


    /**
     * Sets the autoSubmit value for this ZOSJob.
     * 
     * @param autoSubmit
     */
    public void setAutoSubmit(java.lang.String autoSubmit) {
        this.autoSubmit = autoSubmit;
    }


    /**
     * Gets the timeDependent value for this ZOSJob.
     * 
     * @return timeDependent
     */
    public java.lang.String getTimeDependent() {
        return timeDependent;
    }


    /**
     * Sets the timeDependent value for this ZOSJob.
     * 
     * @param timeDependent
     */
    public void setTimeDependent(java.lang.String timeDependent) {
        this.timeDependent = timeDependent;
    }


    /**
     * Gets the centralizedScript value for this ZOSJob.
     * 
     * @return centralizedScript
     */
    public java.lang.String getCentralizedScript() {
        return centralizedScript;
    }


    /**
     * Sets the centralizedScript value for this ZOSJob.
     * 
     * @param centralizedScript
     */
    public void setCentralizedScript(java.lang.String centralizedScript) {
        this.centralizedScript = centralizedScript;
    }


    /**
     * Gets the inputArrivalTime value for this ZOSJob.
     * 
     * @return inputArrivalTime
     */
    public java.util.Calendar getInputArrivalTime() {
        return inputArrivalTime;
    }


    /**
     * Sets the inputArrivalTime value for this ZOSJob.
     * 
     * @param inputArrivalTime
     */
    public void setInputArrivalTime(java.util.Calendar inputArrivalTime) {
        this.inputArrivalTime = inputArrivalTime;
    }


    /**
     * Gets the r1 value for this ZOSJob.
     * 
     * @return r1
     */
    public int getR1() {
        return r1;
    }


    /**
     * Sets the r1 value for this ZOSJob.
     * 
     * @param r1
     */
    public void setR1(int r1) {
        this.r1 = r1;
    }


    /**
     * Gets the r2 value for this ZOSJob.
     * 
     * @return r2
     */
    public int getR2() {
        return r2;
    }


    /**
     * Sets the r2 value for this ZOSJob.
     * 
     * @param r2
     */
    public void setR2(int r2) {
        this.r2 = r2;
    }


    /**
     * Gets the internalStatus value for this ZOSJob.
     * 
     * @return internalStatus
     */
    public java.lang.String getInternalStatus() {
        return internalStatus;
    }


    /**
     * Sets the internalStatus value for this ZOSJob.
     * 
     * @param internalStatus
     */
    public void setInternalStatus(java.lang.String internalStatus) {
        this.internalStatus = internalStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZOSJob)) return false;
        ZOSJob other = (ZOSJob) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction()))) &&
            this.jobNumber == other.getJobNumber() &&
            ((this.workstationName==null && other.getWorkstationName()==null) || 
             (this.workstationName!=null &&
              this.workstationName.equals(other.getWorkstationName()))) &&
            ((this.textDescription==null && other.getTextDescription()==null) || 
             (this.textDescription!=null &&
              this.textDescription.equals(other.getTextDescription()))) &&
            ((this.jobName==null && other.getJobName()==null) || 
             (this.jobName!=null &&
              this.jobName.equals(other.getJobName()))) &&
            this.parallelServer == other.getParallelServer() &&
            this.duration == other.getDuration() &&
            ((this.autoSubmit==null && other.getAutoSubmit()==null) || 
             (this.autoSubmit!=null &&
              this.autoSubmit.equals(other.getAutoSubmit()))) &&
            ((this.timeDependent==null && other.getTimeDependent()==null) || 
             (this.timeDependent!=null &&
              this.timeDependent.equals(other.getTimeDependent()))) &&
            ((this.centralizedScript==null && other.getCentralizedScript()==null) || 
             (this.centralizedScript!=null &&
              this.centralizedScript.equals(other.getCentralizedScript()))) &&
            ((this.inputArrivalTime==null && other.getInputArrivalTime()==null) || 
             (this.inputArrivalTime!=null &&
              this.inputArrivalTime.equals(other.getInputArrivalTime()))) &&
            this.r1 == other.getR1() &&
            this.r2 == other.getR2() &&
            ((this.internalStatus==null && other.getInternalStatus()==null) || 
             (this.internalStatus!=null &&
              this.internalStatus.equals(other.getInternalStatus())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        _hashCode += getJobNumber();
        if (getWorkstationName() != null) {
            _hashCode += getWorkstationName().hashCode();
        }
        if (getTextDescription() != null) {
            _hashCode += getTextDescription().hashCode();
        }
        if (getJobName() != null) {
            _hashCode += getJobName().hashCode();
        }
        _hashCode += getParallelServer();
        _hashCode += new Long(getDuration()).hashCode();
        if (getAutoSubmit() != null) {
            _hashCode += getAutoSubmit().hashCode();
        }
        if (getTimeDependent() != null) {
            _hashCode += getTimeDependent().hashCode();
        }
        if (getCentralizedScript() != null) {
            _hashCode += getCentralizedScript().hashCode();
        }
        if (getInputArrivalTime() != null) {
            _hashCode += getInputArrivalTime().hashCode();
        }
        _hashCode += getR1();
        _hashCode += getR2();
        if (getInternalStatus() != null) {
            _hashCode += getInternalStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZOSJob.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "ZOSJob"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "jobNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workstationName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "workstationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("textDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "textDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "jobName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parallelServer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "parallelServer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoSubmit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "autoSubmit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeDependent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "timeDependent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("centralizedScript");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "centralizedScript"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inputArrivalTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "inputArrivalTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("r1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "R1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("r2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "R2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "internalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
