//1�����
//package cproject;
//public class dvd implements classifiable {
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


public class dvd extends CommonDisk implements Diskable{
	dvd(){
		super(150,"����","����",4);
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
			System.out.println(c.toString()+"�� �뷮�� "+c.capacity+"�Դϴ�.");
		}
	}
	
}
