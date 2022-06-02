package design.pattern.bridge;

public class Corolla_L_Impl_NorthAmerica extends AbstractCorollaImpl{

	@Override
	void listSafetyEquipment() {
		System.out.println("High safety standards.");
		
	}

	@Override
	boolean isCarRightHanded() {
		return true;
	}

}
