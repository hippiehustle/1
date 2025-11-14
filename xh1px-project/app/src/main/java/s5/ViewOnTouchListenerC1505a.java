package s5;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: s5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC1505a implements View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final Dialog f14553d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14554e;

    /* renamed from: f, reason: collision with root package name */
    public final int f14555f;

    /* renamed from: g, reason: collision with root package name */
    public final int f14556g;

    public ViewOnTouchListenerC1505a(Dialog dialog, Rect rect) {
        this.f14553d = dialog;
        this.f14554e = rect.left;
        this.f14555f = rect.top;
        this.f14556g = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(R.id.content);
        int left = findViewById.getLeft() + this.f14554e;
        int width = findViewById.getWidth() + left;
        if (new RectF(left, findViewById.getTop() + this.f14555f, width, findViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i4 = this.f14556g;
            obtain.setLocation((-i4) - 1, (-i4) - 1);
        }
        view.performClick();
        return this.f14553d.onTouchEvent(obtain);
    }
}
