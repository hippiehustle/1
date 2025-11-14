package I6;

import a6.AbstractC0434i;
import a6.AbstractC0437l;
import a6.AbstractC0438m;
import f7.C0722b;
import f7.C0723c;
import f7.C0725e;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import n6.InterfaceC1162a;
import n6.InterfaceC1163b;
import n6.InterfaceC1164c;
import n6.InterfaceC1165d;
import n6.InterfaceC1166e;
import n6.InterfaceC1167f;
import u6.InterfaceC1642c;
import w6.InterfaceC1718e;

/* renamed from: I6.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0065d {

    /* renamed from: a, reason: collision with root package name */
    public static final List f2192a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f2193b;

    /* renamed from: c, reason: collision with root package name */
    public static final Map f2194c;

    /* renamed from: d, reason: collision with root package name */
    public static final Map f2195d;

    static {
        o6.w wVar = o6.v.f13643a;
        int i4 = 0;
        List<InterfaceC1642c> X8 = AbstractC0437l.X(wVar.b(Boolean.TYPE), wVar.b(Byte.TYPE), wVar.b(Character.TYPE), wVar.b(Double.TYPE), wVar.b(Float.TYPE), wVar.b(Integer.TYPE), wVar.b(Long.TYPE), wVar.b(Short.TYPE));
        f2192a = X8;
        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(X8, 10));
        for (InterfaceC1642c interfaceC1642c : X8) {
            arrayList.add(new Z5.j(h2.a.l(interfaceC1642c), h2.a.m(interfaceC1642c)));
        }
        f2193b = a6.x.R0(arrayList);
        List<InterfaceC1642c> list = f2192a;
        ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(list, 10));
        for (InterfaceC1642c interfaceC1642c2 : list) {
            arrayList2.add(new Z5.j(h2.a.m(interfaceC1642c2), h2.a.l(interfaceC1642c2)));
        }
        f2194c = a6.x.R0(arrayList2);
        List X9 = AbstractC0437l.X(InterfaceC1162a.class, InterfaceC1163b.class, InterfaceC1164c.class, InterfaceC1165d.class, InterfaceC1166e.class, InterfaceC1167f.class, InterfaceC1718e.class, InterfaceC1718e.class, InterfaceC1718e.class, InterfaceC1718e.class, InterfaceC1718e.class, InterfaceC1718e.class, InterfaceC1718e.class, InterfaceC1718e.class, InterfaceC1718e.class, InterfaceC1718e.class, InterfaceC1718e.class, InterfaceC1718e.class, InterfaceC1718e.class, InterfaceC1718e.class, InterfaceC1718e.class, InterfaceC1718e.class, InterfaceC1718e.class);
        ArrayList arrayList3 = new ArrayList(AbstractC0438m.d0(X9, 10));
        for (Object obj : X9) {
            int i8 = i4 + 1;
            if (i4 >= 0) {
                arrayList3.add(new Z5.j((Class) obj, Integer.valueOf(i4)));
                i4 = i8;
            } else {
                AbstractC0437l.c0();
                throw null;
            }
        }
        f2195d = a6.x.R0(arrayList3);
    }

    public static final C0722b a(Class cls) {
        o6.j.e(cls, "<this>");
        if (!cls.isPrimitive()) {
            if (!cls.isArray()) {
                if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null && cls.getSimpleName().length() != 0) {
                    Class<?> declaringClass = cls.getDeclaringClass();
                    if (declaringClass != null) {
                        return a(declaringClass).d(C0725e.e(cls.getSimpleName()));
                    }
                    C0723c c0723c = new C0723c(cls.getName());
                    return new C0722b(c0723c.b(), c0723c.f10797a.f());
                }
                C0723c c0723c2 = new C0723c(cls.getName());
                return new C0722b(c0723c2.b(), E2.d.U(c0723c2.f10797a.f()), true);
            }
            throw new IllegalArgumentException("Can't compute ClassId for array type: " + cls);
        }
        throw new IllegalArgumentException("Can't compute ClassId for primitive type: " + cls);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0013. Please report as an issue. */
    public static final String b(Class cls) {
        o6.j.e(cls, "<this>");
        if (cls.isPrimitive()) {
            String name = cls.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return "D";
                    }
                    throw new IllegalArgumentException("Unsupported primitive type: " + cls);
                case 104431:
                    if (name.equals("int")) {
                        return "I";
                    }
                    throw new IllegalArgumentException("Unsupported primitive type: " + cls);
                case 3039496:
                    if (name.equals("byte")) {
                        return "B";
                    }
                    throw new IllegalArgumentException("Unsupported primitive type: " + cls);
                case 3052374:
                    if (name.equals("char")) {
                        return "C";
                    }
                    throw new IllegalArgumentException("Unsupported primitive type: " + cls);
                case 3327612:
                    if (name.equals("long")) {
                        return "J";
                    }
                    throw new IllegalArgumentException("Unsupported primitive type: " + cls);
                case 3625364:
                    if (name.equals("void")) {
                        return "V";
                    }
                    throw new IllegalArgumentException("Unsupported primitive type: " + cls);
                case 64711720:
                    if (name.equals("boolean")) {
                        return "Z";
                    }
                    throw new IllegalArgumentException("Unsupported primitive type: " + cls);
                case 97526364:
                    if (name.equals("float")) {
                        return "F";
                    }
                    throw new IllegalArgumentException("Unsupported primitive type: " + cls);
                case 109413500:
                    if (name.equals("short")) {
                        return "S";
                    }
                    throw new IllegalArgumentException("Unsupported primitive type: " + cls);
                default:
                    throw new IllegalArgumentException("Unsupported primitive type: " + cls);
            }
        }
        if (cls.isArray()) {
            return I7.v.Y(cls.getName(), '.', '/');
        }
        return "L" + I7.v.Y(cls.getName(), '.', '/') + ';';
    }

    public static final List c(Type type) {
        o6.j.e(type, "<this>");
        if (!(type instanceof ParameterizedType)) {
            return a6.s.f7766d;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() == null) {
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            o6.j.d(actualTypeArguments, "getActualTypeArguments(...)");
            return AbstractC0434i.i1(actualTypeArguments);
        }
        return H7.m.Y(new H7.h(H7.m.T(type, C0064c.f2187e), C0064c.f2188f, H7.r.f2078l));
    }

    public static final ClassLoader d(Class cls) {
        o6.j.e(cls, "<this>");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader == null) {
            ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
            o6.j.d(systemClassLoader, "getSystemClassLoader(...)");
            return systemClassLoader;
        }
        return classLoader;
    }
}
