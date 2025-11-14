package T1;

import Z7.C0385f;
import Z7.InterfaceC0404z;
import Z7.T;
import Z7.d0;
import kotlinx.serialization.UnknownFieldException;
import s3.AbstractC1492c;

/* renamed from: T1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0302a implements InterfaceC0404z {

    /* renamed from: a, reason: collision with root package name */
    public static final C0302a f5546a;
    private static final X7.f descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [Z7.z, T1.a, java.lang.Object] */
    static {
        ?? obj = new Object();
        f5546a = obj;
        T t8 = new T("com.buzbuz.smartautoclicker.core.database.entity.ActionEntity", obj, 37);
        t8.l("id", false);
        t8.l("eventId", false);
        t8.l("priority", true);
        t8.l("name", false);
        t8.l("type", false);
        t8.l("clickPositionType", true);
        t8.l("x", true);
        t8.l("y", true);
        t8.l("clickOnConditionId", true);
        t8.l("pressDuration", true);
        t8.l("clickOffsetX", true);
        t8.l("clickOffsetY", true);
        t8.l("fromX", true);
        t8.l("fromY", true);
        t8.l("toX", true);
        t8.l("toY", true);
        t8.l("swipeDuration", true);
        t8.l("pauseDuration", true);
        t8.l("isAdvanced", true);
        t8.l("isBroadcast", true);
        t8.l("intentAction", true);
        t8.l("componentName", true);
        t8.l("flags", true);
        t8.l("toggleAll", true);
        t8.l("toggleAllType", true);
        t8.l("counterName", true);
        t8.l("counterOperation", true);
        t8.l("counterOperationValueType", true);
        t8.l("counterOperationValue", true);
        t8.l("counterOperationCounterName", true);
        t8.l("notificationMessageType", true);
        t8.l("notificationMessageText", true);
        t8.l("notificationMessageCounterName", true);
        t8.l("notificationImportance", true);
        t8.l("systemActionType", true);
        t8.l("textValue", true);
        t8.l("textValidateInput", true);
        descriptor = t8;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0058. Please report as an issue. */
    @Override // V7.a
    public final Object a(Y7.b bVar) {
        u uVar;
        B b4;
        EnumC0306e enumC0306e;
        EnumC0306e enumC0306e2;
        int i4;
        int i8;
        X7.f fVar = descriptor;
        Y7.a j = bVar.j(fVar);
        Z5.g[] gVarArr = C0304c.f5547L;
        String str = null;
        long j5 = 0;
        long j8 = 0;
        u uVar2 = null;
        EnumC0306e enumC0306e3 = null;
        String str2 = null;
        Integer num = null;
        N n3 = null;
        String str3 = null;
        Boolean bool = null;
        Integer num2 = null;
        String str4 = null;
        H h8 = null;
        String str5 = null;
        B b9 = null;
        String str6 = null;
        EnumC0305d enumC0305d = null;
        EnumC0307f enumC0307f = null;
        Integer num3 = null;
        Integer num4 = null;
        Long l6 = null;
        Long l8 = null;
        Integer num5 = null;
        Integer num6 = null;
        Integer num7 = null;
        Integer num8 = null;
        Integer num9 = null;
        Integer num10 = null;
        Long l9 = null;
        Long l10 = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        String str7 = null;
        String str8 = null;
        Integer num11 = null;
        Boolean bool4 = null;
        int i9 = 0;
        boolean z8 = true;
        int i10 = 0;
        int i11 = 0;
        while (z8) {
            int i12 = i9;
            int n8 = j.n(fVar);
            switch (n8) {
                case -1:
                    uVar = uVar2;
                    b4 = b9;
                    i9 = i12;
                    enumC0306e = enumC0306e3;
                    z8 = false;
                    enumC0306e3 = enumC0306e;
                    b9 = b4;
                    uVar2 = uVar;
                case 0:
                    uVar = uVar2;
                    b4 = b9;
                    enumC0306e = enumC0306e3;
                    j5 = j.i(fVar, 0);
                    i9 = i12 | 1;
                    enumC0306e3 = enumC0306e;
                    b9 = b4;
                    uVar2 = uVar;
                case 1:
                    uVar = uVar2;
                    b4 = b9;
                    j8 = j.i(fVar, 1);
                    i9 = i12 | 2;
                    enumC0306e3 = enumC0306e3;
                    b9 = b4;
                    uVar2 = uVar;
                case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                    uVar = uVar2;
                    b4 = b9;
                    enumC0306e2 = enumC0306e3;
                    i11 = j.o(fVar, 2);
                    i9 = i12 | 4;
                    enumC0306e3 = enumC0306e2;
                    b9 = b4;
                    uVar2 = uVar;
                case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                    uVar = uVar2;
                    b4 = b9;
                    enumC0306e2 = enumC0306e3;
                    i9 = i12 | 8;
                    str6 = j.B(fVar, 3);
                    enumC0306e3 = enumC0306e2;
                    b9 = b4;
                    uVar2 = uVar;
                case Z.g.LONG_FIELD_NUMBER /* 4 */:
                    uVar = uVar2;
                    b4 = b9;
                    enumC0306e2 = enumC0306e3;
                    i9 = i12 | 16;
                    enumC0305d = (EnumC0305d) j.p(fVar, 4, (V7.a) gVarArr[4].getValue(), enumC0305d);
                    enumC0306e3 = enumC0306e2;
                    b9 = b4;
                    uVar2 = uVar;
                case Z.g.STRING_FIELD_NUMBER /* 5 */:
                    uVar = uVar2;
                    b4 = b9;
                    enumC0306e2 = enumC0306e3;
                    i9 = i12 | 32;
                    enumC0307f = (EnumC0307f) j.y(fVar, 5, (V7.a) gVarArr[5].getValue(), enumC0307f);
                    enumC0306e3 = enumC0306e2;
                    b9 = b4;
                    uVar2 = uVar;
                case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                    uVar = uVar2;
                    b4 = b9;
                    enumC0306e2 = enumC0306e3;
                    i9 = i12 | 64;
                    num3 = (Integer) j.y(fVar, 6, Z7.F.f7545a, num3);
                    enumC0306e3 = enumC0306e2;
                    b9 = b4;
                    uVar2 = uVar;
                case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                    uVar = uVar2;
                    b4 = b9;
                    enumC0306e2 = enumC0306e3;
                    i9 = i12 | 128;
                    num4 = (Integer) j.y(fVar, 7, Z7.F.f7545a, num4);
                    enumC0306e3 = enumC0306e2;
                    b9 = b4;
                    uVar2 = uVar;
                case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                    uVar = uVar2;
                    b4 = b9;
                    enumC0306e2 = enumC0306e3;
                    i9 = i12 | 256;
                    l6 = (Long) j.y(fVar, 8, Z7.L.f7554a, l6);
                    enumC0306e3 = enumC0306e2;
                    b9 = b4;
                    uVar2 = uVar;
                case 9:
                    uVar = uVar2;
                    b4 = b9;
                    enumC0306e2 = enumC0306e3;
                    i9 = i12 | 512;
                    l8 = (Long) j.y(fVar, 9, Z7.L.f7554a, l8);
                    enumC0306e3 = enumC0306e2;
                    b9 = b4;
                    uVar2 = uVar;
                case 10:
                    uVar = uVar2;
                    b4 = b9;
                    enumC0306e2 = enumC0306e3;
                    i9 = i12 | 1024;
                    num5 = (Integer) j.y(fVar, 10, Z7.F.f7545a, num5);
                    enumC0306e3 = enumC0306e2;
                    b9 = b4;
                    uVar2 = uVar;
                case 11:
                    uVar = uVar2;
                    b4 = b9;
                    enumC0306e2 = enumC0306e3;
                    i9 = i12 | 2048;
                    num6 = (Integer) j.y(fVar, 11, Z7.F.f7545a, num6);
                    enumC0306e3 = enumC0306e2;
                    b9 = b4;
                    uVar2 = uVar;
                case 12:
                    uVar = uVar2;
                    b4 = b9;
                    enumC0306e2 = enumC0306e3;
                    i9 = i12 | 4096;
                    num7 = (Integer) j.y(fVar, 12, Z7.F.f7545a, num7);
                    enumC0306e3 = enumC0306e2;
                    b9 = b4;
                    uVar2 = uVar;
                case 13:
                    uVar = uVar2;
                    b4 = b9;
                    enumC0306e2 = enumC0306e3;
                    i9 = i12 | 8192;
                    num8 = (Integer) j.y(fVar, 13, Z7.F.f7545a, num8);
                    enumC0306e3 = enumC0306e2;
                    b9 = b4;
                    uVar2 = uVar;
                case 14:
                    uVar = uVar2;
                    b4 = b9;
                    i9 = i12 | 16384;
                    num9 = (Integer) j.y(fVar, 14, Z7.F.f7545a, num9);
                    b9 = b4;
                    uVar2 = uVar;
                case 15:
                    uVar = uVar2;
                    b4 = b9;
                    i9 = i12 | 32768;
                    num10 = (Integer) j.y(fVar, 15, Z7.F.f7545a, num10);
                    b9 = b4;
                    uVar2 = uVar;
                case 16:
                    uVar = uVar2;
                    b4 = b9;
                    i9 = i12 | 65536;
                    l9 = (Long) j.y(fVar, 16, Z7.L.f7554a, l9);
                    b9 = b4;
                    uVar2 = uVar;
                case 17:
                    uVar = uVar2;
                    b4 = b9;
                    i9 = i12 | 131072;
                    l10 = (Long) j.y(fVar, 17, Z7.L.f7554a, l10);
                    b9 = b4;
                    uVar2 = uVar;
                case 18:
                    uVar = uVar2;
                    b4 = b9;
                    i9 = i12 | 262144;
                    bool2 = (Boolean) j.y(fVar, 18, C0385f.f7596a, bool2);
                    b9 = b4;
                    uVar2 = uVar;
                case 19:
                    uVar = uVar2;
                    b4 = b9;
                    i9 = i12 | 524288;
                    bool3 = (Boolean) j.y(fVar, 19, C0385f.f7596a, bool3);
                    b9 = b4;
                    uVar2 = uVar;
                case 20:
                    uVar = uVar2;
                    b4 = b9;
                    i9 = i12 | 1048576;
                    str7 = (String) j.y(fVar, 20, d0.f7591a, str7);
                    b9 = b4;
                    uVar2 = uVar;
                case 21:
                    uVar = uVar2;
                    b4 = b9;
                    i9 = i12 | 2097152;
                    str8 = (String) j.y(fVar, 21, d0.f7591a, str8);
                    b9 = b4;
                    uVar2 = uVar;
                case 22:
                    uVar = uVar2;
                    b4 = b9;
                    i9 = i12 | 4194304;
                    num11 = (Integer) j.y(fVar, 22, Z7.F.f7545a, num11);
                    b9 = b4;
                    uVar2 = uVar;
                case 23:
                    uVar = uVar2;
                    b4 = b9;
                    i9 = i12 | 8388608;
                    bool4 = (Boolean) j.y(fVar, 23, C0385f.f7596a, bool4);
                    b9 = b4;
                    uVar2 = uVar;
                case 24:
                    uVar = uVar2;
                    i9 = i12 | 16777216;
                    b4 = (B) j.y(fVar, 24, (V7.a) gVarArr[24].getValue(), b9);
                    b9 = b4;
                    uVar2 = uVar;
                case 25:
                    b4 = b9;
                    str2 = (String) j.y(fVar, 25, d0.f7591a, str2);
                    i4 = 33554432;
                    i9 = i12 | i4;
                    uVar = uVar2;
                    b9 = b4;
                    uVar2 = uVar;
                case 26:
                    b4 = b9;
                    enumC0306e3 = (EnumC0306e) j.y(fVar, 26, (V7.a) gVarArr[26].getValue(), enumC0306e3);
                    i4 = 67108864;
                    i9 = i12 | i4;
                    uVar = uVar2;
                    b9 = b4;
                    uVar2 = uVar;
                case 27:
                    b4 = b9;
                    uVar2 = (u) j.y(fVar, 27, (V7.a) gVarArr[27].getValue(), uVar2);
                    i4 = 134217728;
                    i9 = i12 | i4;
                    uVar = uVar2;
                    b9 = b4;
                    uVar2 = uVar;
                case 28:
                    b4 = b9;
                    i8 = i12 | 268435456;
                    num2 = (Integer) j.y(fVar, 28, Z7.F.f7545a, num2);
                    i9 = i8;
                    uVar = uVar2;
                    b9 = b4;
                    uVar2 = uVar;
                case 29:
                    b4 = b9;
                    i8 = i12 | 536870912;
                    str4 = (String) j.y(fVar, 29, d0.f7591a, str4);
                    i9 = i8;
                    uVar = uVar2;
                    b9 = b4;
                    uVar2 = uVar;
                case 30:
                    b4 = b9;
                    i8 = i12 | 1073741824;
                    h8 = (H) j.y(fVar, 30, (V7.a) gVarArr[30].getValue(), h8);
                    i9 = i8;
                    uVar = uVar2;
                    b9 = b4;
                    uVar2 = uVar;
                case 31:
                    b4 = b9;
                    i8 = i12 | Integer.MIN_VALUE;
                    str5 = (String) j.y(fVar, 31, d0.f7591a, str5);
                    i9 = i8;
                    uVar = uVar2;
                    b9 = b4;
                    uVar2 = uVar;
                case 32:
                    b4 = b9;
                    str = (String) j.y(fVar, 32, d0.f7591a, str);
                    i10 |= 1;
                    uVar = uVar2;
                    i9 = i12;
                    b9 = b4;
                    uVar2 = uVar;
                case 33:
                    b4 = b9;
                    num = (Integer) j.y(fVar, 33, Z7.F.f7545a, num);
                    i10 |= 2;
                    uVar = uVar2;
                    i9 = i12;
                    b9 = b4;
                    uVar2 = uVar;
                case 34:
                    b4 = b9;
                    n3 = (N) j.y(fVar, 34, (V7.a) gVarArr[34].getValue(), n3);
                    i10 |= 4;
                    uVar = uVar2;
                    i9 = i12;
                    b9 = b4;
                    uVar2 = uVar;
                case 35:
                    b4 = b9;
                    str3 = (String) j.y(fVar, 35, d0.f7591a, str3);
                    i10 |= 8;
                    uVar = uVar2;
                    i9 = i12;
                    b9 = b4;
                    uVar2 = uVar;
                case 36:
                    b4 = b9;
                    bool = (Boolean) j.y(fVar, 36, C0385f.f7596a, bool);
                    i10 |= 16;
                    uVar = uVar2;
                    i9 = i12;
                    b9 = b4;
                    uVar2 = uVar;
                default:
                    throw new UnknownFieldException(n8);
            }
        }
        u uVar3 = uVar2;
        EnumC0306e enumC0306e4 = enumC0306e3;
        EnumC0305d enumC0305d2 = enumC0305d;
        j.g(fVar);
        return new C0304c(i9, i10, j5, j8, i11, str6, enumC0305d2, enumC0307f, num3, num4, l6, l8, num5, num6, num7, num8, num9, num10, l9, l10, bool2, bool3, str7, str8, num11, bool4, b9, str2, enumC0306e4, uVar3, num2, str4, h8, str5, str, num, n3, str3, bool);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Z7.InterfaceC0404z
    public final V7.a[] b() {
        Z5.g[] gVarArr = C0304c.f5547L;
        Z7.L l6 = Z7.L.f7554a;
        Z7.F f8 = Z7.F.f7545a;
        d0 d0Var = d0.f7591a;
        C0385f c0385f = C0385f.f7596a;
        return new V7.a[]{l6, l6, f8, d0Var, gVarArr[4].getValue(), AbstractC1492c.t((V7.a) gVarArr[5].getValue()), AbstractC1492c.t(f8), AbstractC1492c.t(f8), AbstractC1492c.t(l6), AbstractC1492c.t(l6), AbstractC1492c.t(f8), AbstractC1492c.t(f8), AbstractC1492c.t(f8), AbstractC1492c.t(f8), AbstractC1492c.t(f8), AbstractC1492c.t(f8), AbstractC1492c.t(l6), AbstractC1492c.t(l6), AbstractC1492c.t(c0385f), AbstractC1492c.t(c0385f), AbstractC1492c.t(d0Var), AbstractC1492c.t(d0Var), AbstractC1492c.t(f8), AbstractC1492c.t(c0385f), AbstractC1492c.t((V7.a) gVarArr[24].getValue()), AbstractC1492c.t(d0Var), AbstractC1492c.t((V7.a) gVarArr[26].getValue()), AbstractC1492c.t((V7.a) gVarArr[27].getValue()), AbstractC1492c.t(f8), AbstractC1492c.t(d0Var), AbstractC1492c.t((V7.a) gVarArr[30].getValue()), AbstractC1492c.t(d0Var), AbstractC1492c.t(d0Var), AbstractC1492c.t(f8), AbstractC1492c.t((V7.a) gVarArr[34].getValue()), AbstractC1492c.t(d0Var), AbstractC1492c.t(c0385f)};
    }

    @Override // V7.a
    public final void c(kotlinx.serialization.json.internal.c cVar, Object obj) {
        C0304c c0304c = (C0304c) obj;
        o6.j.e(c0304c, "value");
        Boolean bool = c0304c.K;
        String str = c0304c.f5557J;
        N n3 = c0304c.f5556I;
        Integer num = c0304c.f5555H;
        String str2 = c0304c.f5554G;
        String str3 = c0304c.f5553F;
        H h8 = c0304c.f5552E;
        String str4 = c0304c.f5551D;
        Integer num2 = c0304c.f5550C;
        u uVar = c0304c.f5549B;
        EnumC0306e enumC0306e = c0304c.f5548A;
        String str5 = c0304c.f5581z;
        B b4 = c0304c.f5580y;
        Boolean bool2 = c0304c.f5579x;
        Integer num3 = c0304c.f5578w;
        String str6 = c0304c.f5577v;
        String str7 = c0304c.f5576u;
        Boolean bool3 = c0304c.f5575t;
        Boolean bool4 = c0304c.f5574s;
        Long l6 = c0304c.f5573r;
        Long l8 = c0304c.f5572q;
        Integer num4 = c0304c.f5571p;
        Integer num5 = c0304c.f5570o;
        Integer num6 = c0304c.f5569n;
        Integer num7 = c0304c.f5568m;
        X7.f fVar = descriptor;
        kotlinx.serialization.json.internal.c a3 = cVar.a(fVar);
        Z5.g[] gVarArr = C0304c.f5547L;
        long j = c0304c.f5558a;
        Integer num8 = c0304c.f5567l;
        Integer num9 = c0304c.k;
        Long l9 = c0304c.j;
        Integer num10 = c0304c.f5565h;
        Integer num11 = c0304c.f5564g;
        EnumC0307f enumC0307f = c0304c.f5563f;
        int i4 = c0304c.f5560c;
        a3.n(fVar, 0, j);
        a3.n(fVar, 1, c0304c.f5559b);
        if (a3.w(fVar) || i4 != 0) {
            a3.l(2, i4, fVar);
        }
        a3.u(fVar, 3, c0304c.f5561d);
        a3.q(fVar, 4, (V7.a) gVarArr[4].getValue(), c0304c.f5562e);
        if (a3.w(fVar) || enumC0307f != null) {
            a3.p(fVar, 5, (V7.a) gVarArr[5].getValue(), enumC0307f);
        }
        if (a3.w(fVar) || num11 != null) {
            a3.p(fVar, 6, Z7.F.f7545a, num11);
        }
        if (a3.w(fVar) || num10 != null) {
            a3.p(fVar, 7, Z7.F.f7545a, num10);
        }
        if (a3.w(fVar) || c0304c.f5566i != null) {
            a3.p(fVar, 8, Z7.L.f7554a, c0304c.f5566i);
        }
        if (a3.w(fVar) || l9 != null) {
            a3.p(fVar, 9, Z7.L.f7554a, l9);
        }
        if (a3.w(fVar) || num9 != null) {
            a3.p(fVar, 10, Z7.F.f7545a, num9);
        }
        if (a3.w(fVar) || num8 != null) {
            a3.p(fVar, 11, Z7.F.f7545a, num8);
        }
        if (a3.w(fVar) || num7 != null) {
            a3.p(fVar, 12, Z7.F.f7545a, num7);
        }
        if (a3.w(fVar) || num6 != null) {
            a3.p(fVar, 13, Z7.F.f7545a, num6);
        }
        if (a3.w(fVar) || num5 != null) {
            a3.p(fVar, 14, Z7.F.f7545a, num5);
        }
        if (a3.w(fVar) || num4 != null) {
            a3.p(fVar, 15, Z7.F.f7545a, num4);
        }
        if (a3.w(fVar) || l8 != null) {
            a3.p(fVar, 16, Z7.L.f7554a, l8);
        }
        if (a3.w(fVar) || l6 != null) {
            a3.p(fVar, 17, Z7.L.f7554a, l6);
        }
        if (a3.w(fVar) || bool4 != null) {
            a3.p(fVar, 18, C0385f.f7596a, bool4);
        }
        if (a3.w(fVar) || bool3 != null) {
            a3.p(fVar, 19, C0385f.f7596a, bool3);
        }
        if (a3.w(fVar) || str7 != null) {
            a3.p(fVar, 20, d0.f7591a, str7);
        }
        if (a3.w(fVar) || str6 != null) {
            a3.p(fVar, 21, d0.f7591a, str6);
        }
        if (a3.w(fVar) || num3 != null) {
            a3.p(fVar, 22, Z7.F.f7545a, num3);
        }
        if (a3.w(fVar) || bool2 != null) {
            a3.p(fVar, 23, C0385f.f7596a, bool2);
        }
        if (a3.w(fVar) || b4 != null) {
            a3.p(fVar, 24, (V7.a) gVarArr[24].getValue(), b4);
        }
        if (a3.w(fVar) || str5 != null) {
            a3.p(fVar, 25, d0.f7591a, str5);
        }
        if (a3.w(fVar) || enumC0306e != null) {
            a3.p(fVar, 26, (V7.a) gVarArr[26].getValue(), enumC0306e);
        }
        if (a3.w(fVar) || uVar != null) {
            a3.p(fVar, 27, (V7.a) gVarArr[27].getValue(), uVar);
        }
        if (a3.w(fVar) || num2 != null) {
            a3.p(fVar, 28, Z7.F.f7545a, num2);
        }
        if (a3.w(fVar) || str4 != null) {
            a3.p(fVar, 29, d0.f7591a, str4);
        }
        if (a3.w(fVar) || h8 != null) {
            a3.p(fVar, 30, (V7.a) gVarArr[30].getValue(), h8);
        }
        if (a3.w(fVar) || str3 != null) {
            a3.p(fVar, 31, d0.f7591a, str3);
        }
        if (a3.w(fVar) || str2 != null) {
            a3.p(fVar, 32, d0.f7591a, str2);
        }
        if (a3.w(fVar) || num != null) {
            a3.p(fVar, 33, Z7.F.f7545a, num);
        }
        if (a3.w(fVar) || n3 != null) {
            a3.p(fVar, 34, (V7.a) gVarArr[34].getValue(), n3);
        }
        if (a3.w(fVar) || str != null) {
            a3.p(fVar, 35, d0.f7591a, str);
        }
        if (a3.w(fVar) || bool != null) {
            a3.p(fVar, 36, C0385f.f7596a, bool);
        }
        a3.v(fVar);
    }

    @Override // V7.a
    public final X7.f d() {
        return descriptor;
    }
}
