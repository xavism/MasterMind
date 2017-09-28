package mastermind.controllers.local.logic;

import mastermind.controllers.local.LocalOperationController;

class ExitState extends State {

	ExitState(StatesBuilder statesBuilder){
		super(statesBuilder);
	}
	
	@Override
	LocalOperationController getOperationController() {
		return null;
	}

}
