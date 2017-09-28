package mastermind.views.console;

import mastermind.controllers.StartController;
import mastermind.utils.LimitedIntDialog;

class StartView {

	private BoardView boardView;
	
	StartView(BoardView boardView) {
		this.boardView = boardView;
	}
	
	void interact(StartController startController){
		int users = LimitedIntDialog.instance().read("Cu�ntos usuarios?", 0, 2);
		startController.start(users);
		boardView.write(startController);
	}
}
