# opp_design_pattern
객체지향 디자인 패턴


## ▪️ 전략 패턴 (Strategy Partten)
옵션들마다 행동을 모듈화해서 독립적이고 상호 교체 가능하게 하는 전략이다.<br/>
검색 동작 하나하나를 모듈로 분리해서 종류에 따라 검색하는 부분을 변경하는 것이다.<br/>
<img width="400" alt="스크린샷 2021-07-24 오전 2 00 44" src="https://user-images.githubusercontent.com/55366664/126816605-8440e66a-c2df-421c-b5ee-e0c4d24fd8cc.png">
<br/><br/><br/>

## ▪️ 상태 패턴 (State Pattern)
특정 상태마다 다르게 할 일을 모듈화해서 지정해둘 때 쓰는 방식이다. 메소드가 실행될 때 상태값도 변경된다.<br/>
라이트 모드에서 스위치를 가동하면 다크 모드로, 다크 모드에서는 라이트 모드로 상태가 전환된다.<br/><br/>
<img width="400" alt="스크린샷 2021-07-24 오후 6 05 40" src="https://user-images.githubusercontent.com/55366664/126873379-ad9e56b5-96e5-4d32-a2b4-637c2c81c246.png">
<br/><br/><br/>

## ▪️ 커맨드 패턴 (Command Pattern)
전략 패턴은 기능은 같고 방식이 다르다면 커맨트 패턴은 기능, 즉 하는 일 자체가 다르다.<br/>
방식은 다양하다. 모드 변경에 따라 명령을 갈아기우는 방식, 스위치 처럼 on/off 시 명령을 갈아끼우는 방식,<br>
여러 개의 명령을 목록으로 보내서 차례대로 실행하는 방식 등이 있다.<br/><br/>
🤖 로봇의 움직임: 2 칸 전진 -> 오른쪽으로 방향전환 -> 3 칸 전진 -> 왼쪽으로 방향전환 -> 1 칸 전진 <br>

<img width="400" alt="스크린샷 2021-07-27 오전 12 06 52" src="https://user-images.githubusercontent.com/55366664/127013599-708a3b90-97e8-4efd-96de-6bc375bdd9c9.png">
<br/><br/>

## ▪️ 어댑터 패턴 (Adapter Pattern)
어댑터는 인터페이스가 서로 다른 객체들이 같은 형식 아래 작동할 수 있도록 하는 역할을 한다. <br/><br/>
예를 들어, 어떤 식당에서 파티셰를 고용했다. 요리사는 요리를 하고 파티셰는 제과를 한다고 가정해보자. <br/>
매니저는 매번 요리사한테는 '요리해라', 파티셰한테는 '제과해라' 하기가 번거롭다. <br/><br/>
그래서 파티셰한테 어댑터를 달아주고 앞으로 매니저가 요리해달라고 하면 파티셰는 제과를 하면 되는 것이다.<br/><br/>
<img width="400" alt="스크린샷 2021-07-29 오후 8 55 39" src="https://user-images.githubusercontent.com/55366664/127487943-07abbf36-760d-4546-a635-cf85b848e210.png">
<br/><br/><br/>

## ▪️ 프록시 패턴 (Proxy Pattern)
프록시 클래스에서 필요할 때에만 주체가 되는 실제 객체를 생성하는 방식이다.<br/>
주체가 되는 객체는 민감한 정보를 가지고 있거나, 무거운 작업을 해야할 수 있다.<br/><br/>

이럴 경우, 프록시 클래스에서는 가벼운 작업만 진행하다가 주체가 되는 객체가 필요하게 되면 <br/>
생성하여 작업을 진행하도록 한다.<br/><br/>

예를 들어, 영상이 있다고 했을 때 프록시 클래스에서는 제목과 썸네일 정보를 보여주는 작업을 한다.<br/>
그러다가 영상을 클릭하면 실제 객체를 생성하여 영상을 가져오는 작업을 한다.<br/>
영상을 누르기 전까지는 가져오는 무거운 작업을 할 필요가 없기 때문에 효율적이다.<br/>

<img width="400" alt="스크린샷 2021-08-03 오후 9 12 52" src="https://user-images.githubusercontent.com/55366664/128013568-ccc80de6-b132-4a30-b3b6-bc933143fc51.png"><br/><br/>

## 😎 프로젝트
- [Strategy](https://github.com/imcodding/opp_design_pattern/tree/main/project/app/src/main/java/com/mia/oppproject/Strategy) - 카테고리에 따른 검색
- [State](https://github.com/imcodding/opp_design_pattern/tree/main/project/app/src/main/java/com/mia/oppproject/State) - 스위치를 통한 라이트/다크 모드 변경
- [Command](https://github.com/imcodding/opp_design_pattern/tree/main/project/app/src/main/java/com/mia/oppproject/Command) - 로봇이 수행하게 할 동작 명령
- [Adapter](https://github.com/imcodding/opp_design_pattern/tree/main/project/app/src/main/java/com/mia/oppproject/Adapter) - 요리사와 파티셰에게 주문하기
- [Proxy](https://github.com/imcodding/opp_design_pattern/tree/main/project/app/src/main/java/com/mia/oppproject/Proxy) - 동영상 클릭 시, 재생 작업 진행
