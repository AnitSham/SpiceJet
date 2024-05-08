package utility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import base.Specification;

public class Listener extends Specification implements ITestListener {

	ExtentTest test;
	ExtentReports extents = ExtentReportDemoWeb.getReport();

	@Override
	public void onTestStart(ITestResult result) {

		test = extents.createTest(result.getMethod().getMethodName());
		System.out.println("Test Started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test Passed");
		System.out.println("Test Success");

	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.fail(result.getThrowable());
		System.out.println("Test Failed");

		String filepath = null;
		try {
			filepath = getScreenShot(result.getMethod().getMethodName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test.addScreenCaptureFromPath(filepath, result.getMethod().getMethodName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test Skipped");
	}

	@Override
	public void onFinish(ITestContext context) {
		extents.flush();
	}

}
