package mastermind.controllers.local.logic;

import mastermind.controllers.local.LocalOperationControllerBuilder;
import mastermind.models.Game;
import mastermind.models.Observer;

class StatesBuilder {

	private InitialState initialState;

	private InGameState inGameState;

	private FinalState finalState;

	private ExitState exitState;

	StatesBuilder(Observer observer, Game game,
			LocalOperationControllerBuilder localOperationControllerBuilder) {
		initialState = new InitialState(this, localOperationControllerBuilder);
		inGameState = new InGameState(this, localOperationControllerBuilder);
		finalState = new FinalState(this, localOperationControllerBuilder);
		exitState = new ExitState(this);
	}

	InitialState getInitialState() {
		return initialState;
	}

	InGameState getInGameState() {
		return inGameState;
	}

	FinalState getFinalState() {
		return finalState;
	}

	ExitState getExitState() {
		return exitState;
	}
}
