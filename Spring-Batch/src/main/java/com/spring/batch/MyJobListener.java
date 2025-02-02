package com.spring.batch;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

public class MyJobListener implements JobExecutionListener {

	@Override
	public void beforeJob(JobExecution jobExecution) {
		System.err.println("Job Started");
		JobExecutionListener.super.beforeJob(jobExecution);
	}

	@Override
	public void afterJob(JobExecution jobExecution) {
		System.out.println("Job Ended" + jobExecution.getStatus().toString());
		JobExecutionListener.super.afterJob(jobExecution);
	}

}
