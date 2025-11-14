package p2;

import l1.C0999a;
import n1.AbstractC1149a;
import o6.j;

/* loaded from: classes.dex */
public final class b extends d {

    /* renamed from: a, reason: collision with root package name */
    public final C0999a f13685a;

    /* renamed from: b, reason: collision with root package name */
    public final C0999a f13686b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13687c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13688d;

    /* renamed from: e, reason: collision with root package name */
    public final long f13689e;

    public b(C0999a c0999a, C0999a c0999a2, String str, int i4, long j) {
        j.e(str, "name");
        this.f13685a = c0999a;
        this.f13686b = c0999a2;
        this.f13687c = str;
        this.f13688d = i4;
        this.f13689e = j;
    }

    public static b i(b bVar, C0999a c0999a, C0999a c0999a2, String str, int i4, long j, int i8) {
        if ((i8 & 1) != 0) {
            c0999a = bVar.f13685a;
        }
        C0999a c0999a3 = c0999a;
        if ((i8 & 2) != 0) {
            c0999a2 = bVar.f13686b;
        }
        C0999a c0999a4 = c0999a2;
        if ((i8 & 4) != 0) {
            str = bVar.f13687c;
        }
        String str2 = str;
        if ((i8 & 8) != 0) {
            i4 = bVar.f13688d;
        }
        int i9 = i4;
        if ((i8 & 16) != 0) {
            j = bVar.f13689e;
        }
        bVar.getClass();
        j.e(str2, "name");
        return new b(c0999a3, c0999a4, str2, i9, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (j.a(this.f13685a, bVar.f13685a) && j.a(this.f13686b, bVar.f13686b) && j.a(this.f13687c, bVar.f13687c) && this.f13688d == bVar.f13688d && this.f13689e == bVar.f13689e) {
            return true;
        }
        return false;
    }

    @Override // p2.d
    public final C0999a g() {
        return this.f13686b;
    }

    @Override // m1.InterfaceC1053c
    public final C0999a getId() {
        return this.f13685a;
    }

    @Override // p2.d
    public final boolean h() {
        if (this.f13687c.length() > 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f13689e) + AbstractC1149a.b(this.f13688d, A.j.c(this.f13687c, A.j.d(this.f13686b, this.f13685a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder t8 = A.j.t("DumbPause(id=", this.f13685a, ", scenarioId=", this.f13686b, ", name=");
        t8.append(this.f13687c);
        t8.append(", priority=");
        t8.append(this.f13688d);
        t8.append(", pauseDurationMs=");
        t8.append(this.f13689e);
        t8.append(")");
        return t8.toString();
    }
}
