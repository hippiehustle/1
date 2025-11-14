package o;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public final class W0 extends TouchDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final View f13147a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f13148b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f13149c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f13150d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13151e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13152f;

    public W0(View view, Rect rect, Rect rect2) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f13151e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f13148b = rect3;
        Rect rect4 = new Rect();
        this.f13150d = rect4;
        Rect rect5 = new Rect();
        this.f13149c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i4 = -scaledTouchSlop;
        rect4.inset(i4, i4);
        rect5.set(rect2);
        this.f13147a = view;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z8;
        boolean z9;
        int x8 = (int) motionEvent.getX();
        int y4 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z10 = true;
        if (action != 0) {
            if (action != 1 && action != 2) {
                if (action == 3) {
                    z9 = this.f13152f;
                    this.f13152f = false;
                }
                z8 = true;
                z10 = false;
            } else {
                z9 = this.f13152f;
                if (z9 && !this.f13150d.contains(x8, y4)) {
                    z10 = z9;
                    z8 = false;
                }
            }
            z10 = z9;
            z8 = true;
        } else {
            if (this.f13148b.contains(x8, y4)) {
                this.f13152f = true;
                z8 = true;
            }
            z8 = true;
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        Rect rect = this.f13149c;
        View view = this.f13147a;
        if (z8 && !rect.contains(x8, y4)) {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        } else {
            motionEvent.setLocation(x8 - rect.left, y4 - rect.top);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
