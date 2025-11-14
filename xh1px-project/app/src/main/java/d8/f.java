package d8;

import a6.AbstractC0429d;
import a6.AbstractC0437l;
import a6.C0432g;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.RandomAccess;
import s3.AbstractC1492c;

/* loaded from: classes.dex */
public final class f extends AbstractC0429d implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public final c[] f10532d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f10533e;

    public f(c[] cVarArr, int[] iArr) {
        this.f10532d = cVarArr;
        this.f10533e = iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0134, code lost:
    
        continue;
     */
    /* JADX WARN: Type inference failed for: r5v2, types: [d8.a, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final f h(c... cVarArr) {
        int i4;
        int i8;
        int i9 = 0;
        if (cVarArr.length == 0) {
            return new f(new c[0], new int[]{0, -1});
        }
        ArrayList arrayList = new ArrayList(new C0432g(cVarArr, false));
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(cVarArr.length);
        for (c cVar : cVarArr) {
            arrayList2.add(-1);
        }
        Integer[] numArr = (Integer[]) arrayList2.toArray(new Integer[0]);
        ArrayList Z8 = AbstractC0437l.Z(Arrays.copyOf(numArr, numArr.length));
        int length = cVarArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            c cVar2 = cVarArr[i10];
            int i12 = i11 + 1;
            int size = arrayList.size();
            int size2 = arrayList.size();
            if (size >= 0) {
                if (size <= size2) {
                    int i13 = size - 1;
                    int i14 = 0;
                    while (true) {
                        if (i14 <= i13) {
                            i8 = (i14 + i13) >>> 1;
                            int N8 = E2.c.N((Comparable) arrayList.get(i8), cVar2);
                            if (N8 < 0) {
                                i14 = i8 + 1;
                            } else if (N8 > 0) {
                                i13 = i8 - 1;
                            }
                        } else {
                            i8 = -(i14 + 1);
                            break;
                        }
                    }
                    Z8.set(i8, Integer.valueOf(i11));
                    i10++;
                    i11 = i12;
                } else {
                    throw new IndexOutOfBoundsException("toIndex (" + size + ") is greater than size (" + size2 + ").");
                }
            } else {
                throw new IllegalArgumentException(A.j.j(size, "fromIndex (0) is greater than toIndex (", ")."));
            }
        }
        if (((c) arrayList.get(0)).b() > 0) {
            int i15 = 0;
            while (i15 < arrayList.size()) {
                c cVar3 = (c) arrayList.get(i15);
                int i16 = i15 + 1;
                int i17 = i16;
                while (i17 < arrayList.size()) {
                    c cVar4 = (c) arrayList.get(i17);
                    cVar4.getClass();
                    o6.j.e(cVar3, "prefix");
                    if (cVar4.g(cVar3, cVar3.b())) {
                        if (cVar4.b() != cVar3.b()) {
                            if (((Number) Z8.get(i17)).intValue() > ((Number) Z8.get(i15)).intValue()) {
                                arrayList.remove(i17);
                                Z8.remove(i17);
                            } else {
                                i17++;
                            }
                        } else {
                            throw new IllegalArgumentException(("duplicate option: " + cVar4).toString());
                        }
                    }
                }
                i15 = i16;
            }
            ?? obj = new Object();
            AbstractC1492c.e(0L, obj, 0, arrayList, 0, arrayList.size(), Z8);
            int[] iArr = new int[(int) (obj.f10525e / 4)];
            while (true) {
                long j = obj.f10525e;
                if (j == 0) {
                    Object[] copyOf = Arrays.copyOf(cVarArr, cVarArr.length);
                    o6.j.d(copyOf, "copyOf(this, size)");
                    return new f((c[]) copyOf, iArr);
                }
                int i18 = i9 + 1;
                if (j >= 4) {
                    j jVar = obj.f10524d;
                    o6.j.b(jVar);
                    int i19 = jVar.f10545b;
                    int i20 = jVar.f10546c;
                    if (i20 - i19 < 4) {
                        i4 = ((obj.d() & 255) << 24) | ((obj.d() & 255) << 16) | ((obj.d() & 255) << 8) | (obj.d() & 255);
                    } else {
                        byte[] bArr = jVar.f10544a;
                        int i21 = i19 + 3;
                        int i22 = ((bArr[i19 + 1] & 255) << 16) | ((bArr[i19] & 255) << 24) | ((bArr[i19 + 2] & 255) << 8);
                        int i23 = i19 + 4;
                        int i24 = (bArr[i21] & 255) | i22;
                        obj.f10525e -= 4;
                        if (i23 == i20) {
                            obj.f10524d = jVar.a();
                            k.a(jVar);
                        } else {
                            jVar.f10545b = i23;
                        }
                        i4 = i24;
                    }
                    iArr[i9] = i4;
                    i9 = i18;
                } else {
                    throw new EOFException();
                }
            }
        } else {
            throw new IllegalArgumentException("the empty byte string is not a supported option");
        }
    }

    @Override // a6.AbstractC0426a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        return super.contains((c) obj);
    }

    @Override // a6.AbstractC0426a
    public final int g() {
        return this.f10532d.length;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        return this.f10532d[i4];
    }

    @Override // a6.AbstractC0429d, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof c)) {
            return -1;
        }
        return super.indexOf((c) obj);
    }

    @Override // a6.AbstractC0429d, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof c)) {
            return -1;
        }
        return super.lastIndexOf((c) obj);
    }
}
