package S0;

import A.j;
import android.graphics.PointF;
import x.AbstractC1769h;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public String f5178a;

    /* renamed from: b, reason: collision with root package name */
    public String f5179b;

    /* renamed from: c, reason: collision with root package name */
    public float f5180c;

    /* renamed from: d, reason: collision with root package name */
    public int f5181d;

    /* renamed from: e, reason: collision with root package name */
    public int f5182e;

    /* renamed from: f, reason: collision with root package name */
    public float f5183f;

    /* renamed from: g, reason: collision with root package name */
    public float f5184g;

    /* renamed from: h, reason: collision with root package name */
    public int f5185h;

    /* renamed from: i, reason: collision with root package name */
    public int f5186i;
    public float j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public PointF f5187l;

    /* renamed from: m, reason: collision with root package name */
    public PointF f5188m;

    public final int hashCode() {
        int b4 = ((AbstractC1769h.b(this.f5181d) + (((int) (j.c(this.f5179b, this.f5178a.hashCode() * 31, 31) + this.f5180c)) * 31)) * 31) + this.f5182e;
        long floatToRawIntBits = Float.floatToRawIntBits(this.f5183f);
        return (((b4 * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.f5185h;
    }
}
