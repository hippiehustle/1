package l2;

import h1.f;
import l1.C0999a;
import m1.InterfaceC1053c;
import n1.AbstractC1149a;
import o6.j;

/* renamed from: l2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1001a implements InterfaceC1053c {

    /* renamed from: a, reason: collision with root package name */
    public final C0999a f12190a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12191b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12192c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f12193d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f12194e;

    /* renamed from: f, reason: collision with root package name */
    public final int f12195f;

    /* renamed from: g, reason: collision with root package name */
    public final f f12196g;

    public /* synthetic */ C1001a(C0999a c0999a, String str, int i4, boolean z8, boolean z9, int i8) {
        this(c0999a, str, i4, (i8 & 8) != 0 ? false : z8, (i8 & 16) != 0 ? false : z9, 0, null);
    }

    public static C1001a b(C1001a c1001a, String str, int i4, boolean z8, boolean z9, int i8) {
        C0999a c0999a = c1001a.f12190a;
        if ((i8 & 2) != 0) {
            str = c1001a.f12191b;
        }
        String str2 = str;
        if ((i8 & 4) != 0) {
            i4 = c1001a.f12192c;
        }
        int i9 = i4;
        if ((i8 & 8) != 0) {
            z8 = c1001a.f12193d;
        }
        boolean z10 = z8;
        if ((i8 & 16) != 0) {
            z9 = c1001a.f12194e;
        }
        int i10 = c1001a.f12195f;
        f fVar = c1001a.f12196g;
        c1001a.getClass();
        j.e(c0999a, "id");
        j.e(str2, "name");
        return new C1001a(c0999a, str2, i9, z10, z9, i10, fVar);
    }

    @Override // m1.InterfaceC1053c
    public final Long a() {
        return getId().f12188b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1001a)) {
            return false;
        }
        C1001a c1001a = (C1001a) obj;
        if (j.a(this.f12190a, c1001a.f12190a) && j.a(this.f12191b, c1001a.f12191b) && this.f12192c == c1001a.f12192c && this.f12193d == c1001a.f12193d && this.f12194e == c1001a.f12194e && this.f12195f == c1001a.f12195f && j.a(this.f12196g, c1001a.f12196g)) {
            return true;
        }
        return false;
    }

    @Override // m1.InterfaceC1053c
    public final C0999a getId() {
        return this.f12190a;
    }

    public final int hashCode() {
        int hashCode;
        int b4 = AbstractC1149a.b(this.f12195f, AbstractC1149a.c(AbstractC1149a.c(AbstractC1149a.b(this.f12192c, A.j.c(this.f12191b, this.f12190a.hashCode() * 31, 31), 31), 31, this.f12193d), 31, this.f12194e), 31);
        f fVar = this.f12196g;
        if (fVar == null) {
            hashCode = 0;
        } else {
            hashCode = fVar.hashCode();
        }
        return b4 + hashCode;
    }

    public final String toString() {
        return "Scenario(id=" + this.f12190a + ", name=" + this.f12191b + ", detectionQuality=" + this.f12192c + ", randomize=" + this.f12193d + ", keepScreenOn=" + this.f12194e + ", eventCount=" + this.f12195f + ", stats=" + this.f12196g + ")";
    }

    public C1001a(C0999a c0999a, String str, int i4, boolean z8, boolean z9, int i8, f fVar) {
        j.e(str, "name");
        this.f12190a = c0999a;
        this.f12191b = str;
        this.f12192c = i4;
        this.f12193d = z8;
        this.f12194e = z9;
        this.f12195f = i8;
        this.f12196g = fVar;
    }
}
