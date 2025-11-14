package i2;

import f2.n;
import l1.C0999a;
import m1.InterfaceC1051a;
import m1.InterfaceC1053c;
import o6.j;

/* renamed from: i2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0880a implements InterfaceC1053c, InterfaceC1051a {

    /* renamed from: a, reason: collision with root package name */
    public final C0999a f11753a;

    /* renamed from: b, reason: collision with root package name */
    public final C0999a f11754b;

    /* renamed from: c, reason: collision with root package name */
    public final C0999a f11755c;

    /* renamed from: d, reason: collision with root package name */
    public final n f11756d;

    public C0880a(C0999a c0999a, C0999a c0999a2, C0999a c0999a3, n nVar) {
        j.e(c0999a, "id");
        j.e(nVar, "toggleType");
        this.f11753a = c0999a;
        this.f11754b = c0999a2;
        this.f11755c = c0999a3;
        this.f11756d = nVar;
    }

    @Override // m1.InterfaceC1053c
    public final Long a() {
        return getId().f12188b;
    }

    @Override // m1.InterfaceC1051a
    public final boolean d() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0880a)) {
            return false;
        }
        C0880a c0880a = (C0880a) obj;
        if (j.a(this.f11753a, c0880a.f11753a) && j.a(this.f11754b, c0880a.f11754b) && j.a(this.f11755c, c0880a.f11755c) && this.f11756d == c0880a.f11756d) {
            return true;
        }
        return false;
    }

    @Override // m1.InterfaceC1053c
    public final C0999a getId() {
        return this.f11753a;
    }

    public final int hashCode() {
        int hashCode;
        int d2 = A.j.d(this.f11754b, this.f11753a.hashCode() * 31, 31);
        C0999a c0999a = this.f11755c;
        if (c0999a == null) {
            hashCode = 0;
        } else {
            hashCode = c0999a.hashCode();
        }
        return this.f11756d.hashCode() + ((d2 + hashCode) * 31);
    }

    public final String toString() {
        StringBuilder t8 = A.j.t("EventToggle(id=", this.f11753a, ", actionId=", this.f11754b, ", targetEventId=");
        t8.append(this.f11755c);
        t8.append(", toggleType=");
        t8.append(this.f11756d);
        t8.append(")");
        return t8.toString();
    }
}
