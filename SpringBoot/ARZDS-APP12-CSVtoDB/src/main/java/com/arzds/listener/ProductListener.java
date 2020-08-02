package com.arzds.listener;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.stereotype.Component;

@Component
public class ProductListener implements JobExecutionListener {

	@Override
	public void beforeJob(JobExecution jobExecution) {
		System.out.println(jobExecution.getStartTime() + " \n" + jobExecution.getEndTime() + " \n"
				+ jobExecution.getStatus() + " \n" + jobExecution.getStepExecutions());

	}

	@Override
	public void afterJob(JobExecution jobExecution) {
		// TODO Auto-generated method stub
		System.out.println(jobExecution.getStartTime() + " \n" + jobExecution.getEndTime() + " \n"
				+ jobExecution.getStatus() + " \n" + jobExecution.getStepExecutions());

	}

}
