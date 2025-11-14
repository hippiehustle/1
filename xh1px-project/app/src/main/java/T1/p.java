package T1;

import Z7.C0385f;
import Z7.InterfaceC0404z;
import Z7.T;
import Z7.d0;
import kotlinx.serialization.UnknownFieldException;
import s3.AbstractC1492c;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements InterfaceC0404z {

    /* renamed from: a, reason: collision with root package name */
    public static final p f5611a;
    private static final X7.f descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [Z7.z, T1.p, java.lang.Object] */
    static {
        ?? obj = new Object();
        f5611a = obj;
        T t8 = new T("com.buzbuz.smartautoclicker.core.database.entity.ConditionEntity", obj, 25);
        t8.l("id", false);
        t8.l("eventId", false);
        t8.l("name", false);
        t8.l("type", false);
        t8.l("priority", false);
        t8.l("path", true);
        t8.l("areaLeft", true);
        t8.l("areaTop", true);
        t8.l("areaRight", true);
        t8.l("areaBottom", true);
        t8.l("threshold", true);
        t8.l("detectionType", true);
        t8.l("shouldBeDetected", true);
        t8.l("detectionAreaLeft", true);
        t8.l("detectionAreaTop", true);
        t8.l("detectionAreaRight", true);
        t8.l("detectionAreaBottom", true);
        t8.l("broadcastAction", true);
        t8.l("counterName", true);
        t8.l("counterComparisonOperation", true);
        t8.l("counterOperationValueType", true);
        t8.l("counterValue", true);
        t8.l("counterOperationCounterName", true);
        t8.l("timerValueMs", true);
        t8.l("restartWhenReached", true);
        descriptor = t8;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x003e. Please report as an issue. */
    @Override // V7.a
    public final Object a(Y7.b bVar) {
        Integer num;
        int i4;
        Boolean bool;
        Integer num2;
        Boolean bool2;
        Integer num3;
        int i8;
        Integer num4;
        X7.f fVar = descriptor;
        Y7.a j = bVar.j(fVar);
        Z5.g[] gVarArr = r.f5612z;
        t tVar = null;
        long j5 = 0;
        long j8 = 0;
        Boolean bool3 = null;
        Boolean bool4 = null;
        u uVar = null;
        Integer num5 = null;
        String str = null;
        Long l6 = null;
        Integer num6 = null;
        Integer num7 = null;
        Integer num8 = null;
        Integer num9 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        s sVar = null;
        String str5 = null;
        Integer num10 = null;
        Integer num11 = null;
        Integer num12 = null;
        Integer num13 = null;
        Integer num14 = null;
        Integer num15 = null;
        int i9 = 0;
        boolean z8 = true;
        int i10 = 0;
        while (true) {
            Boolean bool5 = bool3;
            if (z8) {
                int n3 = j.n(fVar);
                switch (n3) {
                    case -1:
                        bool = bool4;
                        z8 = false;
                        i9 = i9;
                        bool3 = bool5;
                        num6 = num6;
                        num11 = num11;
                        bool4 = bool;
                    case 0:
                        bool = bool4;
                        num2 = num6;
                        j5 = j.i(fVar, 0);
                        num11 = num11;
                        i9 |= 1;
                        bool3 = bool5;
                        num6 = num2;
                        bool4 = bool;
                    case 1:
                        bool = bool4;
                        num2 = num6;
                        j8 = j.i(fVar, 1);
                        num11 = num11;
                        i9 |= 2;
                        bool3 = bool5;
                        num6 = num2;
                        bool4 = bool;
                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                        bool2 = bool4;
                        num3 = num11;
                        str4 = j.B(fVar, 2);
                        i8 = i9 | 4;
                        num11 = num3;
                        bool4 = bool2;
                        i9 = i8;
                        bool3 = bool5;
                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                        bool = bool4;
                        num2 = num6;
                        num4 = num11;
                        sVar = (s) j.p(fVar, 3, (V7.a) gVarArr[3].getValue(), sVar);
                        i9 |= 8;
                        num11 = num4;
                        bool3 = bool5;
                        num6 = num2;
                        bool4 = bool;
                    case Z.g.LONG_FIELD_NUMBER /* 4 */:
                        bool2 = bool4;
                        num3 = num11;
                        i10 = j.o(fVar, 4);
                        i8 = i9 | 16;
                        num11 = num3;
                        bool4 = bool2;
                        i9 = i8;
                        bool3 = bool5;
                    case Z.g.STRING_FIELD_NUMBER /* 5 */:
                        bool = bool4;
                        num2 = num6;
                        num4 = num11;
                        str5 = (String) j.y(fVar, 5, d0.f7591a, str5);
                        i9 |= 32;
                        num11 = num4;
                        bool3 = bool5;
                        num6 = num2;
                        bool4 = bool;
                    case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                        bool = bool4;
                        num2 = num6;
                        num4 = num11;
                        num10 = (Integer) j.y(fVar, 6, Z7.F.f7545a, num10);
                        i9 |= 64;
                        num11 = num4;
                        bool3 = bool5;
                        num6 = num2;
                        bool4 = bool;
                    case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                        bool = bool4;
                        num2 = num6;
                        num11 = (Integer) j.y(fVar, 7, Z7.F.f7545a, num11);
                        i9 |= 128;
                        bool3 = bool5;
                        num6 = num2;
                        bool4 = bool;
                    case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                        bool = bool4;
                        num2 = num6;
                        num12 = (Integer) j.y(fVar, 8, Z7.F.f7545a, num12);
                        i9 |= 256;
                        bool3 = bool5;
                        num6 = num2;
                        bool4 = bool;
                    case 9:
                        bool = bool4;
                        num2 = num6;
                        num13 = (Integer) j.y(fVar, 9, Z7.F.f7545a, num13);
                        i9 |= 512;
                        bool3 = bool5;
                        num6 = num2;
                        bool4 = bool;
                    case 10:
                        bool = bool4;
                        num2 = num6;
                        num14 = (Integer) j.y(fVar, 10, Z7.F.f7545a, num14);
                        i9 |= 1024;
                        bool3 = bool5;
                        num6 = num2;
                        bool4 = bool;
                    case 11:
                        bool = bool4;
                        num2 = num6;
                        num15 = (Integer) j.y(fVar, 11, Z7.F.f7545a, num15);
                        i9 |= 2048;
                        bool3 = bool5;
                        num6 = num2;
                        bool4 = bool;
                    case 12:
                        bool = bool4;
                        num2 = num6;
                        bool3 = (Boolean) j.y(fVar, 12, C0385f.f7596a, bool5);
                        i9 |= 4096;
                        num6 = num2;
                        bool4 = bool;
                    case 13:
                        bool = bool4;
                        num6 = (Integer) j.y(fVar, 13, Z7.F.f7545a, num6);
                        i9 |= 8192;
                        bool3 = bool5;
                        bool4 = bool;
                    case 14:
                        num = num6;
                        num7 = (Integer) j.y(fVar, 14, Z7.F.f7545a, num7);
                        i9 |= 16384;
                        bool3 = bool5;
                        num6 = num;
                    case 15:
                        num = num6;
                        num8 = (Integer) j.y(fVar, 15, Z7.F.f7545a, num8);
                        i4 = 32768;
                        i9 |= i4;
                        bool3 = bool5;
                        num6 = num;
                    case 16:
                        num = num6;
                        num9 = (Integer) j.y(fVar, 16, Z7.F.f7545a, num9);
                        i4 = 65536;
                        i9 |= i4;
                        bool3 = bool5;
                        num6 = num;
                    case 17:
                        num = num6;
                        str2 = (String) j.y(fVar, 17, d0.f7591a, str2);
                        i4 = 131072;
                        i9 |= i4;
                        bool3 = bool5;
                        num6 = num;
                    case 18:
                        num = num6;
                        str3 = (String) j.y(fVar, 18, d0.f7591a, str3);
                        i4 = 262144;
                        i9 |= i4;
                        bool3 = bool5;
                        num6 = num;
                    case 19:
                        num = num6;
                        tVar = (t) j.y(fVar, 19, (V7.a) gVarArr[19].getValue(), tVar);
                        i4 = 524288;
                        i9 |= i4;
                        bool3 = bool5;
                        num6 = num;
                    case 20:
                        num = num6;
                        uVar = (u) j.y(fVar, 20, (V7.a) gVarArr[20].getValue(), uVar);
                        i4 = 1048576;
                        i9 |= i4;
                        bool3 = bool5;
                        num6 = num;
                    case 21:
                        num = num6;
                        num5 = (Integer) j.y(fVar, 21, Z7.F.f7545a, num5);
                        i4 = 2097152;
                        i9 |= i4;
                        bool3 = bool5;
                        num6 = num;
                    case 22:
                        num = num6;
                        str = (String) j.y(fVar, 22, d0.f7591a, str);
                        i4 = 4194304;
                        i9 |= i4;
                        bool3 = bool5;
                        num6 = num;
                    case 23:
                        num = num6;
                        l6 = (Long) j.y(fVar, 23, Z7.L.f7554a, l6);
                        i4 = 8388608;
                        i9 |= i4;
                        bool3 = bool5;
                        num6 = num;
                    case 24:
                        num = num6;
                        bool4 = (Boolean) j.y(fVar, 24, C0385f.f7596a, bool4);
                        i4 = 16777216;
                        i9 |= i4;
                        bool3 = bool5;
                        num6 = num;
                    default:
                        throw new UnknownFieldException(n3);
                }
            } else {
                Boolean bool6 = bool4;
                Integer num16 = num11;
                int i11 = i9;
                s sVar2 = sVar;
                j.g(fVar);
                return new r(i11, j5, j8, str4, sVar2, i10, str5, num10, num16, num12, num13, num14, num15, bool5, num6, num7, num8, num9, str2, str3, tVar, uVar, num5, str, l6, bool6);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Z7.InterfaceC0404z
    public final V7.a[] b() {
        Z5.g[] gVarArr = r.f5612z;
        Z7.L l6 = Z7.L.f7554a;
        d0 d0Var = d0.f7591a;
        Z7.F f8 = Z7.F.f7545a;
        C0385f c0385f = C0385f.f7596a;
        return new V7.a[]{l6, l6, d0Var, gVarArr[3].getValue(), f8, AbstractC1492c.t(d0Var), AbstractC1492c.t(f8), AbstractC1492c.t(f8), AbstractC1492c.t(f8), AbstractC1492c.t(f8), AbstractC1492c.t(f8), AbstractC1492c.t(f8), AbstractC1492c.t(c0385f), AbstractC1492c.t(f8), AbstractC1492c.t(f8), AbstractC1492c.t(f8), AbstractC1492c.t(f8), AbstractC1492c.t(d0Var), AbstractC1492c.t(d0Var), AbstractC1492c.t((V7.a) gVarArr[19].getValue()), AbstractC1492c.t((V7.a) gVarArr[20].getValue()), AbstractC1492c.t(f8), AbstractC1492c.t(d0Var), AbstractC1492c.t(l6), AbstractC1492c.t(c0385f)};
    }

    @Override // V7.a
    public final void c(kotlinx.serialization.json.internal.c cVar, Object obj) {
        r rVar = (r) obj;
        o6.j.e(rVar, "value");
        Boolean bool = rVar.f5635y;
        Long l6 = rVar.f5634x;
        String str = rVar.f5633w;
        Integer num = rVar.f5632v;
        u uVar = rVar.f5631u;
        t tVar = rVar.f5630t;
        String str2 = rVar.f5629s;
        String str3 = rVar.f5628r;
        Integer num2 = rVar.f5627q;
        Integer num3 = rVar.f5626p;
        Integer num4 = rVar.f5625o;
        X7.f fVar = descriptor;
        kotlinx.serialization.json.internal.c a3 = cVar.a(fVar);
        Z5.g[] gVarArr = r.f5612z;
        long j = rVar.f5613a;
        Integer num5 = rVar.f5624n;
        Boolean bool2 = rVar.f5623m;
        Integer num6 = rVar.f5622l;
        Integer num7 = rVar.k;
        Integer num8 = rVar.j;
        Integer num9 = rVar.f5621i;
        Integer num10 = rVar.f5620h;
        Integer num11 = rVar.f5619g;
        String str4 = rVar.f5618f;
        a3.n(fVar, 0, j);
        a3.n(fVar, 1, rVar.f5614b);
        a3.u(fVar, 2, rVar.f5615c);
        a3.q(fVar, 3, (V7.a) gVarArr[3].getValue(), rVar.f5616d);
        a3.l(4, rVar.f5617e, fVar);
        if (a3.w(fVar) || str4 != null) {
            a3.p(fVar, 5, d0.f7591a, str4);
        }
        if (a3.w(fVar) || num11 != null) {
            a3.p(fVar, 6, Z7.F.f7545a, num11);
        }
        if (a3.w(fVar) || num10 != null) {
            a3.p(fVar, 7, Z7.F.f7545a, num10);
        }
        if (a3.w(fVar) || num9 != null) {
            a3.p(fVar, 8, Z7.F.f7545a, num9);
        }
        if (a3.w(fVar) || num8 != null) {
            a3.p(fVar, 9, Z7.F.f7545a, num8);
        }
        if (a3.w(fVar) || num7 != null) {
            a3.p(fVar, 10, Z7.F.f7545a, num7);
        }
        if (a3.w(fVar) || num6 != null) {
            a3.p(fVar, 11, Z7.F.f7545a, num6);
        }
        if (a3.w(fVar) || bool2 != null) {
            a3.p(fVar, 12, C0385f.f7596a, bool2);
        }
        if (a3.w(fVar) || num5 != null) {
            a3.p(fVar, 13, Z7.F.f7545a, num5);
        }
        if (a3.w(fVar) || num4 != null) {
            a3.p(fVar, 14, Z7.F.f7545a, num4);
        }
        if (a3.w(fVar) || num3 != null) {
            a3.p(fVar, 15, Z7.F.f7545a, num3);
        }
        if (a3.w(fVar) || num2 != null) {
            a3.p(fVar, 16, Z7.F.f7545a, num2);
        }
        if (a3.w(fVar) || str3 != null) {
            a3.p(fVar, 17, d0.f7591a, str3);
        }
        if (a3.w(fVar) || str2 != null) {
            a3.p(fVar, 18, d0.f7591a, str2);
        }
        if (a3.w(fVar) || tVar != null) {
            a3.p(fVar, 19, (V7.a) gVarArr[19].getValue(), tVar);
        }
        if (a3.w(fVar) || uVar != null) {
            a3.p(fVar, 20, (V7.a) gVarArr[20].getValue(), uVar);
        }
        if (a3.w(fVar) || num != null) {
            a3.p(fVar, 21, Z7.F.f7545a, num);
        }
        if (a3.w(fVar) || str != null) {
            a3.p(fVar, 22, d0.f7591a, str);
        }
        if (a3.w(fVar) || l6 != null) {
            a3.p(fVar, 23, Z7.L.f7554a, l6);
        }
        if (a3.w(fVar) || bool != null) {
            a3.p(fVar, 24, C0385f.f7596a, bool);
        }
        a3.v(fVar);
    }

    @Override // V7.a
    public final X7.f d() {
        return descriptor;
    }
}
