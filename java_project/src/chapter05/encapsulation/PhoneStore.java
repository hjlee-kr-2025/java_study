package chapter05.encapsulation;

public class PhoneStore {
	private Phone phone;

	public PhoneStore(Phone phone) {
		this.phone = phone;
	}
	
	public Phone sellPhone (String model, double budget) {
		String phoneModel = phone.getModel();
		
		// 고객이 원하는 모델과 같고, 예산이 폰가격보다 크거나 같으면
		if (model.equals(phoneModel) && budget >= phone.getPrice()) {
			registerPayment();
			discountPromotion();
			savdData();
			return phone;
		}
		else {
			return null;
		}
	}
	
	private void registerPayment() {
		System.out.println("대리점: 요금제를 등록합니다. 약정을 등록합니다.");
	}
	
	private void discountPromotion() {
		System.out.println("대리점: 프로모션으로 할인합니다.");
	}
	
	private void savdData() {
		System.out.println("대리점: 데이터를 저장하고 새로운 폰으로 이동합니다.");
	}
}
