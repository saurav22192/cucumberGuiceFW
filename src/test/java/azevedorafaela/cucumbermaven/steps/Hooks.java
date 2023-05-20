package azevedorafaela.cucumbermaven.steps;

import java.io.IOException;

import azevedorafaela.cucumbermaven.support.Context;
import com.google.inject.Inject;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	@Inject
	private Context world;

	// Set the value of the properties in the support
	@Before
	public void beforeScenario() throws IOException {
		world.support.getProperties();
	}

	@After
	public void afterScenario() {
		world.driver.quit();
	}
}
