package org.g0v.jrf_attorney;

import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;

import com.astuetz.PagerSlidingTabStrip;

import org.g0v.jrf_attorney.adapter.TabAdapter;


public class MainActivity extends ActionBarActivity {

    RelativeLayout relativeLayout;
    PagerSlidingTabStrip tabs;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout_Main);
//        tabs = new PagerSlidingTabStrip(this);
//        viewPager = new ViewPager(this);
//        viewPager.setAdapter(new TabAdapter(getSupportFragmentManager()));
//        tabs.setViewPager(viewPager);
//        relativeLayout.addView(tabs);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
