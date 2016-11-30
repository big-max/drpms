/**
 * JobToSubmit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.tws.ws.types.TWS_Types;

public class JobToSubmit  implements java.io.Serializable {
    private java.lang.String jobName;

    private java.lang.String workstationName;

    private java.lang.String userLogin;

    private java.lang.String taskType;

    private java.lang.String taskString;

    private int priority;

    private boolean command;

    private boolean monitored;

    private boolean requiredConfirmation;

    private java.lang.String recoveryJobName;

    private java.lang.String recoveryJobWorkstationName;

    private java.lang.String recoveryOption;

    private java.lang.String recoveryPromptText;

    private java.lang.String returnCodeMapping;

    private long estimatedDuration;

    private java.util.Calendar startTime;

    private java.util.Calendar latestStartTime;

    private java.lang.String latestStartAction;

    private java.util.Calendar deadlineTime;

    private long repeatInterval;

    public JobToSubmit() {
    }

    public JobToSubmit(
           java.lang.String jobName,
           java.lang.String workstationName,
           java.lang.String userLogin,
           java.lang.String taskType,
           java.lang.String taskString,
           int priority,
           boolean command,
           boolean monitored,
           boolean requiredConfirmation,
           java.lang.String recoveryJobName,
           java.lang.String recoveryJobWorkstationName,
           java.lang.String recoveryOption,
           java.lang.String recoveryPromptText,
           java.lang.String returnCodeMapping,
           long estimatedDuration,
           java.util.Calendar startTime,
           java.util.Calendar latestStartTime,
           java.lang.String latestStartAction,
           java.util.Calendar deadlineTime,
           long repeatInterval) {
           this.jobName = jobName;
           this.workstationName = workstationName;
           this.userLogin = userLogin;
           this.taskType = taskType;
           this.taskString = taskString;
           this.priority = priority;
           this.command = command;
           this.monitored = monitored;
           this.requiredConfirmation = requiredConfirmation;
           this.recoveryJobName = recoveryJobName;
           this.recoveryJobWorkstationName = recoveryJobWorkstationName;
           this.recoveryOption = recoveryOption;
           this.recoveryPromptText = recoveryPromptText;
           this.returnCodeMapping = returnCodeMapping;
           this.estimatedDuration = estimatedDuration;
           this.startTime = startTime;
           this.latestStartTime = latestStartTime;
           this.latestStartAction = latestStartAction;
           this.deadlineTime = deadlineTime;
           this.repeatInterval = repeatInterval;
    }


    /**
     * Gets the jobName value for this JobToSubmit.
     * 
     * @return jobName
     */
    public java.lang.String getJobName() {
        return jobName;
    }


    /**
     * Sets the jobName value for this JobToSubmit.
     * 
     * @param jobName
     */
    public void setJobName(java.lang.String jobName) {
        this.jobName = jobName;
    }


    /**
     * Gets the workstationName value for this JobToSubmit.
     * 
     * @return workstationName
     */
    public java.lang.String getWorkstationName() {
        return workstationName;
    }


    /**
     * Sets the workstationName value for this JobToSubmit.
     * 
     * @param workstationName
     */
    public void setWorkstationName(java.lang.String workstationName) {
        this.workstationName = workstationName;
    }


    /**
     * Gets the userLogin value for this JobToSubmit.
     * 
     * @return userLogin
     */
    public java.lang.String getUserLogin() {
        return userLogin;
    }


    /**
     * Sets the userLogin value for this JobToSubmit.
     * 
     * @param userLogin
     */
    public void setUserLogin(java.lang.String userLogin) {
        this.userLogin = userLogin;
    }


    /**
     * Gets the taskType value for this JobToSubmit.
     * 
     * @return taskType
     */
    public java.lang.String getTaskType() {
        return taskType;
    }


    /**
     * Sets the taskType value for this JobToSubmit.
     * 
     * @param taskType
     */
    public void setTaskType(java.lang.String taskType) {
        this.taskType = taskType;
    }


    /**
     * Gets the taskString value for this JobToSubmit.
     * 
     * @return taskString
     */
    public java.lang.String getTaskString() {
        return taskString;
    }


    /**
     * Sets the taskString value for this JobToSubmit.
     * 
     * @param taskString
     */
    public void setTaskString(java.lang.String taskString) {
        this.taskString = taskString;
    }


    /**
     * Gets the priority value for this JobToSubmit.
     * 
     * @return priority
     */
    public int getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this JobToSubmit.
     * 
     * @param priority
     */
    public void setPriority(int priority) {
        this.priority = priority;
    }


    /**
     * Gets the command value for this JobToSubmit.
     * 
     * @return command
     */
    public boolean isCommand() {
        return command;
    }


    /**
     * Sets the command value for this JobToSubmit.
     * 
     * @param command
     */
    public void setCommand(boolean command) {
        this.command = command;
    }


    /**
     * Gets the monitored value for this JobToSubmit.
     * 
     * @return monitored
     */
    public boolean isMonitored() {
        return monitored;
    }


    /**
     * Sets the monitored value for this JobToSubmit.
     * 
     * @param monitored
     */
    public void setMonitored(boolean monitored) {
        this.monitored = monitored;
    }


    /**
     * Gets the requiredConfirmation value for this JobToSubmit.
     * 
     * @return requiredConfirmation
     */
    public boolean isRequiredConfirmation() {
        return requiredConfirmation;
    }


    /**
     * Sets the requiredConfirmation value for this JobToSubmit.
     * 
     * @param requiredConfirmation
     */
    public void setRequiredConfirmation(boolean requiredConfirmation) {
        this.requiredConfirmation = requiredConfirmation;
    }


    /**
     * Gets the recoveryJobName value for this JobToSubmit.
     * 
     * @return recoveryJobName
     */
    public java.lang.String getRecoveryJobName() {
        return recoveryJobName;
    }


    /**
     * Sets the recoveryJobName value for this JobToSubmit.
     * 
     * @param recoveryJobName
     */
    public void setRecoveryJobName(java.lang.String recoveryJobName) {
        this.recoveryJobName = recoveryJobName;
    }


    /**
     * Gets the recoveryJobWorkstationName value for this JobToSubmit.
     * 
     * @return recoveryJobWorkstationName
     */
    public java.lang.String getRecoveryJobWorkstationName() {
        return recoveryJobWorkstationName;
    }


    /**
     * Sets the recoveryJobWorkstationName value for this JobToSubmit.
     * 
     * @param recoveryJobWorkstationName
     */
    public void setRecoveryJobWorkstationName(java.lang.String recoveryJobWorkstationName) {
        this.recoveryJobWorkstationName = recoveryJobWorkstationName;
    }


    /**
     * Gets the recoveryOption value for this JobToSubmit.
     * 
     * @return recoveryOption
     */
    public java.lang.String getRecoveryOption() {
        return recoveryOption;
    }


    /**
     * Sets the recoveryOption value for this JobToSubmit.
     * 
     * @param recoveryOption
     */
    public void setRecoveryOption(java.lang.String recoveryOption) {
        this.recoveryOption = recoveryOption;
    }


    /**
     * Gets the recoveryPromptText value for this JobToSubmit.
     * 
     * @return recoveryPromptText
     */
    public java.lang.String getRecoveryPromptText() {
        return recoveryPromptText;
    }


    /**
     * Sets the recoveryPromptText value for this JobToSubmit.
     * 
     * @param recoveryPromptText
     */
    public void setRecoveryPromptText(java.lang.String recoveryPromptText) {
        this.recoveryPromptText = recoveryPromptText;
    }


    /**
     * Gets the returnCodeMapping value for this JobToSubmit.
     * 
     * @return returnCodeMapping
     */
    public java.lang.String getReturnCodeMapping() {
        return returnCodeMapping;
    }


    /**
     * Sets the returnCodeMapping value for this JobToSubmit.
     * 
     * @param returnCodeMapping
     */
    public void setReturnCodeMapping(java.lang.String returnCodeMapping) {
        this.returnCodeMapping = returnCodeMapping;
    }


    /**
     * Gets the estimatedDuration value for this JobToSubmit.
     * 
     * @return estimatedDuration
     */
    public long getEstimatedDuration() {
        return estimatedDuration;
    }


    /**
     * Sets the estimatedDuration value for this JobToSubmit.
     * 
     * @param estimatedDuration
     */
    public void setEstimatedDuration(long estimatedDuration) {
        this.estimatedDuration = estimatedDuration;
    }


    /**
     * Gets the startTime value for this JobToSubmit.
     * 
     * @return startTime
     */
    public java.util.Calendar getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this JobToSubmit.
     * 
     * @param startTime
     */
    public void setStartTime(java.util.Calendar startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the latestStartTime value for this JobToSubmit.
     * 
     * @return latestStartTime
     */
    public java.util.Calendar getLatestStartTime() {
        return latestStartTime;
    }


    /**
     * Sets the latestStartTime value for this JobToSubmit.
     * 
     * @param latestStartTime
     */
    public void setLatestStartTime(java.util.Calendar latestStartTime) {
        this.latestStartTime = latestStartTime;
    }


    /**
     * Gets the latestStartAction value for this JobToSubmit.
     * 
     * @return latestStartAction
     */
    public java.lang.String getLatestStartAction() {
        return latestStartAction;
    }


    /**
     * Sets the latestStartAction value for this JobToSubmit.
     * 
     * @param latestStartAction
     */
    public void setLatestStartAction(java.lang.String latestStartAction) {
        this.latestStartAction = latestStartAction;
    }


    /**
     * Gets the deadlineTime value for this JobToSubmit.
     * 
     * @return deadlineTime
     */
    public java.util.Calendar getDeadlineTime() {
        return deadlineTime;
    }


    /**
     * Sets the deadlineTime value for this JobToSubmit.
     * 
     * @param deadlineTime
     */
    public void setDeadlineTime(java.util.Calendar deadlineTime) {
        this.deadlineTime = deadlineTime;
    }


    /**
     * Gets the repeatInterval value for this JobToSubmit.
     * 
     * @return repeatInterval
     */
    public long getRepeatInterval() {
        return repeatInterval;
    }


    /**
     * Sets the repeatInterval value for this JobToSubmit.
     * 
     * @param repeatInterval
     */
    public void setRepeatInterval(long repeatInterval) {
        this.repeatInterval = repeatInterval;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof JobToSubmit)) return false;
        JobToSubmit other = (JobToSubmit) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.jobName==null && other.getJobName()==null) || 
             (this.jobName!=null &&
              this.jobName.equals(other.getJobName()))) &&
            ((this.workstationName==null && other.getWorkstationName()==null) || 
             (this.workstationName!=null &&
              this.workstationName.equals(other.getWorkstationName()))) &&
            ((this.userLogin==null && other.getUserLogin()==null) || 
             (this.userLogin!=null &&
              this.userLogin.equals(other.getUserLogin()))) &&
            ((this.taskType==null && other.getTaskType()==null) || 
             (this.taskType!=null &&
              this.taskType.equals(other.getTaskType()))) &&
            ((this.taskString==null && other.getTaskString()==null) || 
             (this.taskString!=null &&
              this.taskString.equals(other.getTaskString()))) &&
            this.priority == other.getPriority() &&
            this.command == other.isCommand() &&
            this.monitored == other.isMonitored() &&
            this.requiredConfirmation == other.isRequiredConfirmation() &&
            ((this.recoveryJobName==null && other.getRecoveryJobName()==null) || 
             (this.recoveryJobName!=null &&
              this.recoveryJobName.equals(other.getRecoveryJobName()))) &&
            ((this.recoveryJobWorkstationName==null && other.getRecoveryJobWorkstationName()==null) || 
             (this.recoveryJobWorkstationName!=null &&
              this.recoveryJobWorkstationName.equals(other.getRecoveryJobWorkstationName()))) &&
            ((this.recoveryOption==null && other.getRecoveryOption()==null) || 
             (this.recoveryOption!=null &&
              this.recoveryOption.equals(other.getRecoveryOption()))) &&
            ((this.recoveryPromptText==null && other.getRecoveryPromptText()==null) || 
             (this.recoveryPromptText!=null &&
              this.recoveryPromptText.equals(other.getRecoveryPromptText()))) &&
            ((this.returnCodeMapping==null && other.getReturnCodeMapping()==null) || 
             (this.returnCodeMapping!=null &&
              this.returnCodeMapping.equals(other.getReturnCodeMapping()))) &&
            this.estimatedDuration == other.getEstimatedDuration() &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            ((this.latestStartTime==null && other.getLatestStartTime()==null) || 
             (this.latestStartTime!=null &&
              this.latestStartTime.equals(other.getLatestStartTime()))) &&
            ((this.latestStartAction==null && other.getLatestStartAction()==null) || 
             (this.latestStartAction!=null &&
              this.latestStartAction.equals(other.getLatestStartAction()))) &&
            ((this.deadlineTime==null && other.getDeadlineTime()==null) || 
             (this.deadlineTime!=null &&
              this.deadlineTime.equals(other.getDeadlineTime()))) &&
            this.repeatInterval == other.getRepeatInterval();
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
        if (getJobName() != null) {
            _hashCode += getJobName().hashCode();
        }
        if (getWorkstationName() != null) {
            _hashCode += getWorkstationName().hashCode();
        }
        if (getUserLogin() != null) {
            _hashCode += getUserLogin().hashCode();
        }
        if (getTaskType() != null) {
            _hashCode += getTaskType().hashCode();
        }
        if (getTaskString() != null) {
            _hashCode += getTaskString().hashCode();
        }
        _hashCode += getPriority();
        _hashCode += (isCommand() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isMonitored() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isRequiredConfirmation() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getRecoveryJobName() != null) {
            _hashCode += getRecoveryJobName().hashCode();
        }
        if (getRecoveryJobWorkstationName() != null) {
            _hashCode += getRecoveryJobWorkstationName().hashCode();
        }
        if (getRecoveryOption() != null) {
            _hashCode += getRecoveryOption().hashCode();
        }
        if (getRecoveryPromptText() != null) {
            _hashCode += getRecoveryPromptText().hashCode();
        }
        if (getReturnCodeMapping() != null) {
            _hashCode += getReturnCodeMapping().hashCode();
        }
        _hashCode += new Long(getEstimatedDuration()).hashCode();
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        if (getLatestStartTime() != null) {
            _hashCode += getLatestStartTime().hashCode();
        }
        if (getLatestStartAction() != null) {
            _hashCode += getLatestStartAction().hashCode();
        }
        if (getDeadlineTime() != null) {
            _hashCode += getDeadlineTime().hashCode();
        }
        _hashCode += new Long(getRepeatInterval()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(JobToSubmit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "JobToSubmit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "jobName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workstationName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "workstationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userLogin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "userLogin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "taskType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskString");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "taskString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("command");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "command"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monitored");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "monitored"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requiredConfirmation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "requiredConfirmation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recoveryJobName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "recoveryJobName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recoveryJobWorkstationName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "recoveryJobWorkstationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recoveryOption");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "recoveryOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recoveryPromptText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "recoveryPromptText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnCodeMapping");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "returnCodeMapping"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "estimatedDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "startTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latestStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "latestStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latestStartAction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "latestStartAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deadlineTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "deadlineTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repeatInterval");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "repeatInterval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
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
