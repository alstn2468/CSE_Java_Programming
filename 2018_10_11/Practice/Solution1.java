
class TV {
	String company;
	int year, inch;

	public TV(String company, int year, int inch) {
		this.company = company;
		this.year = year;
		this.inch = inch;
	}

	void show() {
		System.out.println(this.company + "에서 만든 " +
							this.year + "년형 " + this.inch + "인치 TV");
	}
}


public class Solution1 {

	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();

	}

}
