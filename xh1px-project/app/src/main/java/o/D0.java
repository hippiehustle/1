package o;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class D0 implements View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ E0 f13051d;

    public D0(E0 e02) {
        this.f13051d = e02;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C1173A c1173a;
        E0 e02 = this.f13051d;
        B0 b02 = e02.f13072u;
        Handler handler = e02.f13076y;
        int action = motionEvent.getAction();
        int x8 = (int) motionEvent.getX();
        int y4 = (int) motionEvent.getY();
        if (action == 0 && (c1173a = e02.f13056C) != null && c1173a.isShowing() && x8 >= 0 && x8 < e02.f13056C.getWidth() && y4 >= 0 && y4 < e02.f13056C.getHeight()) {
            handler.postDelayed(b02, 250L);
            return false;
        }
        if (action == 1) {
            handler.removeCallbacks(b02);
            return false;
        }
        return false;
    }
}
