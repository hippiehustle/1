package T1;

import Z7.Q;
import m1.InterfaceC1052b;
import n1.AbstractC1149a;

/* loaded from: classes.dex */
public final class r implements InterfaceC1052b {
    public static final q Companion = new Object();

    /* renamed from: z, reason: collision with root package name */
    public static final Z5.g[] f5612z;

    /* renamed from: a, reason: collision with root package name */
    public final long f5613a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5614b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5615c;

    /* renamed from: d, reason: collision with root package name */
    public final s f5616d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5617e;

    /* renamed from: f, reason: collision with root package name */
    public final String f5618f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f5619g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer f5620h;

    /* renamed from: i, reason: collision with root package name */
    public final Integer f5621i;
    public final Integer j;
    public final Integer k;

    /* renamed from: l, reason: collision with root package name */
    public final Integer f5622l;

    /* renamed from: m, reason: collision with root package name */
    public final Boolean f5623m;

    /* renamed from: n, reason: collision with root package name */
    public final Integer f5624n;

    /* renamed from: o, reason: collision with root package name */
    public final Integer f5625o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f5626p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f5627q;

    /* renamed from: r, reason: collision with root package name */
    public final String f5628r;

    /* renamed from: s, reason: collision with root package name */
    public final String f5629s;

    /* renamed from: t, reason: collision with root package name */
    public final t f5630t;

    /* renamed from: u, reason: collision with root package name */
    public final u f5631u;

    /* renamed from: v, reason: collision with root package name */
    public final Integer f5632v;

    /* renamed from: w, reason: collision with root package name */
    public final String f5633w;

    /* renamed from: x, reason: collision with root package name */
    public final Long f5634x;

    /* renamed from: y, reason: collision with root package name */
    public final Boolean f5635y;

    /* JADX WARN: Type inference failed for: r0v0, types: [T1.q, java.lang.Object] */
    static {
        B1.e eVar = new B1.e(15);
        Z5.h hVar = Z5.h.f7482d;
        f5612z = new Z5.g[]{null, null, null, Z5.a.c(hVar, eVar), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Z5.a.c(hVar, new B1.e(16)), Z5.a.c(hVar, new B1.e(17)), null, null, null, null};
    }

    public /* synthetic */ r(int i4, long j, long j5, String str, s sVar, int i8, String str2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Boolean bool, Integer num7, Integer num8, Integer num9, Integer num10, String str3, String str4, t tVar, u uVar, Integer num11, String str5, Long l6, Boolean bool2) {
        if (31 != (i4 & 31)) {
            Q.f(i4, 31, p.f5611a.d());
            throw null;
        }
        this.f5613a = j;
        this.f5614b = j5;
        this.f5615c = str;
        this.f5616d = sVar;
        this.f5617e = i8;
        if ((i4 & 32) == 0) {
            this.f5618f = null;
        } else {
            this.f5618f = str2;
        }
        if ((i4 & 64) == 0) {
            this.f5619g = null;
        } else {
            this.f5619g = num;
        }
        if ((i4 & 128) == 0) {
            this.f5620h = null;
        } else {
            this.f5620h = num2;
        }
        if ((i4 & 256) == 0) {
            this.f5621i = null;
        } else {
            this.f5621i = num3;
        }
        if ((i4 & 512) == 0) {
            this.j = null;
        } else {
            this.j = num4;
        }
        if ((i4 & 1024) == 0) {
            this.k = null;
        } else {
            this.k = num5;
        }
        if ((i4 & 2048) == 0) {
            this.f5622l = null;
        } else {
            this.f5622l = num6;
        }
        if ((i4 & 4096) == 0) {
            this.f5623m = null;
        } else {
            this.f5623m = bool;
        }
        if ((i4 & 8192) == 0) {
            this.f5624n = null;
        } else {
            this.f5624n = num7;
        }
        if ((i4 & 16384) == 0) {
            this.f5625o = null;
        } else {
            this.f5625o = num8;
        }
        if ((32768 & i4) == 0) {
            this.f5626p = null;
        } else {
            this.f5626p = num9;
        }
        if ((65536 & i4) == 0) {
            this.f5627q = null;
        } else {
            this.f5627q = num10;
        }
        if ((131072 & i4) == 0) {
            this.f5628r = null;
        } else {
            this.f5628r = str3;
        }
        if ((262144 & i4) == 0) {
            this.f5629s = null;
        } else {
            this.f5629s = str4;
        }
        if ((524288 & i4) == 0) {
            this.f5630t = null;
        } else {
            this.f5630t = tVar;
        }
        if ((1048576 & i4) == 0) {
            this.f5631u = null;
        } else {
            this.f5631u = uVar;
        }
        if ((2097152 & i4) == 0) {
            this.f5632v = null;
        } else {
            this.f5632v = num11;
        }
        if ((4194304 & i4) == 0) {
            this.f5633w = null;
        } else {
            this.f5633w = str5;
        }
        if ((8388608 & i4) == 0) {
            this.f5634x = null;
        } else {
            this.f5634x = l6;
        }
        if ((i4 & 16777216) == 0) {
            this.f5635y = null;
        } else {
            this.f5635y = bool2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f5613a == rVar.f5613a && this.f5614b == rVar.f5614b && o6.j.a(this.f5615c, rVar.f5615c) && this.f5616d == rVar.f5616d && this.f5617e == rVar.f5617e && o6.j.a(this.f5618f, rVar.f5618f) && o6.j.a(this.f5619g, rVar.f5619g) && o6.j.a(this.f5620h, rVar.f5620h) && o6.j.a(this.f5621i, rVar.f5621i) && o6.j.a(this.j, rVar.j) && o6.j.a(this.k, rVar.k) && o6.j.a(this.f5622l, rVar.f5622l) && o6.j.a(this.f5623m, rVar.f5623m) && o6.j.a(this.f5624n, rVar.f5624n) && o6.j.a(this.f5625o, rVar.f5625o) && o6.j.a(this.f5626p, rVar.f5626p) && o6.j.a(this.f5627q, rVar.f5627q) && o6.j.a(this.f5628r, rVar.f5628r) && o6.j.a(this.f5629s, rVar.f5629s) && this.f5630t == rVar.f5630t && this.f5631u == rVar.f5631u && o6.j.a(this.f5632v, rVar.f5632v) && o6.j.a(this.f5633w, rVar.f5633w) && o6.j.a(this.f5634x, rVar.f5634x) && o6.j.a(this.f5635y, rVar.f5635y)) {
            return true;
        }
        return false;
    }

