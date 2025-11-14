package e7;

import F6.B;
import a.AbstractC0405a;
import a6.AbstractC0436k;
import a6.AbstractC0437l;
import a6.AbstractC0438m;
import a7.C0439A;
import a7.C0440a;
import a7.C0450k;
import a7.C0453n;
import a7.E;
import a7.I;
import a7.T;
import a7.b0;
import c7.C0583b;
import c7.InterfaceC0588g;
import d7.k;
import g7.AbstractC0793b;
import g7.C0797f;
import g7.C0799h;
import g7.n;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import o6.j;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final C0799h f10671a;

    static {
        C0799h c0799h = new C0799h();
        c0799h.a(k.f10512a);
        c0799h.a(k.f10513b);
        c0799h.a(k.f10514c);
        c0799h.a(k.f10515d);
        c0799h.a(k.f10516e);
        c0799h.a(k.f10517f);
        c0799h.a(k.f10518g);
        c0799h.a(k.f10519h);
        c0799h.a(k.f10520i);
        c0799h.a(k.j);
        c0799h.a(k.k);
        c0799h.a(k.f10521l);
        c0799h.a(k.f10522m);
        c0799h.a(k.f10523n);
        f10671a = c0799h;
    }

    public static e a(C0453n c0453n, InterfaceC0588g interfaceC0588g, B b4) {
        String str;
        String v02;
        j.e(c0453n, "proto");
        j.e(interfaceC0588g, "nameResolver");
        j.e(b4, "typeTable");
        n nVar = k.f10512a;
        j.d(nVar, "constructorSignature");
        d7.c cVar = (d7.c) E2.d.t(c0453n, nVar);
        if (cVar != null && (cVar.f10462e & 1) == 1) {
            str = interfaceC0588g.getString(cVar.f10463f);
        } else {
            str = "<init>";
        }
        if (cVar != null && (cVar.f10462e & 2) == 2) {
            v02 = interfaceC0588g.getString(cVar.f10464g);
        } else {
            List<b0> list = c0453n.f8192h;
            j.d(list, "getValueParameterList(...)");
            ArrayList arrayList = new ArrayList(AbstractC0438m.d0(list, 10));
            for (b0 b0Var : list) {
                j.b(b0Var);
                String e9 = e(AbstractC0405a.G0(b0Var, b4), interfaceC0588g);
                if (e9 == null) {
                    return null;
                }
                arrayList.add(e9);
            }
            v02 = AbstractC0436k.v0(arrayList, "", "(", ")V", null, 56);
        }
        return new e(str, v02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r4 == null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static d b(I i4, InterfaceC0588g interfaceC0588g, B b4, boolean z8) {
        d7.b bVar;
        int i8;
        String e9;
        j.e(i4, "proto");
        j.e(interfaceC0588g, "nameResolver");
        j.e(b4, "typeTable");
        n nVar = k.f10515d;
        j.d(nVar, "propertySignature");
        d7.e eVar = (d7.e) E2.d.t(i4, nVar);
        if (eVar != null) {
            if ((eVar.f10475e & 1) == 1) {
                bVar = eVar.f10476f;
            } else {
                bVar = null;
            }
            if (bVar != null || !z8) {
                if (bVar != null && (bVar.f10456e & 1) == 1) {
                    i8 = bVar.f10457f;
                } else {
                    i8 = i4.f7858i;
                }
                if (bVar != null && (bVar.f10456e & 2) == 2) {
                    e9 = interfaceC0588g.getString(bVar.f10458g);
                } else {
                    e9 = e(AbstractC0405a.s0(i4, b4), interfaceC0588g);
                }
                return new d(interfaceC0588g.getString(i8), e9);
            }
        }
        return null;
    }

    public static e c(C0439A c0439a, InterfaceC0588g interfaceC0588g, B b4) {
        int i4;
        String r8;
        j.e(c0439a, "proto");
        j.e(interfaceC0588g, "nameResolver");
        j.e(b4, "typeTable");
        n nVar = k.f10513b;
        j.d(nVar, "methodSignature");
        d7.c cVar = (d7.c) E2.d.t(c0439a, nVar);
        if (cVar != null && (cVar.f10462e & 1) == 1) {
            i4 = cVar.f10463f;
        } else {
            i4 = c0439a.f7782i;
        }
        if (cVar != null && (cVar.f10462e & 2) == 2) {
            r8 = interfaceC0588g.getString(cVar.f10464g);
        } else {
            List Y = AbstractC0437l.Y(AbstractC0405a.j0(c0439a, b4));
            List<b0> list = c0439a.f7790s;
            j.d(list, "getValueParameterList(...)");
            ArrayList arrayList = new ArrayList(AbstractC0438m.d0(list, 10));
            for (b0 b0Var : list) {
                j.b(b0Var);
                arrayList.add(AbstractC0405a.G0(b0Var, b4));
            }
            ArrayList C02 = AbstractC0436k.C0(Y, arrayList);
            ArrayList arrayList2 = new ArrayList(AbstractC0438m.d0(C02, 10));
            Iterator it = C02.iterator();
            while (it.hasNext()) {
                String e9 = e((T) it.next(), interfaceC0588g);
                if (e9 != null) {
                    arrayList2.add(e9);
                } else {
                    return null;
                }
            }
            String e10 = e(AbstractC0405a.r0(c0439a, b4), interfaceC0588g);
            if (e10 == null) {
                return null;
            }
            r8 = A.j.r(new StringBuilder(), AbstractC0436k.v0(arrayList2, "", "(", ")", null, 56), e10);
        }
        return new e(interfaceC0588g.getString(i4), r8);
    }

    public static final boolean d(I i4) {
        j.e(i4, "proto");
        C0583b c0583b = c.f10662a;
        Object k = i4.k(k.f10516e);
        j.d(k, "getExtension(...)");
        return c0583b.c(((Number) k).intValue()).booleanValue();
    }

    public static String e(T t8, InterfaceC0588g interfaceC0588g) {
        if (t8.p()) {
            return b.b(interfaceC0588g.q(t8.f7939l));
        }
        return null;
    }

    public static final Z5.j f(String[] strArr, String[] strArr2) {
        j.e(strArr2, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(a.a(strArr));
        f g8 = g(byteArrayInputStream, strArr2);
        C0440a c0440a = C0450k.f8143P;
        c0440a.getClass();
        C0797f c0797f = new C0797f(byteArrayInputStream);
        AbstractC0793b abstractC0793b = (AbstractC0793b) c0440a.a(c0797f, f10671a);
        try {
            c0797f.a(0);
            if (abstractC0793b.b()) {
                return new Z5.j(g8, (C0450k) abstractC0793b);
            }
            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
            invalidProtocolBufferException.f12155d = abstractC0793b;
            throw invalidProtocolBufferException;
        } catch (InvalidProtocolBufferException e9) {
            e9.f12155d = abstractC0793b;
            throw e9;
        }
    }

    public static f g(ByteArrayInputStream byteArrayInputStream, String[] strArr) {
        d7.j jVar = (d7.j) d7.j.k.b(byteArrayInputStream, f10671a);
        j.d(jVar, "parseDelimitedFrom(...)");
        return new f(jVar, strArr);
    }

    public static final Z5.j h(String[] strArr, String[] strArr2) {
        j.e(strArr, "data");
        j.e(strArr2, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(a.a(strArr));
        f g8 = g(byteArrayInputStream, strArr2);
        C0440a c0440a = E.f7807o;
        c0440a.getClass();
        C0797f c0797f = new C0797f(byteArrayInputStream);
        AbstractC0793b abstractC0793b = (AbstractC0793b) c0440a.a(c0797f, f10671a);
        try {
            c0797f.a(0);
            if (abstractC0793b.b()) {
                return new Z5.j(g8, (E) abstractC0793b);
            }
            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
            invalidProtocolBufferException.f12155d = abstractC0793b;
            throw invalidProtocolBufferException;
        } catch (InvalidProtocolBufferException e9) {
            e9.f12155d = abstractC0793b;
            throw e9;
        }
    }
}
