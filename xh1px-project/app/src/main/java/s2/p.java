package s2;

import android.graphics.Point;
import j2.C0902b;
import n1.AbstractC1149a;
import v2.InterfaceC1661a;

/* loaded from: classes.dex */
public final class p implements InterfaceC1661a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f14493a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f14494b;

    /* renamed from: c, reason: collision with root package name */
    public final C0902b f14495c;

    /* renamed from: d, reason: collision with root package name */
    public final Point f14496d;

    /* renamed from: e, reason: collision with root package name */
    public final double f14497e;

    public p(boolean z8, boolean z9, C0902b c0902b, Point point, double d2) {
        this.f14493a = z8;
        this.f14494b = z9;
        this.f14495c = c0902b;
        this.f14496d = point;
        this.f14497e = d2;
    }

    @Override // v2.InterfaceC1661a
    public final boolean a() {
        return this.f14493a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f14493a == pVar.f14493a && this.f14494b == pVar.f14494b && o6.j.a(this.f14495c, pVar.f14495c) && o6.j.a(this.f14496d, pVar.f14496d) && Double.compare(this.f14497e, pVar.f14497e) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Double.hashCode(this.f14497e) + ((this.f14496d.hashCode() + ((this.f14495c.hashCode() + AbstractC1149a.c(Boolean.hashCode(this.f14493a) * 31, 31, this.f14494b)) * 31)) * 31);
    }

    public final String toString() {
        return "ImageResult(isFulfilled=" + this.f14493a + ", haveBeenDetected=" + this.f14494b + ", condition=" + this.f14495c + ", position=" + this.f14496d + ", confidenceRate=" + this.f14497e + ")";
    }
}
