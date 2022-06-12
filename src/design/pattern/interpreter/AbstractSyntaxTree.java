package design.pattern.interpreter;

public class AbstractSyntaxTree {

	public boolean hasNext() {		
		return false;
	}

	public Program getNextNode() {		
		return null;
	}

}
