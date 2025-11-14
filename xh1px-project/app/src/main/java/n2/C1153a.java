package n2;

import Z7.C0385f;
import Z7.F;
import Z7.InterfaceC0404z;
import Z7.L;
import Z7.T;
import Z7.d0;
import kotlinx.serialization.UnknownFieldException;
import s3.AbstractC1492c;

/* renamed from: n2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1153a implements InterfaceC0404z {

    /* renamed from: a, reason: collision with root package name */
    public static final C1153a f12865a;
    private static final X7.f descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [Z7.z, n2.a, java.lang.Object] */
    static {
        ?? obj = new Object();
        f12865a = obj;
        T t8 = new T("com.buzbuz.smartautoclicker.core.dumb.data.database.DumbActionEntity", obj, 17);
        t8.l("id", false);
        t8.l("dumbScenarioId", false);
        t8.l("priority", true);
        t8.l("name", false);
        t8.l("type", false);
        t8.l("repeatCount", true);
        t8.l("isRepeatInfinite", true);
        t8.l("repeatDelay", true);
        t8.l("pressDuration", true);
        t8.l("x", true);
        t8.l("y", true);
        t8.l("swipeDuration", true);
        t8.l("fromX", true);
        t8.l("fromY", true);
        t8.l("toX", true);
        t8.l("toY", true);
        t8.l("pauseDuration", true);
        descriptor = t8;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x002e. Please report as an issue. */
    @Override // V7.a
    public final Object a(Y7.b bVar) {
        Integer num;
        int i4;
        Integer num2;
        Integer num3;
        EnumC1156d enumC1156d;
        X7.f fVar = descriptor;
        Y7.a j = bVar.j(fVar);
        Z5.g[] gVarArr = C1155c.f12866r;
        EnumC1156d enumC1156d2 = null;
        long j5 = 0;
        long j8 = 0;
        Integer num4 = null;
        Long l6 = null;
        Integer num5 = null;
        Integer num6 = null;
        Boolean bool = null;
        Long l8 = null;
        Long l9 = null;
        Integer num7 = null;
        Integer num8 = null;
        Integer num9 = null;
        Long l10 = null;
        Integer num10 = null;
        String str = null;
        int i8 = 0;
        boolean z8 = true;
        int i9 = 0;
        while (z8) {
            EnumC1156d enumC1156d3 = enumC1156d2;
            int n3 = j.n(fVar);
            switch (n3) {
                case -1:
                    num2 = num4;
                    z8 = false;
                    enumC1156d2 = enumC1156d3;
                    num4 = num2;
                case 0:
                    num2 = num4;
                    num3 = num6;
                    enumC1156d = enumC1156d3;
                    j5 = j.i(fVar, 0);
                    i8 |= 1;
                    enumC1156d2 = enumC1156d;
                    num6 = num3;
                    num4 = num2;
                case 1:
                    num2 = num4;
                    num3 = num6;
                    enumC1156d = enumC1156d3;
                    j8 = j.i(fVar, 1);
                    i8 |= 2;
                    enumC1156d2 = enumC1156d;
                    num6 = num3;
                    num4 = num2;
                case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                    num2 = num4;
                    num3 = num6;
                    enumC1156d = enumC1156d3;
                    i9 = j.o(fVar, 2);
                    i8 |= 4;
                    enumC1156d2 = enumC1156d;
                    num6 = num3;
                    num4 = num2;
                case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                    num2 = num4;
                    num3 = num6;
                    enumC1156d = enumC1156d3;
                    str = j.B(fVar, 3);
                    i8 |= 8;
                    enumC1156d2 = enumC1156d;
                    num6 = num3;
                    num4 = num2;
                case Z.g.LONG_FIELD_NUMBER /* 4 */:
                    num2 = num4;
                    num3 = num6;
                    enumC1156d2 = (EnumC1156d) j.p(fVar, 4, (V7.a) gVarArr[4].getValue(), enumC1156d3);
                    i8 |= 16;
                    num6 = num3;
                    num4 = num2;
                case Z.g.STRING_FIELD_NUMBER /* 5 */:
                    num2 = num4;
                    num6 = (Integer) j.y(fVar, 5, F.f7545a, num6);
                    i8 |= 32;
                    enumC1156d2 = enumC1156d3;
                    num4 = num2;
                case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                    num = num6;
                    bool = (Boolean) j.y(fVar, 6, C0385f.f7596a, bool);
                    i8 |= 64;
                    enumC1156d2 = enumC1156d3;
                    num6 = num;
                case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                    num = num6;
                    l8 = (Long) j.y(fVar, 7, L.f7554a, l8);
                    i8 |= 128;
                    enumC1156d2 = enumC1156d3;
                    num6 = num;
                case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                    num = num6;
                    l9 = (Long) j.y(fVar, 8, L.f7554a, l9);
                    i8 |= 256;
                    enumC1156d2 = enumC1156d3;
                    num6 = num;
                case 9:
                    num = num6;
                    num10 = (Integer) j.y(fVar, 9, F.f7545a, num10);
                    i8 |= 512;
                    enumC1156d2 = enumC1156d3;
                    num6 = num;
                case 10:
                    num = num6;
                    num5 = (Integer) j.y(fVar, 10, F.f7545a, num5);
                    i8 |= 1024;
                    enumC1156d2 = enumC1156d3;
                    num6 = num;
                case 11:
                    num = num6;
                    l6 = (Long) j.y(fVar, 11, L.f7554a, l6);
                    i8 |= 2048;
                    enumC1156d2 = enumC1156d3;
                    num6 = num;
                case 12:
                    num = num6;
                    num4 = (Integer) j.y(fVar, 12, F.f7545a, num4);
                    i8 |= 4096;
                    enumC1156d2 = enumC1156d3;
                    num6 = num;
                case 13:
                    num = num6;
                    num7 = (Integer) j.y(fVar, 13, F.f7545a, num7);
                    i8 |= 8192;
                    enumC1156d2 = enumC1156d3;
                    num6 = num;
                case 14:
                    num = num6;
                    num8 = (Integer) j.y(fVar, 14, F.f7545a, num8);
                    i8 |= 16384;
                    enumC1156d2 = enumC1156d3;
                    num6 = num;
                case 15:
                    num = num6;
                    num9 = (Integer) j.y(fVar, 15, F.f7545a, num9);
                    i4 = 32768;
                    i8 |= i4;
                    enumC1156d2 = enumC1156d3;
                    num6 = num;
                case 16:
                    num = num6;
                    l10 = (Long) j.y(fVar, 16, L.f7554a, l10);
                    i4 = 65536;
                    i8 |= i4;
                    enumC1156d2 = enumC1156d3;
                    num6 = num;
                default:
                    throw new UnknownFieldException(n3);
            }
        }
        Integer num11 = num4;
        EnumC1156d enumC1156d4 = enumC1156d2;
        j.g(fVar);
        return new C1155c(i8, j5, j8, i9, str, enumC1156d4, num6, bool, l8, l9, num10, num5, l6, num11, num7, num8, num9, l10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Z7.InterfaceC0404z
    public final V7.a[] b() {
        Z5.g[] gVarArr = C1155c.f12866r;
        L l6 = L.f7554a;
        F f8 = F.f7545a;
        return new V7.a[]{l6, l6, f8, d0.f7591a, gVarArr[4].getValue(), AbstractC1492c.t(f8), AbstractC1492c.t(C0385f.f7596a), AbstractC1492c.t(l6), AbstractC1492c.t(l6), AbstractC1492c.t(f8), AbstractC1492c.t(f8), AbstractC1492c.t(l6), AbstractC1492c.t(f8), AbstractC1492c.t(f8), AbstractC1492c.t(f8), AbstractC1492c.t(f8), AbstractC1492c.t(l6)};
    }

    @Override // V7.a
    public final void c(kotlinx.serialization.json.internal.c cVar, Object obj) {
        C1155c c1155c = (C1155c) obj;
        o6.j.e(c1155c, "value");
        Long l6 = c1155c.f12881q;
        Integer num = c1155c.f12880p;
        Integer num2 = c1155c.f12879o;
        X7.f fVar = descriptor;
        kotlinx.serialization.json.internal.c a3 = cVar.a(fVar);
        Z5.g[] gVarArr = C1155c.f12866r;
        long j = c1155c.f12867a;
        Integer num3 = c1155c.f12878n;
        Integer num4 = c1155c.f12877m;
        Long l8 = c1155c.f12876l;
        Integer num5 = c1155c.k;
        Integer num6 = c1155c.j;
        Long l9 = c1155c.f12875i;
        Long l10 = c1155c.f12874h;
        Boolean bool = c1155c.f12873g;
        Integer num7 = c1155c.f12872f;
        int i4 = c1155c.f12869c;
        a3.n(fVar, 0, j);
        a3.n(fVar, 1, c1155c.f12868b);
        if (a3.w(fVar) || i4 != 0) {
            a3.l(2, i4, fVar);
        }
        a3.u(fVar, 3, c1155c.f12870d);
        a3.q(fVar, 4, (V7.a) gVarArr[4].getValue(), c1155c.f12871e);
        if (a3.w(fVar) || num7 != null) {
            a3.p(fVar, 5, F.f7545a, num7);
        }
        if (a3.w(fVar) || bool != null) {
            a3.p(fVar, 6, C0385f.f7596a, bool);
        }
        if (a3.w(fVar) || l10 != null) {
            a3.p(fVar, 7, L.f7554a, l10);
        }
        if (a3.w(fVar) || l9 != null) {
            a3.p(fVar, 8, L.f7554a, l9);
        }
        if (a3.w(fVar) || num6 != null) {
            a3.p(fVar, 9, F.f7545a, num6);
        }
        if (a3.w(fVar) || num5 != null) {
            a3.p(fVar, 10, F.f7545a, num5);
        }
        if (a3.w(fVar) || l8 != null) {
            a3.p(fVar, 11, L.f7554a, l8);
        }
        if (a3.w(fVar) || num4 != null) {
            a3.p(fVar, 12, F.f7545a, num4);
        }
        if (a3.w(fVar) || num3 != null) {
            a3.p(fVar, 13, F.f7545a, num3);
        }
        if (a3.w(fVar) || num2 != null) {
            a3.p(fVar, 14, F.f7545a, num2);
        }
        if (a3.w(fVar) || num != null) {
            a3.p(fVar, 15, F.f7545a, num);
        }
        if (a3.w(fVar) || l6 != null) {
            a3.p(fVar, 16, L.f7554a, l6);
        }
        a3.v(fVar);
    }

    @Override // V7.a
    public final X7.f d() {
        return descriptor;
    }
}
