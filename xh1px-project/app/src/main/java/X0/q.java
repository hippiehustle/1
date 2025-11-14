package X0;

import N0.C0202j;
import a1.C0414a;
import android.graphics.Color;
import android.view.animation.BaseInterpolator;
import java.util.ArrayList;
import java.util.Collections;
import x.AbstractC1769h;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final R3.r f6841a = R3.r.V("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd", "ao", "bm");

    /* renamed from: b, reason: collision with root package name */
    public static final R3.r f6842b = R3.r.V("d", "a");

    /* renamed from: c, reason: collision with root package name */
    public static final R3.r f6843c = R3.r.V("ty", "nm");

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0060. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0058  */
    /* JADX WARN: Type inference failed for: r3v57, types: [java.lang.Object, X0.i] */
    /* JADX WARN: Type inference failed for: r6v16, types: [O7.Y, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static V0.e a(Y0.d dVar, C0202j c0202j) {
        String str;
        boolean z8;
        T0.d dVar2;
        Float f8;
        String str2;
        boolean z9;
        long j;
        char c6;
        char c9;
        Float f9;
        Float f10;
        String str3;
        boolean z10;
        long j5;
        long j8;
        T0.a aVar;
        T0.b bVar;
        T0.b bVar2;
        T0.b bVar3;
        T0.b bVar4;
        char c10;
        Float valueOf = Float.valueOf(0.0f);
        Float valueOf2 = Float.valueOf(1.0f);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        dVar.d();
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        long j9 = -1;
        T0.d dVar3 = null;
        int i4 = 0;
        String str4 = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        boolean z11 = false;
        W0.d dVar4 = null;
        A4.d dVar5 = null;
        int i11 = 1;
        int i12 = 1;
        T0.a aVar2 = null;
        R3.r rVar = null;
        T0.b bVar5 = null;
        float f16 = 1.0f;
        long j10 = 0;
        String str5 = null;
        String str6 = "UNSET";
        while (true) {
            boolean z12 = false;
            while (dVar.p()) {
                switch (dVar.M(f6841a)) {
                    case 0:
                        str6 = dVar.B();
                    case 1:
                        f9 = valueOf;
                        j10 = dVar.z();
                        valueOf = f9;
                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                        str4 = dVar.B();
                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                        f8 = valueOf;
                        str2 = str5;
                        z9 = z12;
                        j = j9;
                        int z13 = dVar.z();
                        i4 = 7;
                        if (z13 < 6) {
                            i4 = AbstractC1769h.c(7)[z13];
                        }
                        valueOf = f8;
                        str5 = str2;
                        z12 = z9;
                        j9 = j;
                    case Z.g.LONG_FIELD_NUMBER /* 4 */:
                        f9 = valueOf;
                        j9 = dVar.z();
                        valueOf = f9;
                    case Z.g.STRING_FIELD_NUMBER /* 5 */:
                        f10 = valueOf;
                        str3 = str5;
                        i8 = (int) (Z0.k.c() * dVar.z());
                        valueOf = f10;
                        str5 = str3;
                    case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                        f10 = valueOf;
                        str3 = str5;
                        i9 = (int) (Z0.k.c() * dVar.z());
                        valueOf = f10;
                        str5 = str3;
                    case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                        f9 = valueOf;
                        i10 = Color.parseColor(dVar.B());
                        valueOf = f9;
                    case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                        dVar3 = AbstractC0360c.a(dVar, c0202j);
                    case 9:
                        f8 = valueOf;
                        str2 = str5;
                        z9 = z12;
                        j = j9;
                        int z14 = dVar.z();
                        if (z14 >= AbstractC1769h.c(6).length) {
                            c0202j.a("Unsupported matte type: " + z14);
                        } else {
                            i11 = AbstractC1769h.c(6)[z14];
                            int b4 = AbstractC1769h.b(i11);
                            if (b4 != 3) {
                                if (b4 == 4) {
                                    c0202j.a("Unsupported matte type: Luma Inverted");
                                }
                            } else {
                                c0202j.a("Unsupported matte type: Luma");
                            }
                            c0202j.f3614p++;
                        }
                        valueOf = f8;
                        str5 = str2;
                        z12 = z9;
                        j9 = j;
                    case 10:
                        f8 = valueOf;
                        str2 = str5;
                        z9 = z12;
                        j = j9;
                        dVar.a();
                        while (dVar.p()) {
                            dVar.d();
                            boolean z15 = false;
                            T0.a aVar3 = null;
                            int i13 = 0;
                            T0.a aVar4 = null;
                            while (dVar.p()) {
                                String U8 = dVar.U();
                                U8.getClass();
                                switch (U8.hashCode()) {
                                    case 111:
                                        if (U8.equals("o")) {
                                            c6 = 0;
                                            break;
                                        }
                                        break;
                                    case 3588:
                                        if (U8.equals("pt")) {
                                            c6 = 1;
                                            break;
                                        }
                                        break;
                                    case 104433:
                                        if (U8.equals("inv")) {
                                            c6 = 2;
                                            break;
                                        }
                                        break;
                                    case 3357091:
                                        if (U8.equals("mode")) {
                                            c6 = 3;
                                            break;
                                        }
                                        break;
                                }
                                c6 = 65535;
                                switch (c6) {
                                    case 0:
                                        aVar4 = D2.f.A(dVar, c0202j);
                                        break;
                                    case 1:
                                        aVar3 = new T0.a(5, p.a(dVar, c0202j, Z0.k.c(), x.f6853a, false));
                                        break;
                                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                        z15 = dVar.v();
                                        break;
                                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                        String B8 = dVar.B();
                                        B8.getClass();
                                        switch (B8.hashCode()) {
                                            case 97:
                                                if (B8.equals("a")) {
                                                    c9 = 0;
                                                    break;
                                                }
                                                break;
                                            case 105:
                                                if (B8.equals("i")) {
                                                    c9 = 1;
                                                    break;
                                                }
                                                break;
                                            case 110:
                                                if (B8.equals("n")) {
                                                    c9 = 2;
                                                    break;
                                                }
                                                break;
                                            case 115:
                                                if (B8.equals("s")) {
                                                    c9 = 3;
                                                    break;
                                                }
                                                break;
                                        }
                                        c9 = 65535;
                                        switch (c9) {
                                            case 0:
                                                break;
                                            case 1:
                                                c0202j.a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                                                i13 = 3;
                                                break;
                                            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                                i13 = 4;
                                                break;
                                            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                                i13 = 2;
                                                break;
                                            default:
                                                Z0.c.b("Unknown mask mode " + U8 + ". Defaulting to Add.");
                                                break;
                                        }
                                        i13 = 1;
                                        break;
                                    default:
                                        dVar.O();
                                        break;
                                }
                            }
                            dVar.j();
                            arrayList.add(new U0.f(i13, aVar3, aVar4, z15));
                        }
                        c0202j.f3614p += arrayList.size();
                        dVar.e();
                        valueOf = f8;
                        str5 = str2;
                        z12 = z9;
                        j9 = j;
                    case 11:
                        f8 = valueOf;
                        str2 = str5;
                        z9 = z12;
                        j = j9;
                        dVar.a();
                        while (dVar.p()) {
                            U0.b a3 = g.a(dVar, c0202j);
                            if (a3 != null) {
                                arrayList2.add(a3);
                            }
                        }
                        dVar.e();
                        valueOf = f8;
                        str5 = str2;
                        z12 = z9;
                        j9 = j;
                    case 12:
                        f10 = valueOf;
                        str3 = str5;
                        dVar.d();
                        while (dVar.p()) {
                            int M8 = dVar.M(f6842b);
                            if (M8 != 0) {
                                if (M8 != 1) {
                                    dVar.N();
                                    dVar.O();
                                } else {
                                    dVar.a();
                                    if (dVar.p()) {
                                        R3.r rVar2 = AbstractC0359b.f6803a;
                                        dVar.d();
                                        A4.d dVar6 = null;
                                        Object obj = null;
                                        while (dVar.p()) {
                                            int M9 = dVar.M(AbstractC0359b.f6803a);
                                            if (M9 != 0) {
                                                boolean z16 = true;
                                                if (M9 != 1) {
                                                    dVar.N();
                                                    dVar.O();
                                                } else {
                                                    dVar.d();
                                                    T0.a aVar5 = null;
                                                    T0.a aVar6 = null;
                                                    T0.b bVar6 = null;
                                                    T0.b bVar7 = null;
                                                    T0.a aVar7 = null;
                                                    while (dVar.p()) {
                                                        int M10 = dVar.M(AbstractC0359b.f6805c);
                                                        if (M10 != 0) {
                                                            if (M10 != z16) {
                                                                if (M10 != 2) {
                                                                    if (M10 != 3) {
                                                                        if (M10 != 4) {
                                                                            dVar.N();
                                                                            dVar.O();
                                                                        } else {
                                                                            aVar7 = D2.f.A(dVar, c0202j);
                                                                        }
                                                                    } else {
                                                                        bVar7 = D2.f.y(dVar, c0202j, z16);
                                                                    }
                                                                } else {
                                                                    bVar6 = D2.f.y(dVar, c0202j, z16);
                                                                }
                                                            } else {
                                                                aVar6 = D2.f.x(dVar, c0202j);
                                                            }
                                                        } else {
                                                            aVar5 = D2.f.x(dVar, c0202j);
                                                        }
                                                        z16 = true;
                                                    }
                                                    dVar.j();
                                                    dVar6 = new A4.d(aVar5, aVar6, bVar6, bVar7, aVar7, 12);
                                                }
                                            } else {
                                                dVar.d();
                                                int i14 = 0;
                                                T0.a aVar8 = null;
                                                T0.a aVar9 = null;
                                                T0.a aVar10 = null;
                                                while (dVar.p()) {
                                                    T0.a aVar11 = aVar8;
                                                    int M11 = dVar.M(AbstractC0359b.f6804b);
                                                    if (M11 != 0) {
                                                        boolean z17 = z12;
                                                        if (M11 != 1) {
                                                            if (M11 != 2) {
                                                                if (M11 != 3) {
                                                                    dVar.N();
                                                                    dVar.O();
                                                                } else {
                                                                    int z18 = dVar.z();
                                                                    if (z18 != 1 && z18 != 2) {
                                                                        c0202j.a("Unsupported text range units: " + z18);
                                                                        aVar8 = aVar11;
                                                                        z12 = z17;
                                                                        i14 = 2;
                                                                    } else if (z18 == 1) {
                                                                        i14 = 1;
                                                                    } else {
                                                                        i14 = 2;
                                                                    }
                                                                }
                                                            } else {
                                                                aVar10 = D2.f.A(dVar, c0202j);
                                                            }
                                                        } else {
                                                            aVar9 = D2.f.A(dVar, c0202j);
                                                        }
                                                        aVar8 = aVar11;
                                                        z12 = z17;
                                                    } else {
                                                        aVar8 = D2.f.A(dVar, c0202j);
                                                    }
                                                }
                                                T0.a aVar12 = aVar8;
                                                boolean z19 = z12;
                                                dVar.j();
                                                if (aVar12 == null && aVar9 != null) {
                                                    j8 = j9;
                                                    aVar = new T0.a(2, Collections.singletonList(new C0414a(0)));
                                                } else {
                                                    j8 = j9;
                                                    aVar = aVar12;
                                                }
                                                ?? obj2 = new Object();
                                                obj2.f4114b = aVar;
                                                obj2.f4115c = aVar9;
                                                obj2.f4116d = aVar10;
                                                obj2.f4113a = i14;
                                                obj = obj2;
                                                z12 = z19;
                                                j9 = j8;
                                            }
                                        }
                                        z10 = z12;
                                        j5 = j9;
                                        dVar.j();
                                        rVar = new R3.r(dVar6, 2, obj);
                                    } else {
                                        z10 = z12;
                                        j5 = j9;
                                    }
                                    while (dVar.p()) {
                                        dVar.O();
                                    }
                                    dVar.e();
                                    z12 = z10;
                                    j9 = j5;
                                }
                            } else {
                                aVar2 = new T0.a(6, p.a(dVar, c0202j, Z0.k.c(), h.f6819a, false));
                                z12 = z12;
                            }
                        }
                        dVar.j();
                        valueOf = f10;
                        str5 = str3;
                        break;
                    case 13:
                        f10 = valueOf;
                        str3 = str5;
                        dVar.a();
                        ArrayList arrayList3 = new ArrayList();
                        while (dVar.p()) {
                            dVar.d();
                            while (dVar.p()) {
                                int M12 = dVar.M(f6843c);
                                if (M12 != 0) {
                                    if (M12 != 1) {
                                        dVar.N();
                                        dVar.O();
                                    } else {
                                        arrayList3.add(dVar.B());
                                    }
                                } else {
                                    int z20 = dVar.z();
                                    if (z20 == 29) {
                                        R3.r rVar3 = AbstractC0361d.f6808a;
                                        dVar4 = null;
                                        while (dVar.p()) {
                                            if (dVar.M(AbstractC0361d.f6808a) != 0) {
                                                dVar.N();
                                                dVar.O();
                                            } else {
                                                dVar.a();
                                                while (dVar.p()) {
                                                    dVar.d();
                                                    boolean z21 = false;
                                                    W0.d dVar7 = null;
                                                    while (dVar.p()) {
                                                        int M13 = dVar.M(AbstractC0361d.f6809b);
                                                        if (M13 != 0) {
                                                            if (M13 != 1) {
                                                                dVar.N();
                                                                dVar.O();
                                                            } else if (z21) {
                                                                dVar7 = new W0.d(26, D2.f.y(dVar, c0202j, true));
                                                            } else {
                                                                dVar.O();
                                                            }
                                                        } else if (dVar.z() == 0) {
                                                            z21 = true;
                                                        } else {
                                                            z21 = false;
                                                        }
                                                    }
                                                    dVar.j();
                                                    if (dVar7 != null) {
                                                        dVar4 = dVar7;
                                                    }
                                                }
                                                dVar.e();
                                            }
                                        }
                                    } else if (z20 == 25) {
                                        ?? obj3 = new Object();
                                        while (dVar.p()) {
                                            if (dVar.M(i.f6821f) != 0) {
                                                dVar.N();
                                                dVar.O();
                                            } else {
                                                dVar.a();
                                                while (dVar.p()) {
                                                    dVar.d();
                                                    String str7 = "";
                                                    while (dVar.p()) {
                                                        int M14 = dVar.M(i.f6822g);
                                                        if (M14 != 0) {
                                                            if (M14 != 1) {
                                                                dVar.N();
                                                                dVar.O();
                                                            } else {
                                                                str7.getClass();
                                                                switch (str7.hashCode()) {
                                                                    case 353103893:
                                                                        if (str7.equals("Distance")) {
                                                                            c10 = 0;
                                                                            break;
                                                                        }
                                                                        break;
                                                                    case 397447147:
                                                                        if (str7.equals("Opacity")) {
                                                                            c10 = 1;
                                                                            break;
                                                                        }
                                                                        break;
                                                                    case 1041377119:
                                                                        if (str7.equals("Direction")) {
                                                                            c10 = 2;
                                                                            break;
                                                                        }
                                                                        break;
                                                                    case 1379387491:
                                                                        if (str7.equals("Shadow Color")) {
                                                                            c10 = 3;
                                                                            break;
                                                                        }
                                                                        break;
                                                                    case 1383710113:
                                                                        if (str7.equals("Softness")) {
                                                                            c10 = 4;
                                                                            break;
                                                                        }
                                                                        break;
                                                                }
                                                                c10 = 65535;
                                                                switch (c10) {
                                                                    case 0:
                                                                        obj3.f6826d = D2.f.y(dVar, c0202j, true);
                                                                        break;
                                                                    case 1:
                                                                        obj3.f6824b = D2.f.y(dVar, c0202j, false);
                                                                        break;
                                                                    case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                                                                        obj3.f6825c = D2.f.y(dVar, c0202j, false);
                                                                        break;
                                                                    case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                                                                        obj3.f6823a = D2.f.x(dVar, c0202j);
                                                                        break;
                                                                    case Z.g.LONG_FIELD_NUMBER /* 4 */:
                                                                        obj3.f6827e = D2.f.y(dVar, c0202j, true);
                                                                        break;
                                                                    default:
                                                                        dVar.O();
                                                                        break;
                                                                }
                                                            }
                                                        } else {
                                                            str7 = dVar.B();
                                                        }
                                                    }
                                                    dVar.j();
                                                }
                                                dVar.e();
                                            }
                                        }
                                        T0.a aVar13 = obj3.f6823a;
                                        if (aVar13 != null && (bVar = obj3.f6824b) != null && (bVar2 = obj3.f6825c) != null && (bVar3 = obj3.f6826d) != null && (bVar4 = obj3.f6827e) != null) {
                                            dVar5 = new A4.d(aVar13, bVar, bVar2, bVar3, bVar4, 15);
                                        } else {
                                            dVar5 = null;
                                        }
                                    }
                                }
                            }
                            dVar.j();
                        }
                        dVar.e();
                        c0202j.a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList3);
                        valueOf = f10;
                        str5 = str3;
                        break;
                    case 14:
                        f10 = valueOf;
                        str3 = str5;
                        f16 = (float) dVar.y();
                        valueOf = f10;
                        str5 = str3;
                    case 15:
                        f10 = valueOf;
                        str3 = str5;
                        f15 = (float) dVar.y();
                        valueOf = f10;
                        str5 = str3;
                    case 16:
                        f10 = valueOf;
                        str3 = str5;
                        f13 = (float) (dVar.y() * Z0.k.c());
                        valueOf = f10;
                        str5 = str3;
                    case 17:
                        f10 = valueOf;
                        str3 = str5;
                        f14 = (float) (dVar.y() * Z0.k.c());
                        valueOf = f10;
                        str5 = str3;
                    case 18:
                        f11 = (float) dVar.y();
                    case 19:
                        f12 = (float) dVar.y();
                    case 20:
                        bVar5 = D2.f.y(dVar, c0202j, false);
                    case 21:
                        str5 = dVar.B();
                    case 22:
                        z11 = dVar.v();
                    case 23:
                        if (dVar.z() == 1) {
                            z12 = true;
                        }
                        break;
                    case 24:
                        int z22 = dVar.z();
                        if (z22 >= AbstractC1769h.c(18).length) {
                            c0202j.a("Unsupported Blend Mode: " + z22);
                            i12 = 1;
                        } else {
                            i12 = AbstractC1769h.c(18)[z22];
                        }
                    default:
                        dVar.N();
                        dVar.O();
                        f8 = valueOf;
                        str2 = str5;
                        z9 = z12;
                        j = j9;
                        valueOf = f8;
                        str5 = str2;
                        z12 = z9;
                        j9 = j;
                }
                while (dVar.p()) {
                }
            }
            Float f17 = valueOf;
            String str8 = str5;
            boolean z23 = z12;
            long j11 = j9;
            dVar.j();
            ArrayList arrayList4 = new ArrayList();
            if (f11 > 0.0f) {
                str = str8;
                z8 = z23;
                arrayList4.add(new C0414a(c0202j, f17, f17, (BaseInterpolator) null, 0.0f, Float.valueOf(f11)));
            } else {
                str = str8;
                z8 = z23;
            }
            if (f12 <= 0.0f) {
                f12 = c0202j.f3611m;
            }
            arrayList4.add(new C0414a(c0202j, valueOf2, valueOf2, (BaseInterpolator) null, f11, Float.valueOf(f12)));
            arrayList4.add(new C0414a(c0202j, f17, f17, (BaseInterpolator) null, f12, Float.valueOf(Float.MAX_VALUE)));
            if (str6.endsWith(".ai") || "ai".equals(str)) {
                c0202j.a("Convert your Illustrator layers to shape layers.");
            }
            if (z8) {
                if (dVar3 == null) {
                    dVar3 = new T0.d();
                }
                T0.d dVar8 = dVar3;
                dVar8.j = z8;
                dVar2 = dVar8;
            } else {
                dVar2 = dVar3;
            }
            return new V0.e(arrayList2, c0202j, str6, j10, i4, j11, str4, arrayList, dVar2, i8, i9, i10, f16, f15, f13, f14, aVar2, rVar, arrayList4, i11, bVar5, z11, dVar4, dVar5, i12);
        }
    }
}
