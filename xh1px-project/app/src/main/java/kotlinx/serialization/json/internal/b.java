package kotlinx.serialization.json.internal;

import A1.o;
import G.d;
import I7.m;
import S6.e;
import X6.r;
import X7.f;
import Z7.C0397s;
import a6.AbstractC0436k;
import a6.q;
import a8.h;
import a8.u;
import a8.y;
import b8.i;
import b8.k;
import b8.t;
import java.util.ArrayList;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.SerializationException;
import o6.j;
import o6.v;
import o6.w;

/* loaded from: classes.dex */
public final class b extends E2.c implements h {

    /* renamed from: f, reason: collision with root package name */
    public final a8.b f12167f;

    /* renamed from: g, reason: collision with root package name */
    public final t f12168g;

    /* renamed from: h, reason: collision with root package name */
    public final e f12169h;

    /* renamed from: i, reason: collision with root package name */
    public final G5.e f12170i;
    public int j;
    public final r k;

    /* renamed from: l, reason: collision with root package name */
    public final i f12171l;

    public b(a8.b bVar, t tVar, e eVar, f fVar) {
        i iVar;
        j.e(fVar, "descriptor");
        this.f12167f = bVar;
        this.f12168g = tVar;
        this.f12169h = eVar;
        this.f12170i = bVar.f8281b;
        this.j = -1;
        r rVar = bVar.f8280a;
        this.k = rVar;
        if (rVar.f7035b) {
            iVar = null;
        } else {
            iVar = new i(fVar);
        }
        this.f12171l = iVar;
    }

    @Override // E2.c, Y7.b
    public final String A() {
        this.k.getClass();
        return this.f12169h.l();
    }

    @Override // E2.c, Y7.b
    public final float C() {
        e eVar = this.f12169h;
        String m6 = eVar.m();
        try {
            float parseFloat = Float.parseFloat(m6);
            this.f12167f.f8280a.getClass();
            if (Math.abs(parseFloat) <= Float.MAX_VALUE) {
                return parseFloat;
            }
            b8.j.q(eVar, Float.valueOf(parseFloat));
            throw null;
        } catch (IllegalArgumentException unused) {
            e.q(eVar, "Failed to parse type 'float' for input '" + m6 + '\'', 0, null, 6);
            throw null;
        }
    }

    @Override // E2.c, Y7.b
    public final double E() {
        e eVar = this.f12169h;
        String m6 = eVar.m();
        try {
            double parseDouble = Double.parseDouble(m6);
            this.f12167f.f8280a.getClass();
            if (Math.abs(parseDouble) <= Double.MAX_VALUE) {
                return parseDouble;
            }
            b8.j.q(eVar, Double.valueOf(parseDouble));
            throw null;
        } catch (IllegalArgumentException unused) {
            e.q(eVar, "Failed to parse type 'double' for input '" + m6 + '\'', 0, null, 6);
            throw null;
        }
    }

    @Override // E2.c, Y7.b
    public final long a() {
        return this.f12169h.k();
    }

    @Override // E2.c, Y7.b
    public final boolean e() {
        boolean z8;
        boolean z9;
        e eVar = this.f12169h;
        int C8 = eVar.C();
        String str = (String) eVar.f5433f;
        if (C8 != str.length()) {
            if (str.charAt(C8) == '\"') {
                C8++;
                z8 = true;
            } else {
                z8 = false;
            }
            int B8 = eVar.B(C8);
            if (B8 < str.length() && B8 != -1) {
                int i4 = B8 + 1;
                int charAt = str.charAt(B8) | ' ';
                if (charAt != 102) {
                    if (charAt == 116) {
                        eVar.f("rue", i4);
                        z9 = true;
                    } else {
                        e.q(eVar, "Expected valid boolean literal prefix, but had '" + eVar.m() + '\'', 0, null, 6);
                        throw null;
                    }
                } else {
                    eVar.f("alse", i4);
                    z9 = false;
                }
                if (z8) {
                    if (eVar.f5429b != str.length()) {
                        if (str.charAt(eVar.f5429b) == '\"') {
                            eVar.f5429b++;
                            return z9;
                        }
                        e.q(eVar, "Expected closing quotation mark", 0, null, 6);
                        throw null;
                    }
                    e.q(eVar, "EOF", 0, null, 6);
                    throw null;
                }
                return z9;
            }
            e.q(eVar, "EOF", 0, null, 6);
            throw null;
        }
        e.q(eVar, "EOF", 0, null, 6);
        throw null;
    }

