package o6;

import java.io.Serializable;

/* renamed from: o6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1282a implements h, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final Object f13621d;

    /* renamed from: e, reason: collision with root package name */
    public final Class f13622e;

    /* renamed from: f, reason: collision with root package name */
    public final String f13623f;

    /* renamed from: g, reason: collision with root package name */
    public final String f13624g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f13625h;

    /* renamed from: i, reason: collision with root package name */
    public final int f13626i;
    public final int j;

    public C1282a(int i4, Object obj, Class cls, String str, String str2, int i8) {
        boolean z8;
        this.f13621d = obj;
        this.f13622e = cls;
        this.f13623f = str;
        this.f13624g = str2;
        if ((i8 & 1) == 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f13625h = z8;
        this.f13626i = i4;
        this.j = i8 >> 1;
    }

    @Override // o6.h
    public final int d() {
        return this.f13626i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1282a) {
                C1282a c1282a = (C1282a) obj;
                if (this.f13625h == c1282a.f13625h && this.f13626i == c1282a.f13626i && this.j == c1282a.j && j.a(this.f13621d, c1282a.f13621d) && this.f13622e.equals(c1282a.f13622e) && this.f13623f.equals(c1282a.f13623f) && this.f13624g.equals(c1282a.f13624g)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i4;
        int i8;
        Object obj = this.f13621d;
        if (obj != null) {
            i4 = obj.hashCode();
        } else {
            i4 = 0;
        }
        int c6 = A.j.c(this.f13624g, A.j.c(this.f13623f, (this.f13622e.hashCode() + (i4 * 31)) * 31, 31), 31);
        if (this.f13625h) {
            i8 = 1231;
        } else {
            i8 = 1237;
        }
        return ((((c6 + i8) * 31) + this.f13626i) * 31) + this.j;
    }

    public final String toString() {
        return v.f13643a.g(this);
    }
}
