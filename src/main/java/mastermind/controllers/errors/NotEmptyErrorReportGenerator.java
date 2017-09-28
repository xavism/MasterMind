package mastermind.controllers.errors;

import mastermind.models.Game;

public class NotEmptyErrorReportGenerator extends ErrorReportGenerator {

	@Override
	public ErrorReport getErrorReport(Game game) {
		return new NotEmptyErrorReport(game.emptyCoordinates());
	}
	
}
