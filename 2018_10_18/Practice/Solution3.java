class TV {
	private int size;

	public TV(int size) {
		this.size = size;
	}

	protected int getSize() {
		return size;
	}
}

class ColorTV extends TV {
	int color;

	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}

	void printProperty() {
		System.out.println(this.getSize() + "인치 " + this.color + "컬러");
	}
}

class IPTV extends ColorTV {
	String ip;

	public IPTV(String ip, int size, int color) {
		super(size, color);
		this.ip = ip;
	}

	@Override
	void printProperty() {
		System.out.println("나의 IPTV는 " + this.ip + " 주소의 " +
					this.getSize() + "인치 " + this.color + "컬러");
	}
}

public class Solution3 {

    public static void main(String[] args) {
    	IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
    	iptv.printProperty();

    }
}
