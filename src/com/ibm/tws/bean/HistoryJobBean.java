package com.ibm.tws.bean;




import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "history_job")
public class HistoryJobBean {
	
	private String id;
	private Timestamp jobdate;	
	private String description;
	private long started;
	private long error;
	private long completed;
	private long waiting;
		
	@Id
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public Long getError() {
		return error;
	}

	public void setError(Long error) {
		this.error = error;
	}

	public Long getStarted() {
		return started;
	}

	public void setStarted(Long started) {
		this.started = started;
	}

	public Long getCompleted() {
		return completed;
	}

	public void setCompleted(Long completed) {
		this.completed = completed;
	}

	public Long getWaiting() {
		return waiting;
	}

	public void setWaiting(Long waiting) {
		this.waiting = waiting;
	}

	public Timestamp getJobdate() {
		return jobdate;
	}

	public void setJobdate(Timestamp jobdate) {
		this.jobdate = jobdate;
	}

	public void setStarted(long started) {
		this.started = started;
	}

	public void setError(long error) {
		this.error = error;
	}

	public void setCompleted(long completed) {
		this.completed = completed;
	}

	public void setWaiting(long waiting) {
		this.waiting = waiting;
	}

	
		
    
}
