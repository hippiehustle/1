package Z4;

import n1.AbstractC1149a;

/* loaded from: classes.dex */
public final class e extends h {

    /* renamed from: b, reason: collision with root package name */
    public final p2.e f7424b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7425c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7426d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f7427e;

    /* renamed from: f, reason: collision with root package name */
    public final long f7428f;

    /* renamed from: g, reason: collision with root package name */
    public final long f7429g;

    /* renamed from: h, reason: collision with root package name */
    public final int f7430h;

    /* renamed from: i, reason: collision with root package name */
    public final int f7431i;
    public final int j;
    public final String k;

    /* renamed from: l, reason: collision with root package name */
    public final String f7432l;

    public e(p2.e eVar, boolean z8, boolean z9, boolean z10, long j, long j5, int i4, int i8, int i9, String str, String str2) {
        super(eVar.f13700b);
        this.f7424b = eVar;
        this.f7425c = z8;
        this.f7426d = z9;
        this.f7427e = z10;
        this.f7428f = j;
        this.f7429g = j5;
        this.f7430h = i4;
        this.f7431i = i8;
        this.j = i9;
        this.k = str;
        this.f7432l = str2;
    }

    public static e e(e eVar, boolean z8, boolean z9, int i4) {
        boolean z10;
        boolean z11;
        p2.e eVar2 = eVar.f7424b;
        if ((i4 & 2) != 0) {
            z10 = eVar.f7425c;
        } else {
            z10 = true;
        }
        boolean z12 = z10;
        if ((i4 & 4) != 0) {
            z8 = eVar.f7426d;
        }
        boolean z13 = z8;
        if ((i4 & 8) != 0) {
            z11 = eVar.f7427e;
        } else {
            z11 = z9;
        }
        long j = eVar.f7428f;
        long j5 = eVar.f7429g;
        int i8 = eVar.f7430h;
        int i9 = eVar.f7431i;
        int i10 = eVar.j;
        String str = eVar.k;
        String str2 = eVar.f7432l;
        eVar.getClass();
        return new e(eVar2, z12, z13, z11, j, j5, i8, i9, i10, str, str2);
    }

    @Override // Z4.i
    public final long a() {
        return this.f7428f;
    }

    @Override // Z4.i
    public final Object b() {
        return this.f7424b;
    }

    @Override // Z4.i
    public final long c() {
        return this.f7429g;
    }

    @Override // Z4.h
    public final long d() {
        return this.f7424b.f13699a.f12187a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (o6.j.a(this.f7424b, eVar.f7424b) && this.f7425c == eVar.f7425c && this.f7426d == eVar.f7426d && this.f7427e == eVar.f7427e && this.f7428f == eVar.f7428f && this.f7429g == eVar.f7429g && this.f7430h == eVar.f7430h && this.f7431i == eVar.f7431i && this.j == eVar.j && o6.j.a(this.k, eVar.k) && o6.j.a(this.f7432l, eVar.f7432l)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f7432l.hashCode() + A.j.c(this.k, AbstractC1149a.b(this.j, AbstractC1149a.b(this.f7431i, AbstractC1149a.b(this.f7430h, AbstractC1149a.d(this.f7429g, AbstractC1149a.d(this.f7428f, AbstractC1149a.c(AbstractC1149a.c(AbstractC1149a.c(this.f7424b.hashCode() * 31, 31, this.f7425c), 31, this.f7426d), 31, this.f7427e), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Dumb(scenario=");
        sb.append(this.f7424b);
        sb.append(", showExportCheckbox=");
        sb.append(this.f7425c);
        sb.append(", checkedForExport=");
        sb.append(this.f7426d);
        sb.append(", expanded=");
        sb.append(this.f7427e);
        sb.append(", lastStartTimestamp=");
        sb.append(this.f7428f);
        sb.append(", startCount=");
        sb.append(this.f7429g);
        sb.append(", clickCount=");
        sb.append(this.f7430h);
        sb.append(", swipeCount=");
        sb.append(this.f7431i);
        sb.append(", pauseCount=");
        sb.append(this.j);
        sb.append(", repeatText=");
        sb.append(this.k);
        sb.append(", maxDurationText=");
        return A.j.r(sb, this.f7432l, ")");
    }
}
