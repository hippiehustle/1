package g2;

import l1.C0999a;
import m1.InterfaceC1051a;
import m1.InterfaceC1053c;
import o6.j;

/* renamed from: g2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0777a implements InterfaceC1053c, InterfaceC1051a {

    /* renamed from: a, reason: collision with root package name */
    public final C0999a f11133a;

    /* renamed from: b, reason: collision with root package name */
    public final C0999a f11134b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11135c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f11136d;

    public C0777a(C0999a c0999a, C0999a c0999a2, String str, Object obj) {
        this.f11133a = c0999a;
        this.f11134b = c0999a2;
        this.f11135c = str;
        this.f11136d = obj;
    }

    public static C0777a e(C0777a c0777a, C0999a c0999a, C0999a c0999a2, String str, int i4) {
        if ((i4 & 1) != 0) {
            c0999a = c0777a.f11133a;
        }
        if ((i4 & 2) != 0) {
            c0999a2 = c0777a.f11134b;
        }
        return new C0777a(c0999a, c0999a2, str, c0777a.f11136d);
    }

    @Override // m1.InterfaceC1053c
    public final Long a() {
        return getId().f12188b;
    }

    public final C0777a b(Object obj) {
        if (!(obj instanceof Boolean) && !(obj instanceof Byte) && !(obj instanceof Character) && !(obj instanceof Double) && !(obj instanceof Integer) && !(obj instanceof Float) && !(obj instanceof Short) && !(obj instanceof String)) {
            throw new IllegalArgumentException("Unsupported value type");
        }
        return new C0777a(this.f11133a, this.f11134b, this.f11135c, obj);
    }

    @Override // m1.InterfaceC1051a
    public final boolean d() {
        if (this.f11135c != null && this.f11136d != null) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0777a)) {
            return false;
        }
        C0777a c0777a = (C0777a) obj;
        if (j.a(this.f11133a, c0777a.f11133a) && j.a(this.f11134b, c0777a.f11134b) && j.a(this.f11135c, c0777a.f11135c) && j.a(this.f11136d, c0777a.f11136d)) {
            return true;
        }
        return false;
    }

    @Override // m1.InterfaceC1053c
    public final C0999a getId() {
        return this.f11133a;
    }

    public final int hashCode() {
        int hashCode;
        int d2 = A.j.d(this.f11134b, this.f11133a.hashCode() * 31, 31);
        int i4 = 0;
        String str = this.f11135c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i8 = (d2 + hashCode) * 31;
        Object obj = this.f11136d;
        if (obj != null) {
            i4 = obj.hashCode();
        }
        return i8 + i4;
    }

    public final String toString() {
        StringBuilder t8 = A.j.t("IntentExtra(id=", this.f11133a, ", actionId=", this.f11134b, ", key=");
        t8.append(this.f11135c);
        t8.append(", value=");
        t8.append(this.f11136d);
        t8.append(")");
        return t8.toString();
    }
}
