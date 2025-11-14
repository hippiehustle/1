package i5;

import E.b;
import E2.c;
import P.O;
import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;

/* renamed from: i5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0884a extends c {

    /* renamed from: f, reason: collision with root package name */
    public int f11766f;

    /* renamed from: g, reason: collision with root package name */
    public int f11767g = -1;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f11768h;

    public C0884a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f11768h = swipeDismissBehavior;
    }

    @Override // E2.c
    public final boolean E0(View view, int i4) {
        int i8 = this.f11767g;
        if ((i8 == -1 || i8 == i4) && this.f11768h.w(view)) {
            return true;
        }
        return false;
    }

    @Override // E2.c
    public final int K(View view, int i4) {
        boolean z8;
        int width;
        int width2;
        int width3;
        WeakHashMap weakHashMap = O.f4214a;
        if (view.getLayoutDirection() == 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        int i8 = this.f11768h.f9932d;
        if (i8 == 0) {
            if (z8) {
                width = this.f11766f - view.getWidth();
                width2 = this.f11766f;
            } else {
                width = this.f11766f;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i8 == 1) {
            if (z8) {
                width = this.f11766f;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.f11766f - view.getWidth();
                width2 = this.f11766f;
            }
        } else {
            width = this.f11766f - view.getWidth();
            width2 = view.getWidth() + this.f11766f;
        }
        return Math.min(Math.max(width, i4), width2);
    }

    @Override // E2.c
    public final int L(View view, int i4) {
        return view.getTop();
    }

    @Override // E2.c
    public final int a0(View view) {
        return view.getWidth();
    }

    @Override // E2.c
    public final void i0(View view, int i4) {
        this.f11767g = i4;
        this.f11766f = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f11768h;
            swipeDismissBehavior.f9931c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f9931c = false;
        }
    }

    @Override // E2.c
    public final void k0(View view, int i4, int i8) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f11768h;
        float f8 = width * swipeDismissBehavior.f9933e;
        float width2 = view.getWidth() * swipeDismissBehavior.f9934f;
        float abs = Math.abs(i4 - this.f11766f);
        if (abs <= f8) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((abs - f8) / (width2 - f8))), 1.0f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0050, code lost:
    
        if (java.lang.Math.abs(r9.getLeft() - r8.f11766f) >= java.lang.Math.round(r9.getWidth() * 0.5f)) goto L27;
     */
    @Override // E2.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l0(View view, float f8, float f9) {
        int i4;
        boolean z8;
        this.f11767g = -1;
        int width = view.getWidth();
        boolean z9 = false;
        SwipeDismissBehavior swipeDismissBehavior = this.f11768h;
        if (f8 != 0.0f) {
            WeakHashMap weakHashMap = O.f4214a;
            if (view.getLayoutDirection() == 1) {
                z8 = true;
            } else {
                z8 = false;
            }
            int i8 = swipeDismissBehavior.f9932d;
            if (i8 != 2) {
                i4 = i8 == 0 ? this.f11766f : this.f11766f;
            }
            if (f8 >= 0.0f) {
                int left = view.getLeft();
                int i9 = this.f11766f;
                if (left >= i9) {
                    i4 = i9 + width;
                    z9 = true;
                }
            }
            i4 = this.f11766f - width;
            z9 = true;
        }
        if (swipeDismissBehavior.f9929a.o(i4, view.getTop())) {
            b bVar = new b(swipeDismissBehavior, view, z9);
            WeakHashMap weakHashMap2 = O.f4214a;
            view.postOnAnimation(bVar);
        }
    }

    @Override // E2.c
    public final void j0(int i4) {
    }
}
