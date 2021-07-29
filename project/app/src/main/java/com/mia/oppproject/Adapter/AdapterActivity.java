package com.mia.oppproject.Adapter;

import android.os.Bundle;

import com.mia.oppproject.BaseActivity;
import com.mia.oppproject.databinding.ActivityAdapterBinding;

public class AdapterActivity extends BaseActivity {

    ActivityAdapterBinding binding;
    CookInterface cookInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAdapterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        cookInterface = new KoreanFoodChef();

        initListener();
    }

    public void initListener() {
        binding.btnOrder.setOnClickListener(v->{ cookInterface.cook(); });
        binding.ivKoreanFoodChef.setOnClickListener(v->{ setCookInterface(new KoreanFoodChef()); });
        binding.ivChineseFoodChef.setOnClickListener(v->{ setCookInterface(new ChineseFoodChef()); });
        binding.ivJapaneseFoodChef.setOnClickListener(v->{ setCookInterface(new JapaneseFoodChef()); });
        // 어댑터 사용
        binding.ivPastryChef.setOnClickListener(v->{ setCookInterface(
                new FoodAndPastryChefAdapter(new PastryChef())
        ); });
    }

    public void setCookInterface(CookInterface _cookInterface) {
        cookInterface = _cookInterface;
    }

    // 한식 요리사
    class KoreanFoodChef implements CookInterface {

        @Override
        public void cook() {
            showToast("한국 요리사가 비빔을 만듭니다.");
        }
    }

    // 중식 요리사
    class ChineseFoodChef implements CookInterface {

        @Override
        public void cook() {
            showToast("중식 요리사가 자장면을 만듭니다.");
        }
    }

    // 일식 요리사
    class JapaneseFoodChef implements CookInterface {

        @Override
        public void cook() {
            showToast("일식 요리사가 초밥을 만듭니다.");
        }
    }

    // 파티시에
    class PastryChef implements BakeInterface {

        @Override
        public void bake() {
            showToast("파티시에가 빵을 굽습니다.");
        }
    }

    // 어댑터 (요리사 - 파티시에)
    class FoodAndPastryChefAdapter implements CookInterface {
        private BakeInterface bakeInterface;

        public FoodAndPastryChefAdapter(BakeInterface _bakeInterface) {
            bakeInterface = _bakeInterface;
        }

        public void cook() {
            bakeInterface.bake();
        }
    }
}