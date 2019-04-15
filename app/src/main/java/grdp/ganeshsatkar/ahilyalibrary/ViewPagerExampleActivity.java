package grdp.ganeshsatkar.ahilyalibrary;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class ViewPagerExampleActivity extends Activity {
	
	/**
	 * Step 1: Download and set up v4 support library: http://developer.android.com/tools/support-library/setup.html
	 * Step 2: Create ExtendedViewPager wrapper which calls TouchImageView.canScrollHorizontallyFroyo
	 * Step 3: ExtendedViewPager is a custom view and must be referred to by its full package name in XML
	 * Step 4: Write TouchImageAdapter, located below
	 * Step 5. The ViewPager in the XML should be ExtendedViewPager
	 */

	@Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewpager_example);
        ExtendedViewPager mViewPager = (ExtendedViewPager) findViewById(R.id.view_pager);
        mViewPager.setAdapter(new TouchImageAdapter());
    }

    static class TouchImageAdapter extends PagerAdapter {

        private static int[] images = { R.drawable.suvidha_hall1, R.drawable.suvidha_acroom,
                R.drawable.flif44, R.drawable.flif2, R.drawable.flif3, R.drawable.suvidha_security,
                R.drawable.suvidha10, R.drawable.flif1,
                R.drawable.flif7, R.drawable.flif6, R.drawable.suvidha13, R.drawable.suvidha10, R.drawable.suvidha9,
                R.drawable.toilates, R.drawable.suvidha8, R.drawable.suvidha13, R.drawable.suvidha7

        };

        @Override
        public int getCount() {
        	return images.length;
        }

        @Override
        public View instantiateItem(ViewGroup container, int position) {
            TouchImageView img = new TouchImageView(container.getContext());
            img.setImageResource(images[position]);
            container.addView(img, LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
            return img;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

    }
}
