package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0480p {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f8730c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final U f8731a = U.f();

    /* renamed from: b, reason: collision with root package name */
    public boolean f8732b;

    static {
        new C0480p(0);
    }

    public C0480p() {
    }

    public static void b(C0475k c0475k, n0 n0Var, int i4, Object obj) {
        if (n0Var == n0.f8714g) {
            c0475k.p0(i4, 3);
            ((AbstractC0465a) obj).b(c0475k);
            c0475k.p0(i4, 4);
            return;
        }
        c0475k.p0(i4, n0Var.f8718e);
        switch (n0Var.ordinal()) {
            case 0:
                c0475k.j0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                return;
            case 1:
                c0475k.h0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                return;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                c0475k.t0(((Long) obj).longValue());
                return;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                c0475k.t0(((Long) obj).longValue());
                return;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                c0475k.l0(((Integer) obj).intValue());
                return;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                c0475k.j0(((Long) obj).longValue());
                return;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                c0475k.h0(((Integer) obj).intValue());
                return;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                c0475k.b0(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                return;
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                if (obj instanceof C0471g) {
                    c0475k.f0((C0471g) obj);
                    return;
                } else {
                    c0475k.o0((String) obj);
                    return;
                }
            case 9:
                ((AbstractC0465a) obj).b(c0475k);
                return;
            case 10:
                AbstractC0465a abstractC0465a = (AbstractC0465a) obj;
                c0475k.getClass();
                c0475k.r0(((AbstractC0484u) abstractC0465a).a(null));
                abstractC0465a.b(c0475k);
                return;
            case 11:
                if (obj instanceof C0471g) {
                    c0475k.f0((C0471g) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                int length = bArr.length;
                c0475k.r0(length);
                c0475k.c0(bArr, 0, length);
                return;
            case 12:
                c0475k.r0(((Integer) obj).intValue());
                return;
            case 13:
                c0475k.l0(((Integer) obj).intValue());
                return;
            case 14:
                c0475k.h0(((Integer) obj).intValue());
                return;
            case 15:
                c0475k.j0(((Long) obj).longValue());
                return;
            case 16:
                int intValue = ((Integer) obj).intValue();
                c0475k.r0((intValue >> 31) ^ (intValue << 1));
                return;
            case 17:
                long longValue = ((Long) obj).longValue();
                c0475k.t0((longValue >> 63) ^ (longValue << 1));
                return;
            default:
                return;
        }
    }

    public final void a() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (this.f8732b) {
            return;
        }
        U u8 = this.f8731a;
        int size = u8.f8641d.size();
        for (int i4 = 0; i4 < size; i4++) {
            Map.Entry c6 = u8.c(i4);
            if (c6.getValue() instanceof AbstractC0484u) {
                AbstractC0484u abstractC0484u = (AbstractC0484u) c6.getValue();
                abstractC0484u.getClass();
                O o7 = O.f8627c;
                o7.getClass();
                o7.a(abstractC0484u.getClass()).d(abstractC0484u);
                abstractC0484u.h();
            }
        }
        if (!u8.f8643f) {
            if (u8.f8641d.size() <= 0) {
                Iterator it = u8.d().iterator();
                if (it.hasNext()) {
                    ((Map.Entry) it.next()).getKey().getClass();
                    throw new ClassCastException();
                }
            } else {
                u8.c(0).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!u8.f8643f) {
            if (u8.f8642e.isEmpty()) {
                unmodifiableMap = Collections.EMPTY_MAP;
            } else {
                unmodifiableMap = Collections.unmodifiableMap(u8.f8642e);
            }
            u8.f8642e = unmodifiableMap;
            if (u8.f8645h.isEmpty()) {
                unmodifiableMap2 = Collections.EMPTY_MAP;
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(u8.f8645h);
            }
            u8.f8645h = unmodifiableMap2;
            u8.f8643f = true;
        }
        this.f8732b = true;
    }

    public final Object clone() {
        C0480p c0480p = new C0480p();
        U u8 = this.f8731a;
        if (u8.f8641d.size() <= 0) {
            Iterator it = u8.d().iterator();
            if (!it.hasNext()) {
                return c0480p;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (entry.getKey() == null) {
                entry.getValue();
                throw null;
            }
            throw new ClassCastException();
        }
        Map.Entry c6 = u8.c(0);
        if (c6.getKey() == null) {
            c6.getValue();
            throw null;
        }
        throw new ClassCastException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0480p)) {
            return false;
        }
        return this.f8731a.equals(((C0480p) obj).f8731a);
    }

    public final int hashCode() {
        return this.f8731a.hashCode();
    }

    public C0480p(int i4) {
        a();
        a();
    }
}
