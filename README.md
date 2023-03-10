# Petwogether👩‍💻


## Summary
-  반려동물을 키우는 사람들, 혹은 키우려는 사람들과 펫 시터들에게 반려동물 돌봄 서비스 플랫폼을 제공하는 사이트입니다.
-  반려동물 관련 커뮤니티 기능과 유기동물 입양 가능한 플랫폼을 제공합니다.


&nbsp;
&nbsp;

### ✨프로젝트 목적
1.  갑작스럽게 반려동물을 누군가에게 맡겨야 하는 경우가 발생할 때 이용할 수 있는 플랫폼 제공
2.  유기동물 입양과 입양 이후의 이야기를 남기고 소통할 수 있는 플랫폼 제공

&nbsp;
&nbsp;

### ✨ERD
![git_erd](https://user-images.githubusercontent.com/111338981/214502487-8901dccb-1529-423f-849f-2c222179ddae.png)


&nbsp;
&nbsp;

### ✨주요기능
☑️ 회원가입

☑️ 로그인

☑️ 돌봄 서비스 신청하기

☑️ 돌봄 서비스 후기

☑️ 유기동물 입양하기

☑️ 유기동물 입양 후기

☑️ 펫시터 신청하기

☑️ QnA / 의료정보 게시판


&nbsp;
&nbsp;

### ✨ 사용 기술
| 기술분야 | 상세내용 |
| ------ | ------ |
| Front-end | HTML5, CSS, JavaScript, JQuery, Tiles, Thymeleaf |
| Back-end | JAVA, Spring, SpringBoot, MyBatis, Insomnia, REST JSON, JDBC |
| Server | Apache Tomcat |
| DB | Oracle, SQL |

&nbsp;
 &nbsp;     

### ✨ 담당 업무
     1. 돌봄 서비스 신청하기 클릭 시 펫 시터 목록 출력 및 선택
     2. 펫시터 선택 이후 서비스 이용 시작 날짜/종료 날짜, 서비스 종류, 맡길 반려동물 선택
     3. 서비스 신청하기 버튼 클릭 시 신청 완료
     4. 입양후기 게시판 CRUD
     
&nbsp;
&nbsp;
&nbsp;
     
    


 ### ✨주요 구현 화면
 &nbsp;
 &nbsp;
#### ✅ _반려동물 돌봄 서비스 신청(펫 시터 선택)_
![펫시터선택](https://user-images.githubusercontent.com/111338981/214503192-94822bee-80ba-4f58-b5c7-85fb13a0421a.png)

 
&nbsp;
&nbsp;
- __내용__
 

    사용자가 돌봄 서비스 신청을 클릭하였을 때 원하는 펫 시터를 선택하는 화면입니다.
    이때, 펫 시터의 이름, 연락처, 자격증 정보, 거주지 유형을 출력하여, 사용자가 알아야 할 기본 정보를
    보여준 후 사진을 클릭 하면 다음 화면(서비스 신청)으로 이동합니다.





- __기술__
     ###### Spring, MyBatis, JDBC, jQuery, Tiles
     
     Spring Framework를 사용하였습니다. 
     MyBatis를 통해서 DB에서 값을 가져와 반복문으로 출력하여 화면에 펫 시터 목록을 띄워주었으며, 
     사용자가 선택한 펫 시터의 Sequence를 GET방식으로 Controller에 전달하였습니다.
     처음에 Controller에서 Spring Framework를 사용하여 데이터를 받는 것이 익숙하지 않았던 탓에
     조금 헷갈렸지만 작동 원리와 순서를 고민하면서 코드를 작성하였더니 해결되었습니다. 



&nbsp;
&nbsp;
&nbsp;    
#### ✅ _반려동물 돌봄 서비스 신청(펫 시터 소개)_
![펫시터 소개](https://user-images.githubusercontent.com/111338981/214503405-3873c94a-5f29-4823-888b-f23d75293a9e.png)

&nbsp;
&nbsp;
- __내용__
 

    사용자가 선택한 펫 시터의 정보를 출력해줍니다.
    펫 시터가 가입시에 첨부한 본인 사진 파일과 개인정보 및 소개 글, 펫 시터가 키우는 반려동물,
    펫 시터 소유 자격증 을 출력해줍니다.




- __기술__
     ###### Spring, MyBatis, JDBC, jQuery, Tiles
     
     MyBatis를 이용하여 Database에 접근하여 데이터를 가져오고, 가져온 데이터를 Controller에서
     가공하여 View로 전달해주었습니다.



&nbsp;
&nbsp;
&nbsp;    
#### ✅ _반려동물 돌봄 서비스 신청(서비스 이용 날짜 선택)_
![서비스 이용 날짜 선택](https://user-images.githubusercontent.com/111338981/214503461-999817ae-408b-4150-957d-24c0b5b58855.png)

&nbsp;
&nbsp;
- __내용__
 

    사용자가 선택한 펫 시터의 이용 가능한 날짜를 출력해줍니다.
    이곳에서 사용자는 이용을 원하는 날짜를 시작날짜와 종료날짜로 선택할 수 있으며,
    시작 날짜만 선택하는 경우 시작, 종료일을 동일하게 데이터를 저장합니다. 
    신청 완료된 날짜는 선택이 불가능합니다.




- __기술__
     ###### Spring, MyBatis, JDBC, jQuery, Tiles

    사용자가 선택할 날짜를 원하는 데이터 형태로 바꿔서 사용하는 것에 대해서 많이 고민했습니다.
    선택한 두 날짜 사이의 날짜 데이터 리스트를 가져오기 위해서 Controller에서 View에서 받은 
    두 날짜 데이터를 가지고 LocalDate의 datesUntil을 사용하여 데이터 리스트를 생성하였고,
    반복문을 통해 각각 날짜에 해당하는 상태를 MyBatis를 통해 Database에 Update 해주었습니다.




&nbsp;
&nbsp;
&nbsp;       
#### ✅ _반려동물 돌봄 서비스 신청(서비스 및 반려동물 선택)_
![서비스_반려동물 선택](https://user-images.githubusercontent.com/111338981/214503554-61b8dcc0-904f-489f-97b0-18c65d1796fc.png)



&nbsp;
&nbsp;
- __내용__
 

    이용할 서비스를 선택하면, 기존에 사이트에서 정해 둔 금액과 선택한 반려동물 수에 맞추어
    1일 이용 금액을 출력해줍니다.
    신청하기 클릭 시 DB에 두 테이블이 변경되며, 이때, 일정, 서비스, 반려동물 중 누락된 것이
    있는 경우에는 경고창을 통해 누락된 부분을 사용자에게 알립니다.





- __기술__
     ###### Spring, MyBatis, JDBC, jQuery, Tiles

    이전에는 한가지 기능을 사용하면 단순하게 하나의 테이블 접근만 이루어졌던 반면에, 
    해당 기능을 통해서 하나의 페이지를 통해서 연쇄적으로 관련되어 있는 여러 테이블에 동시에 접근하여 
    데이터를 이용하는 것에 대해서 공부 할 수 있었습니다.


  

&nbsp;
&nbsp;
&nbsp;    


 ### ✨프로젝트를 통해
 
 ### ✅ 최종 파이널 프로젝트

 
JSP, Servlet을 활용한 프로젝트를 진행한 이후에 Spring Framework와 Spring Boot를 배우면서, 이전보다 훨씬 간편한 방식으로 Model, View, Controller를 활용할 수 있다는 점이 매우 편리하게 느껴졌습니다. 

의존성 주입의 대상에 대해 이론으로는 다소 어렵게 느껴졌던 부분이 프로젝트를 진행하면서 보다 명확하게 이해가 되었습니다. 또한, include 방식을 통해서 조각 페이지 관리를 했던 것과 다르게 Tiles를 사용하여 layout을 미리 설정하고 내부 html 코드만 수정하는 방식이 매우 편리했습니다.

MyBatis를 활용하여 이전보다 쿼리 코드를 효율적으로 관리할 수 있었으며, MyBatis를 사용할 때 binding 방식을 #과 $을 각각의 데이터 형태에 따라 사용하는 방법에 대해서도 확실하게 정리할 수 있었습니다.

돌봄 서비스 신청 페이지를 만드는데 있어서, 한 페이지에 여러 기능들 각각의 데이터를 원하는 형태로 Controller로 넘겨주는 방법에 대해서 많이 고민할 수 있었으며, 지난 JSP, Servlet 프로젝트에 이어서 원하는 데이터를 어떻게 얻어야 하는지 명확하게 알게 되었습니다. 

REST를 활용하여 데이터를 가져와 화면에 출력하고, 검색시에 Ajax를 활용하여 목록을 비동기 방식으로 업데이트 하면서 REST 방식에 대해 많이 공부할 수 있었고, 다양한 API들이 REST 방식으로 제공되는 것을 알게 되면서 REST 방식의 Open API를 더 많이 활용해보고 싶단 생각을 하게 되었습니다.

마지막 프로젝트를 진행하면서, 프로젝트 셋팅을 Spring과 Spring Boot에 각각 해주어야 하는 상황에서 Spring Boot 프로젝트 생성 및 셋팅을 완성하여 팀원들에게 배포하였습니다.

맡은 기능이 다른 팀원과 공유되는 부분이 있을 때는 적극적으로 소통을 시도하여, 작업 효율을 높일 수 있었습니다.

팀 프로젝트는 누군가 혼자 하는 것이 아닌 서로 일을 적절하게 분배하여 진행할 때, 효율이 많이 늘어난다는 것을 다시 한번 느낄 수 있는 프로젝트였습니다.







&nbsp;
&nbsp;
---
&nbsp;
&nbsp;
###### _프로젝트 기간_
- 2023.01.12 ~ 2023.01.30


###### _프로젝트 참여인원_
- 6명


