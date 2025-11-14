package g5;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: g5.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0786f extends C.c {

    /* renamed from: a, reason: collision with root package name */
    public C0787g f11185a;

    /* renamed from: b, reason: collision with root package name */
    public int f11186b = 0;

    public AbstractC0786f() {
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [g5.g, java.lang.Object] */
    @Override // C.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i4) {
        x(coordinatorLayout, view, i4);
        if (this.f11185a == null) {
            ?? obj = new Object();
            obj.f11190d = view;
            this.f11185a = obj;
        }
        C0787g c0787g = this.f11185a;
        View view2 = (View) c0787g.f11190d;
        c0787g.f11187a = view2.getTop();
        c0787g.f11188b = view2.getLeft();
        this.f11185a.c();
        int i8 = this.f11186b;
        if (i8 != 0) {
            C0787g c0787g2 = this.f11185a;
            if (c0787g2.f11189c != i8) {
                c0787g2.f11189c = i8;
                c0787g2.c();
            }
            this.f11186b = 0;
            return true;
        }
        return true;
    }

    public final int w() {
        C0787g c0787g = this.f11185a;
        if (c0787g != null) {
            return c0787g.f11189c;
        }
        return 0;
    }

    public void x(CoordinatorLayout coordinatorLayout, View view, int i4) {
        coordinatorLayout.r(view, i4);
    }

    public AbstractC0786f(int i4) {
    }
}
