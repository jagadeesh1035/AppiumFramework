package utils.supportlibraries;

public class BasePage extends DriverUtils {

	protected static ScriptHelper scriptHelper;

	public BasePage(ScriptHelper scriptHelper) {
		super(scriptHelper);
		BasePage.scriptHelper = scriptHelper;
	}

}
