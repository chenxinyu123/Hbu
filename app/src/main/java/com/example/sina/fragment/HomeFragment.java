package com.example.sina.fragment;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.sina.R;
import com.example.sina.recylerviewmutitype.Adapter.MultiListAdapter;
import com.example.sina.recylerviewmutitype.Item.Item;
import com.example.sina.recylerviewmutitype.Item.ItemLarge;
import com.example.sina.recylerviewmutitype.Item.ItemSmall;
import com.example.sina.recylerviewmutitype.Item.ItemTitleBar;

import java.util.ArrayList;
import java.util.List;

import static android.widget.NumberPicker.OnScrollListener.SCROLL_STATE_IDLE;
import static androidx.viewpager.widget.ViewPager.SCROLL_STATE_DRAGGING;
import static androidx.viewpager.widget.ViewPager.SCROLL_STATE_SETTLING;


public class HomeFragment extends BaseFragment {


    private View view;
    private static final String TAG="HomeFragment";
    private List<Item> itemList = new ArrayList<>();
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        
        view=inflater.inflate(R.layout.fg_home,container,false);
        initdata();
        initrecyclerview();
        return  view;
    }

    private void initdata() {
//        itemList.add(new ItemTitleBar("Hot New", null));
//        itemList.add(new ItemTitleBar("Hot New", null));
//        itemList.add(new ItemTitleBar("Hot New", null));
//        itemList.add(new ItemTitleBar("Hot New", null));
//        itemList.add(new ItemTitleBar("Hot New", null));
//        itemList.add(new ItemTitleBar("Hot New", null));
//        itemList.add(new ItemTitleBar("Hot New", null));
//        itemList.add(new ItemTitleBar("Hot New", null));
//        itemList.add(new ItemTitleBar("Hot New", null));
//        itemList.add(new ItemTitleBar("Hot New", null));
//        itemList.add(new ItemTitleBar("Hot New", null));
//        itemList.add(new ItemTitleBar("Hot New", null));
//        itemList.add(new ItemTitleBar("Hot New", null));
//        itemList.add(new ItemTitleBar("Hot New", null));
//        itemList.add(new ItemTitleBar("Hot New", null));
//        itemList.add(new ItemTitleBar("Hot New", null));
//        itemList.add(new ItemTitleBar("Hot New", null));
//        itemList.add(new ItemTitleBar("Hot New", null));
//        itemList.add(new ItemTitleBar("Hot New", null));
//        itemList.add(new ItemTitleBar("Hot New", null));
//        itemList.add(new ItemTitleBar("Hot New", null));
//        itemList.add(new ItemTitleBar("Hot New", null));
//        itemList.add(new ItemTitleBar("Hot New", null));
//        itemList.add(new ItemTitleBar("Hot New", null));
//        itemList.add(new ItemTitleBar("Hot New", null));
//        itemList.add(new ItemTitleBar("Hot New", null));
//        itemList.add(new ItemTitleBar("Hot New", null));
//        itemList.add(new ItemTitleBar("Hot New", null));
//        itemList.add(new ItemTitleBar("Hot New", null));
//        itemList.add(new ItemTitleBar("Hot New", null));
//        itemList.add(new ItemTitleBar("Hot New", null));
//        itemList.add(new ItemTitleBar("Hot New", null));
//        itemList.add(new ItemTitleBar("Hot New", null));
//        itemList.add(new ItemTitleBar("Hot New", null));
//        itemList.add(new ItemTitleBar("Hot New", null));
//        itemList.add(new ItemTitleBar("Hot New", null));
//        itemList.add(new ItemTitleBar("Hot New", null));
//        itemList.add(new ItemTitleBar("Hot New", null));
//        itemList.add(new ItemTitleBar("Hot New", null));
//        itemList.add(new ItemTitleBar("Hot New", null));
//        itemList.add(new ItemTitleBar("Hot New", null));
//        itemList.add(new ItemTitleBar("Hot New", null));
//        itemList.add(new ItemTitleBar("Hot New", null));
//        itemList.add(new ItemTitleBar("Hot New", null));
//        itemList.add(new ItemTitleBar("Hot New", null));
//        itemList.add(new ItemTitleBar("Hot New", null));
//        itemList.add(new ItemTitleBar("Hot New", null));
        itemList.add(new ItemTitleBar("Hot New", null));

        itemList.add(new ItemLarge(
                "https://www.baidu.com/img/bd_logo1.png",
                "One More Light",
                "Linkin Park"));
        itemList.add(new ItemLarge(
               "https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=2393068126,1738019147&fm=26&gp=0.jpg",
                "Let Go ",
                "Avril Lavigne"));
        itemList.add(new ItemTitleBar("Recommended", null));
        itemList.add(new ItemSmall(
                "https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=356348121,2168052028&fm=15&gp=0.jpg",
                "Bridge to Terabithia"));
        itemList.add(new ItemSmall(
                    "https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=1076599534,1071751897&fm=26&gp=0.jpg",
                "Life Is Beautiful"));
        itemList.add(new ItemSmall(
                "https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=1209349532,658316725&fm=26&gp=0.jpg",
                "A Violent Flame"));
        itemList.add(new ItemTitleBar("Top Rated", null));
        itemList.add(new ItemLarge(
                "https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=4232672761,1656539337&fm=26&gp=0.jpg",
                "Furious image_7: Original Motion Picture Soundtrack",
                "Various Artists"));
        itemList.add(new ItemLarge(
                "https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=3979428591,4095596195&fm=26&gp=0.jpg",
                "Halo image_5: Guardians (Original Soundtrack)",
                "Kazuma Jinnouchi"));
        itemList.add(new ItemTitleBar("Hot New", null));

        itemList.add(new ItemLarge(
                "https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=1828169215,1953066718&fm=26&gp=0.jpg",
                "One More Light",
                "Linkin Park"));
        itemList.add(new ItemLarge(
                "https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=1681603394,2601331197&fm=26&gp=0.jpg",
                "Let Go ",
                "Avril Lavigne"));
        itemList.add(new ItemTitleBar("Recommended", null));
        itemList.add(new ItemSmall(
                "https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=3090948028,4034724502&fm=26&gp=0.jpg",
                "Bridge to Terabithia"));
        itemList.add(new ItemSmall(
                "https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=3925846261,3660467052&fm=26&gp=0.jpg",
                "Life Is Beautiful"));
        itemList.add(new ItemSmall(
                "https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=4099590183,1257813621&fm=26&gp=0.jpg",
                "A Violent Flame"));
        itemList.add(new ItemTitleBar("Top Rated", null));
        itemList.add(new ItemLarge(
                "https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=1735915163,2011973439&fm=26&gp=0.jpg",
                "Furious image_7: Original Motion Picture Soundtrack",
                "Various Artists"));
        itemList.add(new ItemLarge(
                "https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=1679257085,741700880&fm=11&gp=0.jpg",
                "Halo image_5: Guardians (Original Soundtrack)",
                "Kazuma Jinnouchi"));itemList.add(new ItemTitleBar("Hot New", null));

        itemList.add(new ItemLarge(
                "https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=1829061440,936565267&fm=26&gp=0.jpg",
                "One More Light",
                "Linkin Park"));
        itemList.add(new ItemLarge(
                "https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=2677593642,2363845250&fm=26&gp=0.jpg",
                "Let Go ",
                "Avril Lavigne"));
        itemList.add(new ItemTitleBar("Recommended", null));
        itemList.add(new ItemSmall(
                "https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=1070707300,1728574706&fm=26&gp=0.jpg",
                "Bridge to Terabithia"));
        itemList.add(new ItemSmall(
                "https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=1422374959,414525807&fm=26&gp=0.jpg",
                "Life Is Beautiful"));
        itemList.add(new ItemSmall(
                "https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=1588496680,2113326338&fm=26&gp=0.jpg",
                "A Violent Flame"));
        itemList.add(new ItemTitleBar("Top Rated", null));
        itemList.add(new ItemLarge(
                "https://ss1.bdstatic.com/70cFuXSh_Q1YnxGkpoWK1HF6hhy/it/u=126657924,2397216809&fm=26&gp=0.jpg",
                "Furious image_7: Original Motion Picture Soundtrack",
                "Various Artists"));
        itemList.add(new ItemLarge(
                "https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=2234246285,2156264807&fm=26&gp=0.jpg",
                "Halo image_5: Guardians (Original Soundtrack)",
                "Kazuma Jinnouchi"));

    }
    private boolean sIsScrolling=false;
    private void initrecyclerview() {
        GridLayoutManager layoutManager = new GridLayoutManager(getActivity(), 6);
        MultiListAdapter adapter = new MultiListAdapter(getContext(),itemList);
        adapter.setSpanCount(layoutManager);
        RecyclerView recyclerView = view.findViewById(R.id.recycle_view);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        recyclerView.setItemViewCacheSize(18);
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
                switch (newState){
                    case SCROLL_STATE_IDLE: // The RecyclerView is not currently scrolling.
                        //当屏幕停止滚动，加载图片
                        try {
                            if(getContext() != null) Glide.with(getContext()).resumeRequests();
                        }
                        catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;
                    case SCROLL_STATE_DRAGGING: // The RecyclerView is currently being dragged by outside input such as user touch input.
                    case SCROLL_STATE_SETTLING: // The RecyclerView is currently animating to a final position while not under outside control.
                        //由于用户的操作，屏幕产生惯性滑动，停止加载图片
                        //当屏幕滚动且用户使用的触碰或手指还在屏幕上，停止加载图片
                        try {
                            if(getContext() != null) Glide.with(getContext()).pauseRequests();
                        }
                        catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;
                }
            }
                @Override
                public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                    super.onScrolled(recyclerView, dx, dy);
                }
            });
        recyclerView.setDrawingCacheEnabled(true);
        recyclerView.setDrawingCacheQuality(View.DRAWING_CACHE_QUALITY_HIGH);
    }
}
