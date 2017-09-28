package mastermind.controllers.local;

import mastermind.controllers.OperationController;
import mastermind.controllers.OperationControllerVisitor;
import mastermind.controllers.local.LocalController;
import mastermind.models.Game;

public abstract class LocalOperationController extends LocalController
		implements OperationController {

	protected LocalOperationController(Game game) {
		super(game);
	}
	
	public abstract void accept(
			OperationControllerVisitor operationControllerVisitor);

}
