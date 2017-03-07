/*
 created by yang_li
 this class for test.
 */

package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.investorz.stockchartview.R;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.MenuDrawable;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;

public class NewTmpActivity extends BaseFragment {


    private LinearLayout emptyView;
    @Override
    public View createView(Context context) {
        actionBar.setBackButtonDrawable(new MenuDrawable()); // it draw menu icon.
        parentLayout.getDrawerLayoutContainer().setAllowOpenDrawer(true,false); // it will be ignore.
        actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int id) {
                if (id == -1) {
                    // when you select the icon of menu, if you are going to make as backup icon, using this code " finishFragment();", if so, this fragment will be finish, and main DialogActivity will be show.
                    if (parentLayout != null) {
                        parentLayout.getDrawerLayoutContainer().openDrawer(false);// this code shows slide menu, parameter is true, animation is fast, false -> slow
                    }
                }
            }
        });

        actionBar.setSubtitle("by yang li...");
        actionBar.setTitle("Temp Activity ");
        if (!AndroidUtilities.isTablet()) {
            actionBar.showActionModeTop();
        }

        fragmentView = new FrameLayout(context); // this var is View for showing fragment.
        fragmentView.setBackgroundColor(0xfff0f0f0);
        FrameLayout viewGroup = (FrameLayout) fragmentView;
        Button mBtn = new Button(context); // this button for your request as named "Hamburger"

        mBtn.setTextColor(0xff4c8eca);
        mBtn.setGravity(Gravity.CENTER);
        mBtn.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 16);
        mBtn.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        mBtn.setText("Hamburger");
        viewGroup.addView(mBtn, new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT));
        emptyView = new LinearLayout(context); // this view is for capturing finger swipe.

        emptyView.setOrientation(LinearLayout.VERTICAL);
        emptyView.setGravity(Gravity.CENTER);
        viewGroup.addView(emptyView, LayoutHelper.createFrame(LayoutHelper.MATCH_PARENT, LayoutHelper.MATCH_PARENT));
        emptyView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return true;
            }
        });
        return fragmentView;
    }
}
