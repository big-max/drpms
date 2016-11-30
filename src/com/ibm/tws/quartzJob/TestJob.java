package com.ibm.tws.quartzJob;

import java.util.Date;

public class TestJob {
	public void execute() {
		System.out.println(new Date().toString() + ":test quartz");
	}
}
