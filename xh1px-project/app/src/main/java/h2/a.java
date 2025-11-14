package h2;

import L7.AbstractC0166y;
import T1.A;
import T1.B;
import T1.C0304c;
import T1.C0310i;
import T1.EnumC0306e;
import T1.EnumC0307f;
import T1.F;
import T1.H;
import T1.N;
import T1.u;
import Z.g;
import a6.AbstractC0436k;
import a6.AbstractC0438m;
import android.accessibilityservice.GestureDescription;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import d6.C0623i;
import e2.AbstractC0640c;
import e2.C0638a;
import e2.C0639b;
import f2.c;
import f2.d;
import f2.e;
import f2.f;
import f2.h;
import f2.i;
import f2.k;
import f2.l;
import f2.m;
import f2.n;
import f2.o;
import g2.C0777a;
import h4.AbstractC0832f;
import i2.C0880a;
import java.io.Closeable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import l1.C0999a;
import n6.InterfaceC1164c;
import o6.InterfaceC1285d;
import o6.j;
import o6.v;
import r6.AbstractC1473d;
import r6.C1474e;
import t5.b;
import u6.InterfaceC1642c;
import w0.C1682B;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static Field f11324a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f11325b;

    /* renamed from: c, reason: collision with root package name */
    public static Class f11326c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f11327d;

    /* renamed from: e, reason: collision with root package name */
    public static Field f11328e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f11329f;

    /* renamed from: g, reason: collision with root package name */
    public static Field f11330g;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f11331h;

    public static void A(Outline outline, Path path) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 30) {
            b.a(outline, path);
            return;
        }
        if (i4 >= 29) {
            try {
                t5.a.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            t5.a.a(outline, path);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:62:0x01f1. Please report as an issue. */
    public static final f2.a B(C0310i c0310i, boolean z8) {
        C0999a c0999a;
        Point point;
        boolean z9;
        int i4;
        String str;
        C0777a c0777a;
        Boolean bool;
        boolean z10;
        n nVar;
        AbstractC0640c c0639b;
        int i8;
        j.e(c0310i, "<this>");
        C0304c c0304c = c0310i.f5599a;
        boolean z11 = false;
        l lVar = null;
        switch (c0304c.f5562e.ordinal()) {
            case 0:
                C0999a c0999a2 = new C0999a(c0304c.f5558a, z8);
                long j = c0304c.f5559b;
                Integer num = c0304c.f5567l;
                Integer num2 = c0304c.k;
                C0999a c0999a3 = new C0999a(j, z8);
                String str2 = c0304c.f5561d;
                int i9 = c0304c.f5560c;
                Long l6 = c0304c.j;
                j.b(l6);
                EnumC0307f enumC0307f = c0304c.f5563f;
                j.b(enumC0307f);
                d valueOf = d.valueOf(enumC0307f.name());
                Point o7 = o(c0304c.f5564g, c0304c.f5565h);
                Long l8 = c0304c.f5566i;
                if (l8 != null) {
                    c0999a = new C0999a(l8.longValue(), z8);
                } else {
                    c0999a = null;
                }
                if (num2 != null && num != null) {
                    point = new Point(num2.intValue(), num.intValue());
                } else {
                    point = null;
                }
                return new e(c0999a2, c0999a3, str2, i9, l6, valueOf, o7, c0999a, point);
            case 1:
                C0999a c0999a4 = new C0999a(c0304c.f5558a, z8);
                C0999a c0999a5 = new C0999a(c0304c.f5559b, z8);
                String str3 = c0304c.f5561d;
                int i10 = c0304c.f5560c;
                Long l9 = c0304c.f5572q;
                j.b(l9);
                return new k(c0999a4, c0999a5, str3, i10, l9, o(c0304c.f5568m, c0304c.f5569n), o(c0304c.f5570o, c0304c.f5571p));
            case g.FLOAT_FIELD_NUMBER /* 2 */:
                C0999a c0999a6 = new C0999a(c0304c.f5558a, z8);
                C0999a c0999a7 = new C0999a(c0304c.f5559b, z8);
                String str4 = c0304c.f5561d;
                int i11 = c0304c.f5560c;
                Long l10 = c0304c.f5573r;
                j.b(l10);
                return new i(c0999a6, c0999a7, str4, i11, l10);
            case g.INTEGER_FIELD_NUMBER /* 3 */:
                ComponentName componentName = null;
                C0999a c0999a8 = new C0999a(c0304c.f5558a, z8);
                C0999a c0999a9 = new C0999a(c0304c.f5559b, z8);
                String str5 = c0304c.f5561d;
                int i12 = c0304c.f5560c;
                Boolean bool2 = c0304c.f5574s;
                Boolean bool3 = c0304c.f5575t;
                if (bool3 != null) {
                    z9 = bool3.booleanValue();
                } else {
                    z9 = false;
                }
                String str6 = c0304c.f5576u;
                String str7 = c0304c.f5577v;
                if (str7 != null) {
                    componentName = ComponentName.unflattenFromString(str7);
                }
                ComponentName componentName2 = componentName;
                int i13 = i12;
                boolean z12 = z9;
                Integer num3 = c0304c.f5578w;
                List list = c0310i.f5600b;
                ArrayList arrayList = new ArrayList(AbstractC0438m.d0(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    F f8 = (F) it.next();
                    j.e(f8, "<this>");
                    String str8 = f8.f5516e;
                    String str9 = f8.f5515d;
                    C0999a c0999a10 = c0999a8;
                    C0999a c0999a11 = c0999a9;
                    long j5 = f8.f5512a;
                    Iterator it2 = it;
                    switch (f8.f5514c.ordinal()) {
                        case 0:
                            i4 = i13;
                            str = str5;
                            C0999a c0999a12 = new C0999a(j5, z8);
                            bool = bool2;
                            C0999a c0999a13 = new C0999a(f8.f5513b, z8);
                            j.e(str8, "<this>");
                            if (str8.equals("true")) {
                                z10 = true;
                            } else if (str8.equals("false")) {
                                z10 = false;
                            } else {
                                throw new IllegalArgumentException("The string doesn't represent a boolean value: ".concat(str8));
                            }
                            c0777a = new C0777a(c0999a12, c0999a13, str9, Boolean.valueOf(z10));
                            arrayList.add(c0777a);
                            it = it2;
                            bool2 = bool;
                            c0999a8 = c0999a10;
                            c0999a9 = c0999a11;
                            i13 = i4;
                            str5 = str;
                        case 1:
                            i4 = i13;
                            str = str5;
                            c0777a = new C0777a(new C0999a(j5, z8), new C0999a(f8.f5513b, z8), str9, Byte.valueOf(Byte.parseByte(str8)));
                            bool = bool2;
                            arrayList.add(c0777a);
                            it = it2;
                            bool2 = bool;
                            c0999a8 = c0999a10;
                            c0999a9 = c0999a11;
                            i13 = i4;
                            str5 = str;
                        case g.FLOAT_FIELD_NUMBER /* 2 */:
                            i4 = i13;
                            str = str5;
                            c0777a = new C0777a(new C0999a(j5, z8), new C0999a(f8.f5513b, z8), str9, Character.valueOf(str8.charAt(0)));
                            bool = bool2;
                            arrayList.add(c0777a);
                            it = it2;
                            bool2 = bool;
                            c0999a8 = c0999a10;
                            c0999a9 = c0999a11;
                            i13 = i4;
                            str5 = str;
                        case g.INTEGER_FIELD_NUMBER /* 3 */:
                            i4 = i13;
                            str = str5;
                            c0777a = new C0777a(new C0999a(j5, z8), new C0999a(f8.f5513b, z8), str9, Double.valueOf(Double.parseDouble(str8)));
                            bool = bool2;
                            arrayList.add(c0777a);
                            it = it2;
                            bool2 = bool;
                            c0999a8 = c0999a10;
                            c0999a9 = c0999a11;
                            i13 = i4;
                            str5 = str;
                        case g.LONG_FIELD_NUMBER /* 4 */:
                            i4 = i13;
                            str = str5;
                            c0777a = new C0777a(new C0999a(j5, z8), new C0999a(f8.f5513b, z8), str9, Integer.valueOf(Integer.parseInt(str8)));
                            bool = bool2;
                            arrayList.add(c0777a);
                            it = it2;
                            bool2 = bool;
                            c0999a8 = c0999a10;
                            c0999a9 = c0999a11;
                            i13 = i4;
                            str5 = str;
                        case g.STRING_FIELD_NUMBER /* 5 */:
                            i4 = i13;
                            str = str5;
                            c0777a = new C0777a(new C0999a(j5, z8), new C0999a(f8.f5513b, z8), str9, Float.valueOf(Float.parseFloat(str8)));
                            bool = bool2;
                            arrayList.add(c0777a);
                            it = it2;
                            bool2 = bool;
                            c0999a8 = c0999a10;
                            c0999a9 = c0999a11;
                            i13 = i4;
                            str5 = str;
                        case g.STRING_SET_FIELD_NUMBER /* 6 */:
                            i4 = i13;
                            str = str5;
                            c0777a = new C0777a(new C0999a(j5, z8), new C0999a(f8.f5513b, z8), str9, Short.valueOf(Short.parseShort(str8)));
                            bool = bool2;
                            arrayList.add(c0777a);
                            it = it2;
                            bool2 = bool;
                            c0999a8 = c0999a10;
                            c0999a9 = c0999a11;
                            i13 = i4;
                            str5 = str;
                        case g.DOUBLE_FIELD_NUMBER /* 7 */:
                            i4 = i13;
                            str = str5;
                            c0777a = new C0777a(new C0999a(j5, z8), new C0999a(f8.f5513b, z8), str9, str8);
                            bool = bool2;
                            arrayList.add(c0777a);
                            it = it2;
                            bool2 = bool;
                            c0999a8 = c0999a10;
                            c0999a9 = c0999a11;
                            i13 = i4;
                            str5 = str;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
                return new f(c0999a8, c0999a9, str5, i13, bool2, z12, str6, componentName2, num3, AbstractC0436k.S0(arrayList));
            case g.LONG_FIELD_NUMBER /* 4 */:
                C0999a c0999a14 = new C0999a(c0304c.f5558a, z8);
                C0999a c0999a15 = new C0999a(c0304c.f5559b, z8);
                String str10 = c0304c.f5561d;
                int i14 = c0304c.f5560c;
                boolean a3 = j.a(c0304c.f5579x, Boolean.TRUE);
                B b4 = c0304c.f5580y;
                if (b4 != null) {
                    nVar = n.valueOf(b4.name());
                } else {
                    nVar = null;
                }
                List<A> list2 = c0310i.f5601c;
                ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(list2, 10));
                for (A a4 : list2) {
                    j.e(a4, "<this>");
                    arrayList2.add(new C0880a(new C0999a(a4.f5499a, z8), new C0999a(a4.f5500b, z8), new C0999a(a4.f5502d, z8), n.valueOf(a4.f5501c.name())));
                    c0999a14 = c0999a14;
                    c0999a15 = c0999a15;
                }
                return new o(c0999a14, c0999a15, str10, i14, a3, nVar, AbstractC0436k.S0(arrayList2));
            case g.STRING_FIELD_NUMBER /* 5 */:
                C0999a c0999a16 = new C0999a(c0304c.f5558a, z8);
                C0999a c0999a17 = new C0999a(c0304c.f5559b, z8);
                String str11 = "";
                String str12 = c0304c.f5561d;
                int i15 = c0304c.f5560c;
                String str13 = c0304c.f5581z;
                j.b(str13);
                EnumC0306e enumC0306e = c0304c.f5548A;
                j.b(enumC0306e);
                f2.b valueOf2 = f2.b.valueOf(enumC0306e.name());
                u uVar = c0304c.f5549B;
                Integer num4 = c0304c.f5550C;
                String str14 = c0304c.f5551D;
                if (uVar == null) {
                    uVar = u.f5647d;
                }
                int ordinal = uVar.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        if (str14 != null) {
                            str11 = str14;
                        }
                        c0639b = new C0638a(str11);
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    if (num4 != null) {
                        i8 = num4.intValue();
                    } else {
                        i8 = 0;
                    }
                    c0639b = new C0639b(i8);
                }
                return new c(c0999a16, c0999a17, str12, i15, str13, valueOf2, c0639b);
            case g.STRING_SET_FIELD_NUMBER /* 6 */:
                C0999a c0999a18 = new C0999a(c0304c.f5558a, z8);
                C0999a c0999a19 = new C0999a(c0304c.f5559b, z8);
                String str15 = c0304c.f5561d;
                int i16 = c0304c.f5560c;
                Integer num5 = c0304c.f5555H;
                j.b(num5);
                int intValue = num5.intValue();
                H h8 = c0304c.f5552E;
                j.b(h8);
                f2.g valueOf3 = f2.g.valueOf(h8.name());
                String str16 = c0304c.f5553F;
                j.b(str16);
                String str17 = c0304c.f5554G;
                j.b(str17);
                return new h(c0999a18, c0999a19, str15, i16, valueOf3, str16, str17, intValue);
            case g.DOUBLE_FIELD_NUMBER /* 7 */:
                C0999a c0999a20 = new C0999a(c0304c.f5558a, z8);
                C0999a c0999a21 = new C0999a(c0304c.f5559b, z8);
                String str18 = c0304c.f5561d;
                int i17 = c0304c.f5560c;
                N n3 = c0304c.f5556I;
                if (n3 != null) {
                    lVar = l.valueOf(n3.name());
                }
                l lVar2 = lVar;
                j.b(lVar2);
                return new m(c0999a20, c0999a21, str18, i17, lVar2);
            case g.BYTES_FIELD_NUMBER /* 8 */:
                C0999a c0999a22 = new C0999a(c0304c.f5558a, z8);
                C0999a c0999a23 = new C0999a(c0304c.f5559b, z8);
                String str19 = c0304c.f5561d;
                int i18 = c0304c.f5560c;
                String str20 = c0304c.f5557J;
                if (str20 == null) {
                    str20 = "";
                }
                Boolean bool4 = c0304c.K;
                if (bool4 != null) {
                    z11 = bool4.booleanValue();
                }
                return new f2.j(c0999a22, c0999a23, str19, i18, str20, z11);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final GestureDescription a(GestureDescription.Builder builder) {
        GestureDescription build = builder.addStroke(f(1.0f, 1.0f)).addStroke(f(1.0f, 3.0f)).addStroke(f(2.0f, 2.0f)).build();
        j.d(build, "build(...)");
        return build;
    }

    public static final void b(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                Z5.a.a(th, th2);
            }
        }
    }

    public static Drawable c(Drawable drawable, Drawable drawable2, int i4, int i8) {
        if (drawable == null) {
            return drawable2;
        }
        if (drawable2 == null) {
            return drawable;
        }
        if (i4 == -1 && (i4 = drawable2.getIntrinsicWidth()) == -1) {
            i4 = drawable.getIntrinsicWidth();
        }
        if (i8 == -1 && (i8 = drawable2.getIntrinsicHeight()) == -1) {
            i8 = drawable.getIntrinsicHeight();
        }
        if (i4 > drawable.getIntrinsicWidth() || i8 > drawable.getIntrinsicHeight()) {
            float f8 = i4 / i8;
            if (f8 >= drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                i8 = (int) (intrinsicWidth / f8);
                i4 = intrinsicWidth;
            } else {
                i8 = drawable.getIntrinsicHeight();
                i4 = (int) (f8 * i8);
            }
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, drawable2});
        layerDrawable.setLayerSize(1, i4, i8);
        layerDrawable.setLayerGravity(1, 17);
        return layerDrawable;
    }

    public static final Z5.j d(String str) {
        j.e(str, "column");
        return new Z5.j(str, str);
    }

    public static Drawable e(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList != null) {
            drawable = drawable.mutate();
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        return drawable;
    }

    public static final GestureDescription.StrokeDescription f(float f8, float f9) {
        Path path = new Path();
        path.moveTo(f8, f9);
        return new GestureDescription.StrokeDescription(path, 0L, 1L);
    }

    public static final InterfaceC1642c g(Annotation annotation) {
        j.e(annotation, "<this>");
        Class<? extends Annotation> annotationType = annotation.annotationType();
        j.d(annotationType, "annotationType(...)");
        return n(annotationType);
    }

    public static int[] h(int[] iArr) {
        for (int i4 = 0; i4 < iArr.length; i4++) {
            int i8 = iArr[i4];
            if (i8 == 16842912) {
                return iArr;
            }
            if (i8 == 0) {
                int[] iArr2 = (int[]) iArr.clone();
                iArr2[i4] = 16842912;
                return iArr2;
            }
        }
        int[] copyOf = Arrays.copyOf(iArr, iArr.length + 1);
        copyOf[iArr.length] = 16842912;
        return copyOf;
    }

    public static ColorStateList i(Drawable drawable) {
        ColorStateList colorStateList;
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT >= 29 && Z0.h.n(drawable)) {
            colorStateList = Z0.h.d(drawable).getColorStateList();
            return colorStateList;
        }
        return null;
    }

    public static final SharedPreferences j(Context context) {
        j.e(context, "<this>");
        SharedPreferences sharedPreferences = context.getSharedPreferences("EventConfigPreferences", 0);
        j.d(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }

    public static final Class k(InterfaceC1642c interfaceC1642c) {
        j.e(interfaceC1642c, "<this>");
        Class d2 = ((InterfaceC1285d) interfaceC1642c).d();
        j.c(d2, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return d2;
    }

    public static final Class l(InterfaceC1642c interfaceC1642c) {
        j.e(interfaceC1642c, "<this>");
        Class d2 = ((InterfaceC1285d) interfaceC1642c).d();
        if (!d2.isPrimitive()) {
            return d2;
        }
        String name = d2.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return Double.class;
                }
                return d2;
            case 104431:
                if (name.equals("int")) {
                    return Integer.class;
                }
                return d2;
            case 3039496:
                if (name.equals("byte")) {
                    return Byte.class;
                }
                return d2;
            case 3052374:
                if (name.equals("char")) {
                    return Character.class;
                }
                return d2;
            case 3327612:
                if (name.equals("long")) {
                    return Long.class;
                }
                return d2;
            case 3625364:
                if (name.equals("void")) {
                    return Void.class;
                }
                return d2;
            case 64711720:
                if (name.equals("boolean")) {
                    return Boolean.class;
                }
                return d2;
            case 97526364:
                if (name.equals("float")) {
                    return Float.class;
                }
                return d2;
            case 109413500:
                if (name.equals("short")) {
                    return Short.class;
                }
                return d2;
            default:
                return d2;
        }
    }

    public static final Class m(InterfaceC1642c interfaceC1642c) {
        j.e(interfaceC1642c, "<this>");
        Class d2 = ((InterfaceC1285d) interfaceC1642c).d();
        if (d2.isPrimitive()) {
            return d2;
        }
        String name = d2.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (!name.equals("java.lang.Integer")) {
                    return null;
                }
                return Integer.TYPE;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    public static final InterfaceC1642c n(Class cls) {
        j.e(cls, "<this>");
        return v.f13643a.b(cls);
    }

    public static final Point o(Integer num, Integer num2) {
        if (num != null && num2 != null) {
            return new Point(num.intValue(), num2.intValue());
        }
        return null;
    }

    public static R.g p(E0.a aVar, String str) {
        n1.g gVar = new n1.g();
        j.e(aVar, "<this>");
        j.e(str, "tableName");
        return new R.g(aVar, str, gVar);
    }

    public static Rect q(Rect rect, Rect rect2) {
        return new Rect(AbstractC0832f.f(rect.left - 1, rect2.left, rect2.right), AbstractC0832f.f(rect.top - 1, rect2.top, rect2.bottom), AbstractC0832f.f(rect.right + 1, rect2.left, rect2.right), AbstractC0832f.f(rect.bottom + 1, rect2.top, rect2.bottom));
    }

    public static final boolean r() {
        if (Build.VERSION.SDK_INT == 35 && j.a(Build.BRAND, "google")) {
            String str = Build.MODEL;
            j.d(str, "MODEL");
            String lowerCase = str.toLowerCase(Locale.ROOT);
            j.d(lowerCase, "toLowerCase(...)");
            if (I7.m.b0(lowerCase, "pixel", false)) {
                return true;
            }
        }
        return false;
    }

    public static float s(float f8, float f9, float f10) {
        return (f10 * f9) + ((1.0f - f10) * f8);
    }

    public static final float t(AbstractC1473d abstractC1473d, float f8, float f9) {
        j.e(abstractC1473d, "<this>");
        return abstractC1473d.b() * (f9 - f8);
    }

    public static final int u(AbstractC1473d abstractC1473d, int i4) {
        j.e(abstractC1473d, "<this>");
        return abstractC1473d.d(i4 - 5, i4 + 6);
    }

    public static final PointF v(C1474e c1474e, RectF rectF) {
        j.e(c1474e, "<this>");
        j.e(rectF, "area");
        return new PointF(t(c1474e, rectF.left, rectF.right), t(c1474e, rectF.top, rectF.bottom));
    }

    public static int w(double d2) {
        if (!Double.isNaN(d2)) {
            if (d2 > 2.147483647E9d) {
                return Integer.MAX_VALUE;
            }
            if (d2 < -2.147483648E9d) {
                return Integer.MIN_VALUE;
            }
            return (int) Math.round(d2);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    public static int x(float f8) {
        if (!Float.isNaN(f8)) {
            return Math.round(f8);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    public static final Object y(InterfaceC1164c interfaceC1164c) {
        Thread.interrupted();
        return AbstractC0166y.t(C0623i.f10448d, new C1682B(interfaceC1164c, null));
    }

    public static final Point z(Point point, double d2) {
        if (d2 == 1.0d) {
            return point;
        }
        return new Point(w(point.x * d2), w(point.y * d2));
    }
}
