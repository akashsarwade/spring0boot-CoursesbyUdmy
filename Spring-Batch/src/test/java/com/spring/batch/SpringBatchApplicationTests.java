package com.spring.batch;

import org.junit.jupiter.api.Test;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBatchApplicationTests {

	@Autowired
	JobLauncher jobLauncher;
	@Autowired
	Job job;

	@Test
	public void testBatch() throws JobExecutionAlreadyRunningException, JobRestartException,
			JobInstanceAlreadyCompleteException, JobParametersInvalidException {

		JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
				.toJobParameters();
		jobLauncher.run(job, jobParameters);
	}

}
