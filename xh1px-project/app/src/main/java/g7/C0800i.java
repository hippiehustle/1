package g7;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: g7.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0800i {

    /* renamed from: c, reason: collision with root package name */
    public static final C0800i f11237c = new C0800i(0);

    /* renamed from: a, reason: collision with root package name */
    public final z f11238a = new z(16);

    /* renamed from: b, reason: collision with root package name */
    public boolean f11239b;

    public C0800i() {
    }

    public static int c(L l6, Object obj) {
        switch (l6.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                return 8;
            case 1:
                ((Float) obj).getClass();
                return 4;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return L5.m.g(((Long) obj).longValue());
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                return L5.m.g(((Long) obj).longValue());
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                return L5.m.c(((Integer) obj).intValue());
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                ((Long) obj).getClass();
                return 8;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                ((Integer) obj).getClass();
                return 4;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                ((Boolean) obj).getClass();
                return 1;
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                try {
                    byte[] bytes = ((String) obj).getBytes("UTF-8");
                    return L5.m.f(bytes.length) + bytes.length;
                } catch (UnsupportedEncodingException e9) {
                    throw new RuntimeException("UTF-8 not supported.", e9);
                }
            case 9:
                return ((AbstractC0793b) obj).c();
            case 10:
                return L5.m.e((AbstractC0793b) obj);
            case 11:
                if (obj instanceof AbstractC0796e) {
                    AbstractC0796e abstractC0796e = (AbstractC0796e) obj;
                    return abstractC0796e.size() + L5.m.f(abstractC0796e.size());
                }
                byte[] bArr = (byte[]) obj;
                return L5.m.f(bArr.length) + bArr.length;
            case 12:
                return L5.m.f(((Integer) obj).intValue());
            case 13:
                if (obj instanceof p) {
                    return L5.m.c(((p) obj).a());
                }
                return L5.m.c(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                return 4;
            case 15:
                ((Long) obj).getClass();
                return 8;
            case 16:
                int intValue = ((Integer) obj).intValue();
                return L5.m.f((intValue >> 31) ^ (intValue << 1));
            case 17:
                long longValue = ((Long) obj).longValue();
                return L5.m.g((longValue >> 63) ^ (longValue << 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int d(C0804m c0804m, Object obj) {
        L l6 = c0804m.f11245e;
        int i4 = c0804m.f11244d;
        if (c0804m.f11246f) {
            int i8 = 0;
            for (Object obj2 : (List) obj) {
                int h8 = L5.m.h(i4);
                if (l6 == L.f11203h) {
                    h8 *= 2;
                }
                i8 += c(l6, obj2) + h8;
            }
            return i8;
        }
        int h9 = L5.m.h(i4);
        if (l6 == L.f11203h) {
            h9 *= 2;
        }
        return c(l6, obj) + h9;
    }

    public static boolean e(Map.Entry entry) {
        C0804m c0804m = (C0804m) entry.getKey();
        if (c0804m.f11245e.f11205d == M.MESSAGE) {
            if (c0804m.f11246f) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((AbstractC0793b) it.next()).b()) {
                        return false;
                    }
                }
                return true;
            }
            Object value = entry.getValue();
            if (value instanceof AbstractC0793b) {
                if (!((AbstractC0793b) value).b()) {
                    return false;
                }
                return true;
            }
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        return true;
    }

    public static Object h(C0797f c0797f, L l6) {
        boolean z8 = true;
        switch (l6.ordinal()) {
            case 0:
                return Double.valueOf(Double.longBitsToDouble(c0797f.j()));
            case 1:
                return Float.valueOf(Float.intBitsToFloat(c0797f.i()));
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return Long.valueOf(c0797f.l());
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                return Long.valueOf(c0797f.l());
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                return Integer.valueOf(c0797f.k());
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                return Long.valueOf(c0797f.j());
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                return Integer.valueOf(c0797f.i());
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                if (c0797f.l() == 0) {
                    z8 = false;
                }
                return Boolean.valueOf(z8);
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                int k = c0797f.k();
                int i4 = c0797f.f11225b;
                int i8 = c0797f.f11227d;
                if (k <= i4 - i8 && k > 0) {
                    String str = new String(c0797f.f11224a, i8, k, "UTF-8");
                    c0797f.f11227d += k;
                    return str;
                }
                if (k == 0) {
                    return "";
                }
                return new String(c0797f.h(k), "UTF-8");
            case 9:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 10:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 11:
                return c0797f.e();
            case 12:
                return Integer.valueOf(c0797f.k());
            case 13:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            case 14:
                return Integer.valueOf(c0797f.i());
            case 15:
                return Long.valueOf(c0797f.j());
            case 16:
                int k6 = c0797f.k();
                return Integer.valueOf((-(k6 & 1)) ^ (k6 >>> 1));
            case 17:
                long l8 = c0797f.l();
                return Long.valueOf((-(l8 & 1)) ^ (l8 >>> 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
    
        if ((r3 instanceof byte[]) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        if ((r3 instanceof g7.p) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        r0 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void j(L l6, Object obj) {
        obj.getClass();
        boolean z8 = true;
        boolean z9 = false;
        switch (l6.f11205d.ordinal()) {
            case 0:
                z9 = obj instanceof Integer;
                break;
            case 1:
                z9 = obj instanceof Long;
                break;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                z9 = obj instanceof Float;
                break;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                z9 = obj instanceof Double;
                break;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                z9 = obj instanceof Boolean;
                break;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                z9 = obj instanceof String;
                break;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                if (!(obj instanceof AbstractC0796e)) {
                    break;
                }
                z9 = z8;
                break;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                if (!(obj instanceof Integer)) {
                    break;
                }
                z9 = z8;
                break;
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                z9 = obj instanceof AbstractC0793b;
                break;
        }
        if (z9) {
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    public static void k(L5.m mVar, L l6, Object obj) {
        switch (l6.ordinal()) {
            case 0:
                double doubleValue = ((Double) obj).doubleValue();
                mVar.getClass();
                mVar.u(Double.doubleToRawLongBits(doubleValue));
                return;
            case 1:
                float floatValue = ((Float) obj).floatValue();
                mVar.getClass();
                mVar.t(Float.floatToRawIntBits(floatValue));
                return;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                mVar.w(((Long) obj).longValue());
                return;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                mVar.w(((Long) obj).longValue());
                return;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                mVar.n(((Integer) obj).intValue());
                return;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                mVar.u(((Long) obj).longValue());
                return;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                mVar.t(((Integer) obj).intValue());
                return;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                mVar.q(((Boolean) obj).booleanValue() ? 1 : 0);
                return;
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                mVar.getClass();
                byte[] bytes = ((String) obj).getBytes("UTF-8");
                mVar.v(bytes.length);
                mVar.s(bytes);
                return;
            case 9:
                mVar.getClass();
                ((AbstractC0793b) obj).f(mVar);
                return;
            case 10:
                mVar.p((AbstractC0793b) obj);
                return;
            case 11:
                if (obj instanceof AbstractC0796e) {
                    AbstractC0796e abstractC0796e = (AbstractC0796e) obj;
                    mVar.getClass();
                    mVar.v(abstractC0796e.size());
                    mVar.r(abstractC0796e);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                mVar.getClass();
                mVar.v(bArr.length);
                mVar.s(bArr);
                return;
            case 12:
                mVar.v(((Integer) obj).intValue());
                return;
            case 13:
                if (obj instanceof p) {
                    mVar.n(((p) obj).a());
                    return;
                } else {
                    mVar.n(((Integer) obj).intValue());
                    return;
                }
            case 14:
                mVar.t(((Integer) obj).intValue());
                return;
            case 15:
                mVar.u(((Long) obj).longValue());
                return;
            case 16:
                int intValue = ((Integer) obj).intValue();
                mVar.v((intValue >> 31) ^ (intValue << 1));
                return;
            case 17:
                long longValue = ((Long) obj).longValue();
                mVar.w((longValue >> 63) ^ (longValue << 1));
                return;
            default:
                return;
        }
    }

    public final void a(C0804m c0804m, Object obj) {
        List list;
        if (c0804m.f11246f) {
            j(c0804m.f11245e, obj);
            z zVar = this.f11238a;
            Object obj2 = zVar.get(c0804m);
            if (obj2 == null) {
                list = new ArrayList();
                zVar.put(c0804m, list);
            } else {
                list = (List) obj2;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0800i clone() {
        z zVar;
        C0800i c0800i = new C0800i();
        int i4 = 0;
        while (true) {
            zVar = this.f11238a;
            if (i4 >= zVar.f11269e.size()) {
                break;
            }
            Map.Entry entry = (Map.Entry) zVar.f11269e.get(i4);
            c0800i.i((C0804m) entry.getKey(), entry.getValue());
            i4++;
        }
        for (Map.Entry entry2 : zVar.c()) {
            c0800i.i((C0804m) entry2.getKey(), entry2.getValue());
        }
        return c0800i;
    }

    public final void f() {
        Map unmodifiableMap;
        if (this.f11239b) {
            return;
        }
        z zVar = this.f11238a;
        if (!zVar.f11271g) {
            for (int i4 = 0; i4 < zVar.f11269e.size(); i4++) {
                Map.Entry entry = (Map.Entry) zVar.f11269e.get(i4);
                if (((C0804m) entry.getKey()).f11246f) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
            for (Map.Entry entry2 : zVar.c()) {
                if (((C0804m) entry2.getKey()).f11246f) {
                    entry2.setValue(Collections.unmodifiableList((List) entry2.getValue()));
                }
            }
        }
        if (!zVar.f11271g) {
            if (zVar.f11270f.isEmpty()) {
                unmodifiableMap = Collections.EMPTY_MAP;
            } else {
                unmodifiableMap = Collections.unmodifiableMap(zVar.f11270f);
            }
            zVar.f11270f = unmodifiableMap;
            zVar.f11271g = true;
        }
        this.f11239b = true;
    }

    public final void g(Map.Entry entry) {
        C0804m c0804m = (C0804m) entry.getKey();
        Object value = entry.getValue();
        boolean z8 = c0804m.f11246f;
        z zVar = this.f11238a;
        if (z8) {
            Object obj = zVar.get(c0804m);
            if (obj == null) {
                obj = new ArrayList();
            }
            for (Object obj2 : (List) value) {
                List list = (List) obj;
                if (obj2 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj2;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj2 = bArr2;
                }
                list.add(obj2);
            }
            zVar.put(c0804m, obj);
            return;
        }
        if (c0804m.f11245e.f11205d == M.MESSAGE) {
            Object obj3 = zVar.get(c0804m);
            if (obj3 == null) {
                if (value instanceof byte[]) {
                    byte[] bArr3 = (byte[]) value;
                    byte[] bArr4 = new byte[bArr3.length];
                    System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                    value = bArr4;
                }
                zVar.put(c0804m, value);
                return;
            }
            zVar.put(c0804m, ((AbstractC0793b) obj3).e().e((o) ((AbstractC0793b) value)).c());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        zVar.put(c0804m, value);
    }

    public final void i(C0804m c0804m, Object obj) {
        boolean z8 = c0804m.f11246f;
        L l6 = c0804m.f11245e;
        if (z8) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    j(l6, it.next());
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            j(l6, obj);
        }
        this.f11238a.put(c0804m, obj);
    }

    public C0800i(int i4) {
        f();
    }
}
