July2Application - 학습 요약

작성일: 2026-07-02

프로젝트 개요
- 이 레포지토리는 여러 안드로이드 모듈을 실습용으로 포함합니다. 각 모듈에서 레이아웃, 뷰 바인딩, 윈도우 인셋 처리 등 UI 관련 학습을 진행했습니다.

모듈별 학습 내용

1) app
- 기본 액티비티 레이아웃(간단한 LinearLayout과 4개의 버튼)을 유지/복원.
- 프로젝트의 기본 앱 구조와 리소스 배치 학습.

2) phonepad
- 전화기 숫자패드 구현: 1~9, 0, 영상통화, 삭제 버튼 및 중앙 통화 버튼 추가.
- 둥근 버튼 드로어블 생성(round_button, round_button_delete, round_button_call).
- 상단 번호 표시 TextView와 '연락처 추가' 버튼 복원.
- MainActivity에서 WindowInsets 처리를 통한 엣지투엣지(안전영역) 적용 확인.

3) dogcatshow
- ViewBinding 사용하여 강아지/고양이 이미지 토글 구현.
- 간단한 버튼 이벤트 처리 및 뷰 가시성 토글 학습.

4) relativeexam
- RelativeLayout의 위치 제약(anchor) 실습: 여러 뷰를 기준 뷰에 상대적으로 배치하는 법 학습.

5) gravityexam
- LinearLayout/Gravity 실습: 뷰 정렬 및 배치 방법 확인.

다음 권장 작업
- phonepad: 버튼 클릭 리스너 연결(숫자 입력, 삭제, 다이얼링 Intent). 아이콘(vectordrawable) 적용 권장.
- 공통: 스타일/테마 정리 및 리소스 재사용(색상, dimens).

간단 메모
- 오늘은 주로 레이아웃 구성, 드로어블 정의, 그리고 phonepad 모듈의 기능 구현/복구 작업을 수행함.
- 파일 수정 이력: app 레이아웃 복구, phonepad에 키패드/드로어블 추가 및 통화 버튼 복원.
