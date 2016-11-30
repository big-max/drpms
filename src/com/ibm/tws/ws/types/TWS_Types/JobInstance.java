/**
 * JobInstance.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ibm.tws.ws.types.TWS_Types;

import java.util.Date;

public class JobInstance  implements java.io.Serializable {
    private java.lang.String jobId;

    private java.lang.String jobName;

    private java.lang.String workstationName;

    private java.lang.String jobStreamName;

    private java.lang.String jobStreamWorkstationName;

    private int jobNumber;

    private int priority;

    private java.lang.String status;

    private java.lang.String internalStatus;

    private boolean requiredConfirmation;

    private boolean aliased;

    private boolean canceled;

    private boolean every;

    private boolean everyRerun;

    private boolean external;

    private boolean jobLate;

    private boolean pendingCacellation;

    private boolean recoveryRerunJob;

    private boolean released;

    private boolean rerunJob;

    private boolean running;

    private java.util.Calendar startTime;

    private java.util.Calendar latestStartTime;

    private java.lang.String latestStartAction;

    private java.util.Calendar deadlineTime;

    private long repeatRange;

    private java.lang.String occurenceToken;

    private java.lang.String extendedStatus;

    private java.lang.String errorCode;

    private java.lang.String operationCommand;

    private java.lang.String authorityGroup;

    private java.lang.String cleanUpStatus;

    private boolean latestOutPassed;

    private java.util.Calendar latestOut;

    private java.util.Calendar actualArrival;

    private java.util.Calendar actualEnd;

    private java.lang.String jclName;
    
    
    private String startDate;
    private String expectStartDate;
    private Boolean lagtime = false;
    private String username;
    
    public JobInstance() {
    }

    public JobInstance(
           java.lang.String jobId,
           java.lang.String jobName,
           java.lang.String workstationName,
           java.lang.String jobStreamName,
           java.lang.String jobStreamWorkstationName,
           int jobNumber,
           int priority,
           java.lang.String status,
           java.lang.String internalStatus,
           boolean requiredConfirmation,
           boolean aliased,
           boolean canceled,
           boolean every,
           boolean everyRerun,
           boolean external,
           boolean jobLate,
           boolean pendingCacellation,
           boolean recoveryRerunJob,
           boolean released,
           boolean rerunJob,
           boolean running,
           java.util.Calendar startTime,
           java.util.Calendar latestStartTime,
           java.lang.String latestStartAction,
           java.util.Calendar deadlineTime,
           long repeatRange,
           java.lang.String occurenceToken,
           java.lang.String extendedStatus,
           java.lang.String errorCode,
           java.lang.String operationCommand,
           java.lang.String authorityGroup,
           java.lang.String cleanUpStatus,
           boolean latestOutPassed,
           java.util.Calendar latestOut,
           java.util.Calendar actualArrival,
           java.util.Calendar actualEnd,
           java.lang.String jclName) {
           this.jobId = jobId;
           this.jobName = jobName;
           this.workstationName = workstationName;
           this.jobStreamName = jobStreamName;
           this.jobStreamWorkstationName = jobStreamWorkstationName;
           this.jobNumber = jobNumber;
           this.priority = priority;
           this.status = status;
           this.internalStatus = internalStatus;
           this.requiredConfirmation = requiredConfirmation;
           this.aliased = aliased;
           this.canceled = canceled;
           this.every = every;
           this.everyRerun = everyRerun;
           this.external = external;
           this.jobLate = jobLate;
           this.pendingCacellation = pendingCacellation;
           this.recoveryRerunJob = recoveryRerunJob;
           this.released = released;
           this.rerunJob = rerunJob;
           this.running = running;
           this.startTime = startTime;
           this.latestStartTime = latestStartTime;
           this.latestStartAction = latestStartAction;
           this.deadlineTime = deadlineTime;
           this.repeatRange = repeatRange;
           this.occurenceToken = occurenceToken;
           this.extendedStatus = extendedStatus;
           this.errorCode = errorCode;
           this.operationCommand = operationCommand;
           this.authorityGroup = authorityGroup;
           this.cleanUpStatus = cleanUpStatus;
           this.latestOutPassed = latestOutPassed;
           this.latestOut = latestOut;
           this.actualArrival = actualArrival;
           this.actualEnd = actualEnd;
           this.jclName = jclName;
    }


    /**
     * Gets the jobId value for this JobInstance.
     * 
     * @return jobId
     */
    public java.lang.String getJobId() {
        return jobId;
    }


    /**
     * Sets the jobId value for this JobInstance.
     * 
     * @param jobId
     */
    public void setJobId(java.lang.String jobId) {
        this.jobId = jobId;
    }


    /**
     * Gets the jobName value for this JobInstance.
     * 
     * @return jobName
     */
    public java.lang.String getJobName() {
        return jobName;
    }


    /**
     * Sets the jobName value for this JobInstance.
     * 
     * @param jobName
     */
    public void setJobName(java.lang.String jobName) {
        this.jobName = jobName;
    }


    /**
     * Gets the workstationName value for this JobInstance.
     * 
     * @return workstationName
     */
    public java.lang.String getWorkstationName() {
        return workstationName;
    }


    /**
     * Sets the workstationName value for this JobInstance.
     * 
     * @param workstationName
     */
    public void setWorkstationName(java.lang.String workstationName) {
        this.workstationName = workstationName;
    }


    /**
     * Gets the jobStreamName value for this JobInstance.
     * 
     * @return jobStreamName
     */
    public java.lang.String getJobStreamName() {
        return jobStreamName;
    }


    /**
     * Sets the jobStreamName value for this JobInstance.
     * 
     * @param jobStreamName
     */
    public void setJobStreamName(java.lang.String jobStreamName) {
        this.jobStreamName = jobStreamName;
    }


    /**
     * Gets the jobStreamWorkstationName value for this JobInstance.
     * 
     * @return jobStreamWorkstationName
     */
    public java.lang.String getJobStreamWorkstationName() {
        return jobStreamWorkstationName;
    }


    /**
     * Sets the jobStreamWorkstationName value for this JobInstance.
     * 
     * @param jobStreamWorkstationName
     */
    public void setJobStreamWorkstationName(java.lang.String jobStreamWorkstationName) {
        this.jobStreamWorkstationName = jobStreamWorkstationName;
    }


    /**
     * Gets the jobNumber value for this JobInstance.
     * 
     * @return jobNumber
     */
    public int getJobNumber() {
        return jobNumber;
    }


    /**
     * Sets the jobNumber value for this JobInstance.
     * 
     * @param jobNumber
     */
    public void setJobNumber(int jobNumber) {
        this.jobNumber = jobNumber;
    }


    /**
     * Gets the priority value for this JobInstance.
     * 
     * @return priority
     */
    public int getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this JobInstance.
     * 
     * @param priority
     */
    public void setPriority(int priority) {
        this.priority = priority;
    }


    /**
     * Gets the status value for this JobInstance.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this JobInstance.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the internalStatus value for this JobInstance.
     * 
     * @return internalStatus
     */
    public java.lang.String getInternalStatus() {
        return internalStatus;
    }


    /**
     * Sets the internalStatus value for this JobInstance.
     * 
     * @param internalStatus
     */
    public void setInternalStatus(java.lang.String internalStatus) {
        this.internalStatus = internalStatus;
    }


    /**
     * Gets the requiredConfirmation value for this JobInstance.
     * 
     * @return requiredConfirmation
     */
    public boolean isRequiredConfirmation() {
        return requiredConfirmation;
    }


    /**
     * Sets the requiredConfirmation value for this JobInstance.
     * 
     * @param requiredConfirmation
     */
    public void setRequiredConfirmation(boolean requiredConfirmation) {
        this.requiredConfirmation = requiredConfirmation;
    }


    /**
     * Gets the aliased value for this JobInstance.
     * 
     * @return aliased
     */
    public boolean isAliased() {
        return aliased;
    }


    /**
     * Sets the aliased value for this JobInstance.
     * 
     * @param aliased
     */
    public void setAliased(boolean aliased) {
        this.aliased = aliased;
    }


    /**
     * Gets the canceled value for this JobInstance.
     * 
     * @return canceled
     */
    public boolean isCanceled() {
        return canceled;
    }


    /**
     * Sets the canceled value for this JobInstance.
     * 
     * @param canceled
     */
    public void setCanceled(boolean canceled) {
        this.canceled = canceled;
    }


    /**
     * Gets the every value for this JobInstance.
     * 
     * @return every
     */
    public boolean isEvery() {
        return every;
    }


    /**
     * Sets the every value for this JobInstance.
     * 
     * @param every
     */
    public void setEvery(boolean every) {
        this.every = every;
    }


    /**
     * Gets the everyRerun value for this JobInstance.
     * 
     * @return everyRerun
     */
    public boolean isEveryRerun() {
        return everyRerun;
    }


    /**
     * Sets the everyRerun value for this JobInstance.
     * 
     * @param everyRerun
     */
    public void setEveryRerun(boolean everyRerun) {
        this.everyRerun = everyRerun;
    }


    /**
     * Gets the external value for this JobInstance.
     * 
     * @return external
     */
    public boolean isExternal() {
        return external;
    }


    /**
     * Sets the external value for this JobInstance.
     * 
     * @param external
     */
    public void setExternal(boolean external) {
        this.external = external;
    }


    /**
     * Gets the jobLate value for this JobInstance.
     * 
     * @return jobLate
     */
    public boolean isJobLate() {
        return jobLate;
    }


    /**
     * Sets the jobLate value for this JobInstance.
     * 
     * @param jobLate
     */
    public void setJobLate(boolean jobLate) {
        this.jobLate = jobLate;
    }


    /**
     * Gets the pendingCacellation value for this JobInstance.
     * 
     * @return pendingCacellation
     */
    public boolean isPendingCacellation() {
        return pendingCacellation;
    }


    /**
     * Sets the pendingCacellation value for this JobInstance.
     * 
     * @param pendingCacellation
     */
    public void setPendingCacellation(boolean pendingCacellation) {
        this.pendingCacellation = pendingCacellation;
    }


    /**
     * Gets the recoveryRerunJob value for this JobInstance.
     * 
     * @return recoveryRerunJob
     */
    public boolean isRecoveryRerunJob() {
        return recoveryRerunJob;
    }


    /**
     * Sets the recoveryRerunJob value for this JobInstance.
     * 
     * @param recoveryRerunJob
     */
    public void setRecoveryRerunJob(boolean recoveryRerunJob) {
        this.recoveryRerunJob = recoveryRerunJob;
    }


    /**
     * Gets the released value for this JobInstance.
     * 
     * @return released
     */
    public boolean isReleased() {
        return released;
    }


    /**
     * Sets the released value for this JobInstance.
     * 
     * @param released
     */
    public void setReleased(boolean released) {
        this.released = released;
    }


    /**
     * Gets the rerunJob value for this JobInstance.
     * 
     * @return rerunJob
     */
    public boolean isRerunJob() {
        return rerunJob;
    }


    /**
     * Sets the rerunJob value for this JobInstance.
     * 
     * @param rerunJob
     */
    public void setRerunJob(boolean rerunJob) {
        this.rerunJob = rerunJob;
    }


    /**
     * Gets the running value for this JobInstance.
     * 
     * @return running
     */
    public boolean isRunning() {
        return running;
    }


    /**
     * Sets the running value for this JobInstance.
     * 
     * @param running
     */
    public void setRunning(boolean running) {
        this.running = running;
    }


    /**
     * Gets the startTime value for this JobInstance.
     * 
     * @return startTime
     */
    public java.util.Calendar getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this JobInstance.
     * 
     * @param startTime
     */
    public void setStartTime(java.util.Calendar startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the latestStartTime value for this JobInstance.
     * 
     * @return latestStartTime
     */
    public java.util.Calendar getLatestStartTime() {
        return latestStartTime;
    }


    /**
     * Sets the latestStartTime value for this JobInstance.
     * 
     * @param latestStartTime
     */
    public void setLatestStartTime(java.util.Calendar latestStartTime) {
        this.latestStartTime = latestStartTime;
    }


    /**
     * Gets the latestStartAction value for this JobInstance.
     * 
     * @return latestStartAction
     */
    public java.lang.String getLatestStartAction() {
        return latestStartAction;
    }


    /**
     * Sets the latestStartAction value for this JobInstance.
     * 
     * @param latestStartAction
     */
    public void setLatestStartAction(java.lang.String latestStartAction) {
        this.latestStartAction = latestStartAction;
    }


    /**
     * Gets the deadlineTime value for this JobInstance.
     * 
     * @return deadlineTime
     */
    public java.util.Calendar getDeadlineTime() {
        return deadlineTime;
    }


    /**
     * Sets the deadlineTime value for this JobInstance.
     * 
     * @param deadlineTime
     */
    public void setDeadlineTime(java.util.Calendar deadlineTime) {
        this.deadlineTime = deadlineTime;
    }


    /**
     * Gets the repeatRange value for this JobInstance.
     * 
     * @return repeatRange
     */
    public long getRepeatRange() {
        return repeatRange;
    }


    /**
     * Sets the repeatRange value for this JobInstance.
     * 
     * @param repeatRange
     */
    public void setRepeatRange(long repeatRange) {
        this.repeatRange = repeatRange;
    }


    /**
     * Gets the occurenceToken value for this JobInstance.
     * 
     * @return occurenceToken
     */
    public java.lang.String getOccurenceToken() {
        return occurenceToken;
    }


    /**
     * Sets the occurenceToken value for this JobInstance.
     * 
     * @param occurenceToken
     */
    public void setOccurenceToken(java.lang.String occurenceToken) {
        this.occurenceToken = occurenceToken;
    }


    /**
     * Gets the extendedStatus value for this JobInstance.
     * 
     * @return extendedStatus
     */
    public java.lang.String getExtendedStatus() {
        return extendedStatus;
    }


    /**
     * Sets the extendedStatus value for this JobInstance.
     * 
     * @param extendedStatus
     */
    public void setExtendedStatus(java.lang.String extendedStatus) {
        this.extendedStatus = extendedStatus;
    }


    /**
     * Gets the errorCode value for this JobInstance.
     * 
     * @return errorCode
     */
    public java.lang.String getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this JobInstance.
     * 
     * @param errorCode
     */
    public void setErrorCode(java.lang.String errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the operationCommand value for this JobInstance.
     * 
     * @return operationCommand
     */
    public java.lang.String getOperationCommand() {
        return operationCommand;
    }


    /**
     * Sets the operationCommand value for this JobInstance.
     * 
     * @param operationCommand
     */
    public void setOperationCommand(java.lang.String operationCommand) {
        this.operationCommand = operationCommand;
    }


    /**
     * Gets the authorityGroup value for this JobInstance.
     * 
     * @return authorityGroup
     */
    public java.lang.String getAuthorityGroup() {
        return authorityGroup;
    }


    /**
     * Sets the authorityGroup value for this JobInstance.
     * 
     * @param authorityGroup
     */
    public void setAuthorityGroup(java.lang.String authorityGroup) {
        this.authorityGroup = authorityGroup;
    }


    /**
     * Gets the cleanUpStatus value for this JobInstance.
     * 
     * @return cleanUpStatus
     */
    public java.lang.String getCleanUpStatus() {
        return cleanUpStatus;
    }


    /**
     * Sets the cleanUpStatus value for this JobInstance.
     * 
     * @param cleanUpStatus
     */
    public void setCleanUpStatus(java.lang.String cleanUpStatus) {
        this.cleanUpStatus = cleanUpStatus;
    }


    /**
     * Gets the latestOutPassed value for this JobInstance.
     * 
     * @return latestOutPassed
     */
    public boolean isLatestOutPassed() {
        return latestOutPassed;
    }


    /**
     * Sets the latestOutPassed value for this JobInstance.
     * 
     * @param latestOutPassed
     */
    public void setLatestOutPassed(boolean latestOutPassed) {
        this.latestOutPassed = latestOutPassed;
    }


    /**
     * Gets the latestOut value for this JobInstance.
     * 
     * @return latestOut
     */
    public java.util.Calendar getLatestOut() {
        return latestOut;
    }


    /**
     * Sets the latestOut value for this JobInstance.
     * 
     * @param latestOut
     */
    public void setLatestOut(java.util.Calendar latestOut) {
        this.latestOut = latestOut;
    }


    /**
     * Gets the actualArrival value for this JobInstance.
     * 
     * @return actualArrival
     */
    public java.util.Calendar getActualArrival() {
        return actualArrival;
    }


    /**
     * Sets the actualArrival value for this JobInstance.
     * 
     * @param actualArrival
     */
    public void setActualArrival(java.util.Calendar actualArrival) {
        this.actualArrival = actualArrival;
    }


    /**
     * Gets the actualEnd value for this JobInstance.
     * 
     * @return actualEnd
     */
    public java.util.Calendar getActualEnd() {
        return actualEnd;
    }


    /**
     * Sets the actualEnd value for this JobInstance.
     * 
     * @param actualEnd
     */
    public void setActualEnd(java.util.Calendar actualEnd) {
        this.actualEnd = actualEnd;
    }


    /**
     * Gets the jclName value for this JobInstance.
     * 
     * @return jclName
     */
    public java.lang.String getJclName() {
        return jclName;
    }


    /**
     * Sets the jclName value for this JobInstance.
     * 
     * @param jclName
     */
    public void setJclName(java.lang.String jclName) {
        this.jclName = jclName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof JobInstance)) return false;
        JobInstance other = (JobInstance) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.jobId==null && other.getJobId()==null) || 
             (this.jobId!=null &&
              this.jobId.equals(other.getJobId()))) &&
            ((this.jobName==null && other.getJobName()==null) || 
             (this.jobName!=null &&
              this.jobName.equals(other.getJobName()))) &&
            ((this.workstationName==null && other.getWorkstationName()==null) || 
             (this.workstationName!=null &&
              this.workstationName.equals(other.getWorkstationName()))) &&
            ((this.jobStreamName==null && other.getJobStreamName()==null) || 
             (this.jobStreamName!=null &&
              this.jobStreamName.equals(other.getJobStreamName()))) &&
            ((this.jobStreamWorkstationName==null && other.getJobStreamWorkstationName()==null) || 
             (this.jobStreamWorkstationName!=null &&
              this.jobStreamWorkstationName.equals(other.getJobStreamWorkstationName()))) &&
            this.jobNumber == other.getJobNumber() &&
            this.priority == other.getPriority() &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.internalStatus==null && other.getInternalStatus()==null) || 
             (this.internalStatus!=null &&
              this.internalStatus.equals(other.getInternalStatus()))) &&
            this.requiredConfirmation == other.isRequiredConfirmation() &&
            this.aliased == other.isAliased() &&
            this.canceled == other.isCanceled() &&
            this.every == other.isEvery() &&
            this.everyRerun == other.isEveryRerun() &&
            this.external == other.isExternal() &&
            this.jobLate == other.isJobLate() &&
            this.pendingCacellation == other.isPendingCacellation() &&
            this.recoveryRerunJob == other.isRecoveryRerunJob() &&
            this.released == other.isReleased() &&
            this.rerunJob == other.isRerunJob() &&
            this.running == other.isRunning() &&
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
            this.repeatRange == other.getRepeatRange() &&
            ((this.occurenceToken==null && other.getOccurenceToken()==null) || 
             (this.occurenceToken!=null &&
              this.occurenceToken.equals(other.getOccurenceToken()))) &&
            ((this.extendedStatus==null && other.getExtendedStatus()==null) || 
             (this.extendedStatus!=null &&
              this.extendedStatus.equals(other.getExtendedStatus()))) &&
            ((this.errorCode==null && other.getErrorCode()==null) || 
             (this.errorCode!=null &&
              this.errorCode.equals(other.getErrorCode()))) &&
            ((this.operationCommand==null && other.getOperationCommand()==null) || 
             (this.operationCommand!=null &&
              this.operationCommand.equals(other.getOperationCommand()))) &&
            ((this.authorityGroup==null && other.getAuthorityGroup()==null) || 
             (this.authorityGroup!=null &&
              this.authorityGroup.equals(other.getAuthorityGroup()))) &&
            ((this.cleanUpStatus==null && other.getCleanUpStatus()==null) || 
             (this.cleanUpStatus!=null &&
              this.cleanUpStatus.equals(other.getCleanUpStatus()))) &&
            this.latestOutPassed == other.isLatestOutPassed() &&
            ((this.latestOut==null && other.getLatestOut()==null) || 
             (this.latestOut!=null &&
              this.latestOut.equals(other.getLatestOut()))) &&
            ((this.actualArrival==null && other.getActualArrival()==null) || 
             (this.actualArrival!=null &&
              this.actualArrival.equals(other.getActualArrival()))) &&
            ((this.actualEnd==null && other.getActualEnd()==null) || 
             (this.actualEnd!=null &&
              this.actualEnd.equals(other.getActualEnd()))) &&
            ((this.jclName==null && other.getJclName()==null) || 
             (this.jclName!=null &&
              this.jclName.equals(other.getJclName())));
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
        if (getJobId() != null) {
            _hashCode += getJobId().hashCode();
        }
        if (getJobName() != null) {
            _hashCode += getJobName().hashCode();
        }
        if (getWorkstationName() != null) {
            _hashCode += getWorkstationName().hashCode();
        }
        if (getJobStreamName() != null) {
            _hashCode += getJobStreamName().hashCode();
        }
        if (getJobStreamWorkstationName() != null) {
            _hashCode += getJobStreamWorkstationName().hashCode();
        }
        _hashCode += getJobNumber();
        _hashCode += getPriority();
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getInternalStatus() != null) {
            _hashCode += getInternalStatus().hashCode();
        }
        _hashCode += (isRequiredConfirmation() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isAliased() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCanceled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isEvery() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isEveryRerun() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isExternal() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isJobLate() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isPendingCacellation() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isRecoveryRerunJob() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isReleased() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isRerunJob() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isRunning() ? Boolean.TRUE : Boolean.FALSE).hashCode();
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
        _hashCode += new Long(getRepeatRange()).hashCode();
        if (getOccurenceToken() != null) {
            _hashCode += getOccurenceToken().hashCode();
        }
        if (getExtendedStatus() != null) {
            _hashCode += getExtendedStatus().hashCode();
        }
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        if (getOperationCommand() != null) {
            _hashCode += getOperationCommand().hashCode();
        }
        if (getAuthorityGroup() != null) {
            _hashCode += getAuthorityGroup().hashCode();
        }
        if (getCleanUpStatus() != null) {
            _hashCode += getCleanUpStatus().hashCode();
        }
        _hashCode += (isLatestOutPassed() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getLatestOut() != null) {
            _hashCode += getLatestOut().hashCode();
        }
        if (getActualArrival() != null) {
            _hashCode += getActualArrival().hashCode();
        }
        if (getActualEnd() != null) {
            _hashCode += getActualEnd().hashCode();
        }
        if (getJclName() != null) {
            _hashCode += getJclName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(JobInstance.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "JobInstance"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "jobId"));
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
        elemField.setFieldName("workstationName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "workstationName"));
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
        elemField.setFieldName("jobStreamWorkstationName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "jobStreamWorkstationName"));
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
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
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
        elemField.setFieldName("requiredConfirmation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "requiredConfirmation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aliased");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "aliased"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canceled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "canceled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("every");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "every"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("everyRerun");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "everyRerun"));
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
        elemField.setFieldName("jobLate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "jobLate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pendingCacellation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "pendingCacellation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recoveryRerunJob");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "recoveryRerunJob"));
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
        elemField.setFieldName("rerunJob");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "rerunJob"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("running");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "running"));
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
        elemField.setFieldName("repeatRange");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "repeatRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("occurenceToken");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "occurenceToken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extendedStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "extendedStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "errorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationCommand");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "operationCommand"));
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
        elemField.setFieldName("cleanUpStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "cleanUpStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latestOutPassed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "latestOutPassed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latestOut");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "latestOut"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualArrival");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "actualArrival"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "actualEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jclName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://types.ws.tws.ibm.com/TWS-Types", "jclName"));
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

	
	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getExpectStartDate() {
		return expectStartDate;
	}

	public void setExpectStartDate(String expectStartDate) {
		this.expectStartDate = expectStartDate;
	}

	public Boolean getLagtime() {
		return lagtime;
	}

	public void setLagtime(Boolean lagtime) {
		this.lagtime = lagtime;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}


    
    @Override
	public String toString() {
		return "{\"jobId\":\"" + jobId + "\",\"jobName\":\"" + jobName + "\",\"workstationName\":\"" + workstationName
				+ "\",\"jobStreamName\":\"" + jobStreamName + "\",\"jobStreamWorkstationName\":\""
				+ jobStreamWorkstationName + "\",\"jobNumber\":\"" + jobNumber + "\",\"priority\":\"" + priority
				+ "\",\"status\":\"" + status + "\",\"internalStatus\":\"" + internalStatus
				+ "\",\"requiredConfirmation\":\"" + requiredConfirmation + "\",\"aliased\":\"" + aliased
				+ "\",\"canceled\":\"" + canceled + "\",\"every\":\"" + every + "\",\"everyRerun\":\"" + everyRerun
				+ "\",\"external\":\"" + external + "\",\"jobLate\":\"" + jobLate + "\",\"pendingCacellation\":\""
				+ pendingCacellation + "\",\"recoveryRerunJob\":\"" + recoveryRerunJob + "\",\"released\":\"" + released
				+ "\",\"rerunJob\":\"" + rerunJob + "\",\"running\":\"" + running + "\",\"startTime\":\"" + startTime
				+ "\",\"latestStartTime\":\"" + latestStartTime + "\",\"latestStartAction\":\"" + latestStartAction
				+ "\",\"deadlineTime\":\"" + deadlineTime + "\",\"repeatRange\":\"" + repeatRange
				+ "\",\"occurenceToken\":\"" + occurenceToken + "\",\"extendedStatus\":\"" + extendedStatus
				+ "\",\"errorCode\":\"" + errorCode + "\",\"operationCommand\":\"" + operationCommand
				+ "\",\"authorityGroup\":\"" + authorityGroup + "\",\"cleanUpStatus\":\"" + cleanUpStatus
				+ "\",\"latestOutPassed\":\"" + latestOutPassed + "\",\"latestOut\":\"" + latestOut
				+ "\",\"actualArrival\":\"" + actualArrival + "\",\"actualEnd\":\"" + actualEnd + "\",\"jclName\":\""
				+ jclName + "\",\"startDate\":\"" + startDate + "\",\"expectStartDate\":\"" + expectStartDate
				+ "\",\"lagtime\":\"" + lagtime + "\",\"username\":\"" + username + "\",\"__equalsCalc\":\""
				+ __equalsCalc + "\",\"__hashCodeCalc\":\"" + __hashCodeCalc + "\"} ";
	}

}
