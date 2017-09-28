package mastermind.views.console;

import java.util.Iterator;

import mastermind.controllers.errors.ErrorReport;
import mastermind.controllers.errors.ErrorReportVisitor;
import mastermind.controllers.errors.NotEmptyErrorReport;
import mastermind.controllers.errors.NotPropertyErrorReport;
import mastermind.controllers.errors.RepeatedCoordinateErrorReport;
import mastermind.models.Coordinate;
import mastermind.utils.IO;

class ErrorReportView implements ErrorReportVisitor {

	public void write(ErrorReport errorReport) {
		errorReport.accept(this);
	}

	@Override
	public void visit(NotEmptyErrorReport notEmptyErrorReport) {
		this.write("Esa casilla ya est� ocupada", notEmptyErrorReport);
	}

	@Override
	public void visit(NotPropertyErrorReport notPropertyErrorReport) {
		this.write("Esa casilla no est� ocupada por ninguna de tus fichas",
				notPropertyErrorReport);
	}

	@Override
	public void visit(
			RepeatedCoordinateErrorReport repeteadCoordinateErrorReport) {
		this.write("No se puede poner de donde se quit�",
				repeteadCoordinateErrorReport);
	}

	private void write(String message, ErrorReport errorReport) {
		String separator = message + ". Puedes optar por: ";
		Iterator<Coordinate> coordinateIterator = errorReport.iterator();
		while (coordinateIterator.hasNext()){
			CoordinateView.instance().write(separator, coordinateIterator.next());
			if (!separator.equals(", ")) {
				separator = ", ";
			}
		}
		IO.instance().writeln();
	}

}
