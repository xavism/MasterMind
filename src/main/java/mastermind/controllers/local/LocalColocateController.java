package mastermind.controllers.local;

import mastermind.controllers.ColocateController;
import mastermind.controllers.CoordinateController;
import mastermind.controllers.errors.ErrorGeneratorType;
import mastermind.controllers.errors.ErrorReport;
import mastermind.models.Coordinate;
import mastermind.models.Game;

abstract class LocalColocateController extends LocalOperationController
		implements ColocateController {

	private LocalCoordinateController coordinateController;

	protected LocalColocateController(Game game,
			LocalCoordinateController coordinateController) {
		super(game);
		assert coordinateController != null;
		this.coordinateController = coordinateController;
	}

	public ErrorReport validateTarget(Coordinate target) {
		if (!this.empty(target)) {
			return ErrorGeneratorType.NOT_EMPTY.getErrorReport(this.getGame());
		}
		return null;
	}

	public CoordinateController getCoordinateController() {
		return coordinateController;
	}

}
