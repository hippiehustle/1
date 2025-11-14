package t7;

import G5.l;
import X2.e;
import Z.g;
import a.AbstractC0405a;
import a1.C0414a;
import a8.k;
import a8.u;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import d6.InterfaceC0621g;
import e5.AbstractC0645a;
import h4.AbstractC0832f;
import i.AbstractC0863b;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.zip.ZipInputStream;
import k0.InterfaceC0947b;
import n.x;
import n2.C1155c;
import n2.EnumC1156d;
import n2.m;
import n2.p;
import n2.s;
import o6.j;
import t6.C1586a;
import t6.C1590e;
import u6.AbstractC1638C;

/* renamed from: t7.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1594d implements Q0.b, InterfaceC0947b, W2.b, x, r0.d, InterfaceC0621g {
    public C1594d(View view) {
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, t7.d] */
    public static C1594d j(Context context, int i4) {
        boolean z8;
        if (i4 != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        AbstractC0405a.i("Cannot create a CalendarItemStyle with a styleResId of 0", z8);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i4, AbstractC0645a.f10653x);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        AbstractC0405a.C(context, obtainStyledAttributes, 4);
        AbstractC0405a.C(context, obtainStyledAttributes, 9);
        AbstractC0405a.C(context, obtainStyledAttributes, 7);
        obtainStyledAttributes.getDimensionPixelSize(8, 0);
        l.a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new G5.a(0)).a();
        obtainStyledAttributes.recycle();
        ?? obj = new Object();
        AbstractC0405a.j(rect.left);
        AbstractC0405a.j(rect.top);
        AbstractC0405a.j(rect.right);
        AbstractC0405a.j(rect.bottom);
        return obj;
    }

    public static W0.a k(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new W0.a(httpURLConnection);
    }

    public static InputStream m(String str) {
        j.e(str, "path");
        ClassLoader classLoader = C1594d.class.getClassLoader();
        if (classLoader == null) {
            return ClassLoader.getSystemResourceAsStream(str);
        }
        URL resource = classLoader.getResource(str);
        if (resource == null) {
            return null;
        }
        URLConnection openConnection = resource.openConnection();
        openConnection.setUseCaches(false);
        return openConnection.getInputStream();
    }

    @Override // r0.d
    public void E(int i4, Object obj) {
        String str;
        switch (i4) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case g.FLOAT_FIELD_NUMBER /* 2 */:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case g.INTEGER_FIELD_NUMBER /* 3 */:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case g.LONG_FIELD_NUMBER /* 4 */:
                str = "RESULT_NOT_WRITABLE";
                break;
            case g.STRING_FIELD_NUMBER /* 5 */:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case g.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case g.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "RESULT_IO_EXCEPTION";
                break;
            case g.BYTES_FIELD_NUMBER /* 8 */:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i4 != 6 && i4 != 7 && i4 != 8) {
            return;
        }
        Log.e("ProfileInstaller", str, (Throwable) obj);
    }

    @Override // Q0.b
    public float b() {
        return 1.0f;
    }

    @Override // W2.b
    public void c(Object obj, FileOutputStream fileOutputStream) {
        X2.d dVar = (X2.d) obj;
        j.e(dVar, "scenarioBackup");
        a8.b bVar = a8.b.f8279d;
        bVar.getClass();
        AbstractC1638C.u(bVar, X2.d.Companion.serializer(), dVar, fileOutputStream);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0419  */
    /* JADX WARN: Type inference failed for: r11v10, types: [t6.a, t6.c] */
    /* JADX WARN: Type inference failed for: r4v10, types: [t6.a, t6.c] */
    /* JADX WARN: Type inference failed for: r4v25, types: [t6.a, t6.c] */
    /* JADX WARN: Type inference failed for: r4v43, types: [t6.a, t6.c] */
    @Override // W2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object d(ZipInputStream zipInputStream) {
        int i4;
        u l6;
        m mVar;
        a8.d k;
        Iterator it;
        s sVar;
        u uVar;
        String str;
        s sVar2;
        u uVar2;
        Iterator it2;
        u uVar3;
        m mVar2;
        String str2;
        s sVar3;
        String str3;
        C1155c c1155c;
        EnumC1156d valueOf;
        int i8;
        Integer i9;
        Integer i10;
        int i11;
        long j;
        int i12;
        boolean z8;
        long j5;
        C1155c c1155c2;
        Integer i13;
        Integer i14;
        Integer i15;
        Integer i16;
        int i17;
        long j8;
        int i18;
        boolean z9;
        long j9;
        int i19;
        boolean z10;
        long j10;
        int i20;
        long j11;
        int i21;
        boolean z11;
        int i22;
        boolean z12;
        boolean z13;
        int i23;
        int i24;
        j.e(zipInputStream, "json");
        a8.b bVar = a8.b.f8279d;
        u d2 = k.d(bVar.b(new String(AbstractC0863b.r(zipInputStream), I7.a.f2219a)));
        boolean z14 = true;
        Integer i25 = AbstractC0863b.i(d2, "version", true);
        if (i25 != null) {
            i4 = i25.intValue();
        } else {
            i4 = -1;
        }
        String str4 = "DumbScenarioSerializer";
        if (i4 < 1) {
            Log.w("DumbScenarioSerializer", "Can't deserialize dumb scenario, invalid version.");
        } else {
            if (i4 == 2) {
                sVar2 = ((X2.d) bVar.a(X2.d.Companion.serializer(), d2)).f6863d;
                uVar = d2;
                str = "DumbScenarioSerializer";
            } else {
                u l8 = AbstractC0863b.l(d2, "dumbScenario", false);
                if (l8 != null && (l6 = AbstractC0863b.l(l8, "scenario", false)) != null) {
                    Long m6 = AbstractC0863b.m(l6, "id", true);
                    String str5 = "isRepeatInfinite";
                    if (m6 != null) {
                        long longValue = m6.longValue();
                        String p8 = AbstractC0863b.p(l6, "name", true);
                        if (p8 != null && p8.length() != 0) {
                            Integer i26 = AbstractC0863b.i(l6, "repeatCount", false);
                            if (i26 != null) {
                                i21 = AbstractC0832f.g(i26.intValue(), new C1586a(1, 99999, 1));
                            } else {
                                i21 = 1;
                            }
                            Boolean f8 = AbstractC0863b.f(l6, "isRepeatInfinite");
                            if (f8 != null) {
                                z11 = f8.booleanValue();
                            } else {
                                z11 = false;
                            }
                            Integer i27 = AbstractC0863b.i(l6, "maxDurationMin", false);
                            if (i27 != null) {
                                i22 = AbstractC0832f.g(i27.intValue(), new C1586a(1, 1440, 1));
                            } else {
                                i22 = 1;
                            }
                            Boolean f9 = AbstractC0863b.f(l6, "isDurationInfinite");
                            if (f9 != null) {
                                z12 = f9.booleanValue();
                            } else {
                                z12 = true;
                            }
                            Boolean f10 = AbstractC0863b.f(l6, "randomize");
                            if (f10 != null) {
                                z13 = f10.booleanValue();
                            } else {
                                z13 = true;
                            }
                            mVar = new m(longValue, p8, i21, z11, i22, z12, z13);
                            if (mVar != null && (k = AbstractC0863b.k(l8, "dumbActions")) != null) {
                                ArrayList arrayList = new ArrayList();
                                it = k.f8283d.iterator();
                                while (it.hasNext()) {
                                    a8.j jVar = (a8.j) it.next();
                                    j.e(jVar, "<this>");
                                    try {
                                        uVar2 = k.d(jVar);
                                    } catch (IllegalArgumentException unused) {
                                        uVar2 = null;
                                    }
                                    if (uVar2 != null) {
                                        String p9 = AbstractC0863b.p(uVar2, "type", z14);
                                        if (p9 != null) {
                                            try {
                                                valueOf = EnumC1156d.valueOf(p9);
                                            } catch (IllegalArgumentException unused2) {
                                                Log.w("JsonObject", "Can't create IntentExtraType, value " + p9 + " is invalid");
                                            }
                                            if (valueOf != null) {
                                                i8 = -1;
                                            } else {
                                                i8 = e.f6864a[valueOf.ordinal()];
                                            }
                                            mVar2 = mVar;
                                            it2 = it;
                                            if (i8 == 1) {
                                                if (i8 != 2) {
                                                    if (i8 != 3) {
                                                        uVar3 = d2;
                                                        str2 = str4;
                                                        sVar3 = sVar;
                                                        str3 = str5;
                                                        c1155c2 = null;
                                                        c1155c = c1155c2;
                                                    } else {
                                                        Long m8 = AbstractC0863b.m(uVar2, "id", true);
                                                        if (m8 != null) {
                                                            long longValue2 = m8.longValue();
                                                            Long m9 = AbstractC0863b.m(uVar2, "dumb_scenario_id", true);
                                                            if (m9 != null) {
                                                                long longValue3 = m9.longValue();
                                                                String p10 = AbstractC0863b.p(uVar2, "name", true);
                                                                if (p10 != null && p10.length() != 0) {
                                                                    Integer i28 = AbstractC0863b.i(uVar2, "priority", false);
                                                                    if (i28 != null) {
                                                                        int intValue = i28.intValue();
                                                                        if (intValue < 0) {
                                                                            intValue = 0;
                                                                        }
                                                                        i20 = intValue;
                                                                    } else {
                                                                        i20 = 0;
                                                                    }
                                                                    Long m10 = AbstractC0863b.m(uVar2, "pauseDuration", false);
                                                                    if (m10 != null) {
                                                                        j11 = m10.longValue();
                                                                        if (j11 < 0) {
                                                                            j11 = 0;
                                                                        }
                                                                    } else {
                                                                        j11 = 50;
                                                                    }
                                                                    c1155c2 = new C1155c(longValue2, longValue3, i20, p10, EnumC1156d.f12884f, (Integer) null, (Boolean) null, (Long) null, (Long) null, (Integer) null, (Integer) null, (Long) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, Long.valueOf(j11), 65504);
                                                                    uVar3 = d2;
                                                                    str2 = str4;
                                                                    sVar3 = sVar;
                                                                }
                                                            }
                                                        }
                                                        c1155c2 = null;
                                                        uVar3 = d2;
                                                        str2 = str4;
                                                        sVar3 = sVar;
                                                    }
                                                } else {
                                                    Long m11 = AbstractC0863b.m(uVar2, "id", true);
                                                    if (m11 != null) {
                                                        long longValue4 = m11.longValue();
                                                        Long m12 = AbstractC0863b.m(uVar2, "dumb_scenario_id", true);
                                                        if (m12 != null) {
                                                            long longValue5 = m12.longValue();
                                                            String p11 = AbstractC0863b.p(uVar2, "name", true);
                                                            if (p11 != null && p11.length() != 0 && (i13 = AbstractC0863b.i(uVar2, "fromX", true)) != null && (i14 = AbstractC0863b.i(uVar2, "fromY", true)) != null && (i15 = AbstractC0863b.i(uVar2, "toX", true)) != null && (i16 = AbstractC0863b.i(uVar2, "toY", true)) != null) {
                                                                Integer i29 = AbstractC0863b.i(uVar2, "priority", false);
                                                                if (i29 != null) {
                                                                    int intValue2 = i29.intValue();
                                                                    if (intValue2 < 0) {
                                                                        intValue2 = 0;
                                                                    }
                                                                    i17 = intValue2;
                                                                } else {
                                                                    i17 = 0;
                                                                }
                                                                Long m13 = AbstractC0863b.m(uVar2, "swipeDuration", false);
                                                                if (m13 != null) {
                                                                    str2 = str4;
                                                                    uVar3 = d2;
                                                                    sVar3 = sVar;
                                                                    j8 = AbstractC0832f.i(m13.longValue(), new C1590e(1L, 59999L));
                                                                } else {
                                                                    uVar3 = d2;
                                                                    str2 = str4;
                                                                    sVar3 = sVar;
                                                                    j8 = 250;
                                                                }
                                                                Integer i30 = AbstractC0863b.i(uVar2, "repeatCount", false);
                                                                if (i30 != null) {
                                                                    i18 = AbstractC0832f.g(i30.intValue(), new C1586a(1, 99999, 1));
                                                                } else {
                                                                    i18 = 1;
                                                                }
                                                                Boolean f11 = AbstractC0863b.f(uVar2, str5);
                                                                if (f11 != null) {
                                                                    z9 = f11.booleanValue();
                                                                } else {
                                                                    z9 = false;
                                                                }
                                                                Long m14 = AbstractC0863b.m(uVar2, "repeatDelay", false);
                                                                if (m14 != null) {
                                                                    j9 = j8;
                                                                    i19 = i18;
                                                                    z10 = z9;
                                                                    j10 = AbstractC0832f.i(m14.longValue(), new C1590e(0L, 3600000L));
                                                                } else {
                                                                    j9 = j8;
                                                                    i19 = i18;
                                                                    z10 = z9;
                                                                    j10 = 1;
                                                                }
                                                                c1155c2 = new C1155c(longValue4, longValue5, i17, p11, EnumC1156d.f12883e, Integer.valueOf(i19), Boolean.valueOf(z10), Long.valueOf(j10), (Long) null, (Integer) null, (Integer) null, Long.valueOf(j9), i13, i14, i15, i16, (Long) null, 67328);
                                                            }
                                                        }
                                                    }
                                                    uVar3 = d2;
                                                    str2 = str4;
                                                    sVar3 = sVar;
                                                    c1155c2 = null;
                                                }
                                                str3 = str5;
                                                c1155c = c1155c2;
                                            } else {
                                                uVar3 = d2;
                                                str2 = str4;
                                                sVar3 = sVar;
                                                Long m15 = AbstractC0863b.m(uVar2, "id", true);
                                                if (m15 != null) {
                                                    long longValue6 = m15.longValue();
                                                    Long m16 = AbstractC0863b.m(uVar2, "dumb_scenario_id", true);
                                                    if (m16 != null) {
                                                        long longValue7 = m16.longValue();
                                                        String p12 = AbstractC0863b.p(uVar2, "name", true);
                                                        if (p12 != null && p12.length() != 0 && (i9 = AbstractC0863b.i(uVar2, "x", true)) != null && (i10 = AbstractC0863b.i(uVar2, "y", true)) != null) {
                                                            boolean z15 = false;
                                                            Integer i31 = AbstractC0863b.i(uVar2, "priority", false);
                                                            if (i31 != null) {
                                                                int intValue3 = i31.intValue();
                                                                if (intValue3 < 0) {
                                                                    intValue3 = 0;
                                                                }
                                                                i11 = intValue3;
                                                            } else {
                                                                i11 = 0;
                                                            }
                                                            Long m17 = AbstractC0863b.m(uVar2, "pressDuration", false);
                                                            if (m17 != null) {
                                                                j = AbstractC0832f.i(m17.longValue(), new C1590e(1L, 59999L));
                                                                z15 = false;
                                                            } else {
                                                                j = 1;
                                                            }
                                                            Integer i32 = AbstractC0863b.i(uVar2, "repeatCount", z15);
                                                            if (i32 != null) {
                                                                i12 = AbstractC0832f.g(i32.intValue(), new C1586a(1, 99999, 1));
                                                            } else {
                                                                i12 = 1;
                                                            }
                                                            Boolean f12 = AbstractC0863b.f(uVar2, str5);
                                                            if (f12 != null) {
                                                                z8 = f12.booleanValue();
                                                            } else {
                                                                z8 = false;
                                                            }
                                                            Long m18 = AbstractC0863b.m(uVar2, "repeatDelay", false);
                                                            if (m18 != null) {
                                                                str3 = str5;
                                                                j5 = AbstractC0832f.i(m18.longValue(), new C1590e(0L, 3600000L));
                                                            } else {
                                                                str3 = str5;
                                                                j5 = 1;
                                                            }
                                                            c1155c2 = new C1155c(longValue6, longValue7, i11, p12, EnumC1156d.f12882d, Integer.valueOf(i12), Boolean.valueOf(z8), Long.valueOf(j5), Long.valueOf(j), i9, i10, (Long) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, 129024);
                                                            c1155c = c1155c2;
                                                        }
                                                    }
                                                }
                                                str3 = str5;
                                                c1155c2 = null;
                                                c1155c = c1155c2;
                                            }
                                        }
                                        valueOf = null;
                                        if (valueOf != null) {
                                        }
                                        mVar2 = mVar;
                                        it2 = it;
                                        if (i8 == 1) {
                                        }
                                    } else {
                                        it2 = it;
                                        uVar3 = d2;
                                        mVar2 = mVar;
                                        str2 = str4;
                                        sVar3 = sVar;
                                        str3 = str5;
                                        c1155c = null;
                                    }
                                    if (c1155c != null) {
                                        arrayList.add(c1155c);
                                    }
                                    mVar = mVar2;
                                    str5 = str3;
                                    it = it2;
                                    str4 = str2;
                                    sVar = sVar3;
                                    d2 = uVar3;
                                    z14 = true;
                                }
                                uVar = d2;
                                m mVar3 = mVar;
                                str = str4;
                                sVar2 = new s(mVar3, arrayList, new p(0L, mVar3.f12911a, 0L, 0L));
                            }
                        }
                    }
                    mVar = null;
                    if (mVar != null) {
                        ArrayList arrayList2 = new ArrayList();
                        it = k.f8283d.iterator();
                        while (it.hasNext()) {
                        }
                        uVar = d2;
                        m mVar32 = mVar;
                        str = str4;
                        sVar2 = new s(mVar32, arrayList2, new p(0L, mVar32.f12911a, 0L, 0L));
                    }
                }
            }
            if (sVar2 != null) {
                Log.w(str, "Can't deserialize dumb scenario.");
                return null;
            }
            u uVar4 = uVar;
            Integer i33 = AbstractC0863b.i(uVar4, "screenWidth", false);
            if (i33 != null) {
                i23 = i33.intValue();
            } else {
                i23 = 0;
            }
            Integer i34 = AbstractC0863b.i(uVar4, "screenHeight", false);
            if (i34 != null) {
                i24 = i34.intValue();
            } else {
                i24 = 0;
            }
            return new X2.d(i4, i23, i24, sVar2);
        }
        uVar = d2;
        str = "DumbScenarioSerializer";
        sVar2 = null;
        if (sVar2 != null) {
        }
    }

    @Override // Q0.b
    public boolean e(float f8) {
        throw new IllegalStateException("not implemented");
    }

    @Override // Q0.b
    public float f() {
        return 0.0f;
    }

    @Override // Q0.b
    public C0414a g() {
        throw new IllegalStateException("not implemented");
    }

    @Override // n.x
    public boolean h(n.m mVar) {
        return false;
    }

    @Override // Q0.b
    public boolean i(float f8) {
        return false;
    }

    @Override // Q0.b
    public boolean isEmpty() {
        return true;
    }

    public boolean l(CharSequence charSequence) {
        return false;
    }

    @Override // n.x
    public void a(n.m mVar, boolean z8) {
    }
}
