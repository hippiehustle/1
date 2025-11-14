package F7;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.RandomAccess;
import n1.AbstractC1149a;

/* loaded from: classes.dex */
public final class f extends AbstractList implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    public int f1624d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1625e;

    public static /* synthetic */ void g(int i4) {
        String str;
        int i8;
        if (i4 != 2 && i4 != 3 && i4 != 5 && i4 != 6 && i4 != 7) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i4 != 2 && i4 != 3 && i4 != 5 && i4 != 6 && i4 != 7) {
            i8 = 3;
        } else {
            i8 = 2;
        }
        Object[] objArr = new Object[i8];
        switch (i4) {
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i4 != 2 && i4 != 3) {
            if (i4 != 5 && i4 != 6 && i4 != 7) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
            } else {
                objArr[1] = "toArray";
            }
        } else {
            objArr[1] = "iterator";
        }
        switch (i4) {
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
            case Z.g.INTEGER_FIELD_NUMBER /* 3 */:
            case Z.g.STRING_FIELD_NUMBER /* 5 */:
            case Z.g.STRING_SET_FIELD_NUMBER /* 6 */:
            case Z.g.DOUBLE_FIELD_NUMBER /* 7 */:
                break;
            case Z.g.LONG_FIELD_NUMBER /* 4 */:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i4 == 2 || i4 == 3 || i4 == 5 || i4 == 6 || i4 == 7) {
            throw new IllegalStateException(format);
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        int i4 = this.f1624d;
        if (i4 == 0) {
            this.f1625e = obj;
        } else if (i4 == 1) {
            this.f1625e = new Object[]{this.f1625e, obj};
        } else {
            Object[] objArr = (Object[]) this.f1625e;
            int length = objArr.length;
            if (i4 >= length) {
                int i8 = ((length * 3) / 2) + 1;
                int i9 = i4 + 1;
                if (i8 < i9) {
                    i8 = i9;
                }
                Object[] objArr2 = new Object[i8];
                this.f1625e = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.f1624d] = obj;
        }
        this.f1624d++;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f1625e = null;
        this.f1624d = 0;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i4) {
        int i8;
        if (i4 >= 0 && i4 < (i8 = this.f1624d)) {
            if (i8 == 1) {
                return this.f1625e;
            }
            return ((Object[]) this.f1625e)[i4];
        }
        StringBuilder j = AbstractC1149a.j(i4, "Index: ", ", Size: ");
        j.append(this.f1624d);
        throw new IndexOutOfBoundsException(j.toString());
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        int i4 = this.f1624d;
        if (i4 == 0) {
            return d.f1620d;
        }
        if (i4 == 1) {
            return new e(this);
        }
        Iterator it = super.iterator();
        if (it != null) {
            return it;
        }
        g(3);
        throw null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i4) {
        int i8;
        Object obj;
        if (i4 >= 0 && i4 < (i8 = this.f1624d)) {
            if (i8 == 1) {
                obj = this.f1625e;
                this.f1625e = null;
            } else {
                Object[] objArr = (Object[]) this.f1625e;
                Object obj2 = objArr[i4];
                if (i8 == 2) {
                    this.f1625e = objArr[1 - i4];
                } else {
                    int i9 = (i8 - i4) - 1;
                    if (i9 > 0) {
                        System.arraycopy(objArr, i4 + 1, objArr, i4, i9);
                    }
                    objArr[this.f1624d - 1] = null;
                }
                obj = obj2;
            }
            this.f1624d--;
            ((AbstractList) this).modCount++;
            return obj;
        }
        StringBuilder j = AbstractC1149a.j(i4, "Index: ", ", Size: ");
        j.append(this.f1624d);
        throw new IndexOutOfBoundsException(j.toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i4, Object obj) {
        int i8;
        if (i4 >= 0 && i4 < (i8 = this.f1624d)) {
            if (i8 == 1) {
                Object obj2 = this.f1625e;
                this.f1625e = obj;
                return obj2;
            }
            Object[] objArr = (Object[]) this.f1625e;
            Object obj3 = objArr[i4];
            objArr[i4] = obj;
            return obj3;
        }
        StringBuilder j = AbstractC1149a.j(i4, "Index: ", ", Size: ");
        j.append(this.f1624d);
        throw new IndexOutOfBoundsException(j.toString());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f1624d;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        int i4 = this.f1624d;
        if (i4 >= 2) {
            Arrays.sort((Object[]) this.f1625e, 0, i4, comparator);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        if (objArr != null) {
            int length = objArr.length;
            int i4 = this.f1624d;
            if (i4 == 1) {
                if (length != 0) {
                    objArr[0] = this.f1625e;
                } else {
                    Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), 1);
                    objArr2[0] = this.f1625e;
                    return objArr2;
                }
            } else {
                if (length < i4) {
                    Object[] copyOf = Arrays.copyOf((Object[]) this.f1625e, i4, objArr.getClass());
                    if (copyOf != null) {
                        return copyOf;
                    }
                    g(6);
                    throw null;
                }
                if (i4 != 0) {
                    System.arraycopy(this.f1625e, 0, objArr, 0, i4);
                }
            }
            int i8 = this.f1624d;
            if (length > i8) {
                objArr[i8] = null;
            }
            return objArr;
        }
        g(4);
        throw null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i4, Object obj) {
        int i8;
        if (i4 >= 0 && i4 <= (i8 = this.f1624d)) {
            if (i8 == 0) {
                this.f1625e = obj;
            } else if (i8 == 1 && i4 == 0) {
                this.f1625e = new Object[]{obj, this.f1625e};
            } else {
                Object[] objArr = new Object[i8 + 1];
                if (i8 == 1) {
                    objArr[0] = this.f1625e;
                } else {
                    Object[] objArr2 = (Object[]) this.f1625e;
                    System.arraycopy(objArr2, 0, objArr, 0, i4);
                    System.arraycopy(objArr2, i4, objArr, i4 + 1, this.f1624d - i4);
                }
                objArr[i4] = obj;
                this.f1625e = objArr;
            }
            this.f1624d++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder j = AbstractC1149a.j(i4, "Index: ", ", Size: ");
        j.append(this.f1624d);
        throw new IndexOutOfBoundsException(j.toString());
    }
}
