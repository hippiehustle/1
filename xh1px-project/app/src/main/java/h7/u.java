package h7;

import C6.AbstractC0015p;
import C6.C0014o;
import I7.v;
import T1.C0310i;
import T1.C0313l;
import a6.AbstractC0436k;
import a6.AbstractC0438m;
import a7.B;
import a7.h0;
import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import f7.C0722b;
import f7.C0723c;
import f7.C0725e;
import h6.AbstractC0837b;
import i.AbstractC0863b;
import j2.C0902b;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k2.C0952b;
import k2.C0953c;
import l1.C0999a;
import m1.InterfaceC1052b;
import n6.InterfaceC1162a;
import p7.C1324f;
import p7.C1330l;
import p7.InterfaceC1333o;
import p7.InterfaceC1335q;
import s7.x;
import u6.InterfaceC1645f;
import w6.AbstractC1731s;
import w6.m0;
import w6.y0;
import x6.InterfaceC1803g;

/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f11531a = 0;

    public static final boolean a(ArrayList arrayList, long j) {
        Object obj;
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((InterfaceC1052b) obj).getId() == j) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (obj != null) {
            return true;
        }
        return false;
    }

    public static final u0.s b(Context context, Class cls, String str) {
        if (!I7.m.j0(str)) {
            if (!str.equals(":memory:")) {
                return new u0.s(context, cls, str);
            }
            throw new IllegalArgumentException("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
    }

    public static final C0014o c(h0 h0Var) {
        int i4;
        if (h0Var == null) {
            i4 = -1;
        } else {
            i4 = x.f14634b[h0Var.ordinal()];
        }
        switch (i4) {
            case 1:
                C0014o c0014o = AbstractC0015p.f757d;
                o6.j.d(c0014o, "INTERNAL");
                return c0014o;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                C0014o c0014o2 = AbstractC0015p.f754a;
                o6.j.d(c0014o2, "PRIVATE");
                return c0014o2;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                C0014o c0014o3 = AbstractC0015p.f755b;
                o6.j.d(c0014o3, "PRIVATE_TO_THIS");
                return c0014o3;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                C0014o c0014o4 = AbstractC0015p.f756c;
                o6.j.d(c0014o4, "PROTECTED");
                return c0014o4;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                C0014o c0014o5 = AbstractC0015p.f758e;
                o6.j.d(c0014o5, "PUBLIC");
                return c0014o5;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                C0014o c0014o6 = AbstractC0015p.f759f;
                o6.j.d(c0014o6, "LOCAL");
                return c0014o6;
            default:
                C0014o c0014o7 = AbstractC0015p.f754a;
                o6.j.d(c0014o7, "PRIVATE");
                return c0014o7;
        }
    }

    public static /* synthetic */ Collection d(InterfaceC1335q interfaceC1335q, C1324f c1324f, int i4) {
        if ((i4 & 1) != 0) {
            c1324f = C1324f.f13817m;
        }
        InterfaceC1333o.f13843a.getClass();
        return interfaceC1335q.a(c1324f, C1330l.f13836e);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, Z5.g] */
    public static final Field e(u6.s sVar) {
        o6.j.e(sVar, "<this>");
        m0 c6 = y0.c(sVar);
        if (c6 != null) {
            return (Field) c6.j.getValue();
        }
        return null;
    }

    public static final Method f(InterfaceC1645f interfaceC1645f) {
        Member member;
        InterfaceC1803g h8;
        o6.j.e(interfaceC1645f, "<this>");
        AbstractC1731s a3 = y0.a(interfaceC1645f);
        if (a3 != null && (h8 = a3.h()) != null) {
            member = h8.b();
        } else {
            member = null;
        }
        if (!(member instanceof Method)) {
            return null;
        }
        return (Method) member;
    }

    public static final int g(B b4) {
        int i4;
        if (b4 == null) {
            i4 = -1;
        } else {
            i4 = x.f14633a[b4.ordinal()];
        }
        if (i4 != 1) {
            int i8 = 2;
            if (i4 != 2) {
                i8 = 3;
                if (i4 != 3) {
                    i8 = 4;
                    if (i4 != 4) {
                    }
                }
            }
            return i8;
        }
        return 1;
    }

    public static void h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
    }

    public static final String i(C0725e c0725e) {
        o6.j.e(c0725e, "<this>");
        String b4 = c0725e.b();
        o6.j.d(b4, "asString(...)");
        if (!AbstractC0851n.f11517a.contains(b4)) {
            int i4 = 0;
            while (true) {
                if (i4 < b4.length()) {
                    char charAt = b4.charAt(i4);
                    if (!Character.isLetterOrDigit(charAt) && charAt != '_') {
                        break;
                    }
                    i4++;
                } else if (b4.length() != 0 && Character.isJavaIdentifierStart(b4.codePointAt(0))) {
                    String b9 = c0725e.b();
                    o6.j.d(b9, "asString(...)");
                    return b9;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        String b10 = c0725e.b();
        o6.j.d(b10, "asString(...)");
        sb.append("`".concat(b10));
        sb.append('`');
        return sb.toString();
    }

    public static final String j(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0725e c0725e = (C0725e) it.next();
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(i(c0725e));
        }
        return sb.toString();
    }

    public static final String k(String str, String str2, String str3, String str4, String str5) {
        o6.j.e(str, "lowerRendered");
        o6.j.e(str2, "lowerPrefix");
        o6.j.e(str3, "upperRendered");
        o6.j.e(str4, "upperPrefix");
        o6.j.e(str5, "foldedPrefix");
        if (v.a0(str, str2) && v.a0(str3, str4)) {
            String substring = str.substring(str2.length());
            o6.j.d(substring, "substring(...)");
            String substring2 = str3.substring(str4.length());
            o6.j.d(substring2, "substring(...)");
            String concat = str5.concat(substring);
            if (substring.equals(substring2)) {
                return concat;
            }
            if (p(substring, substring2)) {
                return concat + '!';
            }
            return null;
        }
        return null;
    }

    public static void l(Animation animation, K2.a aVar, InterfaceC1162a interfaceC1162a, int i4) {
        if ((i4 & 1) != 0) {
            aVar = null;
        }
        if ((i4 & 2) != 0) {
            interfaceC1162a = null;
        }
        o6.j.e(animation, "<this>");
        animation.setAnimationListener(new k1.a(aVar, interfaceC1162a));
    }

    public static final C0722b m(String str) {
        String str2;
        boolean a02 = v.a0(str, ".");
        if (a02) {
            str = str.substring(1);
            o6.j.d(str, "substring(...)");
        }
        int m02 = I7.m.m0(str, '/', 6);
        if (m02 == -1) {
            str2 = "";
        } else {
            String substring = str.substring(0, m02);
            o6.j.d(substring, "substring(...)");
            str2 = substring;
        }
        return new C0722b(new C0723c(v.Y(str2, '/', '.')), new C0723c(I7.m.t0('/', str, str)), a02);
    }

    public static final C0952b n(C0313l c0313l, boolean z8) {
        o6.j.e(c0313l, "<this>");
        T1.x xVar = c0313l.f5604a;
        C0999a c0999a = new C0999a(xVar.f5652a, z8);
        C0999a c0999a2 = new C0999a(xVar.f5653b, z8);
        String str = xVar.f5654c;
        int i4 = xVar.f5655d;
        int i8 = xVar.f5656e;
        boolean z9 = xVar.f5657f;
        boolean a3 = o6.j.a(xVar.f5659h, Boolean.TRUE);
        List list = c0313l.f5605b;
        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(h2.a.B((C0310i) it.next(), z8));
        }
        ArrayList S02 = AbstractC0436k.S0(AbstractC0863b.t(arrayList));
        List list2 = c0313l.f5606c;
        ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add((C0902b) AbstractC0837b.r((T1.r) it2.next(), z8));
        }
        return new C0952b(c0999a, c0999a2, str, i4, S02, AbstractC0436k.S0(AbstractC0863b.t(arrayList2)), z9, i8, a3);
    }

    public static final C0953c o(C0313l c0313l, boolean z8) {
        o6.j.e(c0313l, "<this>");
        T1.x xVar = c0313l.f5604a;
        C0999a c0999a = new C0999a(xVar.f5652a, z8);
        C0999a c0999a2 = new C0999a(xVar.f5653b, z8);
        String str = xVar.f5654c;
        int i4 = xVar.f5655d;
        boolean z9 = xVar.f5657f;
        List list = c0313l.f5605b;
        ArrayList arrayList = new ArrayList(AbstractC0438m.d0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(h2.a.B((C0310i) it.next(), z8));
        }
        ArrayList S02 = AbstractC0436k.S0(AbstractC0863b.t(arrayList));
        List list2 = c0313l.f5606c;
        ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add((j2.g) AbstractC0837b.r((T1.r) it2.next(), z8));
        }
        return new C0953c(c0999a, c0999a2, str, i4, S02, AbstractC0436k.S0(arrayList2), z9);
    }

    public static final boolean p(String str, String str2) {
        o6.j.e(str, "lower");
        o6.j.e(str2, "upper");
        if (!str.equals(v.Z(str2, "?", ""))) {
            if (!v.W(str2, "?") || !o6.j.a(str.concat("?"), str2)) {
                if (!o6.j.a("(" + str + ")?", str2)) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }
}
