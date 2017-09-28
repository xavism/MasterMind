package mastermind.controllers.local;

import mastermind.models.Game;

class LocalRandomColocateControllerBuilder extends
		LocalColocateControllerBuilder {

	LocalRandomColocateControllerBuilder(Game game) {
		super(game);
	}

	@Override
	void build() {
		LocalCoordinateController[] localCoordinateControllerArray = {
				new LocalRandomCoordinateController(game),
				new LocalRandomCoordinateController(game), };
		this.build(localCoordinateControllerArray);
	}
}
