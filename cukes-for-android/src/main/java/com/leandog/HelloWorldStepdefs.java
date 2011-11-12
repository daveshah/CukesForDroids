package com.leandog;

import static org.junit.Assert.assertNotNull;

import com.google.android.testing.nativedriver.client.AndroidNativeDriver;
import com.google.android.testing.nativedriver.client.AndroidNativeDriverBuilder;
import com.google.android.testing.nativedriver.client.AndroidNativeElement;
import com.google.android.testing.nativedriver.common.AndroidNativeBy;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class HelloWorldStepdefs {

	private AndroidNativeDriver driver;
	

	@Given("^I have launched my hello world activity$")
	public void I_have_launched_my_hello_world_activity() {
		startDriver();
		driver.startActivity("com.leandog.HelloAndroidActivity");
	}

	@When("^I click the button labeled ?(.*)$")
	public void I_click_the_button_labeled(String value) {
		driver.findElementByText(value).click();
	}
	
	
	@Then("^I should see that the text has changed to ?(.*)$")
	public void I_should_see_that_the_text_has_changed_to(String value) {
		AndroidNativeElement element = driver.findElement(AndroidNativeBy.text(value));
		assertNotNull(element);
		stopDriver();
	}

	private void startDriver(){
		driver = new AndroidNativeDriverBuilder().withDefaultServer().build();
	}
	
	private void stopDriver(){
		driver.quit();
	}
	
	

}
