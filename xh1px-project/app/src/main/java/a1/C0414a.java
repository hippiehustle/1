package a1;

import N0.C0202j;
import android.graphics.PointF;
import android.view.animation.BaseInterpolator;
import android.view.animation.Interpolator;

/* renamed from: a1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0414a {

    /* renamed from: a, reason: collision with root package name */
    public final C0202j f7670a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7671b;

    /* renamed from: c, reason: collision with root package name */
    public Object f7672c;

    /* renamed from: d, reason: collision with root package name */
    public final Interpolator f7673d;

    /* renamed from: e, reason: collision with root package name */
    public final Interpolator f7674e;

    /* renamed from: f, reason: collision with root package name */
    public final Interpolator f7675f;

    /* renamed from: g, reason: collision with root package name */
    public final float f7676g;

    /* renamed from: h, reason: collision with root package name */
    public Float f7677h;

    /* renamed from: i, reason: collision with root package name */
    public float f7678i;
    public float j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public int f7679l;

    /* renamed from: m, reason: collision with root package name */
    public float f7680m;

    /* renamed from: n, reason: collision with root package name */
    public float f7681n;

    /* renamed from: o, reason: collision with root package name */
    public PointF f7682o;

    /* renamed from: p, reason: collision with root package name */
    public PointF f7683p;

    public C0414a(C0202j c0202j, Object obj, Object obj2, BaseInterpolator baseInterpolator, float f8, Float f9) {
        this.f7678i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.f7679l = 784923401;
        this.f7680m = Float.MIN_VALUE;
        this.f7681n = Float.MIN_VALUE;
        this.f7682o = null;
        this.f7683p = null;
        this.f7670a = c0202j;
        this.f7671b = obj;
        this.f7672c = obj2;
        this.f7673d = baseInterpolator;
        this.f7674e = null;
        this.f7675f = null;
        this.f7676g = f8;
        this.f7677h = f9;
    }

    public final float a() {
        if (this.f7670a == null) {
            return 1.0f;
        }
        if (this.f7681n == Float.MIN_VALUE) {
            if (this.f7677h == null) {
                this.f7681n = 1.0f;
            } else {
                this.f7681n = (float) (b() + ((this.f7677h.floatValue() - this.f7676g) / (r1.f3611m - r1.f3610l)));
            }
        }
        return this.f7681n;
    }

    public final float b() {
        C0202j c0202j = this.f7670a;
        if (c0202j == null) {
            return 0.0f;
        }
        if (this.f7680m == Float.MIN_VALUE) {
            float f8 = c0202j.f3610l;
            this.f7680m = (this.f7676g - f8) / (c0202j.f3611m - f8);
        }
        return this.f7680m;
    }

    public final boolean c() {
        if (this.f7673d == null && this.f7674e == null && this.f7675f == null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "Keyframe{startValue=" + this.f7671b + ", endValue=" + this.f7672c + ", startFrame=" + this.f7676g + ", endFrame=" + this.f7677h + ", interpolator=" + this.f7673d + '}';
    }

    public C0414a(C0202j c0202j, Object obj, Object obj2, BaseInterpolator baseInterpolator, BaseInterpolator baseInterpolator2, float f8) {
        this.f7678i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.f7679l = 784923401;
        this.f7680m = Float.MIN_VALUE;
        this.f7681n = Float.MIN_VALUE;
        this.f7682o = null;
        this.f7683p = null;
        this.f7670a = c0202j;
        this.f7671b = obj;
        this.f7672c = obj2;
        this.f7673d = null;
        this.f7674e = baseInterpolator;
        this.f7675f = baseInterpolator2;
        this.f7676g = f8;
        this.f7677h = null;
    }

    public C0414a(C0202j c0202j, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f8, Float f9) {
        this.f7678i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.f7679l = 784923401;
        this.f7680m = Float.MIN_VALUE;
        this.f7681n = Float.MIN_VALUE;
        this.f7682o = null;
        this.f7683p = null;
        this.f7670a = c0202j;
        this.f7671b = obj;
        this.f7672c = obj2;
        this.f7673d = interpolator;
        this.f7674e = interpolator2;
        this.f7675f = interpolator3;
        this.f7676g = f8;
        this.f7677h = f9;
    }

    public C0414a(Object obj) {
        this.f7678i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.f7679l = 784923401;
        this.f7680m = Float.MIN_VALUE;
        this.f7681n = Float.MIN_VALUE;
        this.f7682o = null;
        this.f7683p = null;
        this.f7670a = null;
        this.f7671b = obj;
        this.f7672c = obj;
        this.f7673d = null;
        this.f7674e = null;
        this.f7675f = null;
        this.f7676g = Float.MIN_VALUE;
        this.f7677h = Float.valueOf(Float.MAX_VALUE);
    }

    public C0414a(U0.c cVar, U0.c cVar2) {
        this.f7678i = -3987645.8f;
        this.j = -3987645.8f;
        this.k = 784923401;
        this.f7679l = 784923401;
        this.f7680m = Float.MIN_VALUE;
        this.f7681n = Float.MIN_VALUE;
        this.f7682o = null;
        this.f7683p = null;
        this.f7670a = null;
        this.f7671b = cVar;
        this.f7672c = cVar2;
        this.f7673d = null;
        this.f7674e = null;
        this.f7675f = null;
        this.f7676g = Float.MIN_VALUE;
        this.f7677h = Float.valueOf(Float.MAX_VALUE);
    }
}
