package mastermind.controllers;

public interface ColocateControllerVisitor {

	void visit(PutController putController);
	
	void visit(MoveController moveController);
}
