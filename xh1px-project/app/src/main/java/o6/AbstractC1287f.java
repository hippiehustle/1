package o6;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: o6.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1287f {

    /* renamed from: a, reason: collision with root package name */
    public static final Object[] f13636a = new Object[0];

    public static final Object[] a(Collection collection) {
        int size = collection.size();
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArr = new Object[size];
                int i4 = 0;
                while (true) {
                    int i8 = i4 + 1;
                    objArr[i4] = it.next();
                    if (i8 >= objArr.length) {
                        if (!it.hasNext()) {
                            return objArr;
                        }
                        int i9 = ((i8 * 3) + 1) >>> 1;
                        if (i9 <= i8) {
                            i9 = 2147483645;
                            if (i8 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr = Arrays.copyOf(objArr, i9);
                        j.d(objArr, "copyOf(...)");
                    } else if (!it.hasNext()) {
                        Object[] copyOf = Arrays.copyOf(objArr, i8);
                        j.d(copyOf, "copyOf(...)");
                        return copyOf;
                    }
                    i4 = i8;
                }
            }
        }
        return f13636a;
    }

    public static final Object[] b(Collection collection, Object[] objArr) {
        Object[] objArr2;
        int size = collection.size();
        int i4 = 0;
        if (size == 0) {
            if (objArr.length > 0) {
                objArr[0] = null;
                return objArr;
            }
        } else {
            Iterator it = collection.iterator();
            if (!it.hasNext()) {
                if (objArr.length > 0) {
                    objArr[0] = null;
                }
            } else {
                if (size <= objArr.length) {
                    objArr2 = objArr;
                } else {
                    Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    j.c(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    objArr2 = (Object[]) newInstance;
                }
                while (true) {
                    int i8 = i4 + 1;
                    objArr2[i4] = it.next();
                    if (i8 >= objArr2.length) {
                        if (!it.hasNext()) {
                            return objArr2;
                        }
                        int i9 = ((i8 * 3) + 1) >>> 1;
                        if (i9 <= i8) {
                            i9 = 2147483645;
                            if (i8 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr2 = Arrays.copyOf(objArr2, i9);
                        j.d(objArr2, "copyOf(...)");
                    } else if (!it.hasNext()) {
                        if (objArr2 == objArr) {
                            objArr[i8] = null;
                            return objArr;
                        }
                        Object[] copyOf = Arrays.copyOf(objArr2, i8);
                        j.d(copyOf, "copyOf(...)");
                        return copyOf;
                    }
                    i4 = i8;
                }
            }
        }
        return objArr;
    }
}
