#19. 09. 23 Mon
## Main
  메뉴 버튼을 만들고 클릭에 따라 직접 만든 메뉴바를 렌더링 on, off 해주기
    + z-index를 이용해서 최상위 레이어로 변경
    + store에 값을 넣어주고, 메소드에서 상태에 따라 on, off 기능을 넣어줌
  로그아웃 버튼을 드롭박스 안에 넣어주고, 작동하게 하기.
    + Firebase 로그아웃을 DropdownView로 옮겨줌
    + 로그아웃시 store의 dropDown 값을 0으로 만들고나와서 재접속시 메뉴바가 뜨지 않게 0값을 유지하게 해줌.
  (1)컴포넌트 부분 높이 조절

## FriendListView
  임시로 어느 프로필을 누르든 ProfileView로 이동하게 만듬

## LoginView
  Enter로 로그인 확인 버튼 눌려주기 (이전 무비 토이 프로젝트 참고)
    + 비밀번호 인풋에 포커스가 되있으면 작동함.
  -FB-
    HTML 내에서 연산은 안하는게 좋음. 정확히는 안보이는게 좋음.
  (1)컴포넌트 부분 높이 조절

## ProfileView
  배경사진 표시하기
    + 이미지 비율은 고정 시키고 이미지를 잘라내서 안에 이미지를 넣어야됨.


#19. 09. 25 Wed
## README.md
  12, 13 라인 삭제
  setup은 환경설정 (ex: docker, node install, employment)

## ChatView
  새로 만들기
  채팅창과 하단 채팅 메시지간의 동적 사이즈 변경 -> 키워드 물어보기
  마우스 온오버 이벤트로 창 띄우기
  메뉴바
  온오프 토글 및 얼럿

## Main
  마우스 오버 이벤트 -> 모바일 페이지 보기일땐 안나오는 상황
    + 오른쪽 비는 이상한 공간 제거 (col-10 => col)

## FriendListView
  친구가 리스트로 나오는 부분은 영역을 제한하고 스크롤이 되게끔 해야됨.

# 좌우 정렬 종결자 #
  

#19. 09. 27 Fri
## ChatView
  TextArea 추가
    ? 동적으로 움직이는 창을 만들고 싶으니 보류중. 제이쿼리 예문이 많이 나오는데 뷰나 부트스트랩은 안보이는 것 같음.

## FriendListView
  사진을 누르면 프로필, 의외 공간은 채팅창으로 이동하게 끔 메소드 달아주기
    + 두개의 v-on:click() 이벤트가 겹침. 자식이 부모에게 전파함. 자식 부분에 @click.stop 를 걸어주니 해결.
  친구란의 프로필 부분의 이름을 더블클릭과 싱글클릭 이벤트를 구분하여, 싱글클릭시 div의 배경색상만 변경하게 하고 더블클릭시 해당 프로필을 연다.
    + 이미지 부분은 한번 클릭으로 열림.
    + v-on@click:dbclick() 으로 더블클릭을 구분해줄수 있음.
    + 참고 페이지 : https://stackoverflow.com/questions/41303982/vue-js-how-to-handle-click-and-dblclick-events-on-same-element
      -> TargetIndex 데이터를 만들어주고 클릭시 해당 div의 인덱스를 TargetIndex에 넣어줌.
      -> TargetIndex를 값 변경을 감지하는 Watch를 하나 만들어줌.
      -> Watch에서 요소를 리스트 덩어리로 들고옴($refs)
      -> 새로 바뀐 값이 곧 클릭한 인덱스이므로 targets[nValue].classList.toggle('active')를 통해 class를 활성화 시키고 반대의 경우엔
        targets[oValue].classList.remove('active') 를 써줌. 쥰낸 뷰스럽게 만듬.
      -> 원래 뷰에선 $refs 사용을 권장하지 않으나 어쩔수 없을땐 씀. 카피가 아닌 자체 뷰 프로젝트일땐 지양해도 괜찮을 듯 함.

