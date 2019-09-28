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
    ? v-for 각 요소에 어떻게 접근하지?

## Main
  최상위 Body부분에 스크롤 제한.
