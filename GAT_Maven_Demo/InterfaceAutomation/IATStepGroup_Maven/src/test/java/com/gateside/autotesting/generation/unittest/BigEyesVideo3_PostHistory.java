package com.gateside.autotesting.generation.unittest;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import com.gateside.autotesting.Gat.executor.CaseExecutor;
import com.gateside.autotesting.Gat.executor.InterfaceSingleStepExecutor;
import com.gateside.autotesting.Gat.executor.InterfaceStepsExecutor;

public class BigEyesVideo3_PostHistory {

	@BeforeTest
	public void beforeTestMethod(){
	}
	
	@BeforeMethod
	public void beforeMethod(){
	}
	
	
	@Test
	public void TestAndroidParametersLegal() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("BigEyesVideo3.PostHistory.TestAndroidParametersLegal");
		executor.execute();
	}
	
	@Test
	public void TestOsVersion71() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("BigEyesVideo3.PostHistory.TestOsVersion71");
		executor.execute();
	}
	
	@Test
	public void TestOsVersion60() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("BigEyesVideo3.PostHistory.TestOsVersion60");
		executor.execute();
	}
	
	@Test
	public void TestOsVersion61() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("BigEyesVideo3.PostHistory.TestOsVersion61");
		executor.execute();
	}
	
	@Test
	public void TestWindows() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("BigEyesVideo3.PostHistory.TestWindows");
		executor.execute();
	}
	
	@Test
	public void TestRequiredParametersNull() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("BigEyesVideo3.PostHistory.TestRequiredParametersNull");
		executor.execute();
	}
	
	@Test
	public void TestRequiredParametersEmpty() throws Exception{
		CaseExecutor executor = new InterfaceSingleStepExecutor("BigEyesVideo3.PostHistory.TestRequiredParametersEmpty");
		executor.execute();
	}
	
	
	@AfterMethod
	public void afterMethod(){
	}
	
	@AfterClass
	public void afterClassMethod(){
	}
}

