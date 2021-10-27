package basic.dev;

public class MainApp {
  public static void main(String[] args) {
	// cac gia tri so nguyen
	int a = 7;
	int b = 3;
	// phep cong
	int tong = a + b;
	// phep tru
	int hieu = a - b;
	// phep nhan
	int tich = a * b;
	// phep chia
	double thuong = (double) a / b;
	System.out.println("tong: " + tong);
	System.out.println("hieu:" + hieu);
	System.out.println("tich:" + tich);
	System.out.printf("Thuong: %.2f\n",thuong);
	//gan c
	System.out.println("a lon hon b:" + (a>b));
	System.out.println("a be hon b:" + (a<b));
	System.out.println(" a lon hon hoac bang b:" + (a >= b));
	System.out.println("a be hon hoac bang b:" + (a <= b));
}
}
