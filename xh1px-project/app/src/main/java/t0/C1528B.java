package t0;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: t0.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1528B extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public boolean f14696a = true;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1530D f14697b;

    public C1528B(C1530D c1530d) {
        this.f14697b = c1530d;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        C1530D c1530d;
        View l6;
        s0 M8;
        if (this.f14696a && (l6 = (c1530d = this.f14697b).l(motionEvent)) != null && (M8 = c1530d.f14722r.M(l6)) != null) {
            AbstractC1529C abstractC1529C = c1530d.f14717m;
            RecyclerView recyclerView = c1530d.f14722r;
            abstractC1529C.getClass();
            if ((AbstractC1529C.b(196611, recyclerView.getLayoutDirection()) & 16711680) != 0) {
                int pointerId = motionEvent.getPointerId(0);
                int i4 = c1530d.f14716l;
                if (pointerId == i4) {
                    int findPointerIndex = motionEvent.findPointerIndex(i4);
                    float x8 = motionEvent.getX(findPointerIndex);
                    float y4 = motionEvent.getY(findPointerIndex);
                    c1530d.f14710d = x8;
                    c1530d.f14711e = y4;
                    c1530d.f14715i = 0.0f;
                    c1530d.f14714h = 0.0f;
                    c1530d.f14717m.getClass();
                    c1530d.q(M8, 2);
                }
            }
        }
    }
}