    @Override // E2.c, Y7.b
    public final boolean f() {
        boolean z8;
        i iVar = this.f12171l;
        if (iVar != null) {
            z8 = iVar.f9265b;
        } else {
            z8 = false;
        }
        if (!z8) {
            e eVar = this.f12169h;
            int B8 = eVar.B(eVar.C());
            String str = (String) eVar.f5433f;
            int length = str.length() - B8;
            boolean z9 = false;
            if (length >= 4 && B8 != -1) {
                int i4 = 0;
                while (true) {
                    if (i4 < 4) {
                        if ("null".charAt(i4) != str.charAt(B8 + i4)) {
                            break;
                        }
                        i4++;
                    } else if (length <= 4 || b8.j.g(str.charAt(B8 + 4)) != 0) {
                        z9 = true;
                        eVar.f5429b = B8 + 4;
                    }
                }
            }
            if (!z9) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (b8.j.l(r6, r2) != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (n(r6) != (-1)) goto L20;
     */
    @Override // E2.c, Y7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(f fVar) {
        j.e(fVar, "descriptor");
        int c6 = fVar.c();
        a8.b bVar = this.f12167f;
        if (c6 == 0) {
        }
        e eVar = this.f12169h;
        if (!eVar.D()) {
            eVar.j(this.f12168g.f9295e);
            d dVar = (d) eVar.f5430c;
            int i4 = dVar.f1650b;
            int[] iArr = (int[]) dVar.f1652d;
            if (iArr[i4] == -2) {
                iArr[i4] = -1;
                dVar.f1650b = i4 - 1;
            }
            int i8 = dVar.f1650b;
            if (i8 != -1) {
                dVar.f1650b = i8 - 1;
                return;
            }
            return;
        }
        bVar.f8280a.getClass();
        b8.j.m(eVar, "");
        throw null;
    }

    @Override // E2.c, Y7.b
    public final char h() {
        e eVar = this.f12169h;
        String m6 = eVar.m();
        if (m6.length() == 1) {
            return m6.charAt(0);
        }
        e.q(eVar, "Expected single char, but got '" + m6 + '\'', 0, null, 6);
        throw null;
    }

    @Override // E2.c, Y7.b
    public final Y7.a j(f fVar) {
        j.e(fVar, "descriptor");
        a8.b bVar = this.f12167f;
        t p8 = b8.j.p(fVar, bVar);
        e eVar = this.f12169h;
        d dVar = (d) eVar.f5430c;
        int i4 = dVar.f1650b + 1;
        dVar.f1650b = i4;
        if (i4 == ((Object[]) dVar.f1651c).length) {
            dVar.f();
        }
        ((Object[]) dVar.f1651c)[i4] = fVar;
        eVar.j(p8.f9294d);
        if (eVar.z() != 4) {
            int ordinal = p8.ordinal();
            if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                if (this.f12168g == p8 && bVar.f8280a.f7035b) {
                    return this;
                }
                return new b(bVar, p8, eVar, fVar);
            }
            return new b(bVar, p8, eVar, fVar);
        }
        e.q(eVar, "Unexpected leading comma", 0, null, 6);
        throw null;
    }

    @Override // E2.c, Y7.b
    public final int m(f fVar) {
        j.e(fVar, "enumDescriptor");
        return b8.j.k(fVar, this.f12167f, A(), " at path " + ((d) this.f12169h.f5430c).c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y7.a
    public final int n(f fVar) {
        Object[] objArr;
        a8.b bVar = this.f12167f;
        r rVar = bVar.f8280a;
        e eVar = this.f12169h;
        d dVar = (d) eVar.f5430c;
        String str = (String) eVar.f5433f;
        j.e(fVar, "descriptor");
        t tVar = this.f12168g;
        int ordinal = tVar.ordinal();
        char c6 = ':';
        int i4 = 0;
        r13 = false;
        boolean z8 = false;
        byte b4 = 1;
        int i8 = -1;
        if (ordinal != 0) {
            if (ordinal != 2) {
                boolean D7 = eVar.D();
                if (eVar.e()) {
                    int i9 = this.j;
                    if (i9 != -1 && !D7) {
                        e.q(eVar, "Expected end of the array or comma", 0, null, 6);
                        throw null;
                    }
                    i8 = i9 + 1;
                    this.j = i8;
                } else if (D7) {
                    rVar.getClass();
                    b8.j.m(eVar, "array");
                    throw null;
                }
            } else {
                int i10 = this.j;
                if (i10 % 2 != 0) {
                    objArr = true;
                } else {
                    objArr = false;
                }
                if (objArr != false) {
                    if (i10 != -1) {
                        z8 = eVar.D();
                    }
                } else {
                    eVar.j(':');
                }
                if (eVar.e()) {
                    if (objArr != false) {
                        if (this.j == -1) {
                            int i11 = eVar.f5429b;
                            if (z8) {
                                e.q(eVar, "Unexpected leading comma", i11, null, 4);
                                throw null;
                            }
                        } else {
                            int i12 = eVar.f5429b;
                            if (!z8) {
                                e.q(eVar, "Expected comma after the key-value pair", i12, null, 4);
                                throw null;
                            }
                        }
                    }
                    i8 = this.j + 1;
                    this.j = i8;
                } else if (z8) {
                    rVar.getClass();
                    b8.j.m(eVar, "object");
                    throw null;
                }
            }
        } else {
            boolean D8 = eVar.D();
            while (true) {
                boolean e9 = eVar.e();
                byte b9 = b4;
                i iVar = this.f12171l;
                if (e9) {
                    this.k.getClass();
                    String g8 = eVar.g();
                    eVar.j(c6);
                    int j = b8.j.j(fVar, bVar, g8);
                    if (j != -3) {
                        if (iVar != null) {
                            C0397s c0397s = iVar.f9264a;
                            if (j < 64) {
                                c0397s.f7641c |= 1 << j;
                            } else {
                                int i13 = (j >>> 6) - 1;
                                long[] jArr = c0397s.f7642d;
                                jArr[i13] = (1 << (j & 63)) | jArr[i13];
                            }
                        }
                        i8 = j;
                    } else {
                        if (!b8.j.l(fVar, bVar)) {
                            int i14 = dVar.f1650b;
                            int[] iArr = (int[]) dVar.f1652d;
                            if (iArr[i14] == -2) {
                                iArr[i14] = -1;
                                dVar.f1650b = i14 - 1;
                            }
                            int i15 = dVar.f1650b;
                            if (i15 != -1) {
                                dVar.f1650b = i15 - 1;
                            }
                            int l02 = m.l0(0, 6, str.subSequence(0, eVar.f5429b).toString(), g8);
                            throw new JsonDecodingException("Encountered an unknown key '" + g8 + "' at offset " + l02 + " at path: " + dVar.c() + "\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: " + ((Object) b8.j.n(str, l02)));
                        }
                        ArrayList arrayList = new ArrayList();
                        byte z9 = eVar.z();
                        byte b10 = 6;
                        if (z9 == 8 || z9 == 6) {
                            while (true) {
                                byte z10 = eVar.z();
                                b4 = b9;
                                if (z10 == b4) {
                                    eVar.g();
                                } else {
                                    if (z10 != 8 && z10 != b10) {
                                        if (z10 == 9) {
                                            if (((Number) AbstractC0436k.x0(arrayList)).byteValue() == 8) {
                                                q.h0(arrayList);
                                            } else {
                                                throw b8.j.d(eVar.f5429b, "found ] instead of } at path: " + dVar, str);
                                            }
                                        } else if (z10 == 7) {
                                            if (((Number) AbstractC0436k.x0(arrayList)).byteValue() == 6) {
                                                q.h0(arrayList);
                                            } else {
                                                throw b8.j.d(eVar.f5429b, "found } instead of ] at path: " + dVar, str);
                                            }
                                        } else if (z10 == 10) {
                                            e.q(eVar, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6);
                                            throw null;
                                        }
                                        b10 = 6;
                                    } else {
                                        arrayList.add(Byte.valueOf(z10));
                                    }
                                    eVar.h();
                                    if (arrayList.size() == 0) {
                                        break;
                                    }
                                }
                                b9 = b4;
                            }
                        } else {
                            eVar.m();
                            b4 = b9;
                        }
                        D8 = eVar.D();
                        c6 = ':';
                    }
                } else if (!D8) {
                    if (iVar != null) {
                        C0397s c0397s2 = iVar.f9264a;
                        o oVar = c0397s2.f7640b;
                        f fVar2 = c0397s2.f7639a;
                        int c9 = fVar2.c();
                        while (true) {
                            long j5 = c0397s2.f7641c;
                            if (j5 != -1) {
                                int numberOfTrailingZeros = Long.numberOfTrailingZeros(~j5);
                                c0397s2.f7641c |= 1 << numberOfTrailingZeros;
                                if (((Boolean) oVar.l(fVar2, Integer.valueOf(numberOfTrailingZeros))).booleanValue()) {
                                    i8 = numberOfTrailingZeros;
                                    break;
                                }
                            } else if (c9 > 64) {
                                long[] jArr2 = c0397s2.f7642d;
                                int length = jArr2.length;
                                loop3: while (true) {
                                    if (i4 >= length) {
                                        break;
                                    }
                                    int i16 = i4 + 1;
                                    int i17 = i16 * 64;
                                    long j8 = jArr2[i4];
                                    while (j8 != -1) {
                                        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j8);
                                        j8 |= 1 << numberOfTrailingZeros2;
                                        int i18 = numberOfTrailingZeros2 + i17;
                                        if (((Boolean) oVar.l(fVar2, Integer.valueOf(i18))).booleanValue()) {
                                            jArr2[i4] = j8;
                                            i8 = i18;
                                            break loop3;
                                        }
                                    }
                                    jArr2[i4] = j8;
                                    i4 = i16;
                                }
                            }
                        }
                    }
                } else {
                    rVar.getClass();
                    b8.j.m(eVar, "object");
                    throw null;
                }
            }
        }
        if (tVar != t.f9292h) {
            ((int[]) dVar.f1652d)[dVar.f1650b] = i8;
        }
        return i8;
    }

    @Override // E2.c, Y7.a
    public final Object p(f fVar, int i4, V7.a aVar, Object obj) {
        boolean z8;
        d dVar = (d) this.f12169h.f5430c;
        j.e(fVar, "descriptor");
        j.e(aVar, "deserializer");
        if (this.f12168g == t.f9292h && (i4 & 1) == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            int[] iArr = (int[]) dVar.f1652d;
            int i8 = dVar.f1650b;
            if (iArr[i8] == -2) {
                ((Object[]) dVar.f1651c)[i8] = k.f9267a;
            }
        }
        Object p8 = super.p(fVar, i4, aVar, obj);
        if (z8) {
            int[] iArr2 = (int[]) dVar.f1652d;
            int i9 = dVar.f1650b;
            if (iArr2[i9] != -2) {
                int i10 = i9 + 1;
                dVar.f1650b = i10;
                if (i10 == ((Object[]) dVar.f1651c).length) {
                    dVar.f();
                }
            }
            Object[] objArr = (Object[]) dVar.f1651c;
            int i11 = dVar.f1650b;
            objArr[i11] = p8;
            ((int[]) dVar.f1652d)[i11] = -2;
        }
        return p8;
    }

    @Override // E2.c, Y7.b
    public final Y7.b r(f fVar) {
        j.e(fVar, "descriptor");
        if (b8.r.a(fVar)) {
            return new b8.h(this.f12169h, this.f12167f);
        }
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [M.i, java.lang.Object] */
    @Override // a8.h
    public final a8.j s() {
        j.e(this.f12167f.f8280a, "configuration");
        ?? obj = new Object();
        obj.f3288e = this.f12169h;
        return obj.g();
    }

    @Override // E2.c, Y7.b
    public final int t() {
        e eVar = this.f12169h;
        long k = eVar.k();
        int i4 = (int) k;
        if (k == i4) {
            return i4;
        }
        e.q(eVar, "Failed to parse int for input '" + k + '\'', 0, null, 6);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011a  */
    @Override // E2.c, Y7.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(V7.a aVar) {
        String message;
        String str;
        a8.b bVar = this.f12167f;
        e eVar = this.f12169h;
        d dVar = (d) eVar.f5430c;
        j.e(aVar, "deserializer");
        try {
        } catch (MissingFieldException e9) {
            message = e9.getMessage();
            j.b(message);
            if (!m.b0(message, "at path", false)) {
            }
        }
        if (aVar instanceof V7.b) {
            bVar.f8280a.getClass();
            String h8 = b8.j.h(((V7.b) aVar).d(), bVar);
            this.k.getClass();
            String y4 = eVar.y(h8);
            if (y4 == null) {
                if (aVar instanceof V7.b) {
                    bVar.f8280a.getClass();
                    String h9 = b8.j.h(((V7.b) aVar).d(), bVar);
                    a8.j s8 = s();
                    String b4 = ((V7.b) aVar).d().b();
                    if (s8 instanceof u) {
                        u uVar = (u) s8;
                        a8.j jVar = (a8.j) uVar.get(h9);
                        try {
                            if (jVar != null) {
                                y e10 = a8.k.e(jVar);
                                if (!(e10 instanceof a8.r)) {
                                    str = e10.g();
                                    D2.f.m((V7.b) aVar, this, str);
                                    throw null;
                                }
                            }
                            D2.f.m((V7.b) aVar, this, str);
                            throw null;
                        } catch (SerializationException e11) {
                            String message2 = e11.getMessage();
                            j.b(message2);
                            throw b8.j.d(-1, message2, uVar.toString());
                        }
                        str = null;
                    } else {
                        StringBuilder sb = new StringBuilder("Expected ");
                        w wVar = v.f13643a;
                        sb.append(wVar.b(u.class).c());
                        sb.append(", but had ");
                        sb.append(wVar.b(s8.getClass()).c());
                        sb.append(" as the serialized body of ");
                        sb.append(b4);
                        sb.append(" at element: ");
                        sb.append(dVar.c());
                        throw b8.j.d(-1, sb.toString(), s8.toString());
                    }
                } else {
                    return aVar.a(this);
                }
            } else {
                try {
                    D2.f.m((V7.b) aVar, this, y4);
                    throw null;
                } catch (SerializationException e12) {
                    String message3 = e12.getMessage();
                    j.b(message3);
                    String p02 = m.p0(m.u0(message3, '\n'), ".");
                    String message4 = e12.getMessage();
                    j.b(message4);
                    e.q(eVar, p02, 0, m.r0('\n', message4, ""), 2);
                    throw null;
                }
            }
            message = e9.getMessage();
            j.b(message);
            if (!m.b0(message, "at path", false)) {
                throw e9;
            }
            throw new MissingFieldException(e9.f12161d, e9.getMessage() + " at path: " + dVar.c(), e9);
        }
        return aVar.a(this);
    }

    @Override // Y7.a
    public final G5.e v() {
        return this.f12170i;
    }

    @Override // E2.c, Y7.b
    public final byte x() {
        e eVar = this.f12169h;
        long k = eVar.k();
        byte b4 = (byte) k;
        if (k == b4) {
            return b4;
        }
        e.q(eVar, "Failed to parse byte for input '" + k + '\'', 0, null, 6);
        throw null;
    }

    @Override // E2.c, Y7.b
    public final short z() {
        e eVar = this.f12169h;
        long k = eVar.k();
        short s8 = (short) k;
        if (k == s8) {
            return s8;
        }
        e.q(eVar, "Failed to parse short for input '" + k + '\'', 0, null, 6);
        throw null;
    }
}
