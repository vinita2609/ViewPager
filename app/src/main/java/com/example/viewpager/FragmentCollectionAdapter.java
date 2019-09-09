package com.example.viewpager;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class FragmentCollectionAdapter extends PagerAdapter {

    private int[] Swipe_images = {R.drawable.image1,R.drawable.image2,R.drawable.image3,R.drawable.image4,R.drawable.image5};
    private LayoutInflater layoutInflater;
    Context context;


    public FragmentCollectionAdapter(Context context){

        this.context = context;
    }

    @Override
    public int getCount() {
        return Swipe_images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    public Object instantiateItem(ViewGroup container, int position){
        layoutInflater =(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item_view = layoutInflater.inflate(R.layout.swipe_pager,container,false);
        ImageView imageView = item_view.findViewById(R.id.imgpage);
        imageView.setImageResource(Swipe_images[position]);
        container.addView(item_view);

        return item_view;

    }

    public void destroyItem(ViewGroup container, int position, Object object){

        container.removeView((LinearLayout)object);
    }
}
