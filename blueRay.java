//package cproject;
//1�����
//public class blueRay implements classifiable {
//
//	@Override
//	public void classify(String Name) {
//		// TODO Auto-generated method stub
//		System.out.println(Name+"�� ����");
//	}
//
//}


//2�����
package cproject;


public class blueRay extends CommonDisk implements Diskable{
	blueRay(){
		super(150,"����","����",25);
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
//			System.out.println(c.toString()+"�� �뷮�� "+c.capacity+"�Դϴ�.");
//		}
//	}
	
}
