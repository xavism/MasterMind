package mastermind.controllers.local.logic;

import mastermind.controllers.local.LocalOperationController;
import mastermind.controllers.local.LocalOperationControllerBuilder;
import mastermind.controllers.local.LocalStartController;

class InitialState extends State {

	private LocalStartController localStartController;
	
	InitialState(StatesBuilder statesBuilder, LocalOperationControllerBuilder localOperationControllerBuilder){
		super(statesBuilder);
		localStartController = localOperationControllerBuilder.getLocalStartController();
	}
	
	@Override
	State begin() {
		return statesBuilder.getInGameState();
	}
		
	@Override
	LocalOperationController getOperationController() {
		return localStartController;
	}

}
