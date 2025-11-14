package t0;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class J {

    /* renamed from: a, reason: collision with root package name */
    public int f14762a = -1;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f14763b;

    /* renamed from: c, reason: collision with root package name */
    public AbstractC1537c0 f14764c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f14765d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f14766e;

    /* renamed from: f, reason: collision with root package name */
    public View f14767f;

    /* renamed from: g, reason: collision with root package name */
    public final m0 f14768g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f14769h;

    /* renamed from: i, reason: collision with root package name */
    public final LinearInterpolator f14770i;
    public final DecelerateInterpolator j;
    public PointF k;

    /* renamed from: l, reason: collision with root package name */
    public final DisplayMetrics f14771l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f14772m;

    /* renamed from: n, reason: collision with root package name */
    public float f14773n;

    /* renamed from: o, reason: collision with root package name */
    public int f14774o;

    /* renamed from: p, reason: collision with root package name */
    public int f14775p;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, t0.m0] */
    public J(Context context) {
        ?? obj = new Object();
        obj.f14894d = -1;
        obj.f14896f = false;
        obj.f14897g = 0;
        obj.f14891a = 0;
        obj.f14892b = 0;
        obj.f14893c = Integer.MIN_VALUE;
        obj.f14895e = null;
        this.f14768g = obj;
        this.f14770i = new LinearInterpolator();
        this.j = new DecelerateInterpolator();
        this.f14772m = false;
        this.f14774o = 0;
        this.f14775p = 0;
        this.f14771l = context.getResources().getDisplayMetrics();
    }

    public static int a(int i4, int i8, int i9, int i10, int i11) {
        if (i11 != -1) {
            if (i11 != 0) {
                if (i11 == 1) {
                    return i10 - i8;
                }
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            }
            int i12 = i9 - i4;
            if (i12 > 0) {
                return i12;
            }
            int i13 = i10 - i8;
            if (i13 < 0) {
                return i13;
            }
            return 0;
        }
        return i9 - i4;
    }

    public int b(View view, int i4) {
        AbstractC1537c0 abstractC1537c0 = this.f14764c;
        if (abstractC1537c0 != null && abstractC1537c0.d()) {
            d0 d0Var = (d0) view.getLayoutParams();
            return a(AbstractC1537c0.A(view) - ((ViewGroup.MarginLayoutParams) d0Var).leftMargin, AbstractC1537c0.D(view) + ((ViewGroup.MarginLayoutParams) d0Var).rightMargin, abstractC1537c0.H(), abstractC1537c0.f14821n - abstractC1537c0.I(), i4);
        }
        return 0;
    }

    public int c(View view, int i4) {
        AbstractC1537c0 abstractC1537c0 = this.f14764c;
        if (abstractC1537c0 != null && abstractC1537c0.e()) {
            d0 d0Var = (d0) view.getLayoutParams();
            return a(AbstractC1537c0.E(view) - ((ViewGroup.MarginLayoutParams) d0Var).topMargin, AbstractC1537c0.y(view) + ((ViewGroup.MarginLayoutParams) d0Var).bottomMargin, abstractC1537c0.J(), abstractC1537c0.f14822o - abstractC1537c0.G(), i4);
        }
        return 0;
    }

    public float d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int e(int i4) {
        float abs = Math.abs(i4);
        if (!this.f14772m) {
            this.f14773n = d(this.f14771l);
            this.f14772m = true;
        }
        return (int) Math.ceil(abs * this.f14773n);
    }

    public PointF f(int i4) {
        Object obj = this.f14764c;
        if (obj instanceof n0) {
            return ((n0) obj).a(i4);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + n0.class.getCanonicalName());
        return null;
    }

    public final void g(int i4, int i8) {
        PointF f8;
        RecyclerView recyclerView = this.f14763b;
        int i9 = -1;
        if (this.f14762a == -1 || recyclerView == null) {
            i();
        }
        if (this.f14765d && this.f14767f == null && this.f14764c != null && (f8 = f(this.f14762a)) != null) {
            float f9 = f8.x;
            if (f9 != 0.0f || f8.y != 0.0f) {
                recyclerView.i0((int) Math.signum(f9), (int) Math.signum(f8.y), null);
            }
        }
        boolean z8 = false;
        this.f14765d = false;
        View view = this.f14767f;
        m0 m0Var = this.f14768g;
        if (view != null) {
            this.f14763b.getClass();
            s0 N8 = RecyclerView.N(view);
            if (N8 != null) {
                i9 = N8.d();
            }
            if (i9 == this.f14762a) {
                View view2 = this.f14767f;
                o0 o0Var = recyclerView.f8951k0;
                h(view2, m0Var);
                m0Var.a(recyclerView);
                i();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f14767f = null;
            }
        }
        if (this.f14766e) {
            o0 o0Var2 = recyclerView.f8951k0;
            if (this.f14763b.f8962q.v() == 0) {
                i();
            } else {
                int i10 = this.f14774o;
                int i11 = i10 - i4;
                if (i10 * i11 <= 0) {
                    i11 = 0;
                }
                this.f14774o = i11;
                int i12 = this.f14775p;
                int i13 = i12 - i8;
                if (i12 * i13 <= 0) {
                    i13 = 0;
                }
                this.f14775p = i13;
                if (i11 == 0 && i13 == 0) {
                    PointF f10 = f(this.f14762a);
                    if (f10 != null) {
                        if (f10.x != 0.0f || f10.y != 0.0f) {
                            float f11 = f10.y;
                            float sqrt = (float) Math.sqrt((f11 * f11) + (r10 * r10));
                            float f12 = f10.x / sqrt;
                            f10.x = f12;
                            float f13 = f10.y / sqrt;
                            f10.y = f13;
                            this.k = f10;
                            this.f14774o = (int) (f12 * 10000.0f);
                            this.f14775p = (int) (f13 * 10000.0f);
                            int e9 = e(10000);
                            m0Var.f14891a = (int) (this.f14774o * 1.2f);
                            m0Var.f14892b = (int) (this.f14775p * 1.2f);
                            m0Var.f14893c = (int) (e9 * 1.2f);
                            m0Var.f14895e = this.f14770i;
                            m0Var.f14896f = true;
                        }
                    }
                    m0Var.f14894d = this.f14762a;
                    i();
                }
            }
            if (m0Var.f14894d >= 0) {
                z8 = true;
            }
            m0Var.a(recyclerView);
            if (z8 && this.f14766e) {
                this.f14765d = true;
                recyclerView.f8948h0.b();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h(View view, m0 m0Var) {
        int i4;
        PointF pointF;
        int ceil;
        PointF pointF2 = this.k;
        int i8 = 0;
        if (pointF2 != null) {
            float f8 = pointF2.x;
            if (f8 != 0.0f) {
                if (f8 > 0.0f) {
                    i4 = 1;
                } else {
                    i4 = -1;
                }
                int b4 = b(view, i4);
                pointF = this.k;
                if (pointF != null) {
                    float f9 = pointF.y;
                    if (f9 != 0.0f) {
                        i8 = f9 > 0.0f ? 1 : -1;
                    }
                }
                int c6 = c(view, i8);
                ceil = (int) Math.ceil(e((int) Math.sqrt((c6 * c6) + (b4 * b4))) / 0.3356d);
                if (ceil <= 0) {
                    m0Var.f14891a = -b4;
                    m0Var.f14892b = -c6;
                    m0Var.f14893c = ceil;
                    m0Var.f14895e = this.j;
                    m0Var.f14896f = true;
                    return;
                }
                return;
            }
        }
        i4 = 0;
        int b42 = b(view, i4);
        pointF = this.k;
        if (pointF != null) {
        }
        int c62 = c(view, i8);
        ceil = (int) Math.ceil(e((int) Math.sqrt((c62 * c62) + (b42 * b42))) / 0.3356d);
        if (ceil <= 0) {
        }
    }

    public final void i() {
        if (!this.f14766e) {
            return;
        }
        this.f14766e = false;
        this.f14775p = 0;
        this.f14774o = 0;
        this.k = null;
        this.f14763b.f8951k0.f14912a = -1;
        this.f14767f = null;
        this.f14762a = -1;
        this.f14765d = false;
        AbstractC1537c0 abstractC1537c0 = this.f14764c;
        if (abstractC1537c0.f14814e == this) {
            abstractC1537c0.f14814e = null;
        }
        this.f14764c = null;
        this.f14763b = null;
    }
}
