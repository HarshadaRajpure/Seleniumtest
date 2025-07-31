package com.excelr.selenium.demo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("Test started"+result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test succed"+result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed"+result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test skipped"+result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Test successs percentage"+result.getName());
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		onTestFailure(result);
	}

	public void onStart(ITestContext context) {
		System.out.println("Test started"+context.getName());
	}

	public void onFinish(ITestContext context) {
		System.out.println("Test Finished "+context.getName());
	}
}
