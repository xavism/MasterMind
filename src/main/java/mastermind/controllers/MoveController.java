package mastermind.controllers;

import mastermind.controllers.errors.ErrorReport;
import mastermind.models.Coordinate;

public interface MoveController extends ColocateController {

	ErrorReport validateOrigin(Coordinate origin);

	void remove(Coordinate origin);

	ErrorReport validateTarget(Coordinate origin, Coordinate target);

}
