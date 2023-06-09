package azevedorafaela.cucumbermaven.pages;

import org.openqa.selenium.support.PageFactory;

import azevedorafaela.cucumbermaven.support.Context;

public abstract class BasePage {
	protected Context world;

	// Initiate the Page Factory and create as abstract class, so
	// you can use for all the other Page Objects
	public BasePage(Context world) {
		this.world = world;
		PageFactory.initElements(world.driver, this);
	}

}
