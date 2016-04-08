// This file was generated by Mendix Business Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package scheduler.actions;

import scheduler.impl.ScheduleManager;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

/**
 * 
 */
public class ShutdownScheduler extends CustomJavaAction<Boolean>
{
	private Boolean WaitForJobsToComplete;

	public ShutdownScheduler(IContext context, Boolean WaitForJobsToComplete)
	{
		super(context);
		this.WaitForJobsToComplete = WaitForJobsToComplete;
	}

	@Override
	public Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE

		ScheduleManager.getInstance().shutDown( this.WaitForJobsToComplete );

		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "ShutdownScheduler";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}