package a6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import n6.InterfaceC1163b;
import q4.X;

/* renamed from: a6.i */
/* loaded from: classes.dex */
public abstract class AbstractC0434i extends E2.c {
    public static Iterable J0(Object[] objArr) {
        o6.j.e(objArr, "<this>");
        if (objArr.length == 0) {
            return s.f7766d;
        }
        return new H7.q(2, objArr);
    }

    public static List K0(Object[] objArr) {
        o6.j.e(objArr, "<this>");
        List asList = Arrays.asList(objArr);
        o6.j.d(asList, "asList(...)");
        return asList;
    }

    public static H7.k L0(Object[] objArr) {
        if (objArr.length == 0) {
            return H7.e.f2051a;
        }
        return new H7.p(3, objArr);
    }

    public static boolean M0(Object obj, Object[] objArr) {
        o6.j.e(objArr, "<this>");
        if (Z0(obj, objArr) >= 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [long[]] */
    /* JADX WARN: Type inference failed for: r5v4, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v6, types: [short[]] */
    public static boolean N0(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr == null || objArr2 == null || objArr.length != objArr2.length) {
            return false;
        }
        int length = objArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            Object obj = objArr[i4];
            Object obj2 = objArr2[i4];
            if (obj != obj2) {
                if (obj == null || obj2 == null) {
                    return false;
                }
                if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                    if (!N0((Object[]) obj, (Object[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                    if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                    if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                    if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                    if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                    if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                    if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                    if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                    if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                        return false;
                    }
                } else {
                    byte[] bArr = null;
                    if ((obj instanceof Z5.q) && (obj2 instanceof Z5.q)) {
                        byte[] bArr2 = ((Z5.q) obj).f7498d;
                        byte[] bArr3 = ((Z5.q) obj2).f7498d;
                        if (bArr2 == null) {
                            bArr2 = null;
                        }
                        if (bArr3 != null) {
                            bArr = bArr3;
                        }
                        if (!Arrays.equals(bArr2, bArr)) {
                            return false;
                        }
                    } else if ((obj instanceof Z5.x) && (obj2 instanceof Z5.x)) {
                        short[] sArr = ((Z5.x) obj).f7505d;
                        ?? r52 = ((Z5.x) obj2).f7505d;
                        if (sArr == null) {
                            sArr = null;
                        }
                        if (r52 != 0) {
                            bArr = r52;
                        }
                        if (!Arrays.equals(sArr, (short[]) bArr)) {
                            return false;
                        }
                    } else if ((obj instanceof Z5.s) && (obj2 instanceof Z5.s)) {
                        int[] iArr = ((Z5.s) obj).f7500d;
                        ?? r53 = ((Z5.s) obj2).f7500d;
                        if (iArr == null) {
                            iArr = null;
                        }
                        if (r53 != 0) {
                            bArr = r53;
                        }
                        if (!Arrays.equals(iArr, (int[]) bArr)) {
                            return false;
                        }
                    } else if ((obj instanceof Z5.u) && (obj2 instanceof Z5.u)) {
                        long[] jArr = ((Z5.u) obj).f7502d;
                        ?? r54 = ((Z5.u) obj2).f7502d;
                        if (jArr == null) {
                            jArr = null;
                        }
                        if (r54 != 0) {
                            bArr = r54;
                        }
                        if (!Arrays.equals(jArr, (long[]) bArr)) {
                            return false;
                        }
                    } else if (!obj.equals(obj2)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void O0(int i4, int i8, int i9, byte[] bArr, byte[] bArr2) {
        o6.j.e(bArr, "<this>");
        System.arraycopy(bArr, i8, bArr2, i4, i9 - i8);
    }

    public static void P0(int i4, int i8, int i9, int[] iArr, int[] iArr2) {
        o6.j.e(iArr, "<this>");
        o6.j.e(iArr2, "destination");
        System.arraycopy(iArr, i8, iArr2, i4, i9 - i8);
    }

    public static void Q0(Object[] objArr, Object[] objArr2, int i4, int i8, int i9) {
        o6.j.e(objArr, "<this>");
        o6.j.e(objArr2, "destination");
        System.arraycopy(objArr, i8, objArr2, i4, i9 - i8);
    }

    public static /* synthetic */ void R0(int i4, int i8, int[] iArr, int[] iArr2) {
        if ((i8 & 8) != 0) {
            i4 = iArr.length;
        }
        P0(0, 0, i4, iArr, iArr2);
    }

    public static /* synthetic */ void S0(Object[] objArr, Object[] objArr2, int i4, int i8, int i9) {
        if ((i9 & 4) != 0) {
            i4 = 0;
        }
        if ((i9 & 8) != 0) {
            i8 = objArr.length;
        }
        Q0(objArr, objArr2, 0, i4, i8);
    }

    public static Object[] T0(Object[] objArr, int i4, int i8) {
        o6.j.e(objArr, "<this>");
        E2.c.O(i8, objArr.length);
        Object[] copyOfRange = Arrays.copyOfRange(objArr, i4, i8);
        o6.j.d(copyOfRange, "copyOfRange(...)");
        return copyOfRange;
    }

    public static final void U0(Object[] objArr, Q7.t tVar, int i4, int i8) {
        o6.j.e(objArr, "<this>");
        Arrays.fill(objArr, i4, i8, tVar);
    }

    public static ArrayList V0(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object W0(Object[] objArr) {
        o6.j.e(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static Object X0(Object[] objArr) {
        o6.j.e(objArr, "<this>");
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    public static Integer Y0(int[] iArr, int i4) {
        o6.j.e(iArr, "<this>");
        if (i4 >= 0 && i4 < iArr.length) {
            return Integer.valueOf(iArr[i4]);
        }
        return null;
    }

    public static int Z0(Object obj, Object[] objArr) {
        o6.j.e(objArr, "<this>");
        int i4 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i4 < length) {
                if (objArr[i4] == null) {
                    return i4;
                }
                i4++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i4 < length2) {
            if (obj.equals(objArr[i4])) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    public static final void a1(Object[] objArr, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, InterfaceC1163b interfaceC1163b) {
        o6.j.e(objArr, "<this>");
        sb.append(charSequence2);
        int i4 = 0;
        for (Object obj : objArr) {
            i4++;
            if (i4 > 1) {
                sb.append(charSequence);
            }
            D2.f.b(sb, obj, interfaceC1163b);
        }
        sb.append(charSequence3);
    }

    public static String b1(Object[] objArr, String str, String str2, String str3, InterfaceC1163b interfaceC1163b, int i4) {
        if ((i4 & 32) != 0) {
            interfaceC1163b = null;
        }
        o6.j.e(objArr, "<this>");
        StringBuilder sb = new StringBuilder();
        a1(objArr, sb, str, str2, str3, "...", interfaceC1163b);
        return sb.toString();
    }

    public static Object c1(Object[] objArr) {
        o6.j.e(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[objArr.length - 1];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static Object d1(Object[] objArr) {
        o6.j.e(objArr, "<this>");
        int length = objArr.length;
        if (length != 0) {
            if (length == 1) {
                return objArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final void e1(Object[] objArr, LinkedHashSet linkedHashSet) {
        o6.j.e(objArr, "<this>");
        for (Object obj : objArr) {
            linkedHashSet.add(obj);
        }
    }

    public static List f1(float[] fArr) {
        o6.j.e(fArr, "<this>");
        int length = fArr.length;
        if (length != 0) {
            if (length != 1) {
                ArrayList arrayList = new ArrayList(fArr.length);
                for (float f8 : fArr) {
                    arrayList.add(Float.valueOf(f8));
                }
                return arrayList;
            }
            return E2.d.y(Float.valueOf(fArr[0]));
        }
        return s.f7766d;
    }

    public static List g1(int[] iArr) {
        o6.j.e(iArr, "<this>");
        int length = iArr.length;
        if (length != 0) {
            if (length != 1) {
                return k1(iArr);
            }
            return E2.d.y(Integer.valueOf(iArr[0]));
        }
        return s.f7766d;
    }

    public static List h1(long[] jArr) {
        o6.j.e(jArr, "<this>");
        int length = jArr.length;
        if (length != 0) {
            if (length != 1) {
                ArrayList arrayList = new ArrayList(jArr.length);
                for (long j : jArr) {
                    arrayList.add(Long.valueOf(j));
                }
                return arrayList;
            }
            return E2.d.y(Long.valueOf(jArr[0]));
        }
        return s.f7766d;
    }

    public static List i1(Object[] objArr) {
        o6.j.e(objArr, "<this>");
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                return new ArrayList(new C0432g(objArr, false));
            }
            return E2.d.y(objArr[0]);
        }
        return s.f7766d;
    }

    public static List j1(boolean[] zArr) {
        o6.j.e(zArr, "<this>");
        int length = zArr.length;
        if (length != 0) {
            if (length != 1) {
                ArrayList arrayList = new ArrayList(zArr.length);
                for (boolean z8 : zArr) {
                    arrayList.add(Boolean.valueOf(z8));
                }
                return arrayList;
            }
            return E2.d.y(Boolean.valueOf(zArr[0]));
        }
        return s.f7766d;
    }

    public static ArrayList k1(int[] iArr) {
        o6.j.e(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i4 : iArr) {
            arrayList.add(Integer.valueOf(i4));
        }
        return arrayList;
    }

    public static Set l1(Object[] objArr) {
        o6.j.e(objArr, "<this>");
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(x.N0(objArr.length));
                e1(objArr, linkedHashSet);
                return linkedHashSet;
            }
            return X.T(objArr[0]);
        }
        return u.f7768d;
    }
}
