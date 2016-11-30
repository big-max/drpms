/**
 * JobStreamInstance.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.tws.ws.types.TWS_Types;

public class JobStreamInstance  implements java.io.Serializable {
    private java.lang.String jobStreamId;

    private java.lang.String jobStreamName;

    private java.lang.String aliasJobStreamName;

    private java.lang.String originalJobStreamName;

    private java.lang.String workstationName;

    private java.lang.String status;

    private java.lang.String internalStatus;

    private int limit;

    private int priority;

    private int numberOfJobs;

    private boolean canceled;

    private boolean carriedForward;

    private boolean carryForward;

    private boolean external;

    private boolean lateJobStream;

    private boolean pendingCancellation;

    private boolean released;

    private java.util.Calendar startTime;

    private java.util.Calendar latestStartTime;

    private java.lang.String latestStartAction;

    private java.util.Calendar deadlineTime;

    private java.lang.String occurenceToken;

    private java.lang.String owner;

    private java.lang.String authorityGroup;

    private boolean containingMonitoredJob;

    public JobStreamInstance() {
    }

    public JobStreamInstance(
           java.lang.String jobStreamId,
           java.lang.String jobStreamName,
           java.lang.String aliasJobStreamName,
           java.lang.String originalJobStreamName,
           java.lang.String workstationName,
           java.lang.String status,
           java.lang.String internalStatus,
           int limit,
           int priority,
           int numberOfJobs,
           boolean canceled,
           boolean carriedForward,
           boolean carryForward,
           boolean external,
           boolean lateJobStream,
           boolean pendingCancellation,
           boolean released,
           java.util.Calendar startTime,
           java.util.Calendar latestStartTime,
           java.lang.String latestStartAction,
           java.util.Calendar deadlineTime,
           java.lang.String occurenceToken,
           java.lang.String owner,
           java.lang.String authorityGroup,
           boolean containingMonitoredJob) {
           this.jobStreamId = jobStreamId;
           this.jobStreamName = jobStreamName;
           this.aliasJobStreamName = aliasJobStreamName;
           this.originalJobStreamName = originalJobStreamName;
           this.workstationName = workstationName;
           this.status = status;
           this.internalStatus = internalStatus;
           this.limit = limit;
           this.priority = priority;
           this.numberOfJobs = numberOfJobs;
           this.canceled = canceled;
           this.carriedForward = carriedForward;
           this.carryForward = carryForward;
           this.external = external;
           this.lateJobStream = lateJobStream;
           this.pendingCancellation = pendingCancellation;
           this.released = released;
           this.startTime = startTime;
           this.latestStartTime = latestStartTime;
           this.latestStartAction = latestStartAction;
           this.deadlineTime = deadlineTime;
           this.occurenceToken = occurenceToken;
           this.owner = owner;
           this.authorityGroup = authorityGroup;
           this.containingMonitoredJob = containingMonitoredJob;
    }


    /**
     * Gets the jobStreamId value for this JobStreamInstance.
     * 
     * @return jobStreamId
     */
    public java.lang.String getJobStreamId() {
        return jobStreamId;
    }


    /**
     * Sets the jobStreamId value for this JobStreamInstance.
     * 
     * @param jobStreamId
     */
    public void setJobStreamId(java.lang.String jobStreamId) {
        this.jobStreamId = jobStreamId;
    }


    /**
     * Gets the jobStreamName value for this JobStreamInstance.
     * 
     * @return jobStreamName
     */
    public java.lang.String getJobStreamName() {
        return jobStreamName;
    }


    /**
     * Sets the jobStreamName value for this JobStreamInstance.
     * 
     * @param jobStreamName
     */
    public void setJobStreamName(java.lang.String jobStreamName) {
        this.jobStreamName = jobStreamName;
    }


    /**
     * Gets the aliasJobStreamName value for this JobStreamInstance.
     * 
     * @return aliasJobStreamName
     */
    public java.lang.String getAliasJobStreamName() {
        return aliasJobStreamName;
    }


    /**
     * Sets the aliasJobStreamName value for this JobStreamInstance.
     * 
     * @param aliasJobStreamName
     */
    public void setAliasJobStreamName(java.lang.String aliasJobStreamName) {
        this.aliasJobStreamName = aliasJobStreamName;
    }


    /**
     * Gets the originalJobStreamName value for this JobStreamInstance.
     * 
     * @return originalJobStreamName
     */
    public java.lang.String getOriginalJobStreamName() {
        return originalJobStreamName;
    }


    /**
     * Sets the originalJobStreamName value for this JobStreamInstance.
     * 
     * @param originalJobStreamName
     */
    public void setOriginalJobStreamName(java.lang.String originalJobStreamName) {
        this.originalJobStreamName = originalJobStreamName;
    }


    /**
     * Gets the workstationName value for this JobStreamInstance.
     * 
     * @return workstationName
     */
    public java.lang.String getWorkstationName() {
        return workstationName;
    }


    /**
     * Sets the workstationName value for this JobStreamInstance.
     * 
     * @param workstationName
     */
    public void setWorkstationName(java.lang.String workstationName) {
        this.workstationName = workstationName;
    }


    /**
     * Gets the status value for this JobStreamInstance.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this JobStreamInstance.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the internalStatus value for this JobStreamInstance.
     * 
     * @return internalStatus
     */
    public java.lang.String getInternalStatus() {
        return internalStatus;
    }


    /**
     * Sets the internalStatus value for this JobStreamInstance.
     * 
     * @param internalStatus
     */
    public void setInternalStatus(java.lang.String internalStatus) {
        this.internalStatus = internalStatus;
    }


    /**
     * Gets the limit value for this JobStreamInstance.
     * 
     * @return limit
     */
    public int getLimit() {
        return limit;
    }


    /**
     * Sets the limit value for this JobStreamInstance.
     * 
     * @param limit
     */
    public void setLimit(int limit) {
        this.limit = limit;
    }


    /**
     * Gets the priority value for this JobStreamInstance.
     * 
     * @return priority
     */
    public int getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this JobStreamInstance.
     * 
     * @param priority
     */
    public void setPriority(int priority) {
        this.priority = priority;
    }


    /**
     * Gets the numberOfJobs value for this JobStreamInstance.
     * 
     * @return numberOfJobs
     */
    public int getNumberOfJobs() {
        return numberOfJobs;
    }


    /**
     * Sets the numberOfJobs value for this JobStreamInstance.
     * 
     * @param numberOfJobs
     */
    public void setNumberOfJobs(int numberOfJobs) {
        this.numberOfJobs = numberOfJobs;
    }


    /**
     * Gets the canceled value for this JobStreamInstance.
     * 
     * @return canceled
     */
    public boolean isCanceled() {
        return canceled;
    }


    /**
     * Sets the canceled value for this JobStreamInstance.
     * 
     * @param canceled
     */
    public void setCanceled(boolean canceled) {
        this.canceled = canceled;
    }


    /**
     * Gets the carriedForward value for this JobStreamInstance.
     * 
     * @return carriedForward
     */
    public boolean isCarriedForward() {
        return carriedForward;
    }


    /**
     * Sets the carriedForward value for this JobStreamInstance.
     * 
     * @param carriedForward
     */
    public void setCarriedForward(boolean carriedForward) {
        this.carriedForward = carriedForward;
    }


    /**
     * Gets the carryForward value for this JobStreamInstance.
     * 
     * @return carryForward
     */
    public boolean isCarryForward() {
        return carryForward;
    }


    /**
     * Sets the carryForward value for this JobStreamInstance.
     * 
     * @param carryForward
     */
    public void setCarryForward(boolean carryForward) {
        this.carryForward = carryForward;
    }


    /**
     * Gets the external value for this JobStreamInstance.
     * 
     * @return external
     */
    public boolean isExternal() {
        return external;
    }


    /**
     * Sets the external value for this JobStreamInstance.
     * 
     * @param external
     */
    public void setExternal(boolean external) {
        this.external = external;
    }


    /**
     * Gets the lateJobStream value for this JobStreamInstance.
     * 
     * @return lateJobStream
     */
    public boolean isLateJobStream() {
        return lateJobStream;
    }


    /**
     * Sets the lateJobStream value for this JobStreamInstance.
     * 
     * @param lateJobStream
     */
    public void setLateJobStream(boolean lateJobStream) {
        this.lateJobStream = lateJobStream;
    }


    /**
     * Gets the pendingCancellation value for this JobStreamInstance.
     * 
     * @return pendingCancellation
     */
    public boolean isPendingCancellation() {
        return pendingCancellation;
    }


    /**
     * Sets the pendingCancellation value for this JobStreamInstance.
     * 
     * @param pendingCancellation
     */
    public void setPendingCancellation(boolean pendingCancellation) {
        this.pendingCancellation = pendingCancellation;
    }


    /**
     * Gets the released value for this JobStreamInstance.
     * 
     * @return released
     */
    public boolean isReleased() {
        return released;
    }


    /**
     * Sets the released value for this JobStreamInstance.
     * 
     * @param released
     */
    public void setReleased(boolean released) {
        this.released = released;
    }


    /**
     * Gets the startTime value for this JobStreamInstance.
     * 
     * @return startTime
     */
    public java.util.Calendar getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this JobStreamInstance.
     * 
     * @param startTime
     */
    public void setStartTime(java.util.Calendar startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the latestStartTime value for this JobStreamInstance.
     * 
     * @return latestStartTime
     */
    public java.util.Calendar getLatestStartTime() {
        return latestStartTime;
    }


    /**
     * Sets the latestStartTime value for this JobStreamInstance.
     * 
     * @param latestStartTime
     */
    public void setLatestStartTime(java.util.Calendar latestStartTime) {
        this.latestStartTime = latestStartTime;
    }


    /**
     * Gets the latestStartAction value for this JobStreamInstance.
     * 
     * @return latestStartAction
     */
    public java.lang.String getLatestStartAction() {
        return latestStartAction;
    }


    /**
     * Sets the latestStartAction value for this JobStreamInstance.
     * 
     * @param latestStartAction
     */
    public void setLatestStartAction(java.lang.String latestStartAction) {
        this.latestStartAction = latestStartAction;
    }


    /**
     * Gets the deadlineTime value for this JobStreamInstance.
     * 
     * @return deadlineTime
     */
    public java.util.Calendar getDeadlineTime() {
        return deadlineTime;
    }


    /**
     * Sets the deadlineTime value for this JobStreamInstance.
     * 
     * @param deadlineTime
     */
    public void setDeadlineTime(java.util.Calendar deadlineTime) {
        this.deadlineTime = deadlineTime;
    }


    /**
     * Gets the occurenceToken value for this JobStreamInstance.
     * 
     * @return occurenceToken
     */
    public java.lang.String getOccurenceToken() {
        return occurenceToken;
    }


    /**
     * Sets the occurenceToken value for this JobStreamInstance.
     * 
     * @param occurenceToken
     */
    public void setOccurenceToken(java.lang.String occurenceToken) {
        this.occurenceToken = occurenceToken;
    }


    /**
     * Gets the owner value for this JobStreamInstance.
     * 
     * @return owner
     */
    public java.lang.String getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this JobStreamInstance.
     * 
     * @param owner
     */
    public void setOwner(java.lang.String owner) {
        this.owner = owner;
    }


    /**
     * Gets the authorityGroup value for this JobStreamInstance.
     * 
     * @return authorityGroup
     */
    public java.lang.String getAuthorityGroup() {
        return authorityGroup;
    }


    /**
     * Sets the authorityGroup value for this JobStreamInstance.
     * 
     * @param authorityGroup
     */
    public void setAuthorityGroup(java.lang.String authorityGroup) {
        this.authorityGroup = authorityGroup;
    }


    /**
     * Gets the containingMonitoredJob value for this JobStreamInstance.
     * 
     * @return containingMonitoredJob
     */
    public boolean isContainingMonitoredJob() {
        return containingMonitoredJob;
    }


    /**
     * Sets the containingMonitoredJob value for this JobStreamInstance.
     * 
     * @param containingMonitoredJob
     */
    public void setContainingMonitoredJob(boolean containingMonitoredJob) {
        this.containingMonitoredJob = containingMonitoredJob;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof JobStreamInstance)) return false;
        JobStreamInstance other = (JobStreamInstance) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.jobStreamId==null && other.getJobStreamId()==null) || 
             (this.jobStreamId!=null &&
              this.jobStreamId.equals(other.getJobStreamId()))) &&
            ((this.jobStreamName==null && other.getJobStreamName()==null) || 
             (this.jobStreamName!=null &&
              this.jobStreamName.equals(other.getJobStreamName()))) &&
            ((this.aliasJobStreamName==null && other.getAliasJobStreamName()==null) || 
             (this.aliasJobStreamName!=null &&
              this.aliasJobStreamName.equals(other.getAliasJobStreamName()))) &&
            ((this.originalJobStreamName==null && other.getOriginalJobStreamName()==null) || 
             (this.originalJobStreamName!=null &&
              this.originalJobStreamName.equals(other.getOriginalJobStreamName()))) &&
            ((this.workstationName==null && other.getWorkstationName()==null) || 
             (this.workstationName!=null &&
              this.workstationName.equals(other.getWorkstationName()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.internalStatus==null && other.getInternalStatus()==null) || 
             (this.internalStatus!=null &&
              this.internalStatus.equals(other.getInternalStatus()))) &&
            this.limit == other.getLimit() &&
            this.priority == other.getPriority() &&
            this.numberOfJobs == other.getNumberOfJobs() &&
            this.canceled == other.isCanceled() &&
            this.carriedForward == other.isCarriedForward() &&
            this.carryForward == other.isCarryForward() &&
            this.external == other.isExternal() &&
            this.lateJobStream == other.isLateJobStream() &&
            this.pendingCancellation == other.isPendingCancellation() &&
            this.released == other.isReleased() &&
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
            ((this.occurenceToken==null && other.getOccurenceToken()==null) || 
             (this.occurenceToken!=null &&
              this.occurenceToken.equals(other.getOccurenceToken()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.authorityGroup==null && other.getAuthorityGroup()==null) || 
             (this.authorityGroup!=null &&
              this.authorityGroup.equals(other.getAuthorityGroup()))) &&
            this.containingMonitoredJob == other.isContainingMonitoredJob();
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
        if (getJobStreamId() != null) {
            _hashCode += getJobStreamId().hashCode();
        }
        if (getJobStreamName() != null) {
            _hashCode += getJobStreamName().hashCode();
        }
        if (getAliasJobStreamName() != null) {
            _hashCode += getAliasJobStreamName().hashCode();
        }
        if (getOriginalJobStreamName() != null) {
            _hashCode += getOriginalJobStreamName().hashCode();
        }
        if (getWorkstationName() != null) {
            _hashCode += getWorkstationName().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getInternalStatus() != null) {
            _hashCode += getInternalStatus().hashCode();
        }
        _hashCode += getLimit();
        _hashCode += getPriority();
        _hashCode += getNumberOfJobs();
        _hashCode += (isCanceled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCarriedForward() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCarryForward() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isExternal() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isLateJobStream() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isPendingCancellation() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isReleased() ? Boolean.TRUE : Boolean.FALSE).hashCode();
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
        if (getOccurenceToken() != null) {
            _hashCode += getOccurenceToken().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getAuthorityGroup() != null) {
            _hashCode += getAuthorityGroup().hashCode();
        }
        _hashCode += (isContainingMonitoredJob() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(JobStreamInstance.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "JobStreamInstance"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobStreamId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "jobStreamId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobStreamName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "jobStreamName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aliasJobStreamName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "aliasJobStreamName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalJobStreamName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "originalJobStreamName"));
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
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "internalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "limit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfJobs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "numberOfJobs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canceled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "canceled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carriedForward");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "carriedForward"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carryForward");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "carryForward"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("external");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "external"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lateJobStream");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "lateJobStream"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pendingCancellation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "pendingCancellation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("released");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "released"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("occurenceToken");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "occurenceToken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorityGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "authorityGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("containingMonitoredJob");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "containingMonitoredJob"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
