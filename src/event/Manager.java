package event;

import java.util.Scanner;



public class Manager {
	Event[] EventList = new Event[5];
	HideEvent[] hideEvent = new HideEvent[2];
	Scanner in = new Scanner(System.in);
	//생성자
	Manager(String title){
		System.out.println(title + "이벤트관리프로그램");
		Scanner in = new Scanner(System.in);
		while(true) {
			menu();
			System.out.println("번호선택");
			int k = in.nextInt();
			if(k == 1) {
				add(); // add 메서드 call
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
		System.out.println("전체보기 기능");
		for(int i = 0; i < EventList.length; i++) {
			if(EventList[i] != null) {
				System.out.println(EventList[i].EventN);	
				
			}
			;
		}
	}
	private void add() {
		System.out.println("추가");
		System.out.println("이벤트를 입력하세요");
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
		System.out.println("1.추가 2.전체보기 3.수정 4.삭제 4.숨긴이벤트 보기");
		
	}
	
	private void update() {
		System.out.println("수정할 이벤트를 입력하시오");
		String saveEvent = in.nextLine();
		Event tempUser = new Event(saveEvent);
		for(int i = 0; i < EventList.length; i++) {
			if(EventList[i].EventN.equals(saveEvent) && EventList[i].EventN != null) {
				System.out.println("새로 이벤트명를 입력하시오");
				 tempUser.EventN = in.nextLine();
				 EventList[i]= tempUser;
				 break;
			}else if(EventList[i].EventN == null && !EventList[i].EventN.equals(saveEvent)){
				System.out.println("값이 없습니다");
			}
		}
	}
	 private void delete() {
		 System.out.println("삭제할 이벤트를 입력하시오");
		 String saveEvent = in.nextLine();
		 Event tempUser = new Event(saveEvent);
		 for(int i = 0; i < EventList.length; i++) {
			 if(EventList[i].EventN.equals(saveEvent) && EventList[i].EventN != null ) {
				 EventList[i].EventN = null;
				 break;
			 }else if(EventList[i].EventN == null && !EventList[i].EventN.equals(saveEvent) ) {
				 System.out.println("값이 없습니다");
			 }
		 }
	 }
	 private void hide() {
		 HideEvent hideEvent[] = { new HideEvent("자바"),new HideEvent("파이썬")};
		 for(int i = 0; i< hideEvent.length; i++) {
			 System.out.println(hideEvent[i].EventHN);
		 }
	 }
	
	
	
	
	
	
	
	
}
