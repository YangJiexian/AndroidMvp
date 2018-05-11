package top.daxianwill.frame.tool;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by admin on 2017/8/1.
 */

public class RingView extends View {
    private Context mContext;

    private void init(){

    }

    public RingView(Context context) {
        super(context);
        mContext = context;
        init();
    }

    public RingView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
        init();
    }

    public RingView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mContext = context;
        init();
    }
}
