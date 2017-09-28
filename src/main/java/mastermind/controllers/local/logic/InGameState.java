package mastermind.controllers.local.logic;

import mastermind.controllers.local.LocalOperationController;
import mastermind.controllers.local.LocalOperationControllerBuilder;

class InGameState extends State {

	private LocalOperationControllerBuilder localOperationControllerBuilder;
	
	public InGameState(StatesBuilder statesBuilder,
			LocalOperationControllerBuilder localOperationControllerBuilder) {
		super(statesBuilder);
		this.localOperationControllerBuilder = localOperationControllerBuilder;
	}

	@Override
	State end() {
		return statesBuilder.getFinalState();
	}

	@Override
	public LocalOperationController getOperationController() {
		return localOperationControllerBuilder.getLocalColocateController();
	}

}
