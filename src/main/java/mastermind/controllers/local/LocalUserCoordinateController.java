package mastermind.controllers.local;

import mastermind.controllers.CoordinateControllerVisitor;
import mastermind.controllers.UserCoordinateController;
import mastermind.models.Coordinate;
import mastermind.models.Game;

public class LocalUserCoordinateController extends LocalCoordinateController
	implements UserCoordinateController {

	protected LocalUserCoordinateController(Game game) {
		super(game);
	}

	@Override
	public Coordinate getOrigin() {
		return new Coordinate();
	}

	@Override
	public Coordinate getTarget() {
		return new Coordinate();
	}

	@Override
	public void accept(CoordinateControllerVisitor coordinateControllerVisitor) {
		coordinateControllerVisitor.visit(this);
	}
	
}
