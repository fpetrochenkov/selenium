package by.softclub.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TestListener {
/*
	private static final Logger LOG = Logger.getLogger(TestListener.class);

	public TestListener() {
	}

	@Override
	public void onTestStart(ITestResult iTestResult) {
		LOG.info("====================================================================");
		LOG.info("Test with thread " + Thread.currentThread().getName() + " is started");
	}

	@Override
	public void onTestSuccess(ITestResult iTestResult) {
		LOG.info("====================================================================");
		LOG.info("Test with thread " + Thread.currentThread().getName() + " is successful finished");
	}

	@Override
	public void onTestFailure(ITestResult iTestResult) {
		LOG.info("====================================================================");
		WebDriver driver = DriverFactory.getDriver();
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			Long currentTime = System.currentTimeMillis();
			FileUtils.copyFile(file, new File(ConfigUtil.getProperty("sc.path") 
			+ currentTime + "." + ConfigUtil.getProperty("sc.format")));
			LOG.info("Screenshoot with name: " 
			+ currentTime + "." + ConfigUtil.getProperty("sc.format") + 
			" is saved to " + ConfigUtil.getProperty("sc.path"));
		} catch (IOException e) {
			LOG.error(e);
		}
	}

	public void onTestSkipped(ITestResult iTestResult) {
		LOG.info("====================================================================");
		LOG.info("Test with thread " + Thread.currentThread().getName() + " is skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {		
	}

	@Override
	public void onFinish(ITestContext arg0) {		
	}

	@Override
	public void onStart(ITestContext arg0) {		
	}
*/
}
