
public class model {
	private String address;
	private int numOffloors;
	private boolean hasADAAccess;
	
	
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getNumOffloors() {
		return numOffloors;
	}
	public void setNumOffloors(int numOffloors) {
		this.numOffloors = numOffloors;
	}
	public boolean isHasADAAccess() {
		return hasADAAccess;
	}
	public void setHasADAAccess(boolean hasADAAccess) {
		this.hasADAAccess = hasADAAccess;
	}
	public model() {
		super();
	}
	@Override
	public String toString() {
		return "model [address=" + address + ", numOffloors=" + numOffloors + ", hasADAAccess=" + hasADAAccess + "]";
	}
}
