package c7;

import n1.AbstractC1149a;

/* renamed from: c7.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0589h {

    /* renamed from: d, reason: collision with root package name */
    public static final C0589h f9724d = new C0589h(256, 256, 256);

    /* renamed from: a, reason: collision with root package name */
    public final int f9725a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9726b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9727c;

    public C0589h(int i4, int i8, int i9) {
        this.f9725a = i4;
        this.f9726b = i8;
        this.f9727c = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0589h)) {
            return false;
        }
        C0589h c0589h = (C0589h) obj;
        if (this.f9725a == c0589h.f9725a && this.f9726b == c0589h.f9726b && this.f9727c == c0589h.f9727c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9727c) + AbstractC1149a.b(this.f9726b, Integer.hashCode(this.f9725a) * 31, 31);
    }

    public final String toString() {
        int i4 = this.f9726b;
        int i8 = this.f9725a;
        int i9 = this.f9727c;
        if (i9 == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(i8);
            sb.append('.');
            sb.append(i4);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i8);
        sb2.append('.');
        sb2.append(i4);
        sb2.append('.');
        sb2.append(i9);
        return sb2.toString();
    }
}
