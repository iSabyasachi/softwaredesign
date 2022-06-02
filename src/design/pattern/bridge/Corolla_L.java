package design.pattern.bridge;

public class Corolla_L extends AbstractCorolla{

	public Corolla_L(AbstractCorollaImpl corollaImpl) {
		super(corollaImpl);
		
	}

	@Override
	void listSafetyEquipment() {		
		corollaImpl.listSafetyEquipment();
	}

	@Override
	boolean isCarRightHanded() {
		return corollaImpl.isCarRightHanded();
	}

}
