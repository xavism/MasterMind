package mastermind.controllers.local;

import mastermind.controllers.OperationControllerVisitor;
import mastermind.controllers.StartController;
import mastermind.models.Game;
import mastermind.models.Observer;
import mastermind.models.Subject;
import mastermind.utils.ClosedInterval;

public class LocalStartController extends LocalOperationController implements
		StartController {

	private LocalOperationControllerBuilder localOperationControllerBuilder;

	private Subject subject;
	
	public LocalStartController(Observer observer, Game game,
			LocalOperationControllerBuilder localOperationControllerBuilder) {
		super(game);
		subject = new Subject();
		subject.register(observer);
		assert localOperationControllerBuilder != null;
		this.localOperationControllerBuilder = localOperationControllerBuilder;
	}

	public void start(int users) {
		assert new ClosedInterval(0, this.numPlayers()).includes(users);
		localOperationControllerBuilder.build(users);
		subject.begin();
	}

	@Override
	public void accept(OperationControllerVisitor operationControllerVisitor) {
		operationControllerVisitor.visit(this);
	}

}
