package com.example.tablayoutandviewpager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.tablayoutandviewpager.databinding.ActivityMainBinding;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    PagerAdapter adapter;
    ArrayList<MyTab> tabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        tabs = new ArrayList<>();
        tabs.add(new MyTab("Food", CategoryFragment.newInstance("Food")));
        tabs.add(new MyTab("Drinks", CategoryFragment.newInstance("Drinks")));
        tabs.add(new MyTab("Deserts", CategoryFragment.newInstance("Deserts")));
        tabs.add(new MyTab("Other", CategoryFragment.newInstance("Other")));
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(CategoryFragment.newInstance("Food"));
        fragments.add(CategoryFragment.newInstance("Drinks"));
        fragments.add(CategoryFragment.newInstance("Deserts"));
        fragments.add(CategoryFragment.newInstance("Other"));

        adapter = new PagerAdapter(this,fragments);
        binding.mainPager.setAdapter(adapter);

        new TabLayoutMediator(binding.mainTabLayout, binding.mainPager,
                new TabLayoutMediator.TabConfigurationStrategy() {
                    @Override
                    public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                        tab.setText(tabs.get(position).getTabName());
                    }
                }).attach();







    }
}