package g6;

import a6.AbstractC0429d;
import java.io.Serializable;
import o6.j;

/* renamed from: g6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0790b extends AbstractC0429d implements InterfaceC0789a, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final Enum[] f11192d;

    public C0790b(Enum[] enumArr) {
        this.f11192d = enumArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d A[RETURN] */
    @Override // a6.AbstractC0426a, java.util.Collection, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean contains(Object obj) {
        Enum r02;
        if (obj instanceof Enum) {
            Enum r42 = (Enum) obj;
            j.e(r42, "element");
            int ordinal = r42.ordinal();
            if (ordinal >= 0) {
                Enum[] enumArr = this.f11192d;
                if (ordinal < enumArr.length) {
                    r02 = enumArr[ordinal];
                    if (r02 != r42) {
                        return true;
                    }
                    return false;
                }
            }
            r02 = null;
            if (r02 != r42) {
            }
        } else {
            return false;
        }
    }

    @Override // a6.AbstractC0426a
    public final int g() {
        return this.f11192d.length;
    }

    @Override // java.util.List
    public final Object get(int i4) {
        Enum[] enumArr = this.f11192d;
        int length = enumArr.length;
        if (i4 >= 0 && i4 < length) {
            return enumArr[i4];
        }
        throw new IndexOutOfBoundsException(A.j.i(i4, length, "index: ", ", size: "));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001f A[RETURN] */
    @Override // a6.AbstractC0429d, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int indexOf(Object obj) {
        Enum r22;
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r52 = (Enum) obj;
        j.e(r52, "element");
        int ordinal = r52.ordinal();
        if (ordinal >= 0) {
            Enum[] enumArr = this.f11192d;
            if (ordinal < enumArr.length) {
                r22 = enumArr[ordinal];
                if (r22 == r52) {
                    return -1;
                }
                return ordinal;
            }
        }
        r22 = null;
        if (r22 == r52) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001f A[RETURN] */
    @Override // a6.AbstractC0429d, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int lastIndexOf(Object obj) {
        Enum r22;
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r52 = (Enum) obj;
        j.e(r52, "element");
        int ordinal = r52.ordinal();
        if (ordinal >= 0) {
            Enum[] enumArr = this.f11192d;
            if (ordinal < enumArr.length) {
                r22 = enumArr[ordinal];
                if (r22 == r52) {
                    return -1;
                }
                return ordinal;
            }
        }
        r22 = null;
        if (r22 == r52) {
        }
    }
}