## Main
  최상위 Body부분에 스크롤 제한.


#19. 09. 30 Mon

## FriendListView
  친구 리스트 열고 닫기 기능 만들어주기.
    + store에 상태값 등록
    + 친구창의 꺽쇠 부분 모습 변경 및 친구 숨기기

## ChatHistoryView, TimeLineView, NewFriendView, RegisterView 스피드하게 구조 만들기

## DB 구축하기
  프로필
    + 이름, 프로필사진, 프로필배경사진, 소개 메세지, 공유 게시글(=> 타임라인에도 올라감), 날짜
  채팅창
    + 채팅 내용, 날짜
  설치 라이브러리
    + Mybatis : ORM(data mapper)
    + Flyway : database migration
    + Thymeleaf : 웹페이지(template)
    + Lombok : 좋은 @annotation 많음
    + Spring Web :
    + MySQL Driver :
      => 해당 라이브러리 기본 개념 찾아보기
  !Maven 기본 개념 찾아보기
    => https://insomniachaos.tistory.com/55
  !docker 기본 개념 찾아보기
    => https://subicura.com/2017/01/19/docker-guide-for-beginners-1.html

    => 정리하자면
      IntelliJ를 이용하여 Maven를 설치된 환경에서 작업을 하며 
      Maven이 서버 운용에 필요한 각종 라이브러리를 설치 및 관리를 해준다.
      서버 또한 임포트해서 쓰는 느낌인데 서버 환경 관리가 굉장히 어려우므로 Docker를 이용해 가상 서버 환경을 구축
      이것을 불러들어 사용한다.
      

#19.10.02 Wed

## TimeLineView
  게시글 폼 만들기
    + 상단 : 작성자 프로필
    + 중단 : 게시글 내용
    + 하단 : 댓글창
    -> 하단에서 댓글쓰기 클릭시
    + 최하단 : 댓글 입력 부분
      - 좋아요를 한사람의 인원수와 아이콘 출력 -> 있을때만 출력해야됨
      - 꺽세 클릭시 좋아요를 한 사람의 프로필 출력
      - 하단 댓글 인풋 입력창
        사진, 아이콘, 인풋, 등록 버튼 순서

## DB스키마
  - user
    + 이름
    + 프로필사진
    + 프로필배경사진
    + 소개 메세지
    + 날짜
    + 친구 목록
    + 채팅했던 내역 (채팅 히스토리)
  - 게시글
    + 공유 게시글(=> 타임라인에도 올라감)
    + 날짜

#19.10.04 Fri
  ? 자꾸만 좌우로 스크롤이 생기며 사이즈가 커짐. 마진와 패딩으로 인해 커졌는데 이해가 필요한 상황
  ? 어디까지 만들지 정해야 함
    -> 현 프로젝트의 한계가 분명히 존재.
      1. 프로그램을 웹으로 옮기는 것이기 때문에 별도의 채팅창을 띄우는다는 등 웹 인터페이스와 별로 맞지 않음.
      2. 채팅 프로그램을 카피하는 것이나 웹사이트 오픈으로 채팅 테스트는 사실상 힘들다. 덤으로 게시글까지 말이다.
      3. 적어도 Spring으로 백엔드는 해봐야 다음 프로젝트 때 큰 도움이 될 것이다.
      4. 그렇기에 피드백을 확실히 하고 무엇이 문제인지 알고 다음 프로젝트로 넘어가야한다. 
        => 현재 사용하는 프레임워크들을 최대한 활용하는 개인 페이지를 만들고 서비스 단계까지 가보자.
  ? 웹
    프론트 엔드
      yarn(or npm)
        뷰
          html
          css -> (next post-css)
          vue lang
    백 엔드
      maven
        스프링
          java
        docker
          mysql
  ? 웹 말고 신경써야 할 외적인 것들
    -> 토익
    -> 정처기
    -> 학과 공부
    -> 취업 정보 수집
    -> 이력서 수정
    -> 알고리즘
    -> 자료구조