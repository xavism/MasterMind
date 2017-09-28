package mastermind.controllers.local;

import mastermind.controllers.ContinueController;
import mastermind.controllers.OperationControllerVisitor;
import mastermind.models.Game;
import mastermind.models.Observer;
import mastermind.models.Subject;

public class LocalContinueController extends LocalOperationController implements
		ContinueController {

	private Subject subject;
	
	public LocalContinueController(Observer observer, Game game) {
		super(game);
		subject = new Subject();
		subject.register(observer);
	}

	public void resume(boolean another) {
		if (another) {
			this.clear();
			subject.initialize();
		} else {
			subject.exit();
		}
	}

	@Override
	public void accept(OperationControllerVisitor operationControllerVisitor) {
		operationControllerVisitor.visit(this);
	}

}
