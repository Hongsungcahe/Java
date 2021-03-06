package Thread;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] key = {"Q", "W", "E"};
		
		for(int i = 0; i<key.length; i++) {
			Blitzcrank b = new Blitzcrank(key[i]);
			b.run();
		}
		System.out.println("===========================");
		for(int i =0; i<key.length; i++) {
			Ari a = new Ari(key[i]);
			//Start() 메소드를 호출하며 스레드를 동작 시킴
			//스레드가 실행을 시작하기위해서는 꼭 start() 메서드를 호출해야함
			//start()메소드는 절대로 오버라이딩 하면 안됨
			
			//생성된 스레드 객체를 스케줄링이 가능한 상태로 전환하도록 jvi에게 지시
			//스케줄링 : 메모리에 적재된 프로그램을 CPU가 실행할 수 있도록 운영체제가 스레드에게 CPU할당
			//스케줄링에 의해서 해당 스레드가 선택이되면 jvm에 의해서 run() 메서드가 호출되어 실행이 됨
			a.start();//쓰레드를 실행하려면 사용해야돔
		}

		System.out.println("===========================");
		for(int i =0; i<key.length; i++) {
			Thread thread = new Thread(new Ari2(key[i]));
			thread.start();
		}
	}
		
}
