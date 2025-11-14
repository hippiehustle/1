package Z;

import androidx.datastore.preferences.protobuf.AbstractC0482s;
import androidx.datastore.preferences.protobuf.AbstractC0484u;
import androidx.datastore.preferences.protobuf.C0473i;
import androidx.datastore.preferences.protobuf.C0474j;
import androidx.datastore.preferences.protobuf.C0477m;
import androidx.datastore.preferences.protobuf.E;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.N;
import androidx.datastore.preferences.protobuf.O;
import androidx.datastore.preferences.protobuf.Q;
import androidx.datastore.preferences.protobuf.S;
import androidx.datastore.preferences.protobuf.UninitializedMessageException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import x.AbstractC1769h;

/* loaded from: classes.dex */
public final class c extends AbstractC0484u {
    private static final c DEFAULT_INSTANCE;
    private static volatile N PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private E preferences_ = E.f8603e;

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        AbstractC0484u.j(c.class, cVar);
    }

    public static E l(c cVar) {
        E e9 = cVar.preferences_;
        if (!e9.f8604d) {
            cVar.preferences_ = e9.b();
        }
        return cVar.preferences_;
    }

    public static a n() {
        return (a) ((AbstractC0482s) DEFAULT_INSTANCE.c(5));
    }

    public static c o(FileInputStream fileInputStream) {
        c cVar = DEFAULT_INSTANCE;
        C0473i c0473i = new C0473i(fileInputStream);
        C0477m a3 = C0477m.a();
        AbstractC0484u i4 = cVar.i();
        try {
            O o7 = O.f8627c;
            o7.getClass();
            S a4 = o7.a(i4.getClass());
            C0474j c0474j = (C0474j) c0473i.f9255a;
            if (c0474j == null) {
                c0474j = new C0474j(c0473i);
            }
            a4.g(i4, c0474j, a3);
            a4.d(i4);
            if (AbstractC0484u.f(i4, true)) {
                return (c) i4;
            }
            throw new IOException(new UninitializedMessageException().getMessage());
        } catch (InvalidProtocolBufferException e9) {
            if (e9.f8608d) {
                throw new IOException(e9.getMessage(), e9);
            }
            throw e9;
        } catch (UninitializedMessageException e10) {
            throw new IOException(e10.getMessage());
        } catch (IOException e11) {
            if (e11.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e11.getCause());
            }
            throw new IOException(e11.getMessage(), e11);
        } catch (RuntimeException e12) {
            if (e12.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e12.getCause());
            }
            throw e12;
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
            case g.FLOAT_FIELD_NUMBER /* 2 */:
                return new Q(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", b.f7248a});
            case g.INTEGER_FIELD_NUMBER /* 3 */:
                return new c();
            case g.LONG_FIELD_NUMBER /* 4 */:
                return new AbstractC0482s(DEFAULT_INSTANCE);
            case g.STRING_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case g.STRING_SET_FIELD_NUMBER /* 6 */:
                N n8 = PARSER;
                if (n8 == null) {
                    synchronized (c.class) {
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

    public final Map m() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
