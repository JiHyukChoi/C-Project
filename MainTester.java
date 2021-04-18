//package cproject;
//import java.io.IOException;
//import java.util.*;
//
//public class MainTester {
//
//	public static void main(String[] args) throws IOException {
//		Scanner s = new Scanner(System.in);
//		AdminHandler adminHandler = new AdminHandler();
//		BookHandler b1 = new BookHandler();
//		User u = new User();
//		Admin a = new Admin();
//		Employee e = new Employee();
//		Vector<User> v = new Vector<User>();
//		
//		int checkNum;
//		int num = 0;
//		int retry = 0;
//		
//		System.out.print("관리자면 1, 회원이면 2 직원이면 3를 입력해주세요 : ");
//		checkNum = adminHandler.CheckAD();
//		
//		do {
//			if(checkNum==1) {
//					 if(adminHandler.LoginCnt == 0) {
//								adminHandler.Login(a);
//							
//						 }else {
//						 System.out.println("관리자 계정입니다. 기능을 선택하세요 : ");
//						 System.out.println("1 : 회원 등록");
//						 System.out.println("2 : 회원 정보 출력");
//						 System.out.println("3 : 회원 검색");
//						 System.out.println("4 : 회원 삭제");
//						 System.out.println("5 : 회원 정렬");
//						 System.out.println("6 : 로그아웃");
//						 System.out.println("0 : 기능선택창으로 이동");
//						num = s.nextInt();
//						
//						switch(num)
//						{
//							case 1 : adminHandler.registerUser(u);break;
//							case 2 : adminHandler.showUser(u);break;
//							case 3 : adminHandler.searchUser(u);break;
//							case 4 : adminHandler.deleteUser(u);break;
//							case 5 : adminHandler.sortUser(u);break;
//							case 6 : adminHandler.Logout();break;
//							case 0 : break;
//						}
//					}
//			}
//				
//				else if(checkNum==2) {
//					 if(adminHandler.LoginCnt == 0) {
//						System.out.println("기능 선택");
//						System.out.println("1 : 로그인 ");
//						System.out.println("2 : 회원가입 ");
//						num = s.nextInt();
//						if(num == 1)
//							adminHandler.userLogin(u);
//						else if(num == 2) {
//							adminHandler.registerUser(u);
//							}
//
//					 }else {
//					 System.out.println("사용자 계정입니다. 기능을 선택하세요 : ");
//					 System.out.println("1 : 정보 찾기");
//					 System.out.println("2 : 회원 탈퇴");
//					 System.out.println("3 : 도서 관리");
//					 System.out.println("4 : 로그아웃 ");
//					 System.out.println("5 : 회원정보");
//					 System.out.println("6 : 열람실 좌석 이용");
//					 
//					num = s.nextInt();
//					
//					switch(num)
//					{
//						case 1 : System.out.print("1 : ID 찾기 2 : PW 찾기");
//							num = s.nextInt();
//						if(num == 1)
//						{
//							adminHandler.findID(u);break;
//						}
//						else if(num == 2)
//						{
//							adminHandler.findPW(u);break;
//						}else
//							System.out.println("잘못된입력");
//						
//						case 2 : adminHandler.removeUser(u);break;
//						case 3 : 
//							do {
//						System.out.println("\n원하는 메뉴를 선택하세요");
//				         System.out.println("1. 도서 입력");
//				         System.out.println("2. 도서 출력");
//				         System.out.println("3. 도서 검색");
//				         System.out.println("4. 도서 정렬");
//				         System.out.println("5. 도서 삭제");
//				         System.out.println("6. 도서 반납 대여");
//				         System.out.println("0. 종료");
//				         num =s.nextInt();
//				         
//				         switch(num) {
//				         case 1 : System.out.println("책의 개수는 5개까지 입력 가능하며 5개이후로 입력 시 데이터가 초기화됩니다.");
//				        	 b1.inputBook();break;
//				         case 2 : b1.outBook(); break;
//					     case 3 : System.out.println("제목 검색  : 1, 저자 검색  : 2, 출판사 검색 : 3, 북코드 검색 : 4, 가격 검색 : 5, 판매량 검색 : 6, 연도 검색 : 7 "); 
//					            num = s.nextInt();
//					            if(num==1) {
//					            b1.searchBook(); break;
//					            }
//					            else if(num==2){
//					               b1.searchBook2(); break;
//					            }
//					            else if(num==3){
//					               b1.searchBook3(); break;
//					            }
//					            else if(num==4){
//					               b1.searchBook4(); break;
//					            }
//					            else if(num==5){
//					               b1.searchBook5(); break;
//					            }
//					            else if(num==6){
//					               b1.searchBook6(); break;
//					            }
//					            else if(num==7){
//					               b1.searchBook7(); break;
//					            }else 
//					               System.out.println("잘못된 값입니다.");break;
//					            
//					         case 4 : b1.sortBook(); break;
//					         case 5 : System.out.println("책 제목으로 삭제 : 1, 책 코드로 삭제  : 2, 어떤구조로 삭제되는지 실행: 3");
//						         num = s.nextInt();
//						         if(num == 1) {
//						            b1.deleteBook1(); break;
//						         }
//						         else if(num == 2) {
//						            b1.deleteBook2(); break;
//						         }
//					            else
//					               System.out.println("잘못된 값입니다.");break;
//					     
//					         case 6 : System.out.println("대출하기  : 1, 반납하기  : 2"); 
//					         num = s.nextInt();
//					            if(num == 1) {
//					            b1.borrowBook(u); break;
//					            }
//					            else if(num == 2) {
//					               b1.returnBook(u);break;
//					            }
//					            else
//					               System.out.println("잘못된 값입니다.");break;
//					         }
//							
//							}while(num!=0);	
//							if(num == 0)
//								System.out.println();
//						case 4 : adminHandler.Logout();break;
//						case 5 : adminHandler.showUser(u);break;
//						case 6 : adminHandler.readingRoomUse();break;
//						}
//					}
//				}else if(checkNum==3) {
//							 if(adminHandler.LoginCnt == 0) {
//										adminHandler.Login(e);
//									
//								 }else {
//								 System.out.println("직원 계정입니다. 기능을 선택하세요 : ");
//								 System.out.println("1 : 회원 등록");
//								 System.out.println("2 : 회원 정보 출력");
//								 System.out.println("3 : 회원 검색");
//								 System.out.println("4 : 회원 삭제");
//								 System.out.println("5 : 회원 정렬");
//								 System.out.println("0 : 기능선택창으로 이동");
//								num = s.nextInt();
//								
//								switch(num)
//								{
//									case 1 : adminHandler.registerUser(e);break;
//									case 2 : adminHandler.showUser(e);break;
//									case 3 : adminHandler.searchUser(e);break;
//									case 4 : adminHandler.deleteUser(e);break;
//									case 5 : adminHandler.sortUser(e);break;
//									case 0 : break;
//								}
//							}
//				}
//				else
//					System.out.println("잘못된 입력 값입니다.");
//				
//		System.out.println("계속 하시려면 1번, 관리자/사용자/직원 변환은 2번 종료는 0번 ? : ");
//		retry = s.nextInt();
//		if(retry == 0)
//		{
//			adminHandler.Logout();
//		}else if(retry ==2)
//		{
//			System.out.print("관리자면 1, 회원이면 2 직원이면 3를 입력해주세요 : ");
//			checkNum = adminHandler.CheckAD();
//			adminHandler.LoginCnt = 0;
//		}
//	}while(retry!=0);
//	}
//}
//
//
//
//
//
package cproject;

