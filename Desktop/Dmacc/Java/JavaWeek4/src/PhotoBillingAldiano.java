
public class PhotoBillingAldiano {

	public static void main(String[] args) {
		System.out.println(computePhotoBill(19.99));
		System.out.println(computePhotoBill(19.99,2));
		System.out.println(computePhotoBill(19.22, 2, .1));
	}
	public static double computePhotoBill(double photoBookPrice) {
		double Tax = .06;
		double photoBookorder = Tax * photoBookPrice;
		double subTotal = photoBookPrice + photoBookorder;
		return subTotal;
	}
	public static double computePhotoBill(double photoBookPrice, int photoBookQuantity) {
		double Tax = .06;
		double photoBookorderSub = photoBookPrice * photoBookQuantity;
		double subTotal = photoBookorderSub * Tax;
		double subTotal2 = subTotal + photoBookorderSub;
		return subTotal2;
	}
	public static double computePhotoBill(double photoBookPrice, int photoBookQuantity, double photoBookCoupon) {
		double Tax = .06;
		double photoBookorderSub = photoBookPrice * photoBookQuantity; 
		double photoBookorderCoupon = photoBookorderSub * photoBookCoupon;
		double photoBookorderwithCoupon = photoBookorderSub - photoBookorderCoupon;
		double subTotal = photoBookorderwithCoupon * Tax;
		double OrderTotal = photoBookorderwithCoupon + subTotal;
		/*double subTotal1 = photoBookorderwithCoupon + subTotal;
		System.out.println(subTotal1);*/
		return OrderTotal;
	}
}
