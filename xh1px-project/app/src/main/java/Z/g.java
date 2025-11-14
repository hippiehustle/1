package Z;

import androidx.datastore.preferences.protobuf.AbstractC0482s;
import androidx.datastore.preferences.protobuf.AbstractC0484u;
import androidx.datastore.preferences.protobuf.C0471g;
import androidx.datastore.preferences.protobuf.N;
import androidx.datastore.preferences.protobuf.Q;
import x.AbstractC1769h;

/* loaded from: classes.dex */
public final class g extends AbstractC0484u {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final g DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile N PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        AbstractC0484u.j(g.class, gVar);
    }

    public static f D() {
        return (f) ((AbstractC0482s) DEFAULT_INSTANCE.c(5));
    }

    public static void l(g gVar, long j) {
        gVar.valueCase_ = 4;
        gVar.value_ = Long.valueOf(j);
    }

    public static void m(g gVar, String str) {
        gVar.getClass();
        str.getClass();
        gVar.valueCase_ = 5;
        gVar.value_ = str;
    }

    public static void n(g gVar, e eVar) {
        gVar.getClass();
        gVar.value_ = eVar;
        gVar.valueCase_ = 6;
    }

    public static void o(g gVar, double d2) {
        gVar.valueCase_ = 7;
        gVar.value_ = Double.valueOf(d2);
    }

    public static void p(g gVar, C0471g c0471g) {
        gVar.getClass();
        gVar.valueCase_ = 8;
        gVar.value_ = c0471g;
    }

    public static void q(g gVar, boolean z8) {
        gVar.valueCase_ = 1;
        gVar.value_ = Boolean.valueOf(z8);
    }

    public static void r(g gVar, float f8) {
        gVar.valueCase_ = 2;
        gVar.value_ = Float.valueOf(f8);
    }

    public static void s(g gVar, int i4) {
        gVar.valueCase_ = 3;
        gVar.value_ = Integer.valueOf(i4);
    }

    public static g v() {
        return DEFAULT_INSTANCE;
    }

    public final String A() {
        if (this.valueCase_ == 5) {
            return (String) this.value_;
        }
        return "";
    }

    public final e B() {
        if (this.valueCase_ == 6) {
            return (e) this.value_;
        }
        return e.m();
    }

    public final int C() {
        switch (this.valueCase_) {
            case 0:
                return 9;
            case 1:
                return 1;
            case FLOAT_FIELD_NUMBER /* 2 */:
                return 2;
            case INTEGER_FIELD_NUMBER /* 3 */:
                return 3;
            case LONG_FIELD_NUMBER /* 4 */:
                return 4;
            case STRING_FIELD_NUMBER /* 5 */:
                return 5;
            case STRING_SET_FIELD_NUMBER /* 6 */:
                return 6;
            case DOUBLE_FIELD_NUMBER /* 7 */:
                return 7;
            case BYTES_FIELD_NUMBER /* 8 */:
                return 8;
            default:
                return 0;
        }
    }

    /* JADX WARN: Type inference failed for: r4v14, types: [androidx.datastore.preferences.protobuf.N, java.lang.Object] */
    @Override // androidx.datastore.preferences.protobuf.AbstractC0484u
    public final Object c(int i4) {
        N n3;
        switch (AbstractC1769h.b(i4)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case FLOAT_FIELD_NUMBER /* 2 */:
                return new Q(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", e.class});
            case INTEGER_FIELD_NUMBER /* 3 */:
                return new g();
            case LONG_FIELD_NUMBER /* 4 */:
                return new AbstractC0482s(DEFAULT_INSTANCE);
            case STRING_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case STRING_SET_FIELD_NUMBER /* 6 */:
                N n8 = PARSER;
                if (n8 == null) {
                    synchronized (g.class) {
                        try {
                            N n9 = PARSER;
                            n3 = n9;
                            if (n9 == null) {
                                ?? obj = new Object();
                                PARSER = obj;
                                n3 = obj;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return n3;
                }
                return n8;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean t() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final C0471g u() {
        if (this.valueCase_ == 8) {
            return (C0471g) this.value_;
        }
        return C0471g.f8681f;
    }

    public final double w() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final float x() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public final int y() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final long z() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }
}
