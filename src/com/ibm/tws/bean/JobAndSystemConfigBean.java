package com.ibm.tws.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "job_config")
public class JobAndSystemConfigBean {
	//job在tws系统中的id
	private String id;
	//job名字
	private String name;
	//描述
	private String description;
	//job所属的系统
	private String systemName;
	//job在系统中的阶段
	private String phaseInSystem;
	//计划预计花费时间
	private long planStartTime;
	//是否为串行任务
	private int serial;//1:串行任务 ; 0:并行任务
	//操作人员
	private String username;
	
	@Transient
	private String jobName;
	@Transient
	private String status;
	@Transient
	private String startDate;
	@Transient
    private String expectStartDate;
	@Transient
    private Boolean lagtime = false;
	@Transient
    private String colorclass;//颜色class
    
	@Id
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getSystemName() {
		return systemName;
	}
	public void setSystemName(String systemName) {
		this.systemName = systemName;
	}
	public String getPhaseInSystem() {
		return phaseInSystem;
	}
	public void setPhaseInSystem(String phaseInSystem) {
		this.phaseInSystem = phaseInSystem;
	}	
	public long getPlanStartTime() {
		return planStartTime;
	}
	public void setPlanStartTime(long planStartTime) {
		this.planStartTime = planStartTime;
	}
	public int getSerial() {
		return serial;
	}
	public void setSerial(int serial) {
		this.serial = serial;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Transient
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	@Transient
	public String getExpectStartDate() {
		return expectStartDate;
	}
	public void setExpectStartDate(String expectStartDate) {
		this.expectStartDate = expectStartDate;
	}
	@Transient
	public Boolean getLagtime() {
		return lagtime;
	}
	public void setLagtime(Boolean lagtime) {
		this.lagtime = lagtime;
	}
	@Transient
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	@Transient
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Transient
	public String getColorclass() {
		return colorclass;
	}
	public void setColorclass(String colorclass) {
		this.colorclass = colorclass;
	}
	
	
	
}
