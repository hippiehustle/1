package Z;

import androidx.datastore.preferences.protobuf.AbstractC0466b;
import androidx.datastore.preferences.protobuf.AbstractC0482s;
import androidx.datastore.preferences.protobuf.AbstractC0484u;
import androidx.datastore.preferences.protobuf.AbstractC0486w;
import androidx.datastore.preferences.protobuf.InterfaceC0485v;
import androidx.datastore.preferences.protobuf.N;
import androidx.datastore.preferences.protobuf.P;
import androidx.datastore.preferences.protobuf.Q;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.RandomAccess;
import java.util.Set;
import x.AbstractC1769h;

/* loaded from: classes.dex */
public final class e extends AbstractC0484u {
    private static final e DEFAULT_INSTANCE;
    private static volatile N PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private InterfaceC0485v strings_ = P.f8630g;

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        AbstractC0484u.j(e.class, eVar);
    }

    public static void l(e eVar, Set set) {
        int i4;
        InterfaceC0485v interfaceC0485v = eVar.strings_;
        if (!((AbstractC0466b) interfaceC0485v).f8662d) {
            P p8 = (P) interfaceC0485v;
            int i8 = p8.f8632f;
            if (i8 == 0) {
                i4 = 10;
            } else {
                i4 = i8 * 2;
            }
            eVar.strings_ = p8.i(i4);
        }
        RandomAccess randomAccess = eVar.strings_;
        Charset charset = AbstractC0486w.f8742a;
        set.getClass();
        if (randomAccess instanceof ArrayList) {
            ((ArrayList) randomAccess).ensureCapacity(set.size() + ((P) randomAccess).f8632f);
        }
        P p9 = (P) randomAccess;
        int i9 = p9.f8632f;
        for (Object obj : set) {
            if (obj == null) {
                String str = "Element at index " + (p9.f8632f - i9) + " is null.";
                for (int i10 = p9.f8632f - 1; i10 >= i9; i10--) {
                    p9.remove(i10);
                }
                throw new NullPointerException(str);
            }
            p9.add(obj);
        }
    }

    public static e m() {
        return DEFAULT_INSTANCE;
    }

    public static d o() {
        return (d) ((AbstractC0482s) DEFAULT_INSTANCE.c(5));
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
                return new Q(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case g.INTEGER_FIELD_NUMBER /* 3 */:
                return new e();
            case g.LONG_FIELD_NUMBER /* 4 */:
                return new AbstractC0482s(DEFAULT_INSTANCE);
            case g.STRING_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case g.STRING_SET_FIELD_NUMBER /* 6 */:
                N n8 = PARSER;
                if (n8 == null) {
                    synchronized (e.class) {
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

    public final InterfaceC0485v n() {
        return this.strings_;
    }
}
