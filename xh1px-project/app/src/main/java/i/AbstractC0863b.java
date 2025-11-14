package i;

import I6.AbstractC0065d;
import L7.AbstractC0166y;
import O7.V;
import a6.AbstractC0434i;
import a6.AbstractC0436k;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import b6.C0541i;
import com.buzbuz.smartautoclicker.R;
import e6.EnumC0646a;
import f6.AbstractC0713c;
import i1.C0879a;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.json.internal.JsonDecodingException;
import n0.C1121K;
import n0.InterfaceC1119I;
import n6.InterfaceC1163b;
import o3.C1234e;
import q2.C1366l;
import q4.X;
import t3.AbstractC1571i;
import t3.C1563a;
import t3.C1564b;
import t3.C1565c;
import t3.C1566d;
import t3.C1567e;
import t3.C1568f;
import t3.C1569g;
import t3.C1570h;
import u0.C1599D;
import u0.C1609N;
import u0.C1617h;
import u0.C1621l;
import u0.InterfaceC1624o;
import w6.C1715b;

/* renamed from: i.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0863b implements S.g {
    public static final String a(Method method) {
        StringBuilder sb = new StringBuilder();
        sb.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        o6.j.d(parameterTypes, "getParameterTypes(...)");
        sb.append(AbstractC0434i.b1(parameterTypes, "", "(", ")", C1715b.f15842m, 24));
        Class<?> returnType = method.getReturnType();
        o6.j.d(returnType, "getReturnType(...)");
        sb.append(AbstractC0065d.b(returnType));
        return sb.toString();
    }

    public static long b(InputStream inputStream, OutputStream outputStream) {
        o6.j.e(inputStream, "<this>");
        o6.j.e(outputStream, "out");
        byte[] bArr = new byte[8192];
        int read = inputStream.read(bArr);
        long j = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j += read;
            read = inputStream.read(bArr);
        }
        return j;
    }

    public static final C1621l c(u0.u uVar, boolean z8, String[] strArr, InterfaceC1163b interfaceC1163b) {
        o6.j.e(uVar, "db");
        C1617h e9 = uVar.e();
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        o6.j.e(strArr2, "tables");
        C1609N c1609n = e9.f15231b;
        c1609n.getClass();
        C0541i c0541i = new C0541i();
        for (String str : strArr2) {
            LinkedHashMap linkedHashMap = c1609n.f15196c;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            o6.j.d(lowerCase, "toLowerCase(...)");
            Set set = (Set) linkedHashMap.get(lowerCase);
            if (set != null) {
                c0541i.addAll(set);
            } else {
                c0541i.add(str);
            }
        }
        String[] strArr3 = (String[]) X.j(c0541i).toArray(new String[0]);
        int length = strArr3.length;
        int[] iArr = new int[length];
        for (int i4 = 0; i4 < length; i4++) {
            String str2 = strArr3[i4];
            LinkedHashMap linkedHashMap2 = c1609n.f15199f;
            String lowerCase2 = str2.toLowerCase(Locale.ROOT);
            o6.j.d(lowerCase2, "toLowerCase(...)");
            Integer num = (Integer) linkedHashMap2.get(lowerCase2);
            if (num != null) {
                iArr[i4] = num.intValue();
            } else {
                throw new IllegalArgumentException("There is no table with name ".concat(str2));
            }
        }
        Z5.j jVar = new Z5.j(strArr3, iArr);
        String[] strArr4 = (String[]) jVar.f7485d;
        int[] iArr2 = (int[]) jVar.f7486e;
        o6.j.e(strArr4, "resolvedTableNames");
        o6.j.e(iArr2, "tableIds");
        return new C1621l(V.g(new W0.d(new C1599D(c1609n, iArr2, strArr4, null)), -1), uVar, z8, interfaceC1163b);
    }

    public static final Object d(p2.f fVar, C1366l c1366l) {
        Object g8;
        if (fVar instanceof p2.g) {
            p2.g gVar = (p2.g) fVar;
            if (gVar.f() != 0 && (g8 = AbstractC0166y.g(gVar.f(), c1366l)) == EnumC0646a.f10656d) {
                return g8;
            }
        }
        return Z5.y.f7506a;
    }

    public static final Object e(InterfaceC1624o interfaceC1624o, String str, AbstractC0713c abstractC0713c) {
        Object a3 = interfaceC1624o.a(str, new C1234e(11), abstractC0713c);
        if (a3 == EnumC0646a.f10656d) {
            return a3;
        }
        return Z5.y.f7506a;
    }

    public static Boolean f(a8.u uVar, String str) {
        o6.j.e(uVar, "<this>");
        a8.j q6 = q(uVar, str, false);
        if (q6 != null) {
            try {
                return Boolean.valueOf(a8.k.b(a8.k.e(q6)));
            } catch (IllegalArgumentException | IllegalStateException unused) {
                return null;
            }
        }
        return null;
    }

    public static final String g(AbstractC1571i abstractC1571i) {
        if (abstractC1571i.equals(C1568f.f15054a)) {
            return "com.buzbuz.smartautoclicker.PLAY";
        }
        if (abstractC1571i.equals(C1567e.f15053a)) {
            return "com.buzbuz.smartautoclicker.PAUSE";
        }
        if (abstractC1571i.equals(C1569g.f15055a)) {
            return "com.buzbuz.smartautoclicker.SHOW";
        }
        if (abstractC1571i.equals(C1566d.f15052a)) {
            return "com.buzbuz.smartautoclicker.HIDE";
        }
        if (abstractC1571i.equals(C1570h.f15056a)) {
            return "com.buzbuz.smartautoclicker.STOP";
        }
        if (abstractC1571i.equals(C1565c.f15051a)) {
            throw new IllegalArgumentException("This action doesn't use broadcasts");
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final SharedPreferences h(Context context) {
        o6.j.e(context, "<this>");
        SharedPreferences sharedPreferences = context.getSharedPreferences("DebugConfigPreferences", 0);
        o6.j.d(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }

    public static final Integer i(a8.u uVar, String str, boolean z8) {
        o6.j.e(uVar, "<this>");
        a8.j q6 = q(uVar, str, z8);
        if (q6 != null) {
            try {
                return Integer.valueOf(a8.k.c(a8.k.e(q6)));
            } catch (IllegalArgumentException unused) {
                if (z8) {
                    Log.w("JsonObject", "Value for " + str + " is not a primitive");
                    return null;
                }
                return null;
            }
        }
        return null;
    }

    public static final boolean j(SharedPreferences sharedPreferences, Context context) {
        o6.j.e(sharedPreferences, "<this>");
        return sharedPreferences.getBoolean("Debug_View_Enabled", context.getResources().getBoolean(R.bool.default_debug_view_enabled));
    }

    public static a8.d k(a8.u uVar, String str) {
        a8.d dVar;
        o6.j.e(uVar, "<this>");
        a8.j q6 = q(uVar, str, false);
        if (q6 != null) {
            try {
                Z7.A a3 = a8.k.f8289a;
                if (q6 instanceof a8.d) {
                    dVar = (a8.d) q6;
                } else {
                    dVar = null;
                }
                if (dVar != null) {
                    return dVar;
                }
                a8.k.a(q6, "JsonArray");
                throw null;
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    public static final a8.u l(a8.u uVar, String str, boolean z8) {
        a8.j q6 = q(uVar, str, z8);
        if (q6 != null) {
            try {
                return a8.k.d(q6);
            } catch (IllegalArgumentException unused) {
                if (z8) {
                    Log.w("JsonObject", "Value for " + str + " is not a JsonObject");
                    return null;
                }
                return null;
            }
        }
        return null;
    }

    public static final Long m(a8.u uVar, String str, boolean z8) {
        o6.j.e(uVar, "<this>");
        a8.j q6 = q(uVar, str, z8);
        if (q6 != null) {
            try {
                try {
                    return Long.valueOf(a8.k.f(a8.k.e(q6)));
                } catch (JsonDecodingException e9) {
                    throw new NumberFormatException(e9.getMessage());
                }
            } catch (IllegalArgumentException unused) {
                if (z8) {
                    Log.w("JsonObject", "Value for " + str + " is not a primitive");
                    return null;
                }
                return null;
            }
        }
        return null;
    }

    public static String n(Class cls) {
        LinkedHashMap linkedHashMap = C1121K.f12740b;
        String str = (String) linkedHashMap.get(cls);
        if (str == null) {
            InterfaceC1119I interfaceC1119I = (InterfaceC1119I) cls.getAnnotation(InterfaceC1119I.class);
            if (interfaceC1119I != null) {
                str = interfaceC1119I.value();
            } else {
                str = null;
            }
            if (str != null && str.length() > 0) {
                linkedHashMap.put(cls, str);
            } else {
                throw new IllegalArgumentException("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()).toString());
            }
        }
        o6.j.b(str);
        return str;
    }

    public static final PendingIntent o(AbstractC1571i abstractC1571i, Context context, C0879a c0879a) {
        Object c1563a;
        o6.j.e(context, "context");
        o6.j.e(c0879a, "appComponentsProvider");
        if (abstractC1571i.equals(C1568f.f15054a)) {
            c1563a = new C1564b(g(abstractC1571i));
        } else if (abstractC1571i.equals(C1567e.f15053a)) {
            c1563a = new C1564b(g(abstractC1571i));
        } else if (abstractC1571i.equals(C1569g.f15055a)) {
            c1563a = new C1564b(g(abstractC1571i));
        } else if (abstractC1571i.equals(C1566d.f15052a)) {
            c1563a = new C1564b(g(abstractC1571i));
        } else if (abstractC1571i.equals(C1570h.f15056a)) {
            c1563a = new C1564b(g(abstractC1571i));
        } else if (abstractC1571i.equals(C1565c.f15051a)) {
            ComponentName componentName = c0879a.f11752c;
            if (componentName != null) {
                c1563a = new C1563a(componentName);
            } else {
                o6.j.i("_scenarioActivityComponentName");
                throw null;
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (c1563a instanceof C1563a) {
            PendingIntent activity = PendingIntent.getActivity(context, 0, Intent.makeMainActivity(((C1563a) c1563a).f15049b), 67108864);
            o6.j.d(activity, "getActivity(...)");
            return activity;
        }
        if (c1563a instanceof C1564b) {
            PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, new Intent(((C1564b) c1563a).f15050b), 67108864);
            o6.j.d(broadcast, "getBroadcast(...)");
            return broadcast;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String p(a8.u uVar, String str, boolean z8) {
        o6.j.e(uVar, "<this>");
        a8.j q6 = q(uVar, str, z8);
        if (q6 != null) {
            try {
                if (a8.k.e(q6).h()) {
                    return a8.k.e(q6).g();
                }
                return null;
            } catch (IllegalArgumentException unused) {
                if (z8) {
                    Log.w("JsonObject", "Value for " + str + " is not a primitive");
                    return null;
                }
                return null;
            }
        }
        return null;
    }

    public static final a8.j q(a8.u uVar, String str, boolean z8) {
        a8.j jVar = (a8.j) uVar.get(str);
        if (jVar == null) {
            if (z8) {
                Log.w("JsonObject", "Can't find ".concat(str));
            }
            return null;
        }
        return jVar;
    }

    public static final byte[] r(InputStream inputStream) {
        o6.j.e(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        b(inputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        o6.j.d(byteArray, "toByteArray(...)");
        return byteArray;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0091, code lost:
    
        if (d(r12, r0) != r7) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00d3 -> B:13:0x00d5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0091 -> B:29:0x0062). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object s(p2.f fVar, InterfaceC1163b interfaceC1163b, AbstractC0713c abstractC0713c) {
        C1366l c1366l;
        int i4;
        C1366l c1366l2;
        int e9;
        InterfaceC1163b interfaceC1163b2;
        int i8;
        p2.f fVar2;
        InterfaceC1163b interfaceC1163b3;
        InterfaceC1163b interfaceC1163b4;
        int i9;
        int i10;
        int i11;
        p2.f fVar3;
        InterfaceC1163b interfaceC1163b5;
        if (abstractC0713c instanceof C1366l) {
            C1366l c1366l3 = (C1366l) abstractC0713c;
            int i12 = c1366l3.f13976n;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c1366l3.f13976n = i12 - Integer.MIN_VALUE;
                c1366l = c1366l3;
                Object obj = c1366l.f13975m;
                i4 = c1366l.f13976n;
                Object obj2 = EnumC0646a.f10656d;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                if (i4 == 4) {
                                    i11 = c1366l.j;
                                    int i13 = c1366l.f13973i;
                                    InterfaceC1163b interfaceC1163b6 = c1366l.f13972h;
                                    p2.f fVar4 = c1366l.f13971g;
                                    Z5.a.d(obj);
                                    interfaceC1163b2 = interfaceC1163b6;
                                    c1366l2 = c1366l;
                                    e9 = i13;
                                    i8 = i11 + 1;
                                    fVar = fVar4;
                                    if (i8 < e9) {
                                        c1366l2.f13971g = fVar;
                                        c1366l2.f13972h = interfaceC1163b2;
                                        c1366l2.f13973i = e9;
                                        c1366l2.j = i8;
                                        c1366l2.k = i8;
                                        c1366l2.f13974l = 0;
                                        c1366l2.f13976n = 3;
                                        if (interfaceC1163b2.m(c1366l2) != obj2) {
                                            fVar3 = fVar;
                                            i11 = i8;
                                            interfaceC1163b5 = interfaceC1163b2;
                                            i9 = i11;
                                            i10 = 0;
                                            c1366l2.f13971g = fVar3;
                                            c1366l2.f13972h = interfaceC1163b5;
                                            c1366l2.f13973i = e9;
                                            c1366l2.j = i11;
                                            c1366l2.k = i9;
                                            c1366l2.f13974l = i10;
                                            c1366l2.f13976n = 4;
                                            if (d(fVar3, c1366l2) != obj2) {
                                                interfaceC1163b2 = interfaceC1163b5;
                                                fVar4 = fVar3;
                                                i8 = i11 + 1;
                                                fVar = fVar4;
                                                if (i8 < e9) {
                                                }
                                            }
                                        }
                                        return obj2;
                                    }
                                    return Z5.y.f7506a;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            int i14 = c1366l.f13974l;
                            int i15 = c1366l.k;
                            int i16 = c1366l.j;
                            int i17 = c1366l.f13973i;
                            interfaceC1163b5 = c1366l.f13972h;
                            fVar3 = c1366l.f13971g;
                            Z5.a.d(obj);
                            i9 = i15;
                            i10 = i14;
                            i11 = i16;
                            c1366l2 = c1366l;
                            e9 = i17;
                            c1366l2.f13971g = fVar3;
                            c1366l2.f13972h = interfaceC1163b5;
                            c1366l2.f13973i = e9;
                            c1366l2.j = i11;
                            c1366l2.k = i9;
                            c1366l2.f13974l = i10;
                            c1366l2.f13976n = 4;
                            if (d(fVar3, c1366l2) != obj2) {
                            }
                            return obj2;
                        }
                        interfaceC1163b3 = c1366l.f13972h;
                        fVar2 = c1366l.f13971g;
                        Z5.a.d(obj);
                        p2.f fVar5 = fVar2;
                        interfaceC1163b4 = interfaceC1163b3;
                        fVar = fVar5;
                        c1366l.f13971g = fVar;
                        c1366l.f13972h = interfaceC1163b4;
                        c1366l.f13976n = 1;
                        if (interfaceC1163b4.m(c1366l) != obj2) {
                            InterfaceC1163b interfaceC1163b7 = interfaceC1163b4;
                            fVar2 = fVar;
                            interfaceC1163b3 = interfaceC1163b7;
                            c1366l.f13971g = fVar2;
                            c1366l.f13972h = interfaceC1163b3;
                            c1366l.f13976n = 2;
                        }
                        return obj2;
                    }
                    interfaceC1163b3 = c1366l.f13972h;
                    fVar2 = c1366l.f13971g;
                    Z5.a.d(obj);
                    c1366l.f13971g = fVar2;
                    c1366l.f13972h = interfaceC1163b3;
                    c1366l.f13976n = 2;
                } else {
                    Z5.a.d(obj);
                    interfaceC1163b4 = interfaceC1163b;
                    if (!fVar.b()) {
                        if (fVar.e() > 0) {
                            c1366l2 = c1366l;
                            e9 = fVar.e();
                            interfaceC1163b2 = interfaceC1163b;
                            i8 = 0;
                            if (i8 < e9) {
                            }
                        }
                        return Z5.y.f7506a;
                    }
                    c1366l.f13971g = fVar;
                    c1366l.f13972h = interfaceC1163b4;
                    c1366l.f13976n = 1;
                    if (interfaceC1163b4.m(c1366l) != obj2) {
                    }
                    return obj2;
                }
            }
        }
        c1366l = new AbstractC0713c(abstractC0713c);
        Object obj3 = c1366l.f13975m;
        i4 = c1366l.f13976n;
        Object obj22 = EnumC0646a.f10656d;
        if (i4 == 0) {
        }
    }

    public static final List t(Collection collection) {
        o6.j.e(collection, "<this>");
        return AbstractC0436k.L0(collection, new A0.i(23));
    }
}
