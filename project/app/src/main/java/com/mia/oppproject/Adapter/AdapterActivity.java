package com.mia.oppproject.Adpater;
package com.mia.oppproject.Adpater.CookInterface;
package com.mia.oppproject.Adpater.BakeInterface;

public class AdapterActivity extends BaseActivity {

    ActivityAdapterBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAdapterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


    }

    // 한식 요리사
    class KoreanFoodChef implements CookInterface {
        public void cook() {
            showToast("한식을 요리합니다.");
        }
    }

    // 중식 요리사
    class ChineseFoodChef implements CookInterface {
        public void cook() {
            showToast("중식을 요리합니다.");
        }
    }

    // 일식 요리사
    class JapaneseFoodChef implements CookInterface {
        public void cook() {
            showToast("일식을 요리합니다.");
        }
    }

    // 파티시에
    class PastryChef implements BakeInterface {
        public void cook() {
            showToast("빵을 만듭니다.");
        }
    }

    // 어댑터 (요리사 - 파티시에)
    class FoodAndPastryChefAdapter implements CookInterface {
        private BakeInterface bakeInterface;

        public void FoodAndPastryChefAdapter(BakeInterface _bakeInterface) {
            bakeInterface = _bakeInterface;
        }

        public void cook() {
            bakeInterface.bake();
        }
    }

    /**
     * 어댑터는 인터페이스가 서로 다른 객체들이
     * 같은 형식 아래 작동할 수 있도록 하는 역할을 한다.
     *
     * 예를 들어, 어떤 식당에서 파티셰를 고용했다.
     * 요리사는 요리를 하고 파티셰는 제과를 한다고 가정해보자.
     * 매니저는 요리사한테는 요리해라,
     * 파티셰한테는 제과해라 하기가 번거롭다.
     * 그래서 파티셰한테 어댑터를 달아주고 앞으로 매니저가
     * 요리해달라고 하면 파티셰는 제과를 하면 되는 것이다.
     */
}