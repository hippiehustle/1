package S;

import L5.x;
import P.O;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import java.util.WeakHashMap;
import o.C1213s0;

/* loaded from: classes.dex */
public final class d implements View.OnTouchListener {

    /* renamed from: u, reason: collision with root package name */
    public static final int f5151u = ViewConfiguration.getTapTimeout();

    /* renamed from: d, reason: collision with root package name */
    public final a f5152d;

    /* renamed from: e, reason: collision with root package name */
    public final AccelerateInterpolator f5153e;

    /* renamed from: f, reason: collision with root package name */
    public final C1213s0 f5154f;

    /* renamed from: g, reason: collision with root package name */
    public x f5155g;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f5156h;

    /* renamed from: i, reason: collision with root package name */
    public final float[] f5157i;
    public final int j;
    public final int k;

    /* renamed from: l, reason: collision with root package name */
    public final float[] f5158l;

    /* renamed from: m, reason: collision with root package name */
    public final float[] f5159m;

    /* renamed from: n, reason: collision with root package name */
    public final float[] f5160n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f5161o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f5162p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f5163q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f5164r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f5165s;

    /* renamed from: t, reason: collision with root package name */
    public final C1213s0 f5166t;

    /* JADX WARN: Type inference failed for: r0v0, types: [S.a, java.lang.Object] */
    public d(C1213s0 c1213s0) {
        ?? obj = new Object();
        obj.f5146e = Long.MIN_VALUE;
        obj.f5148g = -1L;
        obj.f5147f = 0L;
        this.f5152d = obj;
        this.f5153e = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f5156h = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f5157i = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f5158l = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f5159m = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f5160n = fArr5;
        this.f5154f = c1213s0;
        float f8 = Resources.getSystem().getDisplayMetrics().density;
        float f9 = ((int) ((1575.0f * f8) + 0.5f)) / 1000.0f;
        fArr5[0] = f9;
        fArr5[1] = f9;
        float f10 = ((int) ((f8 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f10;
        fArr4[1] = f10;
        this.j = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.k = f5151u;
        obj.f5142a = 500;
        obj.f5143b = 500;
        this.f5166t = c1213s0;
    }

    public static float b(float f8, float f9, float f10) {
        if (f8 > f10) {
            return f10;
        }
        if (f8 < f9) {
            return f9;
        }
        return f8;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(float f8, float f9, float f10, int i4) {
        float f11;
        float interpolation;
        float b4 = b(this.f5156h[i4] * f9, 0.0f, this.f5157i[i4]);
        float c6 = c(f9 - f8, b4) - c(f8, b4);
        AccelerateInterpolator accelerateInterpolator = this.f5153e;
        if (c6 < 0.0f) {
            interpolation = -accelerateInterpolator.getInterpolation(-c6);
        } else if (c6 > 0.0f) {
            interpolation = accelerateInterpolator.getInterpolation(c6);
        } else {
            f11 = 0.0f;
            if (f11 != 0.0f) {
                return 0.0f;
            }
            float f12 = this.f5158l[i4];
            float f13 = this.f5159m[i4];
            float f14 = this.f5160n[i4];
            float f15 = f12 * f10;
            if (f11 > 0.0f) {
                return b(f11 * f15, f13, f14);
            }
            return -b((-f11) * f15, f13, f14);
        }
        f11 = b(interpolation, -1.0f, 1.0f);
        if (f11 != 0.0f) {
        }
    }

    public final float c(float f8, float f9) {
        if (f9 != 0.0f) {
            int i4 = this.j;
            if (i4 != 0 && i4 != 1) {
                if (i4 == 2 && f8 < 0.0f) {
                    return f8 / (-f9);
                }
            } else if (f8 < f9) {
                if (f8 >= 0.0f) {
                    return 1.0f - (f8 / f9);
                }
                if (this.f5164r && i4 == 1) {
                    return 1.0f;
                }
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i4 = 0;
        if (this.f5162p) {
            this.f5164r = false;
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        a aVar = this.f5152d;
        int i8 = (int) (currentAnimationTimeMillis - aVar.f5146e);
        int i9 = aVar.f5143b;
        if (i8 > i9) {
            i4 = i9;
        } else if (i8 >= 0) {
            i4 = i8;
        }
        aVar.f5150i = i4;
        aVar.f5149h = aVar.a(currentAnimationTimeMillis);
        aVar.f5148g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        C1213s0 c1213s0;
        int count;
        a aVar = this.f5152d;
        float f8 = aVar.f5145d;
        int abs = (int) (f8 / Math.abs(f8));
        Math.abs(aVar.f5144c);
        if (abs != 0 && (count = (c1213s0 = this.f5166t).getCount()) != 0) {
            int childCount = c1213s0.getChildCount();
            int firstVisiblePosition = c1213s0.getFirstVisiblePosition();
            int i4 = firstVisiblePosition + childCount;
            if (abs <= 0 ? !(abs >= 0 || (firstVisiblePosition <= 0 && c1213s0.getChildAt(0).getTop() >= 0)) : !(i4 >= count && c1213s0.getChildAt(childCount - 1).getBottom() <= c1213s0.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i4;
        if (this.f5165s) {
            int actionMasked = motionEvent.getActionMasked();
            int i8 = 1;
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                    }
                }
                d();
                return false;
            }
            this.f5163q = true;
            this.f5161o = false;
            float x8 = motionEvent.getX();
            float width = view.getWidth();
            C1213s0 c1213s0 = this.f5154f;
            float a3 = a(x8, width, c1213s0.getWidth(), 0);
            float a4 = a(motionEvent.getY(), view.getHeight(), c1213s0.getHeight(), 1);
            a aVar = this.f5152d;
            aVar.f5144c = a3;
            aVar.f5145d = a4;
            if (!this.f5164r && e()) {
                if (this.f5155g == null) {
                    this.f5155g = new x(i8, this);
                }
                this.f5164r = true;
                this.f5162p = true;
                if (!this.f5161o && (i4 = this.k) > 0) {
                    x xVar = this.f5155g;
                    long j = i4;
                    WeakHashMap weakHashMap = O.f4214a;
                    c1213s0.postOnAnimationDelayed(xVar, j);
                } else {
                    this.f5155g.run();
                }
                this.f5161o = true;
            }
        }
        return false;
    }
}
