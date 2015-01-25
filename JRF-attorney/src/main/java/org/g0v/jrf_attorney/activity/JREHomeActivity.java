package org.g0v.jrf_attorney.activity;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;

import com.takumalee.simplematerialpager.view.SimpleMaterialPagerView;

import org.g0v.jrf_attorney.R;

public class JREHomeActivity extends ActionBarActivity {

    private RelativeLayout relativeLayout;
    private SimpleMaterialPagerView mPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jrehome);
        initView();
    }

    private void initView() {
        relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout_JREHome);
        mPager = new SimpleMaterialPagerView(this);
        mPager.changeColor(getResources().getColor(android.R.color.holo_blue_dark));
        relativeLayout.addView(mPager);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_jrehome, menu);
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
