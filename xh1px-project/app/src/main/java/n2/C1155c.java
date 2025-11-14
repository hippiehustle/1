package n2;

import Z7.Q;
import m1.InterfaceC1052b;
import n1.AbstractC1149a;

/* renamed from: n2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1155c implements InterfaceC1052b {
    public static final C1154b Companion = new Object();

    /* renamed from: r, reason: collision with root package name */
    public static final Z5.g[] f12866r = {null, null, null, null, Z5.a.c(Z5.h.f7482d, new B1.e(28)), null, null, null, null, null, null, null, null, null, null, null, null};

    /* renamed from: a, reason: collision with root package name */
    public final long f12867a;

    /* renamed from: b, reason: collision with root package name */
    public final long f12868b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12869c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12870d;

    /* renamed from: e, reason: collision with root package name */
    public final EnumC1156d f12871e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f12872f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f12873g;

    /* renamed from: h, reason: collision with root package name */
    public final Long f12874h;

    /* renamed from: i, reason: collision with root package name */
    public final Long f12875i;
    public final Integer j;
    public final Integer k;

    /* renamed from: l, reason: collision with root package name */
    public final Long f12876l;

    /* renamed from: m, reason: collision with root package name */
    public final Integer f12877m;

    /* renamed from: n, reason: collision with root package name */
    public final Integer f12878n;

    /* renamed from: o, reason: collision with root package name */
    public final Integer f12879o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f12880p;

    /* renamed from: q, reason: collision with root package name */
    public final Long f12881q;

    public /* synthetic */ C1155c(int i4, long j, long j5, int i8, String str, EnumC1156d enumC1156d, Integer num, Boolean bool, Long l6, Long l8, Integer num2, Integer num3, Long l9, Integer num4, Integer num5, Integer num6, Integer num7, Long l10) {
        if (27 != (i4 & 27)) {
            Q.f(i4, 27, C1153a.f12865a.d());
            throw null;
        }
        this.f12867a = j;
        this.f12868b = j5;
        if ((i4 & 4) == 0) {
            this.f12869c = 0;
        } else {
            this.f12869c = i8;
        }
        this.f12870d = str;
        this.f12871e = enumC1156d;
        if ((i4 & 32) == 0) {
            this.f12872f = null;
        } else {
            this.f12872f = num;
        }
        if ((i4 & 64) == 0) {
            this.f12873g = null;
        } else {
            this.f12873g = bool;
        }
        if ((i4 & 128) == 0) {
            this.f12874h = null;
        } else {
            this.f12874h = l6;
        }
        if ((i4 & 256) == 0) {
            this.f12875i = null;
        } else {
            this.f12875i = l8;
        }
        if ((i4 & 512) == 0) {
            this.j = null;
        } else {
            this.j = num2;
        }
        if ((i4 & 1024) == 0) {
            this.k = null;
        } else {
            this.k = num3;
        }
        if ((i4 & 2048) == 0) {
            this.f12876l = null;
        } else {
            this.f12876l = l9;
        }
        if ((i4 & 4096) == 0) {
            this.f12877m = null;
        } else {
            this.f12877m = num4;
        }
        if ((i4 & 8192) == 0) {
            this.f12878n = null;
        } else {
            this.f12878n = num5;
        }
        if ((i4 & 16384) == 0) {
            this.f12879o = null;
        } else {
            this.f12879o = num6;
        }
        if ((32768 & i4) == 0) {
            this.f12880p = null;
        } else {
            this.f12880p = num7;
        }
        if ((i4 & 65536) == 0) {
            this.f12881q = null;
        } else {
            this.f12881q = l10;
        }
    }

    public static C1155c a(C1155c c1155c, long j) {
        int i4 = c1155c.f12869c;
        String str = c1155c.f12870d;
        EnumC1156d enumC1156d = c1155c.f12871e;
        Integer num = c1155c.f12872f;
        Boolean bool = c1155c.f12873g;
        Long l6 = c1155c.f12874h;
        Long l8 = c1155c.f12875i;
        Integer num2 = c1155c.j;
        Integer num3 = c1155c.k;
        Long l9 = c1155c.f12876l;
        Integer num4 = c1155c.f12877m;
        Integer num5 = c1155c.f12878n;
        Integer num6 = c1155c.f12879o;
        Integer num7 = c1155c.f12880p;
        Long l10 = c1155c.f12881q;
        c1155c.getClass();
        o6.j.e(str, "name");
        o6.j.e(enumC1156d, "type");
        return new C1155c(0L, j, i4, str, enumC1156d, num, bool, l6, l8, num2, num3, l9, num4, num5, num6, num7, l10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1155c)) {
            return false;
        }
        C1155c c1155c = (C1155c) obj;
        if (this.f12867a == c1155c.f12867a && this.f12868b == c1155c.f12868b && this.f12869c == c1155c.f12869c && o6.j.a(this.f12870d, c1155c.f12870d) && this.f12871e == c1155c.f12871e && o6.j.a(this.f12872f, c1155c.f12872f) && o6.j.a(this.f12873g, c1155c.f12873g) && o6.j.a(this.f12874h, c1155c.f12874h) && o6.j.a(this.f12875i, c1155c.f12875i) && o6.j.a(this.j, c1155c.j) && o6.j.a(this.k, c1155c.k) && o6.j.a(this.f12876l, c1155c.f12876l) && o6.j.a(this.f12877m, c1155c.f12877m) && o6.j.a(this.f12878n, c1155c.f12878n) && o6.j.a(this.f12879o, c1155c.f12879o) && o6.j.a(this.f12880p, c1155c.f12880p) && o6.j.a(this.f12881q, c1155c.f12881q)) {
            return true;
        }
        return false;
    }

    @Override // m1.InterfaceC1052b
    public final long getId() {
        return this.f12867a;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12 = (this.f12871e.hashCode() + A.j.c(this.f12870d, AbstractC1149a.b(this.f12869c, AbstractC1149a.d(this.f12868b, Long.hashCode(this.f12867a) * 31, 31), 31), 31)) * 31;
        int i4 = 0;
        Integer num = this.f12872f;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i8 = (hashCode12 + hashCode) * 31;
        Boolean bool = this.f12873g;
        if (bool == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool.hashCode();
        }
        int i9 = (i8 + hashCode2) * 31;
        Long l6 = this.f12874h;
        if (l6 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = l6.hashCode();
        }
        int i10 = (i9 + hashCode3) * 31;
        Long l8 = this.f12875i;
        if (l8 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = l8.hashCode();
        }
        int i11 = (i10 + hashCode4) * 31;
        Integer num2 = this.j;
        if (num2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = num2.hashCode();
        }
        int i12 = (i11 + hashCode5) * 31;
        Integer num3 = this.k;
        if (num3 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = num3.hashCode();
        }
        int i13 = (i12 + hashCode6) * 31;
        Long l9 = this.f12876l;
        if (l9 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = l9.hashCode();
        }
        int i14 = (i13 + hashCode7) * 31;
        Integer num4 = this.f12877m;
        if (num4 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = num4.hashCode();
        }
        int i15 = (i14 + hashCode8) * 31;
        Integer num5 = this.f12878n;
        if (num5 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = num5.hashCode();
        }
        int i16 = (i15 + hashCode9) * 31;
        Integer num6 = this.f12879o;
        if (num6 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = num6.hashCode();
        }
        int i17 = (i16 + hashCode10) * 31;
        Integer num7 = this.f12880p;
        if (num7 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = num7.hashCode();
        }
        int i18 = (i17 + hashCode11) * 31;
        Long l10 = this.f12881q;
        if (l10 != null) {
            i4 = l10.hashCode();
        }
        return i18 + i4;
    }

    public final String toString() {
        return "DumbActionEntity(id=" + this.f12867a + ", dumbScenarioId=" + this.f12868b + ", priority=" + this.f12869c + ", name=" + this.f12870d + ", type=" + this.f12871e + ", repeatCount=" + this.f12872f + ", isRepeatInfinite=" + this.f12873g + ", repeatDelay=" + this.f12874h + ", pressDuration=" + this.f12875i + ", x=" + this.j + ", y=" + this.k + ", swipeDuration=" + this.f12876l + ", fromX=" + this.f12877m + ", fromY=" + this.f12878n + ", toX=" + this.f12879o + ", toY=" + this.f12880p + ", pauseDuration=" + this.f12881q + ")";
    }

    public C1155c(long j, long j5, int i4, String str, EnumC1156d enumC1156d, Integer num, Boolean bool, Long l6, Long l8, Integer num2, Integer num3, Long l9, Integer num4, Integer num5, Integer num6, Integer num7, Long l10) {
        o6.j.e(str, "name");
        o6.j.e(enumC1156d, "type");
        this.f12867a = j;
        this.f12868b = j5;
        this.f12869c = i4;
        this.f12870d = str;
        this.f12871e = enumC1156d;
        this.f12872f = num;
        this.f12873g = bool;
        this.f12874h = l6;
        this.f12875i = l8;
        this.j = num2;
        this.k = num3;
        this.f12876l = l9;
        this.f12877m = num4;
        this.f12878n = num5;
        this.f12879o = num6;
        this.f12880p = num7;
        this.f12881q = l10;
    }

    public /* synthetic */ C1155c(long j, long j5, int i4, String str, EnumC1156d enumC1156d, Integer num, Boolean bool, Long l6, Long l8, Integer num2, Integer num3, Long l9, Integer num4, Integer num5, Integer num6, Integer num7, Long l10, int i8) {
        this(j, j5, i4, str, enumC1156d, (i8 & 32) != 0 ? null : num, (i8 & 64) != 0 ? null : bool, (i8 & 128) != 0 ? null : l6, (i8 & 256) != 0 ? null : l8, (i8 & 512) != 0 ? null : num2, (i8 & 1024) != 0 ? null : num3, (i8 & 2048) != 0 ? null : l9, (i8 & 4096) != 0 ? null : num4, (i8 & 8192) != 0 ? null : num5, (i8 & 16384) != 0 ? null : num6, (32768 & i8) != 0 ? null : num7, (i8 & 65536) != 0 ? null : l10);
    }
}
