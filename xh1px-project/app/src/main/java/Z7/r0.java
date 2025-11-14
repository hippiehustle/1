package Z7;

import a.AbstractC0405a;

/* loaded from: classes.dex */
public final class r0 implements V7.a {

    /* renamed from: a, reason: collision with root package name */
    public static final r0 f7636a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final X f7637b = new X("kotlin.uuid.Uuid", X7.d.f7061m);

    @Override // V7.a
    public final Object a(Y7.b bVar) {
        String concat;
        String A2 = bVar.A();
        o6.j.e(A2, "uuidString");
        int length = A2.length();
        if (length != 32) {
            if (length != 36) {
                StringBuilder sb = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
                if (A2.length() <= 64) {
                    concat = A2;
                } else {
                    String substring = A2.substring(0, 64);
                    o6.j.d(substring, "substring(...)");
                    concat = substring.concat("...");
                }
                sb.append(concat);
                sb.append("\" of length ");
                sb.append(A2.length());
                throw new IllegalArgumentException(sb.toString());
            }
            long b4 = I7.c.b(A2, 0, 8);
            AbstractC0405a.k(A2, 8);
            long b9 = I7.c.b(A2, 9, 13);
            AbstractC0405a.k(A2, 13);
            long b10 = I7.c.b(A2, 14, 18);
            AbstractC0405a.k(A2, 18);
            long b11 = I7.c.b(A2, 19, 23);
            AbstractC0405a.k(A2, 23);
            long j = (b9 << 16) | (b4 << 32) | b10;
            long b12 = I7.c.b(A2, 24, 36) | (b11 << 48);
            if (j != 0 || b12 != 0) {
                return new K7.a(j, b12);
            }
        } else {
            long b13 = I7.c.b(A2, 0, 16);
            long b14 = I7.c.b(A2, 16, 32);
            if (b13 != 0 || b14 != 0) {
                return new K7.a(b13, b14);
            }
        }
        return K7.a.f2737f;
    }

    @Override // V7.a
    public final void c(kotlinx.serialization.json.internal.c cVar, Object obj) {
        K7.a aVar = (K7.a) obj;
        o6.j.e(aVar, "value");
        cVar.t(aVar.toString());
    }

    @Override // V7.a
    public final X7.f d() {
        return f7637b;
    }
}
