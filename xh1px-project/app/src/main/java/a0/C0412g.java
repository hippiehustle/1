package a0;

import X.e0;
import a6.AbstractC0436k;
import a6.x;
import androidx.datastore.preferences.protobuf.AbstractC0484u;
import androidx.datastore.preferences.protobuf.AbstractC0486w;
import androidx.datastore.preferences.protobuf.C0471g;
import androidx.datastore.preferences.protobuf.C0475k;
import androidx.datastore.preferences.protobuf.InterfaceC0485v;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import kotlin.NoWhenBranchMatchedException;
import o6.j;
import x.AbstractC1769h;

/* renamed from: a0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0412g {

    /* renamed from: a, reason: collision with root package name */
    public static final C0412g f7667a = new Object();

    public final C0407b a(FileInputStream fileInputStream) {
        int i4;
        byte[] bArr;
        try {
            Z.c o7 = Z.c.o(fileInputStream);
            C0407b c0407b = new C0407b(false);
            AbstractC0410e[] abstractC0410eArr = (AbstractC0410e[]) Arrays.copyOf(new AbstractC0410e[0], 0);
            j.e(abstractC0410eArr, "pairs");
            c0407b.b();
            if (abstractC0410eArr.length <= 0) {
                Map m6 = o7.m();
                j.d(m6, "preferencesProto.preferencesMap");
                for (Map.Entry entry : m6.entrySet()) {
                    String str = (String) entry.getKey();
                    Z.g gVar = (Z.g) entry.getValue();
                    j.d(str, "name");
                    j.d(gVar, "value");
                    int C8 = gVar.C();
                    if (C8 == 0) {
                        i4 = -1;
                    } else {
                        i4 = AbstractC0411f.f7666a[AbstractC1769h.b(C8)];
                    }
                    switch (i4) {
                        case -1:
                            throw new IOException("Value case is null.", null);
                        case 0:
                        default:
                            throw new NoWhenBranchMatchedException();
                        case 1:
                            c0407b.e(new C0409d(str), Boolean.valueOf(gVar.t()));
                            break;
                        case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                            c0407b.e(new C0409d(str), Float.valueOf(gVar.x()));
                            break;
                        case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                            c0407b.e(new C0409d(str), Double.valueOf(gVar.w()));
                            break;
                        case Z.g.LONG_FIELD_NUMBER /* 4 */:
                            c0407b.e(new C0409d(str), Integer.valueOf(gVar.y()));
                            break;
                        case Z.g.STRING_FIELD_NUMBER /* 5 */:
                            c0407b.e(new C0409d(str), Long.valueOf(gVar.z()));
                            break;
                        case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                            C0409d c0409d = new C0409d(str);
                            String A2 = gVar.A();
                            j.d(A2, "value.string");
                            c0407b.e(c0409d, A2);
                            break;
                        case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                            C0409d c0409d2 = new C0409d(str);
                            InterfaceC0485v n3 = gVar.B().n();
                            j.d(n3, "value.stringSet.stringsList");
                            c0407b.e(c0409d2, AbstractC0436k.V0(n3));
                            break;
                        case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                            C0409d c0409d3 = new C0409d(str);
                            C0471g u8 = gVar.u();
                            int size = u8.size();
                            if (size == 0) {
                                bArr = AbstractC0486w.f8743b;
                            } else {
                                byte[] bArr2 = new byte[size];
                                u8.j(size, bArr2);
                                bArr = bArr2;
                            }
                            j.d(bArr, "value.bytes.toByteArray()");
                            c0407b.e(c0409d3, bArr);
                            break;
                        case 9:
                            throw new IOException("Value not set.", null);
                    }
                }
                return new C0407b(x.T0(c0407b.a()), true);
            }
            AbstractC0410e abstractC0410e = abstractC0410eArr[0];
            throw null;
        } catch (InvalidProtocolBufferException e9) {
            throw new IOException("Unable to parse preferences proto.", e9);
        }
    }

    public final void b(Object obj, e0 e0Var) {
        AbstractC0484u a3;
        Map a4 = ((C0407b) obj).a();
        Z.a n3 = Z.c.n();
        for (Map.Entry entry : a4.entrySet()) {
            C0409d c0409d = (C0409d) entry.getKey();
            Object value = entry.getValue();
            String str = c0409d.f7665a;
            if (value instanceof Boolean) {
                Z.f D7 = Z.g.D();
                boolean booleanValue = ((Boolean) value).booleanValue();
                D7.c();
                Z.g.q((Z.g) D7.f8741e, booleanValue);
                a3 = D7.a();
            } else if (value instanceof Float) {
                Z.f D8 = Z.g.D();
                float floatValue = ((Number) value).floatValue();
                D8.c();
                Z.g.r((Z.g) D8.f8741e, floatValue);
                a3 = D8.a();
            } else if (value instanceof Double) {
                Z.f D9 = Z.g.D();
                double doubleValue = ((Number) value).doubleValue();
                D9.c();
                Z.g.o((Z.g) D9.f8741e, doubleValue);
                a3 = D9.a();
            } else if (value instanceof Integer) {
                Z.f D10 = Z.g.D();
                int intValue = ((Number) value).intValue();
                D10.c();
                Z.g.s((Z.g) D10.f8741e, intValue);
                a3 = D10.a();
            } else if (value instanceof Long) {
                Z.f D11 = Z.g.D();
                long longValue = ((Number) value).longValue();
                D11.c();
                Z.g.l((Z.g) D11.f8741e, longValue);
                a3 = D11.a();
            } else if (value instanceof String) {
                Z.f D12 = Z.g.D();
                D12.c();
                Z.g.m((Z.g) D12.f8741e, (String) value);
                a3 = D12.a();
            } else if (value instanceof Set) {
                Z.f D13 = Z.g.D();
                Z.d o7 = Z.e.o();
                j.c(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                o7.c();
                Z.e.l((Z.e) o7.f8741e, (Set) value);
                D13.c();
                Z.g.n((Z.g) D13.f8741e, (Z.e) o7.a());
                a3 = D13.a();
            } else if (value instanceof byte[]) {
                Z.f D14 = Z.g.D();
                byte[] bArr = (byte[]) value;
                C0471g c0471g = C0471g.f8681f;
                C0471g i4 = C0471g.i(bArr, 0, bArr.length);
                D14.c();
                Z.g.p((Z.g) D14.f8741e, i4);
                a3 = D14.a();
            } else {
                throw new IllegalStateException("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
            }
            n3.getClass();
            n3.c();
            Z.c.l((Z.c) n3.f8741e).put(str, (Z.g) a3);
        }
        Z.c cVar = (Z.c) n3.a();
        int a9 = cVar.a(null);
        Logger logger = C0475k.f8705n;
        if (a9 > 4096) {
            a9 = 4096;
        }
        C0475k c0475k = new C0475k(e0Var, a9);
        cVar.b(c0475k);
        if (c0475k.f8708l > 0) {
            c0475k.Z();
        }
    }
}
