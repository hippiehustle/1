package n0;

import a6.AbstractC0434i;
import a6.AbstractC0436k;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import q4.X;
import s3.AbstractC1492c;

/* renamed from: n0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1125c extends AbstractC1117G {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f12747r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1125c(int i4, boolean z8) {
        super(z8);
        this.f12747r = i4;
    }

    public static float[] g(String str) {
        o6.j.e(str, "value");
        return new float[]{((Number) AbstractC1117G.f12730i.d(str)).floatValue()};
    }

    public static int[] h(String str) {
        o6.j.e(str, "value");
        return new int[]{((Number) AbstractC1117G.f12723b.d(str)).intValue()};
    }

    public static long[] i(String str) {
        o6.j.e(str, "value");
        return new long[]{((Number) AbstractC1117G.f12727f.d(str)).longValue()};
    }

    public static boolean[] j(String str) {
        o6.j.e(str, "value");
        return new boolean[]{((Boolean) AbstractC1117G.f12731l.d(str)).booleanValue()};
    }

    @Override // n0.AbstractC1117G
    public final Object a(String str, Bundle bundle) {
        switch (this.f12747r) {
            case 0:
                o6.j.e(bundle, "bundle");
                if (!bundle.containsKey(str) || X.B(str, bundle)) {
                    return null;
                }
                boolean[] booleanArray = bundle.getBooleanArray(str);
                if (booleanArray != null) {
                    return booleanArray;
                }
                AbstractC1492c.z(str);
                throw null;
            case 1:
                o6.j.e(bundle, "bundle");
                if (!bundle.containsKey(str) || X.B(str, bundle)) {
                    return null;
                }
                boolean[] booleanArray2 = bundle.getBooleanArray(str);
                if (booleanArray2 != null) {
                    return AbstractC0434i.j1(booleanArray2);
                }
                AbstractC1492c.z(str);
                throw null;
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                o6.j.e(bundle, "bundle");
                if (!bundle.containsKey(str) || X.B(str, bundle)) {
                    return null;
                }
                float[] floatArray = bundle.getFloatArray(str);
                if (floatArray != null) {
                    return floatArray;
                }
                AbstractC1492c.z(str);
                throw null;
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                o6.j.e(bundle, "bundle");
                if (!bundle.containsKey(str) || X.B(str, bundle)) {
                    return null;
                }
                float[] floatArray2 = bundle.getFloatArray(str);
                if (floatArray2 != null) {
                    return AbstractC0434i.f1(floatArray2);
                }
                AbstractC1492c.z(str);
                throw null;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                o6.j.e(bundle, "bundle");
                if (!bundle.containsKey(str) || X.B(str, bundle)) {
                    return null;
                }
                int[] intArray = bundle.getIntArray(str);
                if (intArray != null) {
                    return intArray;
                }
                AbstractC1492c.z(str);
                throw null;
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                o6.j.e(bundle, "bundle");
                if (!bundle.containsKey(str) || X.B(str, bundle)) {
                    return null;
                }
                int[] intArray2 = bundle.getIntArray(str);
                if (intArray2 != null) {
                    return AbstractC0434i.g1(intArray2);
                }
                AbstractC1492c.z(str);
                throw null;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                o6.j.e(bundle, "bundle");
                if (!bundle.containsKey(str) || X.B(str, bundle)) {
                    return null;
                }
                long[] longArray = bundle.getLongArray(str);
                if (longArray != null) {
                    return longArray;
                }
                AbstractC1492c.z(str);
                throw null;
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                o6.j.e(bundle, "bundle");
                if (!bundle.containsKey(str) || X.B(str, bundle)) {
                    return null;
                }
                long[] longArray2 = bundle.getLongArray(str);
                if (longArray2 != null) {
                    return AbstractC0434i.h1(longArray2);
                }
                AbstractC1492c.z(str);
                throw null;
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                o6.j.e(bundle, "bundle");
                if (!bundle.containsKey(str) || X.B(str, bundle)) {
                    return null;
                }
                String[] stringArray = bundle.getStringArray(str);
                if (stringArray != null) {
                    return stringArray;
                }
                AbstractC1492c.z(str);
                throw null;
            default:
                o6.j.e(bundle, "bundle");
                if (!bundle.containsKey(str) || X.B(str, bundle)) {
                    return null;
                }
                String[] stringArray2 = bundle.getStringArray(str);
                if (stringArray2 != null) {
                    return AbstractC0434i.i1(stringArray2);
                }
                AbstractC1492c.z(str);
                throw null;
        }
    }

    @Override // n0.AbstractC1117G
    public final String b() {
        switch (this.f12747r) {
            case 0:
                return "boolean[]";
            case 1:
                return "List<Boolean>";
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return "float[]";
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                return "List<Float>";
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                return "integer[]";
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                return "List<Int>";
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                return "long[]";
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                return "List<Long>";
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                return "string[]";
            default:
                return "List<String>";
        }
    }

    @Override // n0.AbstractC1117G
    public final Object c(Object obj, String str) {
        switch (this.f12747r) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                if (zArr != null) {
                    boolean[] j = j(str);
                    int length = zArr.length;
                    boolean[] copyOf = Arrays.copyOf(zArr, length + 1);
                    System.arraycopy(j, 0, copyOf, length, 1);
                    o6.j.b(copyOf);
                    return copyOf;
                }
                return j(str);
            case 1:
                List list = (List) obj;
                C1126d c1126d = AbstractC1117G.f12731l;
                if (list != null) {
                    return AbstractC0436k.C0(list, E2.d.y(c1126d.d(str)));
                }
                return E2.d.y(c1126d.d(str));
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                float[] fArr = (float[]) obj;
                if (fArr != null) {
                    float[] g8 = g(str);
                    int length2 = fArr.length;
                    float[] copyOf2 = Arrays.copyOf(fArr, length2 + 1);
                    System.arraycopy(g8, 0, copyOf2, length2, 1);
                    o6.j.b(copyOf2);
                    return copyOf2;
                }
                return g(str);
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                List list2 = (List) obj;
                C1126d c1126d2 = AbstractC1117G.f12730i;
                if (list2 != null) {
                    return AbstractC0436k.C0(list2, E2.d.y(c1126d2.d(str)));
                }
                return E2.d.y(c1126d2.d(str));
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                int[] iArr = (int[]) obj;
                if (iArr != null) {
                    int[] h8 = h(str);
                    int length3 = iArr.length;
                    int[] copyOf3 = Arrays.copyOf(iArr, length3 + 1);
                    System.arraycopy(h8, 0, copyOf3, length3, 1);
                    o6.j.b(copyOf3);
                    return copyOf3;
                }
                return h(str);
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                List list3 = (List) obj;
                C1126d c1126d3 = AbstractC1117G.f12723b;
                if (list3 != null) {
                    return AbstractC0436k.C0(list3, E2.d.y(c1126d3.d(str)));
                }
                return E2.d.y(c1126d3.d(str));
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                long[] jArr = (long[]) obj;
                if (jArr != null) {
                    long[] i4 = i(str);
                    int length4 = jArr.length;
                    long[] copyOf4 = Arrays.copyOf(jArr, length4 + 1);
                    System.arraycopy(i4, 0, copyOf4, length4, 1);
                    o6.j.b(copyOf4);
                    return copyOf4;
                }
                return i(str);
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                List list4 = (List) obj;
                C1126d c1126d4 = AbstractC1117G.f12727f;
                if (list4 != null) {
                    return AbstractC0436k.C0(list4, E2.d.y(c1126d4.d(str)));
                }
                return E2.d.y(c1126d4.d(str));
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                String[] strArr = (String[]) obj;
                if (strArr != null) {
                    int length5 = strArr.length;
                    Object[] copyOf5 = Arrays.copyOf(strArr, length5 + 1);
                    System.arraycopy(new String[]{str}, 0, copyOf5, length5, 1);
                    o6.j.b(copyOf5);
                    return (String[]) copyOf5;
                }
                return new String[]{str};
            default:
                List list5 = (List) obj;
                if (list5 != null) {
                    return AbstractC0436k.C0(list5, E2.d.y(str));
                }
                return E2.d.y(str);
        }
    }

    @Override // n0.AbstractC1117G
    public final Object d(String str) {
        switch (this.f12747r) {
            case 0:
                return j(str);
            case 1:
                o6.j.e(str, "value");
                return E2.d.y(AbstractC1117G.f12731l.d(str));
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return g(str);
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                o6.j.e(str, "value");
                return E2.d.y(AbstractC1117G.f12730i.d(str));
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                return h(str);
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                o6.j.e(str, "value");
                return E2.d.y(AbstractC1117G.f12723b.d(str));
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                return i(str);
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                o6.j.e(str, "value");
                return E2.d.y(AbstractC1117G.f12727f.d(str));
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                o6.j.e(str, "value");
                return new String[]{str};
            default:
                o6.j.e(str, "value");
                return E2.d.y(str);
        }
    }

    @Override // n0.AbstractC1117G
    public final void e(Bundle bundle, String str, Object obj) {
        switch (this.f12747r) {
            case 0:
                boolean[] zArr = (boolean[]) obj;
                o6.j.e(str, "key");
                if (zArr != null) {
                    bundle.putBooleanArray(str, zArr);
                    return;
                } else {
                    D2.f.D(str, bundle);
                    return;
                }
            case 1:
                List list = (List) obj;
                o6.j.e(str, "key");
                if (list != null) {
                    bundle.putBooleanArray(str, AbstractC0436k.N0(list));
                    return;
                } else {
                    D2.f.D(str, bundle);
                    return;
                }
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                float[] fArr = (float[]) obj;
                o6.j.e(str, "key");
                if (fArr != null) {
                    bundle.putFloatArray(str, fArr);
                    return;
                } else {
                    D2.f.D(str, bundle);
                    return;
                }
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
                List list2 = (List) obj;
                o6.j.e(str, "key");
                if (list2 != null) {
                    float[] fArr2 = new float[list2.size()];
                    Iterator it = list2.iterator();
                    int i4 = 0;
                    while (it.hasNext()) {
                        fArr2[i4] = ((Number) it.next()).floatValue();
                        i4++;
                    }
                    bundle.putFloatArray(str, fArr2);
                    return;
                }
                D2.f.D(str, bundle);
                return;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                int[] iArr = (int[]) obj;
                o6.j.e(str, "key");
                if (iArr != null) {
                    bundle.putIntArray(str, iArr);
                    return;
                } else {
                    D2.f.D(str, bundle);
                    return;
                }
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
                List list3 = (List) obj;
                o6.j.e(str, "key");
                if (list3 != null) {
                    bundle.putIntArray(str, AbstractC0436k.P0(list3));
                    return;
                }
                return;
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
                long[] jArr = (long[]) obj;
                o6.j.e(str, "key");
                if (jArr != null) {
                    bundle.putLongArray(str, jArr);
                    return;
                } else {
                    D2.f.D(str, bundle);
                    return;
                }
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                List list4 = (List) obj;
                o6.j.e(str, "key");
                if (list4 != null) {
                    bundle.putLongArray(str, AbstractC0436k.R0(list4));
                    return;
                } else {
                    D2.f.D(str, bundle);
                    return;
                }
            case Z.g.BYTES_FIELD_NUMBER /* 8 */:
                String[] strArr = (String[]) obj;
                o6.j.e(str, "key");
                if (strArr != null) {
                    bundle.putStringArray(str, strArr);
                    return;
                } else {
                    D2.f.D(str, bundle);
                    return;
                }
            default:
                List list5 = (List) obj;
                o6.j.e(str, "key");
                if (list5 != null) {
                    String[] strArr2 = (String[]) list5.toArray(new String[0]);
                    o6.j.e(strArr2, "value");
                    bundle.putStringArray(str, strArr2);
                    return;
                }
                D2.f.D(str, bundle);
                return;
        }
    }
}