import java.util.*;
import java.util.logging.ConsoleHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.*;
/**
 * 통합 구현 테스터
 * 
 * 
 * 
 * @author SHY-702-01
 * @since 2021.04.07
 *
 */
public class MainTester {
	/**

	 *핸들러 클래스를 통해 메소드를 호출하여
	 * 각 기능들을  불러서 구현한 메인클래스 임
	 * @param args
	 * @throws java.io.IOException 입출력 관련
	 * 
	 * 
	 * <p>참조
	 * {@link AdminHandler}
	 * {@link BookHandler}
	 * </p> 
	 */
	
	//private final static Logger logger = Logger.getLogger(CustomLogFormatter.class.getName());
   public static void main(String[] args) throws IOException {
	   //1번
//	   classifiable c = Contents.getContents("Book");
//	   c.classify("Book");
//	   classifiable c1 = Contents.getContents("dvd");
//	   c1.classify("dvd");
//	   classifiable c2 = Contents.getContents("blueRay");
//	   c2.classify("blueRay");
//	   classifiable c3 = Contents.getContents("eBook");
//	   c3.classify("eBook");
	   
	   //2번
//	   blueRay br = new blueRay();
//	   dvd dv = new dvd();
//	   dv.Disk(dv);
//	   dv.Disk(br);
	   
	   
      Scanner s = new Scanner(System.in);
      AdminHandler adminHandler = new AdminHandler();
      BookHandler b1 = new BookHandler();
      User u = new User();
      Admin a = new Admin();
      Employee e = new Employee();
      Vector<User> v = new Vector<User>();
      CustomLogFormatter c = new CustomLogFormatter();
      
      c.logTest();
      c.logPrint();
      //c.addFileHandler(logger);
      
      int checkNum;
      int num = 0;
      int retry = 0;
      
      System.out.println("관리자..1, 회원..2, 직원..3");
      checkNum = adminHandler.CheckAD();
      
      do {
    	  try {//관리자 회원 직원 선택 try문
         if (checkNum ==  MenuNum.num1) {
            if (adminHandler.LoginCnt ==  MenuNum.num0) {
               adminHandler.Login(a);
            }
            else {
               System.out.println("관리자 계정입니다. 기능을 선택하세요 : ");
               System.out.println("1 : 회원 등록");
               System.out.println("2 : 회원 정보 출력");
               System.out.println("3 : 회원 검색");
               System.out.println("4 : 회원 삭제");
               System.out.println("5 : 회원 정렬");
               System.out.println("6 : 도서 관리");
               System.out.println("7 : 로그아웃");
               System.out.println("0 : 기능선택창으로 이동");
               
               try {//관리자 기능선택 try문
            	   num = s.nextInt();
            	   
            	   switch (num) {
            	   case  MenuNum.num1 : adminHandler.registerUser(u); break;
            	   case MenuNum.num2 : adminHandler.showUser(u); break;
            	   case MenuNum.num3 : adminHandler.searchUser(u); break;
            	   case MenuNum.num4 : adminHandler.deleteUser(u); break;
            	   case MenuNum.num5 : adminHandler.sortUser(u); break;
            	   case MenuNum.num6 : 
            			   
            				   do {
            					   System.out.println("원하는 메뉴를 선택하세요");
            					   System.out.println("1. 도서 입력");
            					   System.out.println("2. 도서 출력");
            					   System.out.println("3. 도서 검색");
            					   System.out.println("4. 도서 정렬");
            					   System.out.println("5. 도서 삭제");
            					   System.out.println("6. 도서 반납 대여");
            					   System.out.println("0. 종료");
            				  
            					   try {//도서관리 기능선택 try문
            						   num =s.nextInt();
            						   switch (num) {
            						   case MenuNum.num1 : b1.inputBook(); break;
            						   case MenuNum.num2 : b1.outBook(); break;
            						   case MenuNum.num3 : b1.searchBook(); break;
            						   case MenuNum.num4 : b1.sortBook(); break;
            						   case MenuNum.num5 : System.out.println("책 제목으로 삭제..1, 책 코드로 삭제..2");
            						   
            						   try {//삭제함수 try문
            							   num = s.nextInt();
            							   if (num == MenuNum.num1) {
            								   b1.deleteBook1(); break;
            							   }
            							   else if (num == MenuNum.num2) {
            								   b1.deleteBook2(); break;
            							   }
            							   
            						   }catch (InputMismatchException ie) {
            							   s.nextLine();
            							   System.out.println("잘못된 값입니다."); break;
            							   
            						   }//삭제함수 try문 종료
            						   case 6 : System.out.println("대출하기..1, 반납하기..2"); 
            						   try {//대여반납 try문
            							   num = s.nextInt();
            							   if (num == MenuNum.num1) {
            								   b1.borrowBook(u); break;
            							   }
            							   else if (num == MenuNum.num2) {
            								   b1.returnBook(u); break;
            							   }
            							   
            						   }catch (InputMismatchException ie) {
            							   s.nextLine();
            							   System.out.println("올바른 숫자를 입력하세요. "); break;	
            						   }//대여반납 try문 종료
            						   
            						   }
            						   
            					   }catch (InputMismatchException ie) {
            						   s.nextLine();
                    				   System.out.println("올바른 숫자를 입력하세요. "); break;
            					   }//도서관리 기능선택 try문 종료
            			   } while (num != MenuNum.num0);   
            				   
            		   if (num == MenuNum.num0)
            			   System.out.println();
            	   case MenuNum.num7 : adminHandler.Logout(); break;
            	   case MenuNum.num0 : break;
            	   }
            	   
               }catch(InputMismatchException ie) {
            	   s.nextLine();
            	   System.out.println("올바른 숫자를 입력하세요. "); break;
            	   
               }//관리자 기능선택 try문 종료
               
               
            }

         }
         
         else if (checkNum == MenuNum.num2) {
            if (adminHandler.LoginCnt == MenuNum.num0) {
               System.out.println("기능 선택");
               System.out.println("1 : 로그인");
               System.out.println("2 : 회원가입");
               try {//로그인, 회원가입 기능선택 try문
            	   num = s.nextInt();
            	   if (num == MenuNum.num1)
            		   adminHandler.userLogin(u);
            	   else if (num == MenuNum.num2) {
            		   adminHandler.registerUser(u);
            	   }            	   
               }catch(InputMismatchException ie){
                   s.nextLine();
                   System.out.println("올바른 숫자를 입력하세요. ");
                   s.nextLine();
                   System.out.println("올바른 숫자를 입력하세요. ");
               }//로그인, 회원가입 기능선택 try문 종료
            }
            else {
                  System.out.println("사용자 계정입니다. 기능을 선택하세요.");
                  System.out.println("1 : 정보 찾기");
                  System.out.println("2 : 회원 탈퇴");
                  System.out.println("3 : 도서관 입장");
                  System.out.println("4 : 로그아웃");
                  System.out.println("5 : 회원정보");
                  try {//사용자 기능선택 try문
                	  num = s.nextInt();
                	  switch (num) {
                	  case MenuNum.num1 : System.out.print("ID 찾기..1, PW 찾기..2");
                	  try {//ID,PW 찾기 try문
                		  num = s.nextInt();
                		  if (num == MenuNum.num1) {
                			  adminHandler.findID(u); break;
                		  }
                		  else if (num == MenuNum.num2) {
                			  adminHandler.findPW(u); break;
                		  }
                   	  }catch (InputMismatchException ie) {
						s.nextLine();
		                System.out.println("올바른 숫자를 입력하세요. ");
					}//ID,PW 찾기 try문
                	  case MenuNum.num2 : adminHandler.removeUser(u); break;
                	  case MenuNum.num3 : 
                		  do {
                			  System.out.println("원하는 메뉴를 선택하세요");
                			  System.out.println("1. 도서 출력");
                			  System.out.println("2. 도서 검색");
                			  System.out.println("3. 도서 정렬");
                			  System.out.println("4. 도서 반납 대여");
                			  System.out.println("5. 열람실 이용");
                			  System.out.println("0. 종료");
                			  
                			  try {//도서 기능 try문
                				  num =s.nextInt();
                				  switch (num) {
                				  case MenuNum.num1 : b1.outBook(); break;
                				  case MenuNum.num2 : b1.searchBook(); break;
                				  case MenuNum.num3 : b1.sortBook(); break;
                				  case MenuNum.num4 : System.out.println("대출하기..1, 반납하기..2"); 
                				  try {//4. 도서대여반납 함수 안의 대출 반납 선택 try문
                					  num = s.nextInt();
                					  if (num == MenuNum.num1) {
                						  b1.borrowBook(u); break;
                					  }
                					  else if (num == MenuNum.num2) {
                						  b1.returnBook(u); break;
                					  }
                					  
                				  }catch (InputMismatchException ie) {
                					  s.nextLine();
                                	  System.out.println("올바른 숫자를 입력하세요. ");
								}//4. 도서대여반납 함수 안의 대출 반납 선택 try문 종료

                				  case MenuNum.num5 : adminHandler.readingRoomUse();break;
                				  }
                				  
                			  }catch(InputMismatchException ie) {
                				  s.nextLine();
                            	  System.out.println("올바른 숫자를 입력하세요. ");
                			  }//도서 기능 try문 종료
                			  
                		  } while (num != MenuNum.num0);   
                		  if (num == MenuNum.num0)
                			  System.out.println();
                	  case MenuNum.num4 : adminHandler.Logout();break;
                	  case MenuNum.num5 : adminHandler.showUser(u);break;
                	  }
                	  
                  }catch (InputMismatchException ie) {
                	  s.nextLine();
                	  System.out.println("올바른 숫자를 입력하세요. ");
                  }//사용자 기능선택 try문 종료
               }
         }
            
         else if (checkNum == 3) {
            if (adminHandler.LoginCnt == 0) {
               adminHandler.Login(e);
            }
            else {
               System.out.println("직원 계정입니다. 기능을 선택하세요 : ");
               System.out.println("1 : 회원 등록");
               System.out.println("2 : 회원 정보 출력");
               System.out.println("3 : 회원 검색");
               System.out.println("4 : 회원 삭제");
               System.out.println("5 : 회원 정렬");
               System.out.println("6 : 도서 관리");
               System.out.println("7 : 로그아웃");
               System.out.println("0 : 기능선택창으로 이동");
               
               try {//직원 기능 선택 try문
            	   num = s.nextInt();
            	   switch (num) {
            	   case MenuNum.num1 : adminHandler.registerUser(e); break;
            	   case MenuNum.num2 : adminHandler.showUser(e); break;
            	   case MenuNum.num3 : adminHandler.searchUser(e); break;
            	   case MenuNum.num4 : adminHandler.deleteUser(e); break;
            	   case MenuNum.num5 : adminHandler.sortUser(e); break;
            	   case MenuNum.num6 : 
            		   do {
            			   System.out.println("원하는 메뉴를 선택하세요");
            			   System.out.println("1. 도서 입력");
            			   System.out.println("2. 도서 출력");
            			   System.out.println("3. 도서 검색");
            			   System.out.println("4. 도서 정렬");
            			   System.out.println("5. 도서 삭제");
            			   System.out.println("6. 도서 반납 대여");
            			   System.out.println("0. 종료");
            			   
            			   try {//직원 도서관리 try문
            				   num =s.nextInt();
            				   switch (num) {
            				   case MenuNum.num1 : b1.inputBook(); break;
            				   case MenuNum.num2 : b1.outBook(); break;
            				   case MenuNum.num3 : b1.searchBook(); break;
            				   case MenuNum.num4 : b1.sortBook(); break;
            				   case MenuNum.num5 : System.out.println("책 제목으로 삭제..1, 책 코드로 삭제..2");
            				   try {//직원 도서 삭제 함수 try문
            					   num = s.nextInt();
            					   if (num == MenuNum.num1) {
            						   b1.deleteBook1(); break;
            					   }
            					   else if (num == MenuNum.num2) {
            						   b1.deleteBook2(); break;
            					   }
            					   
            				   }catch (InputMismatchException ie) {
            					   System.out.println("잘못된 입력 값입니다.");
							}//직원 도서 삭제 함수 try문 종료
            				   case MenuNum.num6 : System.out.println("대출하기  : 1, 반납하기  : 2"); 
            				   try {//직원 도서 대여 반납 함수의 try문
            					   num = s.nextInt();
            					   if (num == MenuNum.num1) {
            						   b1.borrowBook(u); break;
            					   }
            					   else if (num == MenuNum.num2) {
            						   b1.returnBook(u); break;
            					   }
            					   
            				   }catch (InputMismatchException ie) {
            					   System.out.println("잘못된 입력 값입니다.");
							}//직원 도서 대여 반납 함수의 try문 종료
            			}
            				   
            			   }catch (InputMismatchException ie) {
            				   System.out.println("잘못된 입력 값입니다.");
						}//직원 도서관리 try문 종료
            			   
            		   } while (num != MenuNum.num0);   
            		   if (num == MenuNum.num0)
            			   System.out.println();
            	   case MenuNum.num7 : adminHandler.Logout(); break;
            	   case MenuNum.num0 : break;
            	   }
            	   
               }catch (InputMismatchException ie) {
            	   System.out.println("잘못된 입력 값입니다.");
			}//직원 기능 선택 try문
            }
         }
      }catch (InputMismatchException ie) {
    	  System.out.println("올바른 숫자를 입력하세요. ");
  	}//관리자 회원 직원 선택 try문 종료
         
         System.out.println("계속 하시려면 1번, 관리자/사용자/직원 변환은 2번 종료는 0번 ? : ");
         retry = s.nextInt();
         if (retry == MenuNum.num0) {
            adminHandler.Logout();
         }
         else if (retry == MenuNum.num2) {
            System.out.print("관리자..1, 회원..2 직원..3");
            checkNum = adminHandler.CheckAD();
            adminHandler.LoginCnt = MenuNum.num0;
         }
            
      } while (retry != MenuNum.num0);
      
   }
      
}