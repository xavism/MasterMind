package mastermind.controllers.errors;

import mastermind.models.Game;

public class RepeatedCoordinateErrorReportGenerator extends ErrorReportGenerator {

	@Override
	public ErrorReport getErrorReport(Game game) {
		return new RepeatedCoordinateErrorReport(game.emptyCoordinates());
	}

}
