package mastermind.views.console;

import mastermind.controllers.CoordinateController;
import mastermind.controllers.CoordinateControllerVisitor;
import mastermind.models.Coordinate;
import mastermind.utils.IO;

abstract class ColocateCoordinateView implements CoordinateControllerVisitor {

	private CoordinateController coordinateController;
	
	protected ColocateCoordinateView(CoordinateController coordinateController){
		assert coordinateController != null;
		this.coordinateController = coordinateController;
	}
	
	abstract Coordinate getCoordinate();
	
	protected void show(String infix, Coordinate coordinate){
		CoordinateView.instance().write("La maquina " + infix + " ", coordinate);
		IO.instance().readString(". Pulse enter para continuar");
	}
	
	protected CoordinateController getCoordinateController(){
		return coordinateController;
	}
}
