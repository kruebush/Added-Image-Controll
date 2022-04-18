package com.revature.revspace.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)				
@CucumberOptions(features="src\\test\\resources\\Features",glue={"com.revature.revspace.S_C_Imgae"})	
public class UploadTestRunner {


}