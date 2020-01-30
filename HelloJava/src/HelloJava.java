
public class HelloJava {
	public static void main(String[] args) {
		//이클립스에서는 저장과 동시에 컴파일이 일어남.
		System.out.println("Hello Java");
		
		int x = 0;
		int y= 0;
		
		//하나가 뒤에까지 본다.
		//&&는 앞에거가 거짓이면 뒤에 확인하지도 않음. 두개가 속도가 조금 더 빠르다.
		if((2>5) & (x++>y))
			y++;
		System.out.println("x=" + x +"y="+y);
	}
}