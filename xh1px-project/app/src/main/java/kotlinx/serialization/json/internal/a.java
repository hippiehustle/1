package kotlinx.serialization.json.internal;

import S6.e;
import X6.r;
import X7.f;
import X7.i;
import Z7.A;
import Z7.V;
import a6.AbstractC0436k;
import a6.AbstractC0437l;
import a8.d;
import a8.h;
import a8.k;
import a8.o;
import a8.u;
import a8.y;
import b8.l;
import b8.m;
import b8.n;
import b8.s;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import kotlinx.serialization.SerializationException;
import o6.j;
import o6.v;
import o6.w;
import q4.X;

/* loaded from: classes.dex */
public abstract class a implements h, Y7.b, Y7.a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f12162a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public boolean f12163b;

    /* renamed from: c, reason: collision with root package name */
    public final a8.b f12164c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12165d;

    /* renamed from: e, reason: collision with root package name */
    public final r f12166e;

    public a(a8.b bVar, String str) {
        this.f12164c = bVar;
        this.f12165d = str;
        this.f12166e = bVar.f8280a;
    }

    @Override // Y7.b
    public final String A() {
        return P(T());
    }

    @Override // Y7.a
    public final String B(f fVar, int i4) {
        j.e(fVar, "descriptor");
        return P(R(fVar, i4));
    }

    @Override // Y7.b
    public final float C() {
        return K(T());
    }

    @Override // Y7.a
    public final byte D(V v8, int i4) {
        j.e(v8, "descriptor");
        return H(R(v8, i4));
    }

    @Override // Y7.b
    public final double E() {
        return J(T());
    }

    public final boolean F(Object obj) {
        Boolean bool;
        String str = (String) obj;
        j.e(str, "tag");
        a8.j c6 = c(str);
        if (c6 instanceof y) {
            y yVar = (y) c6;
            try {
                A a3 = k.f8289a;
                j.e(yVar, "<this>");
                String g8 = yVar.g();
                String[] strArr = s.f9288a;
                j.e(g8, "<this>");
                if (g8.equalsIgnoreCase("true")) {
                    bool = Boolean.TRUE;
                } else if (g8.equalsIgnoreCase("false")) {
                    bool = Boolean.FALSE;
                } else {
                    bool = null;
                }
                if (bool != null) {
                    return bool.booleanValue();
                }
                W(yVar, "boolean", str);
                throw null;
            } catch (IllegalArgumentException unused) {
                W(yVar, "boolean", str);
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        w wVar = v.f13643a;
        sb.append(wVar.b(y.class).c());
        sb.append(", but had ");
        sb.append(wVar.b(c6.getClass()).c());
        sb.append(" as the serialized body of boolean at element: ");
        sb.append(V(str));
        throw b8.j.d(-1, sb.toString(), c6.toString());
    }

    @Override // Y7.a
    public final Y7.b G(V v8, int i4) {
        j.e(v8, "descriptor");
        return L(R(v8, i4), v8.j(i4));
    }

    public final byte H(Object obj) {
        Byte b4;
        String str = (String) obj;
        j.e(str, "tag");
        a8.j c6 = c(str);
        if (c6 instanceof y) {
            y yVar = (y) c6;
            try {
                long f8 = k.f(yVar);
                if (-128 <= f8 && f8 <= 127) {
                    b4 = Byte.valueOf((byte) f8);
                } else {
                    b4 = null;
                }
                if (b4 != null) {
                    return b4.byteValue();
                }
                W(yVar, "byte", str);
                throw null;
            } catch (IllegalArgumentException unused) {
                W(yVar, "byte", str);
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        w wVar = v.f13643a;
        sb.append(wVar.b(y.class).c());
        sb.append(", but had ");
        sb.append(wVar.b(c6.getClass()).c());
        sb.append(" as the serialized body of byte at element: ");
        sb.append(V(str));
        throw b8.j.d(-1, sb.toString(), c6.toString());
    }

    public final char I(Object obj) {
        String str = (String) obj;
        j.e(str, "tag");
        a8.j c6 = c(str);
        if (c6 instanceof y) {
            y yVar = (y) c6;
            try {
                String g8 = yVar.g();
                j.e(g8, "<this>");
                int length = g8.length();
                if (length != 0) {
                    if (length == 1) {
                        return g8.charAt(0);
                    }
                    throw new IllegalArgumentException("Char sequence has more than one element.");
                }
                throw new NoSuchElementException("Char sequence is empty.");
            } catch (IllegalArgumentException unused) {
                W(yVar, "char", str);
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        w wVar = v.f13643a;
        sb.append(wVar.b(y.class).c());
        sb.append(", but had ");
        sb.append(wVar.b(c6.getClass()).c());
        sb.append(" as the serialized body of char at element: ");
        sb.append(V(str));
        throw b8.j.d(-1, sb.toString(), c6.toString());
    }

    public final double J(Object obj) {
        String str = (String) obj;
        j.e(str, "tag");
        a8.j c6 = c(str);
        if (c6 instanceof y) {
            y yVar = (y) c6;
            try {
                A a3 = k.f8289a;
                j.e(yVar, "<this>");
                double parseDouble = Double.parseDouble(yVar.g());
                this.f12164c.f8280a.getClass();
                if (Math.abs(parseDouble) <= Double.MAX_VALUE) {
                    return parseDouble;
                }
                throw b8.j.a(Double.valueOf(parseDouble), str, d().toString());
            } catch (IllegalArgumentException unused) {
                W(yVar, "double", str);
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        w wVar = v.f13643a;
        sb.append(wVar.b(y.class).c());
        sb.append(", but had ");
        sb.append(wVar.b(c6.getClass()).c());
        sb.append(" as the serialized body of double at element: ");
        sb.append(V(str));
        throw b8.j.d(-1, sb.toString(), c6.toString());
    }

    public final float K(Object obj) {
        String str = (String) obj;
        j.e(str, "tag");
        a8.j c6 = c(str);
        if (c6 instanceof y) {
            y yVar = (y) c6;
            try {
                A a3 = k.f8289a;
                j.e(yVar, "<this>");
                float parseFloat = Float.parseFloat(yVar.g());
                this.f12164c.f8280a.getClass();
                if (Math.abs(parseFloat) <= Float.MAX_VALUE) {
                    return parseFloat;
                }
                throw b8.j.a(Float.valueOf(parseFloat), str, d().toString());
            } catch (IllegalArgumentException unused) {
                W(yVar, "float", str);
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        w wVar = v.f13643a;
        sb.append(wVar.b(y.class).c());
        sb.append(", but had ");
        sb.append(wVar.b(c6.getClass()).c());
        sb.append(" as the serialized body of float at element: ");
        sb.append(V(str));
        throw b8.j.d(-1, sb.toString(), c6.toString());
    }

    public final Y7.b L(Object obj, f fVar) {
        String str = (String) obj;
        j.e(str, "tag");
        j.e(fVar, "inlineDescriptor");
        if (b8.r.a(fVar)) {
            a8.j c6 = c(str);
            String b4 = fVar.b();
            if (c6 instanceof y) {
                String g8 = ((y) c6).g();
                a8.b bVar = this.f12164c;
                j.e(bVar, "json");
                j.e(g8, "source");
                bVar.f8280a.getClass();
                return new b8.h(new e(g8), bVar);
            }
            StringBuilder sb = new StringBuilder("Expected ");
            w wVar = v.f13643a;
            sb.append(wVar.b(y.class).c());
            sb.append(", but had ");
            sb.append(wVar.b(c6.getClass()).c());
            sb.append(" as the serialized body of ");
            sb.append(b4);
            sb.append(" at element: ");
            sb.append(V(str));
            throw b8.j.d(-1, sb.toString(), c6.toString());
        }
        this.f12162a.add(str);
        return this;
    }

    public final int M(Object obj) {
        Integer num;
        String str = (String) obj;
        j.e(str, "tag");
        a8.j c6 = c(str);
        if (c6 instanceof y) {
            y yVar = (y) c6;
            try {
                long f8 = k.f(yVar);
                if (-2147483648L <= f8 && f8 <= 2147483647L) {
                    num = Integer.valueOf((int) f8);
                } else {
                    num = null;
                }
                if (num != null) {
                    return num.intValue();
                }
                W(yVar, "int", str);
                throw null;
            } catch (IllegalArgumentException unused) {
                W(yVar, "int", str);
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        w wVar = v.f13643a;
        sb.append(wVar.b(y.class).c());
        sb.append(", but had ");
        sb.append(wVar.b(c6.getClass()).c());
        sb.append(" as the serialized body of int at element: ");
        sb.append(V(str));
        throw b8.j.d(-1, sb.toString(), c6.toString());
    }

    public final long N(Object obj) {
        String str = (String) obj;
        j.e(str, "tag");
        a8.j c6 = c(str);
        if (c6 instanceof y) {
            y yVar = (y) c6;
            try {
                return k.f(yVar);
            } catch (IllegalArgumentException unused) {
                W(yVar, "long", str);
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        w wVar = v.f13643a;
        sb.append(wVar.b(y.class).c());
        sb.append(", but had ");
        sb.append(wVar.b(c6.getClass()).c());
        sb.append(" as the serialized body of long at element: ");
        sb.append(V(str));
        throw b8.j.d(-1, sb.toString(), c6.toString());
    }

    public final short O(Object obj) {
        Short sh;
        String str = (String) obj;
        j.e(str, "tag");
        a8.j c6 = c(str);
        if (c6 instanceof y) {
            y yVar = (y) c6;
            try {
                long f8 = k.f(yVar);
                if (-32768 <= f8 && f8 <= 32767) {
                    sh = Short.valueOf((short) f8);
                } else {
                    sh = null;
                }
                if (sh != null) {
                    return sh.shortValue();
                }
                W(yVar, "short", str);
                throw null;
            } catch (IllegalArgumentException unused) {
                W(yVar, "short", str);
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        w wVar = v.f13643a;
        sb.append(wVar.b(y.class).c());
        sb.append(", but had ");
        sb.append(wVar.b(c6.getClass()).c());
        sb.append(" as the serialized body of short at element: ");
        sb.append(V(str));
        throw b8.j.d(-1, sb.toString(), c6.toString());
    }

    public final String P(Object obj) {
        String str = (String) obj;
        j.e(str, "tag");
        a8.j c6 = c(str);
        if (c6 instanceof y) {
            y yVar = (y) c6;
            if (yVar instanceof o) {
                o oVar = (o) yVar;
                if (oVar.f8293d) {
                    return oVar.f8294e;
                }
                this.f12164c.f8280a.getClass();
                throw b8.j.d(-1, "String literal for key '" + str + "' should be quoted at element: " + V(str) + ".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", d().toString());
            }
            StringBuilder s8 = A.j.s("Expected string value for a non-null key '", str, "', got null literal instead at element: ");
            s8.append(V(str));
            throw b8.j.d(-1, s8.toString(), d().toString());
        }
        StringBuilder sb = new StringBuilder("Expected ");
        w wVar = v.f13643a;
        sb.append(wVar.b(y.class).c());
        sb.append(", but had ");
        sb.append(wVar.b(c6.getClass()).c());
        sb.append(" as the serialized body of string at element: ");
        sb.append(V(str));
        throw b8.j.d(-1, sb.toString(), c6.toString());
    }

    public String Q(f fVar, int i4) {
        j.e(fVar, "descriptor");
        return fVar.d(i4);
    }

    public final String R(f fVar, int i4) {
        j.e(fVar, "<this>");
        String Q5 = Q(fVar, i4);
        j.e(Q5, "nestedName");
        return Q5;
    }

    public abstract a8.j S();

    public final Object T() {
        ArrayList arrayList = this.f12162a;
        Object remove = arrayList.remove(AbstractC0437l.W(arrayList));
        this.f12163b = true;
        return remove;
    }

    public final String U() {
        ArrayList arrayList = this.f12162a;
        if (arrayList.isEmpty()) {
            return "$";
        }
        return AbstractC0436k.v0(arrayList, ".", "$.", null, null, 60);
    }

    public final String V(String str) {
        j.e(str, "currentTag");
        return U() + '.' + str;
    }

    public final void W(y yVar, String str, String str2) {
        String str3;
        if (I7.v.a0(str, "i")) {
            str3 = "an ";
        } else {
            str3 = "a ";
        }
        throw b8.j.d(-1, "Failed to parse literal '" + yVar + "' as " + str3.concat(str) + " value at element: " + V(str2), d().toString());
    }

    @Override // Y7.b
    public final long a() {
        return N(T());
    }

    @Override // Y7.a
    public final double b(V v8, int i4) {
        j.e(v8, "descriptor");
        return J(R(v8, i4));
    }

    public abstract a8.j c(String str);

    public final a8.j d() {
        a8.j c6;
        String str = (String) AbstractC0436k.y0(this.f12162a);
        if (str != null && (c6 = c(str)) != null) {
            return c6;
        }
        return S();
    }

    @Override // Y7.b
    public final boolean e() {
        return F(T());
    }

    @Override // Y7.b
    public boolean f() {
        return !(d() instanceof a8.r);
    }

    public void g(f fVar) {
        j.e(fVar, "descriptor");
    }

    @Override // Y7.b
    public final char h() {
        return I(T());
    }

    @Override // Y7.a
    public final long i(f fVar, int i4) {
        j.e(fVar, "descriptor");
        return N(R(fVar, i4));
    }

    @Override // Y7.b
    public Y7.a j(f fVar) {
        j.e(fVar, "descriptor");
        a8.j d2 = d();
        X e9 = fVar.e();
        boolean a3 = j.a(e9, i.f7074f);
        a8.b bVar = this.f12164c;
        if (!a3 && !(e9 instanceof X7.c)) {
            if (j.a(e9, i.f7075g)) {
                f f8 = b8.j.f(fVar.j(0), bVar.f8281b);
                X e10 = f8.e();
                if (!(e10 instanceof X7.e) && !j.a(e10, X7.h.f7072f)) {
                    bVar.f8280a.getClass();
                    throw b8.j.c(f8);
                }
                String b4 = fVar.b();
                if (d2 instanceof u) {
                    return new b8.o(bVar, (u) d2);
                }
                StringBuilder sb = new StringBuilder("Expected ");
                w wVar = v.f13643a;
                sb.append(wVar.b(u.class).c());
                sb.append(", but had ");
                sb.append(wVar.b(d2.getClass()).c());
                sb.append(" as the serialized body of ");
                sb.append(b4);
                sb.append(" at element: ");
                sb.append(U());
                throw b8.j.d(-1, sb.toString(), d2.toString());
            }
            String b9 = fVar.b();
            if (d2 instanceof u) {
                return new m(bVar, (u) d2, this.f12165d, 8);
            }
            StringBuilder sb2 = new StringBuilder("Expected ");
            w wVar2 = v.f13643a;
            sb2.append(wVar2.b(u.class).c());
            sb2.append(", but had ");
            sb2.append(wVar2.b(d2.getClass()).c());
            sb2.append(" as the serialized body of ");
            sb2.append(b9);
            sb2.append(" at element: ");
            sb2.append(U());
            throw b8.j.d(-1, sb2.toString(), d2.toString());
        }
        String b10 = fVar.b();
        if (d2 instanceof d) {
            return new n(bVar, (d) d2);
        }
        StringBuilder sb3 = new StringBuilder("Expected ");
        w wVar3 = v.f13643a;
        sb3.append(wVar3.b(d.class).c());
        sb3.append(", but had ");
        sb3.append(wVar3.b(d2.getClass()).c());
        sb3.append(" as the serialized body of ");
        sb3.append(b10);
        sb3.append(" at element: ");
        sb3.append(U());
        throw b8.j.d(-1, sb3.toString(), d2.toString());
    }

    @Override // Y7.a
    public final boolean k(f fVar, int i4) {
        j.e(fVar, "descriptor");
        return F(R(fVar, i4));
    }

    @Override // Y7.a
    public final short l(V v8, int i4) {
        j.e(v8, "descriptor");
        return O(R(v8, i4));
    }

    @Override // Y7.b
    public final int m(f fVar) {
        j.e(fVar, "enumDescriptor");
        String str = (String) T();
        j.e(str, "tag");
        a8.j c6 = c(str);
        String b4 = fVar.b();
        if (c6 instanceof y) {
            return b8.j.k(fVar, this.f12164c, ((y) c6).g(), "");
        }
        StringBuilder sb = new StringBuilder("Expected ");
        w wVar = v.f13643a;
        sb.append(wVar.b(y.class).c());
        sb.append(", but had ");
        sb.append(wVar.b(c6.getClass()).c());
        sb.append(" as the serialized body of ");
        sb.append(b4);
        sb.append(" at element: ");
        sb.append(V(str));
        throw b8.j.d(-1, sb.toString(), c6.toString());
    }

    @Override // Y7.a
    public final int o(f fVar, int i4) {
        j.e(fVar, "descriptor");
        return M(R(fVar, i4));
    }

    @Override // Y7.a
    public final Object p(f fVar, int i4, V7.a aVar, Object obj) {
        j.e(fVar, "descriptor");
        j.e(aVar, "deserializer");
        this.f12162a.add(R(fVar, i4));
        j.e(aVar, "deserializer");
        Object u8 = u(aVar);
        if (!this.f12163b) {
            T();
        }
        this.f12163b = false;
        return u8;
    }

    @Override // Y7.a
    public final char q(V v8, int i4) {
        j.e(v8, "descriptor");
        return I(R(v8, i4));
    }

    @Override // Y7.b
    public final Y7.b r(f fVar) {
        j.e(fVar, "descriptor");
        if (AbstractC0436k.y0(this.f12162a) != null) {
            return L(T(), fVar);
        }
        return new l(this.f12164c, S(), this.f12165d).r(fVar);
    }

    @Override // a8.h
    public final a8.j s() {
        return d();
    }

    @Override // Y7.b
    public final int t() {
        return M(T());
    }

    @Override // Y7.b
    public final Object u(V7.a aVar) {
        String str;
        j.e(aVar, "deserializer");
        if (aVar instanceof V7.b) {
            a8.b bVar = this.f12164c;
            bVar.f8280a.getClass();
            V7.b bVar2 = (V7.b) aVar;
            String h8 = b8.j.h(bVar2.d(), bVar);
            a8.j d2 = d();
            String b4 = bVar2.d().b();
            if (d2 instanceof u) {
                u uVar = (u) d2;
                a8.j jVar = (a8.j) uVar.get(h8);
                try {
                    if (jVar != null) {
                        y e9 = k.e(jVar);
                        if (!(e9 instanceof a8.r)) {
                            str = e9.g();
                            D2.f.m((V7.b) aVar, this, str);
                            throw null;
                        }
                    }
                    D2.f.m((V7.b) aVar, this, str);
                    throw null;
                } catch (SerializationException e10) {
                    String message = e10.getMessage();
                    j.b(message);
                    throw b8.j.d(-1, message, uVar.toString());
                }
                str = null;
            } else {
                StringBuilder sb = new StringBuilder("Expected ");
                w wVar = v.f13643a;
                sb.append(wVar.b(u.class).c());
                sb.append(", but had ");
                sb.append(wVar.b(d2.getClass()).c());
                sb.append(" as the serialized body of ");
                sb.append(b4);
                sb.append(" at element: ");
                sb.append(U());
                throw b8.j.d(-1, sb.toString(), d2.toString());
            }
        } else {
            return aVar.a(this);
        }
    }

    @Override // Y7.a
    public final G5.e v() {
        return this.f12164c.f8281b;
    }

    @Override // Y7.a
    public final float w(V v8, int i4) {
        j.e(v8, "descriptor");
        return K(R(v8, i4));
    }

    @Override // Y7.b
    public final byte x() {
        return H(T());
    }

    @Override // Y7.a
    public final Object y(f fVar, int i4, V7.a aVar, Object obj) {
        Object u8;
        j.e(fVar, "descriptor");
        j.e(aVar, "deserializer");
        this.f12162a.add(R(fVar, i4));
        if (!aVar.d().h() && !f()) {
            u8 = null;
        } else {
            u8 = u(aVar);
        }
        if (!this.f12163b) {
            T();
        }
        this.f12163b = false;
        return u8;
    }

    @Override // Y7.b
    public final short z() {
        return O(T());
    }
}
