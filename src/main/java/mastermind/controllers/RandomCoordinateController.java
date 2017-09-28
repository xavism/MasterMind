package mastermind.controllers;

import mastermind.models.Coordinate;

public interface RandomCoordinateController extends CoordinateController {

	Coordinate getTarget(Coordinate origin);

}
