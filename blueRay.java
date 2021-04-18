//package cproject;
//1번방식
//public class blueRay implements classifiable {
//
//	@Override
//	public void classify(String Name) {
//		// TODO Auto-generated method stub
//		System.out.println(Name+"을 선택");
//	}
//
//}


//2번방식
package cproject;


public class blueRay extends CommonDisk implements Diskable{
	blueRay(){
		super(150,"감독","제목",25);
	}
	
	blueRay(int runningTime, String director, String title, int capacity) {
		super(runningTime, director, title,capacity);
	}
	
	public String toString() {
		return "dvd";
	}
	
//	void Disk(Diskable d) {
//		if(d instanceof CommonDisk) {
//			CommonDisk c = (CommonDisk)d;
//			//c.capacity = (int)random.nextInt(10)+1;
//			System.out.println(c.toString()+"의 용량은 "+c.capacity+"입니다.");
//		}
//	}
	
}
