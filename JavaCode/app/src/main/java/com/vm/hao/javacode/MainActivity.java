package com.vm.hao.javacode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private LinearLayout linearLayoutRoot;
    private RelativeLayout relativeLayoutRoot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

//        initLayoutbyLinear();
        iniLayoutbyReleative();

//        setContentView(linearLayoutRoot);
        setContentView(relativeLayoutRoot);
    }
    public void iniLayoutbyReleative(){
        //RelativeLayout Root
        relativeLayoutRoot = new RelativeLayout(this);
//        RelativeLayout.LayoutParams relayoutParams = new RelativeLayout.LayoutParams
//                (ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);

        //RelativeLayout Second
        RelativeLayout relativeLayoutSecond = new RelativeLayout(this);
        RelativeLayout.LayoutParams relayoutParamsSecond = new RelativeLayout.LayoutParams
                (ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        relativeLayoutSecond.setId(R.id.rl);
//        relativeLayoutSecond.setLayoutParams(relayoutParamsSecond);

        //ImageView
        ImageView imgAvatar = new ImageView(this);
        imgAvatar.setLayoutParams(new RelativeLayout.LayoutParams
                (ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        imgAvatar.setId(R.id.imgAvatar);
//        imgAvatar.setImageResource(R.drawable.datepicker_example);
        imgAvatar.setImageResource(R.mipmap.ic_launcher);

        //TextView
        TextView tv = new TextView(this);
        RelativeLayout.LayoutParams layoutParamsTv = new RelativeLayout.LayoutParams
                (ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParamsTv.addRule(RelativeLayout.CENTER_VERTICAL);
        layoutParamsTv.setMargins(20,0,0,0);
        layoutParamsTv.addRule(RelativeLayout.RIGHT_OF,imgAvatar.getId());
        tv.setText(getString(R.string.sologan));
        tv.setLayoutParams(layoutParamsTv);

        relativeLayoutSecond.addView(imgAvatar);
        relativeLayoutSecond.addView(tv);

        //Button click
        Button btnClick = new Button(this);
        RelativeLayout.LayoutParams layoutParamsbtnClick = new RelativeLayout.LayoutParams
                (ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        btnClick.setId(R.id.btnClick);
        layoutParamsbtnClick.addRule(RelativeLayout.BELOW,relativeLayoutSecond.getId());
        layoutParamsbtnClick.addRule(RelativeLayout.CENTER_HORIZONTAL);
        btnClick.setPadding(10,10,10,10);
        btnClick.setText(getString(R.string.btnClick));

        //Button Hihi
        Button btnHihi = new Button(this);
        RelativeLayout.LayoutParams layoutParamsbtnHihi = new RelativeLayout.LayoutParams
                (ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
//        layoutParamsbtnHihi.addRule(RelativeLayout.BELOW,relativeLayoutSecond.getId());
        layoutParamsbtnHihi.addRule(RelativeLayout.BELOW,btnClick.getId());
        layoutParamsbtnHihi.addRule(RelativeLayout.CENTER_HORIZONTAL);
//        btnHihi.setPadding(10,10,10,10);
        btnHihi.setText(getString(R.string.btnHihi));

        relativeLayoutRoot.addView(relativeLayoutSecond, relayoutParamsSecond);
        relativeLayoutRoot.addView(btnClick,layoutParamsbtnClick);
        relativeLayoutRoot.addView(btnHihi,layoutParamsbtnHihi);
    }
    public void initLayoutbyLinear(){

        //LinearLayout Root
        linearLayoutRoot = new LinearLayout(this);
        LinearLayout.LayoutParams layoutParamsRoot = new LinearLayout.LayoutParams
                (ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        linearLayoutRoot.setOrientation(LinearLayout.VERTICAL);
        linearLayoutRoot.setLayoutParams(layoutParamsRoot);

        //LinearLayout Second
        LinearLayout linearLayoutSecond = new LinearLayout(this);
        LinearLayout.LayoutParams layoutParamsSecond = new LinearLayout.LayoutParams
                (ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        linearLayoutSecond.setOrientation(LinearLayout.HORIZONTAL);
        linearLayoutSecond.setLayoutParams(layoutParamsSecond);

        //ImageView
        ImageView imgView = new ImageView(this);
        imgView.setLayoutParams(new LinearLayout.LayoutParams
                (ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        imgView.setImageResource(R.mipmap.ic_launcher);

        //TextView
        TextView tv = new TextView(this);
        LinearLayout.LayoutParams layoutParamstv = new LinearLayout.LayoutParams
                (ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParamstv.gravity = Gravity.CENTER;
        layoutParamstv.setMargins(20,0,0,0);
        tv.setLayoutParams(layoutParamstv);
        tv.setText("Xin chào Android");

        linearLayoutSecond.addView(imgView);
        linearLayoutSecond.addView(tv);

        //Button Click
        Button btnClick = new Button(this);
        LinearLayout.LayoutParams layoutParamsClick = new LinearLayout.LayoutParams
                (ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParamsClick.gravity = Gravity.CENTER;
        btnClick.setPadding(20,0,0,0);
        btnClick.setText("Click để xem");
        btnClick.setLayoutParams(layoutParamsClick);

        //Button Hihi
        Button btnHihi = new Button(this);
        LinearLayout.LayoutParams layoutParamsHihi = new LinearLayout.LayoutParams
                (ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParamsHihi.gravity = Gravity.CENTER;
        btnHihi.setPadding(20,0,0,0);
        btnHihi.setText("Hihi xin chào");
        btnHihi.setLayoutParams(layoutParamsHihi);

        linearLayoutRoot.addView(linearLayoutSecond);
        linearLayoutRoot.addView(btnClick);
        linearLayoutRoot.addView(btnHihi);
    }
}
