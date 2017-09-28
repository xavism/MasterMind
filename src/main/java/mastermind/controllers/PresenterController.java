package mastermind.controllers;

import mastermind.models.Color;
import mastermind.models.Coordinate;

public interface PresenterController {
	
	Color getColor(Coordinate coordinate);

}
