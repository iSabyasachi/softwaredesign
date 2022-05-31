package design.pattern.visitor;

public class PriceVisitor implements IAircraftVisitor{
	@Override
    public void visitF16(F16 f16) {
        // Logic to get price for F16
    }

    @Override
    public void visitBoeing747(Boeing747 boeing747) {
        // Logic to get price for Boeing 747
    }

    public void printAccumulatedResults(){
        
    }
}
