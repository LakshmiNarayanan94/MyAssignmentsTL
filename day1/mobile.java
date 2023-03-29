package week1.day1;

public class mobile {
	
	public void makeCall () {
		String mobileModel = "apple";
		Float mobileWeight = 125.f;
		System.out.println(mobileModel);
		System.out.println(mobileWeight);
	}
	
	public void sendMsg () {
		Boolean isFullCharged = true;
		int mobileCost = 50000;
		System.out.println(isFullCharged);
		System.out.println(mobileCost);
		
	}
	
	public static void main(String[] args) {
		mobile details = new mobile();
		details.makeCall();
		details.sendMsg();
		System.out.println("This is my mobile");
}
}
