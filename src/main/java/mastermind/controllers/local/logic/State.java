package mastermind.controllers.local.logic;

import mastermind.controllers.local.LocalOperationController;

abstract class State {

	protected StatesBuilder statesBuilder;
	
	protected State(StatesBuilder statesBuilder) {
		this.statesBuilder = statesBuilder;
	}
	
	State initialize() {
		assert false;
		return null;
	}
	
	State begin() {
		assert false;
		return null;
	}
	
	State end() {
		assert false;
		return null;
	}
	
	State exit() {
		assert false;
		return null;
	}
	
	abstract LocalOperationController getOperationController();

}
