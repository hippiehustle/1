package e4;

import o6.j;

/* renamed from: e4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0643a {

    /* renamed from: a, reason: collision with root package name */
    public final int f10606a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10607b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10608c;

    /* renamed from: d, reason: collision with root package name */
    public final f2.a f10609d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f10610e;

    public C0643a(int i4, String str, String str2, f2.a aVar, boolean z8) {
        j.e(aVar, "action");
        this.f10606a = i4;
        this.f10607b = str;
        this.f10608c = str2;
        this.f10609d = aVar;
        this.f10610e = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0643a)) {
            return false;
        }
        C0643a c0643a = (C0643a) obj;
        if (this.f10606a == c0643a.f10606a && j.a(this.f10607b, c0643a.f10607b) && j.a(this.f10608c, c0643a.f10608c) && j.a(this.f10609d, c0643a.f10609d) && this.f10610e == c0643a.f10610e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f10610e) + ((this.f10609d.hashCode() + A.j.c(this.f10608c, A.j.c(this.f10607b, Integer.hashCode(this.f10606a) * 31, 31), 31)) * 31);
    }

    public final String toString() {
        return "UiAction(icon=" + this.f10606a + ", name=" + this.f10607b + ", description=" + this.f10608c + ", action=" + this.f10609d + ", haveError=" + this.f10610e + ")";
    }
}
