//1번방식
//package cproject;
//public class dvd implements classifiable {
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


public class dvd extends CommonDisk implements Diskable{
	dvd(){
		super(150,"감독","제목",4);
	}
	
	dvd(int runningTime, String director, String title, int capacity) {
		super(runningTime, director, title,capacity);
	}
	
	public String toString() {
		return "dvd";
	}
	
	void Disk(Diskable d) {
		if(d instanceof CommonDisk) {
			CommonDisk c = (CommonDisk)d;
			//c.capacity = (int)random.nextInt(10)+1;
			System.out.println(c.toString()+"의 용량은 "+c.capacity+"입니다.");
		}
	}
	
}
