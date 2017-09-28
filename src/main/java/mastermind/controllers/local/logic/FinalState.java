package mastermind.controllers.local.logic;

import mastermind.controllers.local.LocalContinueController;
import mastermind.controllers.local.LocalOperationController;
import mastermind.controllers.local.LocalOperationControllerBuilder;

class FinalState extends State {

	private LocalContinueController localContinueController;

	FinalState(StatesBuilder statesBuilder,
			LocalOperationControllerBuilder localOperationControllerBuilder) {
		super(statesBuilder);
		localContinueController = localOperationControllerBuilder
				.getLocalContinueController();
	}

	@Override
	State initialize() {
		return statesBuilder.getInitialState();
	}
	
	@Override
	State exit() {
		return statesBuilder.getExitState();
	}

	@Override
	LocalOperationController getOperationController() {
		return localContinueController;
	}

}