    @Override // m1.InterfaceC1052b
    public final long getId() {
        return this.f5613a;
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
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
        int hashCode17;
        int hashCode18;
        int hashCode19;
        int b4 = AbstractC1149a.b(this.f5617e, (this.f5616d.hashCode() + A.j.c(this.f5615c, AbstractC1149a.d(this.f5614b, Long.hashCode(this.f5613a) * 31, 31), 31)) * 31, 31);
        int i4 = 0;
        String str = this.f5618f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i8 = (b4 + hashCode) * 31;
        Integer num = this.f5619g;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i9 = (i8 + hashCode2) * 31;
        Integer num2 = this.f5620h;
        if (num2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num2.hashCode();
        }
        int i10 = (i9 + hashCode3) * 31;
        Integer num3 = this.f5621i;
        if (num3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num3.hashCode();
        }
        int i11 = (i10 + hashCode4) * 31;
        Integer num4 = this.j;
        if (num4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = num4.hashCode();
        }
        int i12 = (i11 + hashCode5) * 31;
        Integer num5 = this.k;
        if (num5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = num5.hashCode();
        }
        int i13 = (i12 + hashCode6) * 31;
        Integer num6 = this.f5622l;
        if (num6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = num6.hashCode();
        }
        int i14 = (i13 + hashCode7) * 31;
        Boolean bool = this.f5623m;
        if (bool == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = bool.hashCode();
        }
        int i15 = (i14 + hashCode8) * 31;
        Integer num7 = this.f5624n;
        if (num7 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = num7.hashCode();
        }
        int i16 = (i15 + hashCode9) * 31;
        Integer num8 = this.f5625o;
        if (num8 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = num8.hashCode();
        }
        int i17 = (i16 + hashCode10) * 31;
        Integer num9 = this.f5626p;
        if (num9 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = num9.hashCode();
        }
        int i18 = (i17 + hashCode11) * 31;
        Integer num10 = this.f5627q;
        if (num10 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = num10.hashCode();
        }
        int i19 = (i18 + hashCode12) * 31;
        String str2 = this.f5628r;
        if (str2 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = str2.hashCode();
        }
        int i20 = (i19 + hashCode13) * 31;
        String str3 = this.f5629s;
        if (str3 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = str3.hashCode();
        }
        int i21 = (i20 + hashCode14) * 31;
        t tVar = this.f5630t;
        if (tVar == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = tVar.hashCode();
        }
        int i22 = (i21 + hashCode15) * 31;
        u uVar = this.f5631u;
        if (uVar == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = uVar.hashCode();
        }
        int i23 = (i22 + hashCode16) * 31;
        Integer num11 = this.f5632v;
        if (num11 == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = num11.hashCode();
        }
        int i24 = (i23 + hashCode17) * 31;
        String str4 = this.f5633w;
        if (str4 == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = str4.hashCode();
        }
        int i25 = (i24 + hashCode18) * 31;
        Long l6 = this.f5634x;
        if (l6 == null) {
            hashCode19 = 0;
        } else {
            hashCode19 = l6.hashCode();
        }
        int i26 = (i25 + hashCode19) * 31;
        Boolean bool2 = this.f5635y;
        if (bool2 != null) {
            i4 = bool2.hashCode();
        }
        return i26 + i4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConditionEntity(id=");
        sb.append(this.f5613a);
        sb.append(", eventId=");
        sb.append(this.f5614b);
        sb.append(", name=");
        sb.append(this.f5615c);
        sb.append(", type=");
        sb.append(this.f5616d);
        sb.append(", priority=");
        sb.append(this.f5617e);
        sb.append(", path=");
        sb.append(this.f5618f);
        sb.append(", areaLeft=");
        sb.append(this.f5619g);
        sb.append(", areaTop=");
        sb.append(this.f5620h);
        sb.append(", areaRight=");
        sb.append(this.f5621i);
        sb.append(", areaBottom=");
        sb.append(this.j);
        sb.append(", threshold=");
        sb.append(this.k);
        sb.append(", detectionType=");
        sb.append(this.f5622l);
        sb.append(", shouldBeDetected=");
        sb.append(this.f5623m);
        sb.append(", detectionAreaLeft=");
        sb.append(this.f5624n);
        sb.append(", detectionAreaTop=");
        sb.append(this.f5625o);
        sb.append(", detectionAreaRight=");
        sb.append(this.f5626p);
        sb.append(", detectionAreaBottom=");
        sb.append(this.f5627q);
        AbstractC1149a.m(sb, ", broadcastAction=", this.f5628r, ", counterName=", this.f5629s);
        sb.append(", counterComparisonOperation=");
        sb.append(this.f5630t);
        sb.append(", counterOperationValueType=");
        sb.append(this.f5631u);
        sb.append(", counterValue=");
        sb.append(this.f5632v);
        sb.append(", counterOperationCounterName=");
        sb.append(this.f5633w);
        sb.append(", timerValueMs=");
        sb.append(this.f5634x);
        sb.append(", restartWhenReached=");
        sb.append(this.f5635y);
        sb.append(")");
        return sb.toString();
    }

    public r(long j, long j5, String str, s sVar, int i4, String str2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Boolean bool, Integer num7, Integer num8, Integer num9, Integer num10, String str3, String str4, t tVar, u uVar, Integer num11, String str5, Long l6, Boolean bool2) {
        o6.j.e(str, "name");
        o6.j.e(sVar, "type");
        this.f5613a = j;
        this.f5614b = j5;
        this.f5615c = str;
        this.f5616d = sVar;
        this.f5617e = i4;
        this.f5618f = str2;
        this.f5619g = num;
        this.f5620h = num2;
        this.f5621i = num3;
        this.j = num4;
        this.k = num5;
        this.f5622l = num6;
        this.f5623m = bool;
        this.f5624n = num7;
        this.f5625o = num8;
        this.f5626p = num9;
        this.f5627q = num10;
        this.f5628r = str3;
        this.f5629s = str4;
        this.f5630t = tVar;
        this.f5631u = uVar;
        this.f5632v = num11;
        this.f5633w = str5;
        this.f5634x = l6;
        this.f5635y = bool2;
    }

    public /* synthetic */ r(long j, long j5, String str, s sVar, int i4, String str2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Boolean bool, Integer num7, Integer num8, Integer num9, Integer num10, String str3, String str4, t tVar, u uVar, Integer num11, String str5, Long l6, Boolean bool2, int i8) {
        this(j, j5, str, sVar, i4, (i8 & 32) != 0 ? null : str2, (i8 & 64) != 0 ? null : num, (i8 & 128) != 0 ? null : num2, (i8 & 256) != 0 ? null : num3, (i8 & 512) != 0 ? null : num4, (i8 & 1024) != 0 ? null : num5, (i8 & 2048) != 0 ? null : num6, (i8 & 4096) != 0 ? null : bool, (i8 & 8192) != 0 ? null : num7, (i8 & 16384) != 0 ? null : num8, (32768 & i8) != 0 ? null : num9, (65536 & i8) != 0 ? null : num10, (131072 & i8) != 0 ? null : str3, (262144 & i8) != 0 ? null : str4, (524288 & i8) != 0 ? null : tVar, (1048576 & i8) != 0 ? null : uVar, (2097152 & i8) != 0 ? null : num11, (4194304 & i8) != 0 ? null : str5, (8388608 & i8) != 0 ? null : l6, (i8 & 16777216) != 0 ? null : bool2);
    }
}
