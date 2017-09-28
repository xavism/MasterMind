package mastermind.controllers.errors;

import mastermind.models.Game;

public abstract class ErrorReportGenerator {

	public abstract ErrorReport getErrorReport(Game game);

}
