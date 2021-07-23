package com.mia.oppproject.Strategy;

import android.os.Bundle;

import com.mia.oppproject.BaseActivity;
import com.mia.oppproject.databinding.ActivityStrategyBinding;

public class StrategyActivity extends BaseActivity {

    ActivityStrategyBinding binding;
    SearchBtn searchBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityStrategyBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initListener();

        searchBtn = new SearchAll();
    }

    public void initListener() {
        // 검색
        binding.searchBtn.setOnClickListener(v->{ searchBtn.search(); });
        // 타입 설정
        binding.searchAll.setOnClickListener(v->{ setSearchBtn(new SearchAll());});
        binding.searchRice.setOnClickListener(v->{setSearchBtn(new SearchRice());});
        binding.searchChicken.setOnClickListener(v->{setSearchBtn(new SearchChicken());});
        binding.searchPizza.setOnClickListener(v->{setSearchBtn(new SearchPizza());});
    }

    public void setSearchBtn(SearchBtn _searchBtn) {
        searchBtn = _searchBtn;
    }

    class SearchAll implements SearchBtn {

        @Override
        public void search() {
            showToast("Search food!");
        }
    }

    class SearchRice implements SearchBtn {

        @Override
        public void search() {
            showToast("Search rice!");
        }
    }

    class SearchChicken implements SearchBtn {

        @Override
        public void search() {
            showToast("Search chicken!");
        }
    }

    class SearchPizza implements SearchBtn {

        @Override
        public void search() {
            showToast("Search pizza!");
        }
    }
}