package mastermind.controllers;

import mastermind.controllers.errors.ErrorReport;
import mastermind.models.Coordinate;

public interface PutController extends ColocateController {

	ErrorReport validateTarget(Coordinate target);

}
