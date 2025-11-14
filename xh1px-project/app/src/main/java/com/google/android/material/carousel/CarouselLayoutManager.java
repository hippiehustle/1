package com.google.android.material.carousel;

import A.j;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import b0.C0519d;
import com.buzbuz.smartautoclicker.R;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.datepicker.t;
import e5.AbstractC0645a;
import o5.C1280b;
import o5.C1281c;
import t0.AbstractC1537c0;
import t0.d0;
import t0.j0;
import t0.n0;
import t0.o0;

/* loaded from: classes.dex */
public class CarouselLayoutManager extends AbstractC1537c0 implements n0 {

    /* renamed from: p, reason: collision with root package name */
    public final C0519d f10018p;

    /* renamed from: q, reason: collision with root package name */
    public C1281c f10019q;

    /* renamed from: r, reason: collision with root package name */
    public final View.OnLayoutChangeListener f10020r;

    public CarouselLayoutManager() {
        C0519d c0519d = new C0519d();
        new C1280b();
        this.f10020r = new View.OnLayoutChangeListener() { // from class: o5.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i4, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
                if (i4 == i11 && i8 == i12 && i9 == i13 && i10 == i14) {
                    return;
                }
                view.post(new E.a(15, CarouselLayoutManager.this));
            }
        };
        this.f10018p = c0519d;
        t0();
        K0(0);
    }

    @Override // t0.AbstractC1537c0
    public final void F0(RecyclerView recyclerView, int i4) {
        t tVar = new t(this, recyclerView.getContext());
        tVar.f14762a = i4;
        G0(tVar);
    }

    public final boolean I0() {
        if (this.f10019q.f13618a == 0) {
            return true;
        }
        return false;
    }

    public final boolean J0() {
        if (I0() && this.f14811b.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public final void K0(int i4) {
        C1281c c1281c;
        if (i4 != 0 && i4 != 1) {
            throw new IllegalArgumentException(j.l("invalid orientation:", i4));
        }
        c(null);
        C1281c c1281c2 = this.f10019q;
        if (c1281c2 != null && i4 == c1281c2.f13618a) {
            return;
        }
        if (i4 != 0) {
            if (i4 == 1) {
                c1281c = new C1281c(this, 0);
            } else {
                throw new IllegalArgumentException("invalid orientation");
            }
        } else {
            c1281c = new C1281c(this, 1);
        }
        this.f10019q = c1281c;
        t0();
    }

    @Override // t0.AbstractC1537c0
    public final boolean O() {
        return true;
    }

    @Override // t0.AbstractC1537c0
    public final void V(RecyclerView recyclerView) {
        Context context = recyclerView.getContext();
        C0519d c0519d = this.f10018p;
        float f8 = c0519d.f9019a;
        if (f8 <= 0.0f) {
            f8 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        c0519d.f9019a = f8;
        float f9 = c0519d.f9020b;
        if (f9 <= 0.0f) {
            f9 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        c0519d.f9020b = f9;
        t0();
        recyclerView.addOnLayoutChangeListener(this.f10020r);
    }

    @Override // t0.AbstractC1537c0
    public final void W(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.f10020r);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0027, code lost:
    
        if (r6 != 1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0031, code lost:
    
        if (J0() != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0035, code lost:
    
        if (r6 == 1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x003e, code lost:
    
        if (J0() != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    @Override // t0.AbstractC1537c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View X(View view, int i4, j0 j0Var, o0 o0Var) {
        char c6;
        if (v() != 0) {
            int i8 = this.f10019q.f13618a;
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 17) {
                        if (i4 != 33) {
                            if (i4 != 66) {
                                if (i4 == 130) {
                                }
                                c6 = 0;
                            } else {
                                if (i8 == 0) {
                                }
                                c6 = 0;
                            }
                        }
                    } else {
                        if (i8 == 0) {
                        }
                        c6 = 0;
                    }
                    if (c6 != 0) {
                        int i9 = 0;
                        if (c6 == 65535) {
                            if (AbstractC1537c0.K(view) != 0) {
                                int K = AbstractC1537c0.K(u(0)) - 1;
                                if (K >= 0 && K < F()) {
                                    this.f10019q.a();
                                    throw null;
                                }
                                if (J0()) {
                                    i9 = v() - 1;
                                }
                                return u(i9);
                            }
                            return null;
                        }
                        if (AbstractC1537c0.K(view) == F() - 1) {
                            return null;
                        }
                        int K8 = AbstractC1537c0.K(u(v() - 1)) + 1;
                        if (K8 >= 0 && K8 < F()) {
                            this.f10019q.a();
                            throw null;
                        }
                        if (!J0()) {
                            i9 = v() - 1;
                        }
                        return u(i9);
                    }
                    return null;
                }
                c6 = 1;
                if (c6 != 0) {
                }
            }
            c6 = 65535;
            if (c6 != 0) {
            }
        } else {
            return null;
        }
    }

    @Override // t0.AbstractC1537c0
    public final void Y(AccessibilityEvent accessibilityEvent) {
        super.Y(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(AbstractC1537c0.K(u(0)));
            accessibilityEvent.setToIndex(AbstractC1537c0.K(u(v() - 1)));
        }
    }

    @Override // t0.n0
    public final PointF a(int i4) {
        return null;
    }

    @Override // t0.AbstractC1537c0
    public final void c0(int i4, int i8) {
        F();
    }

    @Override // t0.AbstractC1537c0
    public final boolean d() {
        return I0();
    }

    @Override // t0.AbstractC1537c0
    public final boolean e() {
        return !I0();
    }

    @Override // t0.AbstractC1537c0
    public final void f0(int i4, int i8) {
        F();
    }

    @Override // t0.AbstractC1537c0
    public final void h0(j0 j0Var, o0 o0Var) {
        int i4;
        if (o0Var.b() > 0) {
            if (I0()) {
                i4 = this.f14821n;
            } else {
                i4 = this.f14822o;
            }
            if (i4 > 0.0f) {
                J0();
                View view = j0Var.k(0, Long.MAX_VALUE).f14950a;
                throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
            }
        }
        n0(j0Var);
    }

    @Override // t0.AbstractC1537c0
    public final void i0(o0 o0Var) {
        if (v() == 0) {
            return;
        }
        AbstractC1537c0.K(u(0));
    }

    @Override // t0.AbstractC1537c0
    public final int j(o0 o0Var) {
        v();
        return 0;
    }

    @Override // t0.AbstractC1537c0
    public final int k(o0 o0Var) {
        return 0;
    }

    @Override // t0.AbstractC1537c0
    public final int l(o0 o0Var) {
        return 0;
    }

    @Override // t0.AbstractC1537c0
    public final int m(o0 o0Var) {
        v();
        return 0;
    }

    @Override // t0.AbstractC1537c0
    public final int n(o0 o0Var) {
        return 0;
    }

    @Override // t0.AbstractC1537c0
    public final int o(o0 o0Var) {
        return 0;
    }

    @Override // t0.AbstractC1537c0
    public final d0 r() {
        return new d0(-2, -2);
    }

    @Override // t0.AbstractC1537c0
    public final boolean s0(RecyclerView recyclerView, View view, Rect rect, boolean z8, boolean z9) {
        return false;
    }

    @Override // t0.AbstractC1537c0
    public final int u0(int i4, j0 j0Var, o0 o0Var) {
        if (!I0() || v() == 0 || i4 == 0) {
            return 0;
        }
        View view = j0Var.k(0, Long.MAX_VALUE).f14950a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // t0.AbstractC1537c0
    public final void v0(int i4) {
    }

    @Override // t0.AbstractC1537c0
    public final int w0(int i4, j0 j0Var, o0 o0Var) {
        if (!e() || v() == 0 || i4 == 0) {
            return 0;
        }
        View view = j0Var.k(0, Long.MAX_VALUE).f14950a;
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // t0.AbstractC1537c0
    public final void z(View view, Rect rect) {
        RecyclerView.O(view, rect);
        rect.centerY();
        if (I0()) {
            rect.centerX();
        }
        throw null;
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i4, int i8) {
        new C1280b();
        this.f10020r = new View.OnLayoutChangeListener() { // from class: o5.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i42, int i82, int i9, int i10, int i11, int i12, int i13, int i14) {
                if (i42 == i11 && i82 == i12 && i9 == i13 && i10 == i14) {
                    return;
                }
                view.post(new E.a(15, CarouselLayoutManager.this));
            }
        };
        this.f10018p = new C0519d();
        t0();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0645a.f10639h);
            obtainStyledAttributes.getInt(0, 0);
            t0();
            K0(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
        }
    }
}
