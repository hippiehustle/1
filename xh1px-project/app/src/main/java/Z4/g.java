package Z4;

import java.util.List;
import l2.C1001a;
import n1.AbstractC1149a;

/* loaded from: classes.dex */
public final class g extends h {

    /* renamed from: b, reason: collision with root package name */
    public final C1001a f7438b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7439c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7440d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f7441e;

    /* renamed from: f, reason: collision with root package name */
    public final long f7442f;

    /* renamed from: g, reason: collision with root package name */
    public final long f7443g;

    /* renamed from: h, reason: collision with root package name */
    public final List f7444h;

    /* renamed from: i, reason: collision with root package name */
    public final int f7445i;
    public final int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(C1001a c1001a, boolean z8, boolean z9, boolean z10, long j, long j5, List list, int i4, int i8) {
        super(c1001a.f12191b);
        o6.j.e(list, "eventsItems");
        this.f7438b = c1001a;
        this.f7439c = z8;
        this.f7440d = z9;
        this.f7441e = z10;
        this.f7442f = j;
        this.f7443g = j5;
        this.f7444h = list;
        this.f7445i = i4;
        this.j = i8;
    }

    public static g e(g gVar, boolean z8, boolean z9, int i4) {
        boolean z10;
        C1001a c1001a = gVar.f7438b;
        if ((i4 & 2) != 0) {
            z10 = gVar.f7439c;
        } else {
            z10 = true;
        }
        boolean z11 = z10;
        if ((i4 & 4) != 0) {
            z8 = gVar.f7440d;
        }
        boolean z12 = z8;
        if ((i4 & 8) != 0) {
            z9 = gVar.f7441e;
        }
        long j = gVar.f7442f;
        long j5 = gVar.f7443g;
        List list = gVar.f7444h;
        int i8 = gVar.f7445i;
        int i9 = gVar.j;
        gVar.getClass();
        o6.j.e(list, "eventsItems");
        return new g(c1001a, z11, z12, z9, j, j5, list, i8, i9);
    }

    @Override // Z4.i
    public final long a() {
        return this.f7442f;
    }

    @Override // Z4.i
    public final Object b() {
        return this.f7438b;
    }

    @Override // Z4.i
    public final long c() {
        return this.f7443g;
    }

    @Override // Z4.h
    public final long d() {
        return this.f7438b.f12190a.f12187a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (o6.j.a(this.f7438b, gVar.f7438b) && this.f7439c == gVar.f7439c && this.f7440d == gVar.f7440d && this.f7441e == gVar.f7441e && this.f7442f == gVar.f7442f && this.f7443g == gVar.f7443g && o6.j.a(this.f7444h, gVar.f7444h) && this.f7445i == gVar.f7445i && this.j == gVar.j) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.j) + AbstractC1149a.b(this.f7445i, (this.f7444h.hashCode() + AbstractC1149a.d(this.f7443g, AbstractC1149a.d(this.f7442f, AbstractC1149a.c(AbstractC1149a.c(AbstractC1149a.c(this.f7438b.hashCode() * 31, 31, this.f7439c), 31, this.f7440d), 31, this.f7441e), 31), 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Smart(scenario=");
        sb.append(this.f7438b);
        sb.append(", showExportCheckbox=");
        sb.append(this.f7439c);
        sb.append(", checkedForExport=");
        sb.append(this.f7440d);
        sb.append(", expanded=");
        sb.append(this.f7441e);
        sb.append(", lastStartTimestamp=");
        sb.append(this.f7442f);
        sb.append(", startCount=");
        sb.append(this.f7443g);
        sb.append(", eventsItems=");
        sb.append(this.f7444h);
        sb.append(", triggerEventCount=");
        sb.append(this.f7445i);
        sb.append(", detectionQuality=");
        return AbstractC1149a.h(sb, this.j, ")");
    }
}
