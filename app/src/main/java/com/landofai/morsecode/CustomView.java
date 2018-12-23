package com.landofai.morsecode;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Parmar on 21-12-2018.
 */

public class CustomView extends LinearLayout {
    LinearLayout layout = null;
    TextView leftTextView = null;
    TextView rightTextView = null;
    Context mContext = null;

    public CustomView(Context context) {

        super(context);
        mContext = context;
    }

    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);

        mContext = context;

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.CustomView);

        String leftText = a.getString(R.styleable.CustomView_leftText);
        String rightText = a.getString(R.styleable.CustomView_rightText);

        leftText = leftText == null ? "" : leftText;
        rightText = rightText == null ? "" : rightText;

        String service = Context.LAYOUT_INFLATER_SERVICE;
        LayoutInflater li = (LayoutInflater) getContext().getSystemService(service);

        layout = (LinearLayout) li.inflate(R.layout.customview, this, true);

        leftTextView = (TextView) layout.findViewById(R.id.left_text);
        rightTextView = (TextView) layout.findViewById(R.id.right_text);

        leftTextView.setText(leftText);
        rightTextView.setText(rightText);

        a.recycle();
    }

    public CustomView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        mContext = context;
    }

    @SuppressWarnings("unused")
    public void setLeftText(String text) {
        leftTextView.setText(text);
    }

    @SuppressWarnings("unused")
    public void setRightText(String text) {
        rightTextView.setText(text);
    }

    @SuppressWarnings("unused")
    public String getLeftText() {
        return leftTextView.getText().toString();
    }

    @SuppressWarnings("unused")
    public String getRightText() {
        return rightTextView.getText().toString();
    }

}