package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.buzbuz.smartautoclicker.R;

/* loaded from: classes.dex */
public final class F extends SeekBar {

    /* renamed from: d, reason: collision with root package name */
    public final G f13078d;

    public F(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        a1.a(this, getContext());
        G g8 = new G(this);
        this.f13078d = g8;
        g8.b(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        G g8 = this.f13078d;
        F f8 = g8.f13079e;
        Drawable drawable = g8.f13080f;
        if (drawable != null && drawable.isStateful() && drawable.setState(f8.getDrawableState())) {
            f8.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f13078d.f13080f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f13078d.g(canvas);
    }
}
