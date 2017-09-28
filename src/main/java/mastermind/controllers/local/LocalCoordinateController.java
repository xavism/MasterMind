package mastermind.controllers.local;

import mastermind.controllers.CoordinateController;
import mastermind.models.Coordinate;
import mastermind.models.Game;

public abstract class LocalCoordinateController extends LocalController
		implements CoordinateController {

	protected LocalCoordinateController(Game game) {
		super(game);
	}

	public abstract Coordinate getOrigin();

	public abstract Coordinate getTarget();

}
