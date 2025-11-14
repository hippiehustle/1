package Q7;

import L7.M;
import L7.N;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public class x {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4975b = AtomicIntegerFieldUpdater.newUpdater(x.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* renamed from: a, reason: collision with root package name */
    public M[] f4976a;

    public final void a(M m6) {
        m6.d((N) this);
        M[] mArr = this.f4976a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f4975b;
        if (mArr == null) {
            mArr = new M[4];
            this.f4976a = mArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= mArr.length) {
            Object[] copyOf = Arrays.copyOf(mArr, atomicIntegerFieldUpdater.get(this) * 2);
            o6.j.d(copyOf, "copyOf(...)");
            mArr = (M[]) copyOf;
            this.f4976a = mArr;
        }
        int i4 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i4 + 1);
        mArr[i4] = m6;
        m6.f3184e = i4;
        c(i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r6.compareTo(r7) < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final M b(int i4) {
        Object[] objArr = this.f4976a;
        o6.j.b(objArr);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f4975b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i4 < atomicIntegerFieldUpdater.get(this)) {
            d(i4, atomicIntegerFieldUpdater.get(this));
            int i8 = (i4 - 1) / 2;
            if (i4 > 0) {
                M m6 = objArr[i4];
                o6.j.b(m6);
                Object obj = objArr[i8];
                o6.j.b(obj);
                if (m6.compareTo(obj) < 0) {
                    d(i4, i8);
                    c(i8);
                }
            }
            while (true) {
                int i9 = i4 * 2;
                int i10 = i9 + 1;
                if (i10 >= atomicIntegerFieldUpdater.get(this)) {
                    break;
                }
                Object[] objArr2 = this.f4976a;
                o6.j.b(objArr2);
                int i11 = i9 + 2;
                if (i11 < atomicIntegerFieldUpdater.get(this)) {
                    Comparable comparable = objArr2[i11];
                    o6.j.b(comparable);
                    Object obj2 = objArr2[i10];
                    o6.j.b(obj2);
                }
                i11 = i10;
                Comparable comparable2 = objArr2[i4];
                o6.j.b(comparable2);
                Comparable comparable3 = objArr2[i11];
                o6.j.b(comparable3);
                if (comparable2.compareTo(comparable3) <= 0) {
                    break;
                }
                d(i4, i11);
                i4 = i11;
            }
        }
        M m8 = objArr[atomicIntegerFieldUpdater.get(this)];
        o6.j.b(m8);
        m8.d(null);
        m8.f3184e = -1;
        objArr[atomicIntegerFieldUpdater.get(this)] = null;
        return m8;
    }

    public final void c(int i4) {
        while (i4 > 0) {
            M[] mArr = this.f4976a;
            o6.j.b(mArr);
            int i8 = (i4 - 1) / 2;
            M m6 = mArr[i8];
            o6.j.b(m6);
            M m8 = mArr[i4];
            o6.j.b(m8);
            if (m6.compareTo(m8) <= 0) {
                return;
            }
            d(i4, i8);
            i4 = i8;
        }
    }

    public final void d(int i4, int i8) {
        M[] mArr = this.f4976a;
        o6.j.b(mArr);
        M m6 = mArr[i8];
        o6.j.b(m6);
        M m8 = mArr[i4];
        o6.j.b(m8);
        mArr[i4] = m6;
        mArr[i8] = m8;
        m6.f3184e = i4;
        m8.f3184e = i8;
    }
}
