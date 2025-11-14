package S0;

import android.graphics.PointF;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final PointF f5175a;

    /* renamed from: b, reason: collision with root package name */
    public final PointF f5176b;

    /* renamed from: c, reason: collision with root package name */
    public final PointF f5177c;

    public a() {
        this.f5175a = new PointF();
        this.f5176b = new PointF();
        this.f5177c = new PointF();
    }

    public final String toString() {
        PointF pointF = this.f5177c;
        Float valueOf = Float.valueOf(pointF.x);
        Float valueOf2 = Float.valueOf(pointF.y);
        PointF pointF2 = this.f5175a;
        Float valueOf3 = Float.valueOf(pointF2.x);
        Float valueOf4 = Float.valueOf(pointF2.y);
        PointF pointF3 = this.f5176b;
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", valueOf, valueOf2, valueOf3, valueOf4, Float.valueOf(pointF3.x), Float.valueOf(pointF3.y));
    }

    public a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f5175a = pointF;
        this.f5176b = pointF2;
        this.f5177c = pointF3;
    }
}
