package design.pattern.bridge;

public class Client {
	public static void main(String[] args) {
		Corolla_L LModel = new Corolla_L(new Corolla_L_Impl_NorthAmerica());
		System.out.println(LModel.isCarRightHanded());
		LModel.listSafetyEquipment();
		
		Corolla_L LModelAsia = new Corolla_L(new Corolla_L_Impl_AsiaPacific());
		System.out.println(LModelAsia.isCarRightHanded());
		LModelAsia.listSafetyEquipment();
	}
}
