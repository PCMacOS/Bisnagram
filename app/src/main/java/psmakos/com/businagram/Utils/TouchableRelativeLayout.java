package psmakos.com.businagram.Utils;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

/**
 * Created by psmakos on 1/3/2019.
 */

public class TouchableRelativeLayout extends RelativeLayout {
    public TouchableRelativeLayout(Context context) {
        super(context);
    }

    public TouchableRelativeLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TouchableRelativeLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean performClick() {
        return super.performClick();
    }
}
