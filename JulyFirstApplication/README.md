# JulyFirstApplication

문서 작성일: 2026-07-01

이 저장소는 안드로이드 기본 UI와 레이아웃, 뷰 참조, ViewBinding을 익히는 실습용 멀티 모듈 프로젝트입니다.

## 모듈별 학습 내용

### `app`
- 기본 Android 앱 구조 확인
- `enableEdgeToEdge()`와 WindowInsets 처리
- `setContentView()`와 `findViewById()`를 이용한 기본 화면 구성

### `xmllayout`
- XML 레이아웃의 기본 구조 학습
- `ConstraintLayout`을 이용한 단순 화면 배치
- 중앙 정렬된 텍스트 뷰 배치 연습

### `viewattribute`
- 뷰 속성 실습
- `layout_width`, `layout_height`, `orientation`, `layout_weight` 같은 속성 확인
- 중첩 `LinearLayout`을 이용한 버튼 배치 연습

### `visibleclick`
- `Button`을 `findViewById()`로 참조하는 방식 학습
- 뷰 ID 기반 조작의 출발점 확인
- 버튼 중심의 간단한 UI 구성 연습

### `lunch`
- 체크박스와 라디오버튼을 이용한 선택형 UI 구성
- 메뉴 선택/취소 같은 사용자 입력 화면 실습
- 텍스트, 구분선, 버튼을 조합한 간단한 폼 화면 학습

### `viewbindingexam`
- `ViewBinding` 활성화 방법 학습
- `ActivityMainBinding`으로 뷰 참조
- `resetBtn`, `changeBtn` 클릭 이벤트로 텍스트 변경 실습
- 기존 `findViewById()` 방식과 ViewBinding 방식의 차이 확인

## 오늘 배운 점

- XML 레이아웃은 모듈마다 다른 방식으로 UI를 구성할 수 있다.
- `ConstraintLayout`과 `LinearLayout`은 배치 목적에 따라 다르게 사용한다.
- 기존 `findViewById()`보다 ViewBinding이 더 안전하고 읽기 쉽다.
- 버튼, 체크박스, 라디오버튼 등을 조합하면 기본적인 입력 UI를 빠르게 만들 수 있다.
