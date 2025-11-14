package T1;

import java.util.ArrayList;
import kotlinx.serialization.MissingFieldException;
import m1.InterfaceC1052b;
import n1.AbstractC1149a;

/* renamed from: T1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0304c implements InterfaceC1052b {
    public static final C0303b Companion = new Object();

    /* renamed from: L, reason: collision with root package name */
    public static final Z5.g[] f5547L;

    /* renamed from: A, reason: collision with root package name */
    public final EnumC0306e f5548A;

    /* renamed from: B, reason: collision with root package name */
    public final u f5549B;

    /* renamed from: C, reason: collision with root package name */
    public final Integer f5550C;

    /* renamed from: D, reason: collision with root package name */
    public final String f5551D;

    /* renamed from: E, reason: collision with root package name */
    public final H f5552E;

    /* renamed from: F, reason: collision with root package name */
    public final String f5553F;

    /* renamed from: G, reason: collision with root package name */
    public final String f5554G;

    /* renamed from: H, reason: collision with root package name */
    public final Integer f5555H;

    /* renamed from: I, reason: collision with root package name */
    public final N f5556I;

    /* renamed from: J, reason: collision with root package name */
    public final String f5557J;
    public final Boolean K;

    /* renamed from: a, reason: collision with root package name */
    public final long f5558a;

    /* renamed from: b, reason: collision with root package name */
    public long f5559b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5560c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5561d;

    /* renamed from: e, reason: collision with root package name */
    public final EnumC0305d f5562e;

    /* renamed from: f, reason: collision with root package name */
    public final EnumC0307f f5563f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f5564g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer f5565h;

    /* renamed from: i, reason: collision with root package name */
    public Long f5566i;
    public final Long j;
    public final Integer k;

    /* renamed from: l, reason: collision with root package name */
    public final Integer f5567l;

    /* renamed from: m, reason: collision with root package name */
    public final Integer f5568m;

    /* renamed from: n, reason: collision with root package name */
    public final Integer f5569n;

    /* renamed from: o, reason: collision with root package name */
    public final Integer f5570o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f5571p;

    /* renamed from: q, reason: collision with root package name */
    public final Long f5572q;

    /* renamed from: r, reason: collision with root package name */
    public final Long f5573r;

    /* renamed from: s, reason: collision with root package name */
    public final Boolean f5574s;

    /* renamed from: t, reason: collision with root package name */
    public final Boolean f5575t;

    /* renamed from: u, reason: collision with root package name */
    public final String f5576u;

    /* renamed from: v, reason: collision with root package name */
    public final String f5577v;

    /* renamed from: w, reason: collision with root package name */
    public final Integer f5578w;

    /* renamed from: x, reason: collision with root package name */
    public final Boolean f5579x;

    /* renamed from: y, reason: collision with root package name */
    public final B f5580y;

    /* renamed from: z, reason: collision with root package name */
    public final String f5581z;

    /* JADX WARN: Type inference failed for: r0v0, types: [T1.b, java.lang.Object] */
    static {
        B1.e eVar = new B1.e(3);
        Z5.h hVar = Z5.h.f7482d;
        f5547L = new Z5.g[]{null, null, null, null, Z5.a.c(hVar, eVar), Z5.a.c(hVar, new B1.e(4)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Z5.a.c(hVar, new B1.e(5)), null, Z5.a.c(hVar, new B1.e(6)), Z5.a.c(hVar, new B1.e(7)), null, null, Z5.a.c(hVar, new B1.e(8)), null, null, null, Z5.a.c(hVar, new B1.e(9)), null, null};
    }

    public C0304c(int i4, int i8, long j, long j5, int i9, String str, EnumC0305d enumC0305d, EnumC0307f enumC0307f, Integer num, Integer num2, Long l6, Long l8, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Long l9, Long l10, Boolean bool, Boolean bool2, String str2, String str3, Integer num9, Boolean bool3, B b4, String str4, EnumC0306e enumC0306e, u uVar, Integer num10, String str5, H h8, String str6, String str7, Integer num11, N n3, String str8, Boolean bool4) {
        if (27 != (i4 & 27)) {
            int[] iArr = {i4, i8};
            int[] iArr2 = {27, 0};
            X7.f d2 = C0302a.f5546a.d();
            o6.j.e(d2, "descriptor");
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < 2; i10++) {
                int i11 = iArr2[i10] & (~iArr[i10]);
                if (i11 != 0) {
                    for (int i12 = 0; i12 < 32; i12++) {
                        if ((i11 & 1) != 0) {
                            arrayList.add(d2.d((i10 * 32) + i12));
                        }
                        i11 >>>= 1;
                    }
                }
            }
            throw new MissingFieldException(arrayList, d2.b());
        }
        this.f5558a = j;
        this.f5559b = j5;
        if ((i4 & 4) == 0) {
            this.f5560c = 0;
        } else {
            this.f5560c = i9;
        }
        this.f5561d = str;
        this.f5562e = enumC0305d;
        if ((i4 & 32) == 0) {
            this.f5563f = null;
        } else {
            this.f5563f = enumC0307f;
        }
        if ((i4 & 64) == 0) {
            this.f5564g = null;
        } else {
            this.f5564g = num;
        }
        if ((i4 & 128) == 0) {
            this.f5565h = null;
        } else {
            this.f5565h = num2;
        }
        if ((i4 & 256) == 0) {
            this.f5566i = null;
        } else {
            this.f5566i = l6;
        }
        if ((i4 & 512) == 0) {
            this.j = null;
        } else {
            this.j = l8;
        }
        if ((i4 & 1024) == 0) {
            this.k = null;
        } else {
            this.k = num3;
        }
        if ((i4 & 2048) == 0) {
            this.f5567l = null;
        } else {
            this.f5567l = num4;
        }
        if ((i4 & 4096) == 0) {
            this.f5568m = null;
        } else {
            this.f5568m = num5;
        }
        if ((i4 & 8192) == 0) {
            this.f5569n = null;
        } else {
            this.f5569n = num6;
        }
        if ((i4 & 16384) == 0) {
            this.f5570o = null;
        } else {
            this.f5570o = num7;
        }
        if ((32768 & i4) == 0) {
            this.f5571p = null;
        } else {
            this.f5571p = num8;
        }
        if ((65536 & i4) == 0) {
            this.f5572q = null;
        } else {
            this.f5572q = l9;
        }
        if ((131072 & i4) == 0) {
            this.f5573r = null;
        } else {
            this.f5573r = l10;
        }
        if ((262144 & i4) == 0) {
            this.f5574s = null;
        } else {
            this.f5574s = bool;
        }
        if ((524288 & i4) == 0) {
            this.f5575t = null;
        } else {
            this.f5575t = bool2;
        }
        if ((1048576 & i4) == 0) {
            this.f5576u = null;
        } else {
            this.f5576u = str2;
        }
        if ((2097152 & i4) == 0) {
            this.f5577v = null;
        } else {
            this.f5577v = str3;
        }
        if ((4194304 & i4) == 0) {
            this.f5578w = null;
        } else {
            this.f5578w = num9;
        }
        if ((8388608 & i4) == 0) {
            this.f5579x = null;
        } else {
            this.f5579x = bool3;
        }
        if ((16777216 & i4) == 0) {
            this.f5580y = null;
        } else {
            this.f5580y = b4;
        }
        if ((33554432 & i4) == 0) {
            this.f5581z = null;
        } else {
            this.f5581z = str4;
        }
        if ((67108864 & i4) == 0) {
            this.f5548A = null;
        } else {
            this.f5548A = enumC0306e;
        }
        if ((134217728 & i4) == 0) {
            this.f5549B = null;
        } else {
            this.f5549B = uVar;
        }
        if ((268435456 & i4) == 0) {
            this.f5550C = null;
        } else {
            this.f5550C = num10;
        }
        if ((536870912 & i4) == 0) {
            this.f5551D = null;
        } else {
            this.f5551D = str5;
        }
        if ((1073741824 & i4) == 0) {
            this.f5552E = null;
        } else {
            this.f5552E = h8;
        }
        if ((i4 & Integer.MIN_VALUE) == 0) {
            this.f5553F = null;
        } else {
            this.f5553F = str6;
        }
        if ((i8 & 1) == 0) {
            this.f5554G = null;
        } else {
            this.f5554G = str7;
        }
        if ((i8 & 2) == 0) {
            this.f5555H = null;
        } else {
            this.f5555H = num11;
        }
        if ((i8 & 4) == 0) {
            this.f5556I = null;
        } else {
            this.f5556I = n3;
        }
        if ((i8 & 8) == 0) {
            this.f5557J = null;
        } else {
            this.f5557J = str8;
        }
        if ((i8 & 16) == 0) {
            this.K = null;
        } else {
            this.K = bool4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0304c)) {
            return false;
        }
        C0304c c0304c = (C0304c) obj;
        if (this.f5558a == c0304c.f5558a && this.f5559b == c0304c.f5559b && this.f5560c == c0304c.f5560c && o6.j.a(this.f5561d, c0304c.f5561d) && this.f5562e == c0304c.f5562e && this.f5563f == c0304c.f5563f && o6.j.a(this.f5564g, c0304c.f5564g) && o6.j.a(this.f5565h, c0304c.f5565h) && o6.j.a(this.f5566i, c0304c.f5566i) && o6.j.a(this.j, c0304c.j) && o6.j.a(this.k, c0304c.k) && o6.j.a(this.f5567l, c0304c.f5567l) && o6.j.a(this.f5568m, c0304c.f5568m) && o6.j.a(this.f5569n, c0304c.f5569n) && o6.j.a(this.f5570o, c0304c.f5570o) && o6.j.a(this.f5571p, c0304c.f5571p) && o6.j.a(this.f5572q, c0304c.f5572q) && o6.j.a(this.f5573r, c0304c.f5573r) && o6.j.a(this.f5574s, c0304c.f5574s) && o6.j.a(this.f5575t, c0304c.f5575t) && o6.j.a(this.f5576u, c0304c.f5576u) && o6.j.a(this.f5577v, c0304c.f5577v) && o6.j.a(this.f5578w, c0304c.f5578w) && o6.j.a(this.f5579x, c0304c.f5579x) && this.f5580y == c0304c.f5580y && o6.j.a(this.f5581z, c0304c.f5581z) && this.f5548A == c0304c.f5548A && this.f5549B == c0304c.f5549B && o6.j.a(this.f5550C, c0304c.f5550C) && o6.j.a(this.f5551D, c0304c.f5551D) && this.f5552E == c0304c.f5552E && o6.j.a(this.f5553F, c0304c.f5553F) && o6.j.a(this.f5554G, c0304c.f5554G) && o6.j.a(this.f5555H, c0304c.f5555H) && this.f5556I == c0304c.f5556I && o6.j.a(this.f5557J, c0304c.f5557J) && o6.j.a(this.K, c0304c.K)) {
            return true;
        }
        return false;
    }

    @Override // m1.InterfaceC1052b
    public final long getId() {
        return this.f5558a;
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
        int hashCode20;
        int hashCode21;
        int hashCode22;
        int hashCode23;
        int hashCode24;
        int hashCode25;
        int hashCode26;
        int hashCode27;
        int hashCode28;
        int hashCode29;
        int hashCode30;
        int hashCode31;
        int hashCode32 = (this.f5562e.hashCode() + A.j.c(this.f5561d, AbstractC1149a.b(this.f5560c, AbstractC1149a.d(this.f5559b, Long.hashCode(this.f5558a) * 31, 31), 31), 31)) * 31;
        int i4 = 0;
        EnumC0307f enumC0307f = this.f5563f;
        if (enumC0307f == null) {
            hashCode = 0;
        } else {
            hashCode = enumC0307f.hashCode();
        }
        int i8 = (hashCode32 + hashCode) * 31;
        Integer num = this.f5564g;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i9 = (i8 + hashCode2) * 31;
        Integer num2 = this.f5565h;
        if (num2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num2.hashCode();
        }
        int i10 = (i9 + hashCode3) * 31;
        Long l6 = this.f5566i;
        if (l6 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = l6.hashCode();
        }
        int i11 = (i10 + hashCode4) * 31;
        Long l8 = this.j;
        if (l8 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = l8.hashCode();
        }
        int i12 = (i11 + hashCode5) * 31;
        Integer num3 = this.k;
        if (num3 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = num3.hashCode();
        }
        int i13 = (i12 + hashCode6) * 31;
        Integer num4 = this.f5567l;
        if (num4 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = num4.hashCode();
        }
        int i14 = (i13 + hashCode7) * 31;
        Integer num5 = this.f5568m;
        if (num5 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = num5.hashCode();
        }
        int i15 = (i14 + hashCode8) * 31;
        Integer num6 = this.f5569n;
        if (num6 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = num6.hashCode();
        }
        int i16 = (i15 + hashCode9) * 31;
        Integer num7 = this.f5570o;
        if (num7 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = num7.hashCode();
        }
        int i17 = (i16 + hashCode10) * 31;
        Integer num8 = this.f5571p;
        if (num8 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = num8.hashCode();
        }
        int i18 = (i17 + hashCode11) * 31;
        Long l9 = this.f5572q;
        if (l9 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = l9.hashCode();
        }
        int i19 = (i18 + hashCode12) * 31;
        Long l10 = this.f5573r;
        if (l10 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = l10.hashCode();
        }
        int i20 = (i19 + hashCode13) * 31;
        Boolean bool = this.f5574s;
        if (bool == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = bool.hashCode();
        }
        int i21 = (i20 + hashCode14) * 31;
        Boolean bool2 = this.f5575t;
        if (bool2 == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = bool2.hashCode();
        }
        int i22 = (i21 + hashCode15) * 31;
        String str = this.f5576u;
        if (str == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = str.hashCode();
        }
        int i23 = (i22 + hashCode16) * 31;
        String str2 = this.f5577v;
        if (str2 == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = str2.hashCode();
        }
        int i24 = (i23 + hashCode17) * 31;
        Integer num9 = this.f5578w;
        if (num9 == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = num9.hashCode();
        }
        int i25 = (i24 + hashCode18) * 31;
        Boolean bool3 = this.f5579x;
        if (bool3 == null) {
            hashCode19 = 0;
        } else {
            hashCode19 = bool3.hashCode();
        }
        int i26 = (i25 + hashCode19) * 31;
        B b4 = this.f5580y;
        if (b4 == null) {
            hashCode20 = 0;
        } else {
            hashCode20 = b4.hashCode();
        }
        int i27 = (i26 + hashCode20) * 31;
        String str3 = this.f5581z;
        if (str3 == null) {
            hashCode21 = 0;
        } else {
            hashCode21 = str3.hashCode();
        }
        int i28 = (i27 + hashCode21) * 31;
        EnumC0306e enumC0306e = this.f5548A;
        if (enumC0306e == null) {
            hashCode22 = 0;
        } else {
            hashCode22 = enumC0306e.hashCode();
        }
        int i29 = (i28 + hashCode22) * 31;
        u uVar = this.f5549B;
        if (uVar == null) {
            hashCode23 = 0;
        } else {
            hashCode23 = uVar.hashCode();
        }
        int i30 = (i29 + hashCode23) * 31;
        Integer num10 = this.f5550C;
        if (num10 == null) {
            hashCode24 = 0;
        } else {
            hashCode24 = num10.hashCode();
        }
        int i31 = (i30 + hashCode24) * 31;
        String str4 = this.f5551D;
        if (str4 == null) {
            hashCode25 = 0;
        } else {
            hashCode25 = str4.hashCode();
        }
        int i32 = (i31 + hashCode25) * 31;
        H h8 = this.f5552E;
        if (h8 == null) {
            hashCode26 = 0;
        } else {
            hashCode26 = h8.hashCode();
        }
        int i33 = (i32 + hashCode26) * 31;
        String str5 = this.f5553F;
        if (str5 == null) {
            hashCode27 = 0;
        } else {
            hashCode27 = str5.hashCode();
        }
        int i34 = (i33 + hashCode27) * 31;
        String str6 = this.f5554G;
        if (str6 == null) {
            hashCode28 = 0;
        } else {
            hashCode28 = str6.hashCode();
        }
        int i35 = (i34 + hashCode28) * 31;
        Integer num11 = this.f5555H;
        if (num11 == null) {
            hashCode29 = 0;
        } else {
            hashCode29 = num11.hashCode();
        }
        int i36 = (i35 + hashCode29) * 31;
        N n3 = this.f5556I;
        if (n3 == null) {
            hashCode30 = 0;
        } else {
            hashCode30 = n3.hashCode();
        }
        int i37 = (i36 + hashCode30) * 31;
        String str7 = this.f5557J;
        if (str7 == null) {
            hashCode31 = 0;
        } else {
            hashCode31 = str7.hashCode();
        }
        int i38 = (i37 + hashCode31) * 31;
        Boolean bool4 = this.K;
        if (bool4 != null) {
            i4 = bool4.hashCode();
        }
        return i38 + i4;
    }

    public final String toString() {
        long j = this.f5559b;
        Long l6 = this.f5566i;
        StringBuilder sb = new StringBuilder("ActionEntity(id=");
        sb.append(this.f5558a);
        sb.append(", eventId=");
        sb.append(j);
        sb.append(", priority=");
        sb.append(this.f5560c);
        sb.append(", name=");
        sb.append(this.f5561d);
        sb.append(", type=");
        sb.append(this.f5562e);
        sb.append(", clickPositionType=");
        sb.append(this.f5563f);
        sb.append(", x=");
        sb.append(this.f5564g);
        sb.append(", y=");
        sb.append(this.f5565h);
        sb.append(", clickOnConditionId=");
        sb.append(l6);
        sb.append(", pressDuration=");
        sb.append(this.j);
        sb.append(", clickOffsetX=");
        sb.append(this.k);
        sb.append(", clickOffsetY=");
        sb.append(this.f5567l);
        sb.append(", fromX=");
        sb.append(this.f5568m);
        sb.append(", fromY=");
        sb.append(this.f5569n);
        sb.append(", toX=");
        sb.append(this.f5570o);
        sb.append(", toY=");
        sb.append(this.f5571p);
        sb.append(", swipeDuration=");
        sb.append(this.f5572q);
        sb.append(", pauseDuration=");
        sb.append(this.f5573r);
        sb.append(", isAdvanced=");
        sb.append(this.f5574s);
        sb.append(", isBroadcast=");
        sb.append(this.f5575t);
        sb.append(", intentAction=");
        sb.append(this.f5576u);
        sb.append(", componentName=");
        sb.append(this.f5577v);
        sb.append(", flags=");
        sb.append(this.f5578w);
        sb.append(", toggleAll=");
        sb.append(this.f5579x);
        sb.append(", toggleAllType=");
        sb.append(this.f5580y);
        sb.append(", counterName=");
        sb.append(this.f5581z);
        sb.append(", counterOperation=");
        sb.append(this.f5548A);
        sb.append(", counterOperationValueType=");
        sb.append(this.f5549B);
        sb.append(", counterOperationValue=");
        sb.append(this.f5550C);
        sb.append(", counterOperationCounterName=");
        sb.append(this.f5551D);
        sb.append(", notificationMessageType=");
        sb.append(this.f5552E);
        AbstractC1149a.m(sb, ", notificationMessageText=", this.f5553F, ", notificationMessageCounterName=", this.f5554G);
        sb.append(", notificationImportance=");
        sb.append(this.f5555H);
        sb.append(", systemActionType=");
        sb.append(this.f5556I);
        sb.append(", textValue=");
        sb.append(this.f5557J);
        sb.append(", textValidateInput=");
        sb.append(this.K);
        sb.append(")");
        return sb.toString();
    }

    public C0304c(long j, long j5, int i4, String str, EnumC0305d enumC0305d, EnumC0307f enumC0307f, Integer num, Integer num2, Long l6, Long l8, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Long l9, Long l10, Boolean bool, Boolean bool2, String str2, String str3, Integer num9, Boolean bool3, B b4, String str4, EnumC0306e enumC0306e, u uVar, Integer num10, String str5, H h8, String str6, String str7, Integer num11, N n3, String str8, Boolean bool4) {
        o6.j.e(str, "name");
        this.f5558a = j;
        this.f5559b = j5;
        this.f5560c = i4;
        this.f5561d = str;
        this.f5562e = enumC0305d;
        this.f5563f = enumC0307f;
        this.f5564g = num;
        this.f5565h = num2;
        this.f5566i = l6;
        this.j = l8;
        this.k = num3;
        this.f5567l = num4;
        this.f5568m = num5;
        this.f5569n = num6;
        this.f5570o = num7;
        this.f5571p = num8;
        this.f5572q = l9;
        this.f5573r = l10;
        this.f5574s = bool;
        this.f5575t = bool2;
        this.f5576u = str2;
        this.f5577v = str3;
        this.f5578w = num9;
        this.f5579x = bool3;
        this.f5580y = b4;
        this.f5581z = str4;
        this.f5548A = enumC0306e;
        this.f5549B = uVar;
        this.f5550C = num10;
        this.f5551D = str5;
        this.f5552E = h8;
        this.f5553F = str6;
        this.f5554G = str7;
        this.f5555H = num11;
        this.f5556I = n3;
        this.f5557J = str8;
        this.K = bool4;
    }

    public /* synthetic */ C0304c(long j, long j5, int i4, String str, EnumC0305d enumC0305d, EnumC0307f enumC0307f, Integer num, Integer num2, Long l6, Long l8, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Long l9, Long l10, Boolean bool, Boolean bool2, String str2, String str3, Integer num9, Boolean bool3, B b4, String str4, EnumC0306e enumC0306e, u uVar, Integer num10, String str5, H h8, String str6, String str7, Integer num11, N n3, String str8, Boolean bool4, int i8, int i9) {
        this(j, j5, i4, str, enumC0305d, (i8 & 32) != 0 ? null : enumC0307f, (i8 & 64) != 0 ? null : num, (i8 & 128) != 0 ? null : num2, (i8 & 256) != 0 ? null : l6, (i8 & 512) != 0 ? null : l8, (i8 & 1024) != 0 ? null : num3, (i8 & 2048) != 0 ? null : num4, (i8 & 4096) != 0 ? null : num5, (i8 & 8192) != 0 ? null : num6, (i8 & 16384) != 0 ? null : num7, (32768 & i8) != 0 ? null : num8, (65536 & i8) != 0 ? null : l9, (131072 & i8) != 0 ? null : l10, (262144 & i8) != 0 ? null : bool, (524288 & i8) != 0 ? null : bool2, (1048576 & i8) != 0 ? null : str2, (2097152 & i8) != 0 ? null : str3, (4194304 & i8) != 0 ? null : num9, (8388608 & i8) != 0 ? null : bool3, (16777216 & i8) != 0 ? null : b4, (33554432 & i8) != 0 ? null : str4, (67108864 & i8) != 0 ? null : enumC0306e, (134217728 & i8) != 0 ? null : uVar, (268435456 & i8) != 0 ? null : num10, (536870912 & i8) != 0 ? null : str5, (1073741824 & i8) != 0 ? null : h8, (i8 & Integer.MIN_VALUE) != 0 ? null : str6, (i9 & 1) != 0 ? null : str7, (i9 & 2) != 0 ? null : num11, (i9 & 4) != 0 ? null : n3, (i9 & 8) != 0 ? null : str8, (i9 & 16) != 0 ? null : bool4);
    }
}
