package i;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;
import m.C1039b;

/* renamed from: i.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0858A extends ContentFrameLayout {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C0860C f11532l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0858A(LayoutInflaterFactory2C0860C layoutInflaterFactory2C0860C, C1039b c1039b) {
        super(c1039b, null);
        this.f11532l = layoutInflaterFactory2C0860C;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f11532l.s(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x8 = (int) motionEvent.getX();
            int y4 = (int) motionEvent.getY();
            if (x8 < -5 || y4 < -5 || x8 > getWidth() + 5 || y4 > getHeight() + 5) {
                LayoutInflaterFactory2C0860C layoutInflaterFactory2C0860C = this.f11532l;
                layoutInflaterFactory2C0860C.q(layoutInflaterFactory2C0860C.x(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i4) {
        setBackgroundDrawable(h4.g.k(getContext(), i4));
    }
}
