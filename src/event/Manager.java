package event;

import java.util.Scanner;



public class Manager {
	Event[] EventList = new Event[5];
	HideEvent[] hideEvent = new HideEvent[2];
	Scanner in = new Scanner(System.in);
	//������
	Manager(String title){
		System.out.println(title + "�̺�Ʈ�������α׷�");
		Scanner in = new Scanner(System.in);
		while(true) {
			menu();
			System.out.println("��ȣ����");
			int k = in.nextInt();
			if(k == 1) {
				add(); // add �޼��� call
			}else if( k == 2) {
				alllist(); // allList call
			}
			else if( k == 3) {
				update(); // update call
			}
			else if( k == 4) {
				delete(); // delete call
			}
			else if( k == 5) {
				hide(); // hide call
			}
		}
	}
	private void alllist() {
		System.out.println("��ü���� ���");
		for(int i = 0; i < EventList.length; i++) {
			if(EventList[i] != null) {
				System.out.println(EventList[i].EventN);	
				
			}
			;
		}
	}
	private void add() {
		System.out.println("�߰�");
		System.out.println("�̺�Ʈ�� �Է��ϼ���");
		String EventN = in.nextLine();
		Event tempUser = new Event(EventN);
		for(int i = 0; i < EventList.length; i++) {
			if(EventList[i] == null) {
				EventList[i] = tempUser;
				break;
			}
		}
		
	}
	private void menu() {
		System.out.println("1.�߰� 2.��ü���� 3.���� 4.���� 4.�����̺�Ʈ ����");
		
	}
	
	private void update() {
		System.out.println("������ �̺�Ʈ�� �Է��Ͻÿ�");
		String saveEvent = in.nextLine();
		Event tempUser = new Event(saveEvent);
		for(int i = 0; i < EventList.length; i++) {
			if(EventList[i].EventN.equals(saveEvent) && EventList[i].EventN != null) {
				System.out.println("���� �̺�Ʈ�� �Է��Ͻÿ�");
				 tempUser.EventN = in.nextLine();
				 EventList[i]= tempUser;
				 break;
			}else if(EventList[i].EventN == null && !EventList[i].EventN.equals(saveEvent)){
				System.out.println("���� �����ϴ�");
			}
		}
	}
	 private void delete() {
		 System.out.println("������ �̺�Ʈ�� �Է��Ͻÿ�");
		 String saveEvent = in.nextLine();
		 Event tempUser = new Event(saveEvent);
		 for(int i = 0; i < EventList.length; i++) {
			 if(EventList[i].EventN.equals(saveEvent) && EventList[i].EventN != null ) {
				 EventList[i].EventN = null;
				 break;
			 }else if(EventList[i].EventN == null && !EventList[i].EventN.equals(saveEvent) ) {
				 System.out.println("���� �����ϴ�");
			 }
		 }
	 }
	 private void hide() {
		 HideEvent hideEvent[] = { new HideEvent("�ڹ�"),new HideEvent("���̽�")};
		 for(int i = 0; i< hideEvent.length; i++) {
			 System.out.println(hideEvent[i].EventHN);
		 }
	 }
	
	
	
	
	
	
	
	
}
