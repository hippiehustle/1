package a8;

import Z7.A;
import Z7.Q;
import Z7.d0;
import kotlinx.serialization.json.internal.JsonDecodingException;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final A f8289a = Q.a("kotlinx.serialization.json.JsonUnquotedLiteral", d0.f7591a);

    public static final void a(j jVar, String str) {
        throw new IllegalArgumentException("Element " + o6.v.f13643a.b(jVar.getClass()) + " is not a " + str);
    }

    public static final boolean b(y yVar) {
        Boolean bool;
        String g8 = yVar.g();
        String[] strArr = b8.s.f9288a;
        o6.j.e(g8, "<this>");
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
        throw new IllegalStateException(yVar + " does not represent a Boolean");
    }

    public static final int c(y yVar) {
        try {
            long f8 = f(yVar);
            if (-2147483648L <= f8 && f8 <= 2147483647L) {
                return (int) f8;
            }
            throw new NumberFormatException(yVar.g() + " is not an Int");
        } catch (JsonDecodingException e9) {
            throw new NumberFormatException(e9.getMessage());
        }
    }

    public static final u d(j jVar) {
        u uVar;
        o6.j.e(jVar, "<this>");
        if (jVar instanceof u) {
            uVar = (u) jVar;
        } else {
            uVar = null;
        }
        if (uVar != null) {
            return uVar;
        }
        a(jVar, "JsonObject");
        throw null;
    }

    public static final y e(j jVar) {
        y yVar;
        if (jVar instanceof y) {
            yVar = (y) jVar;
        } else {
            yVar = null;
        }
        if (yVar != null) {
            return yVar;
        }
        a(jVar, "JsonPrimitive");
        throw null;
    }

    public static final long f(y yVar) {
        String str;
        o6.j.e(yVar, "<this>");
        String g8 = yVar.g();
        S6.e eVar = new S6.e(g8);
        long k = eVar.k();
        if (eVar.h() != 10) {
            int i4 = eVar.f5429b;
            int i8 = i4 - 1;
            if (i4 != g8.length() && i8 >= 0) {
                str = String.valueOf(g8.charAt(i8));
            } else {
                str = "EOF";
            }
            S6.e.q(eVar, A.j.p("Expected input to contain a single valid number, but got '", str, "' after it"), i8, null, 4);
            throw null;
        }
        return k;
    }
}
