package X0;

import N0.C0202j;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final R3.r f6844a = R3.r.V("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* renamed from: b, reason: collision with root package name */
    public static final R3.r f6845b = R3.r.V("id", "layers", "w", "h", "p", "u");

    /* renamed from: c, reason: collision with root package name */
    public static final R3.r f6846c = R3.r.V("list");

    /* renamed from: d, reason: collision with root package name */
    public static final R3.r f6847d = R3.r.V("cm", "tm", "dr");

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0045. Please report as an issue. */
    public static C0202j a(Y0.d dVar) {
        C0202j c0202j;
        float f8;
        C0202j c0202j2;
        C0202j c0202j3;
        int i4;
        float f9;
        C0202j c0202j4;
        float f10;
        float f11;
        int i8;
        float c6 = Z0.k.c();
        t.g gVar = new t.g((Object) null);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        t.k kVar = new t.k(0);
        C0202j c0202j5 = new C0202j();
        dVar.d();
        int i9 = 0;
        int i10 = 0;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        while (dVar.p()) {
            switch (dVar.M(f6844a)) {
                case 0:
                    c0202j = c0202j5;
                    i9 = (int) dVar.y();
                    c0202j5 = c0202j;
                    break;
                case 1:
                    c0202j = c0202j5;
                    i10 = (int) dVar.y();
                    c0202j5 = c0202j;
                    break;
                case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                    c0202j = c0202j5;
                    f13 = (float) dVar.y();
                    c0202j5 = c0202j;
                    break;
                case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                    f8 = c6;
                    c0202j2 = c0202j5;
                    f12 = ((float) dVar.y()) - 0.01f;
                    c0202j5 = c0202j2;
                    c6 = f8;
                    break;
                case Z.g.LONG_FIELD_NUMBER /* 4 */:
                    f8 = c6;
                    c0202j2 = c0202j5;
                    f14 = (float) dVar.y();
                    c0202j5 = c0202j2;
                    c6 = f8;
                    break;
                case Z.g.STRING_FIELD_NUMBER /* 5 */:
                    f8 = c6;
                    c0202j3 = c0202j5;
                    i4 = i10;
                    f9 = f13;
                    String[] split = dVar.B().split("\\.");
                    int parseInt = Integer.parseInt(split[0]);
                    int parseInt2 = Integer.parseInt(split[1]);
                    int parseInt3 = Integer.parseInt(split[2]);
                    if (parseInt < 4 || (parseInt <= 4 && (parseInt2 < 4 || (parseInt2 <= 4 && parseInt3 < 0)))) {
                        c0202j3.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    c0202j5 = c0202j3;
                    i10 = i4;
                    f13 = f9;
                    c6 = f8;
                    break;
                case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                    f8 = c6;
                    C0202j c0202j6 = c0202j5;
                    i4 = i10;
                    f9 = f13;
                    dVar.a();
                    int i11 = 0;
                    while (dVar.p()) {
                        C0202j c0202j7 = c0202j6;
                        V0.e a3 = q.a(dVar, c0202j7);
                        if (a3.f6260e == 3) {
                            i11++;
                        }
                        arrayList.add(a3);
                        gVar.g(a3.f6259d, a3);
                        if (i11 > 4) {
                            Z0.c.b("You have " + i11 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                        c0202j6 = c0202j7;
                    }
                    c0202j3 = c0202j6;
                    dVar.e();
                    c0202j5 = c0202j3;
                    i10 = i4;
                    f13 = f9;
                    c6 = f8;
                    break;
                case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                    f8 = c6;
                    i4 = i10;
                    f9 = f13;
                    dVar.a();
                    while (dVar.p()) {
                        ArrayList arrayList3 = new ArrayList();
                        t.g gVar2 = new t.g((Object) null);
                        dVar.d();
                        String str = null;
                        String str2 = null;
                        String str3 = null;
                        int i12 = 0;
                        int i13 = 0;
                        while (dVar.p()) {
                            int M8 = dVar.M(f6845b);
                            if (M8 != 0) {
                                if (M8 != 1) {
                                    if (M8 != 2) {
                                        if (M8 != 3) {
                                            if (M8 != 4) {
                                                if (M8 != 5) {
                                                    dVar.N();
                                                    dVar.O();
                                                    c0202j4 = c0202j5;
                                                } else {
                                                    str3 = dVar.B();
                                                }
                                            } else {
                                                str2 = dVar.B();
                                            }
                                        } else {
                                            i13 = dVar.z();
                                        }
                                    } else {
                                        i12 = dVar.z();
                                    }
                                } else {
                                    dVar.a();
                                    while (dVar.p()) {
                                        V0.e a4 = q.a(dVar, c0202j5);
                                        gVar2.g(a4.f6259d, a4);
                                        arrayList3.add(a4);
                                        c0202j5 = c0202j5;
                                    }
                                    c0202j4 = c0202j5;
                                    dVar.e();
                                }
                                c0202j5 = c0202j4;
                            } else {
                                str = dVar.B();
                            }
                        }
                        C0202j c0202j8 = c0202j5;
                        dVar.j();
                        if (str2 != null) {
                            hashMap2.put(str, new N0.z(i12, i13, str, str2, str3));
                        } else {
                            hashMap.put(str, arrayList3);
                        }
                        c0202j5 = c0202j8;
                    }
                    dVar.e();
                    c0202j3 = c0202j5;
                    c0202j5 = c0202j3;
                    i10 = i4;
                    f13 = f9;
                    c6 = f8;
                    break;
                case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                    f8 = c6;
                    i4 = i10;
                    float f15 = f13;
                    dVar.d();
                    while (dVar.p()) {
                        if (dVar.M(f6846c) != 0) {
                            dVar.N();
                            dVar.O();
                        } else {
                            dVar.a();
                            while (dVar.p()) {
                                R3.r rVar = k.f6830a;
                                dVar.d();
                                String str4 = null;
                                String str5 = null;
                                String str6 = null;
                                while (dVar.p()) {
                                    int M9 = dVar.M(k.f6830a);
                                    if (M9 != 0) {
                                        float f16 = f15;
                                        if (M9 != 1) {
                                            if (M9 != 2) {
                                                if (M9 != 3) {
                                                    dVar.N();
                                                    dVar.O();
                                                } else {
                                                    dVar.y();
                                                }
                                            } else {
                                                str6 = dVar.B();
                                            }
                                        } else {
                                            str5 = dVar.B();
                                        }
                                        f15 = f16;
                                    } else {
                                        str4 = dVar.B();
                                    }
                                }
                                dVar.j();
                                hashMap3.put(str5, new S0.c(str4, str5, str6));
                                f15 = f15;
                            }
                            dVar.e();
                        }
                    }
                    f9 = f15;
                    dVar.j();
                    c0202j3 = c0202j5;
                    c0202j5 = c0202j3;
                    i10 = i4;
                    f13 = f9;
                    c6 = f8;
                    break;
                case 9:
                    f8 = c6;
                    i4 = i10;
                    f10 = f13;
                    dVar.a();
                    while (dVar.p()) {
                        R3.r rVar2 = j.f6828a;
                        ArrayList arrayList4 = new ArrayList();
                        dVar.d();
                        double d2 = 0.0d;
                        char c9 = 0;
                        String str7 = null;
                        String str8 = null;
                        while (dVar.p()) {
                            int M10 = dVar.M(j.f6828a);
                            if (M10 != 0) {
                                if (M10 != 1) {
                                    if (M10 != 2) {
                                        if (M10 != 3) {
                                            if (M10 != 4) {
                                                if (M10 != 5) {
                                                    dVar.N();
                                                    dVar.O();
                                                } else {
                                                    dVar.d();
                                                    while (dVar.p()) {
                                                        if (dVar.M(j.f6829b) != 0) {
                                                            dVar.N();
                                                            dVar.O();
                                                        } else {
                                                            dVar.a();
                                                            while (dVar.p()) {
                                                                arrayList4.add((U0.m) g.a(dVar, c0202j5));
                                                            }
                                                            dVar.e();
                                                        }
                                                    }
                                                    dVar.j();
                                                }
                                            } else {
                                                str8 = dVar.B();
                                            }
                                        } else {
                                            str7 = dVar.B();
                                        }
                                    } else {
                                        d2 = dVar.y();
                                    }
                                } else {
                                    dVar.y();
                                }
                            } else {
                                c9 = dVar.B().charAt(0);
                            }
                        }
                        dVar.j();
                        S0.d dVar2 = new S0.d(arrayList4, c9, d2, str7, str8);
                        kVar.d(dVar2.hashCode(), dVar2);
                    }
                    dVar.e();
                    f9 = f10;
                    c0202j3 = c0202j5;
                    c0202j5 = c0202j3;
                    i10 = i4;
                    f13 = f9;
                    c6 = f8;
                    break;
                case 10:
                    dVar.a();
                    while (dVar.p()) {
                        dVar.d();
                        String str9 = null;
                        float f17 = 0.0f;
                        float f18 = 0.0f;
                        while (dVar.p()) {
                            int M11 = dVar.M(f6847d);
                            if (M11 != 0) {
                                f11 = c6;
                                if (M11 != 1) {
                                    if (M11 != 2) {
                                        dVar.N();
                                        dVar.O();
                                    } else {
                                        i8 = i10;
                                        f13 = f13;
                                        f18 = (float) dVar.y();
                                    }
                                } else {
                                    i8 = i10;
                                    f13 = f13;
                                    f17 = (float) dVar.y();
                                }
                                i10 = i8;
                            } else {
                                f11 = c6;
                                str9 = dVar.B();
                            }
                            c6 = f11;
                        }
                        dVar.j();
                        arrayList2.add(new S0.h(str9, f17, f18));
                        f13 = f13;
                        i10 = i10;
                        c6 = c6;
                    }
                    f8 = c6;
                    i4 = i10;
                    f10 = f13;
                    dVar.e();
                    f9 = f10;
                    c0202j3 = c0202j5;
                    c0202j5 = c0202j3;
                    i10 = i4;
                    f13 = f9;
                    c6 = f8;
                    break;
                default:
                    dVar.N();
                    dVar.O();
                    f8 = c6;
                    c0202j3 = c0202j5;
                    i4 = i10;
                    f9 = f13;
                    c0202j5 = c0202j3;
                    i10 = i4;
                    f13 = f9;
                    c6 = f8;
                    break;
            }
        }
        float f19 = c6;
        C0202j c0202j9 = c0202j5;
        Rect rect = new Rect(0, 0, (int) (i9 * f19), (int) (i10 * f19));
        float c10 = Z0.k.c();
        c0202j9.k = rect;
        c0202j9.f3610l = f13;
        c0202j9.f3611m = f12;
        c0202j9.f3612n = f14;
        c0202j9.j = arrayList;
        c0202j9.f3609i = gVar;
        c0202j9.f3603c = hashMap;
        c0202j9.f3604d = hashMap2;
        c0202j9.f3605e = c10;
        c0202j9.f3608h = kVar;
        c0202j9.f3606f = hashMap3;
        c0202j9.f3607g = arrayList2;
        return c0202j9;
    }
}
