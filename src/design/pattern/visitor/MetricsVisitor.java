package design.pattern.visitor;

public class MetricsVisitor implements IAircraftVisitor{

	@Override
	public void visitF16(F16 f16) {
		
		// Logic to get metrics for F16
		
	}

	@Override
	public void visitBoeing747(Boeing747 boeing747) {
		
		// Logic to get metrics for Boeing 747
		
	}
	
	public void printAccumulatedResults(){
        
    }

}
