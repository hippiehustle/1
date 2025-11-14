package Q7;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4955e = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_next$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f4956f = AtomicLongFieldUpdater.newUpdater(m.class, "_state$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final t f4957g = new t("REMOVE_FROZEN", 0);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f4958a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4959b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4960c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f4961d;

    public m(int i4, boolean z8) {
        this.f4958a = i4;
        this.f4959b = z8;
        int i8 = i4 - 1;
        this.f4960c = i8;
        this.f4961d = new AtomicReferenceArray(i4);
        if (i8 <= 1073741823) {
            if ((i4 & i8) == 0) {
                return;
            } else {
                throw new IllegalStateException("Check failed.");
            }
        }
        throw new IllegalStateException("Check failed.");
    }

    public final int a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f4956f;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                if ((2305843009213693952L & j) != 0) {
                    return 2;
                }
                return 1;
            }
            int i4 = (int) (1073741823 & j);
            int i8 = (int) ((1152921503533105152L & j) >> 30);
            int i9 = this.f4960c;
            if (((i8 + 2) & i9) != (i4 & i9)) {
                boolean z8 = this.f4959b;
                AtomicReferenceArray atomicReferenceArray = this.f4961d;
                if (!z8 && atomicReferenceArray.get(i8 & i9) != null) {
                    int i10 = this.f4958a;
                    if (i10 < 1024 || ((i8 - i4) & 1073741823) > (i10 >> 1)) {
                        return 1;
                    }
                } else {
                    if (f4956f.compareAndSet(this, j, ((-1152921503533105153L) & j) | (((i8 + 1) & 1073741823) << 30))) {
                        atomicReferenceArray.set(i8 & i9, obj);
                        m mVar = this;
                        while ((atomicLongFieldUpdater.get(mVar) & 1152921504606846976L) != 0) {
                            mVar = mVar.c();
                            AtomicReferenceArray atomicReferenceArray2 = mVar.f4961d;
                            int i11 = mVar.f4960c & i8;
                            Object obj2 = atomicReferenceArray2.get(i11);
                            if ((obj2 instanceof l) && ((l) obj2).f4954a == i8) {
                                atomicReferenceArray2.set(i11, obj);
                            } else {
                                mVar = null;
                            }
                            if (mVar == null) {
                                return 0;
                            }
                        }
                        return 0;
                    }
                }
            } else {
                return 1;
            }
        }
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        do {
            atomicLongFieldUpdater = f4956f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, 2305843009213693952L | j));
        return true;
    }

    public final m c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        m mVar;
        while (true) {
            atomicLongFieldUpdater = f4956f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                mVar = this;
                break;
            }
            long j5 = 1152921504606846976L | j;
            mVar = this;
            if (atomicLongFieldUpdater.compareAndSet(mVar, j, j5)) {
                j = j5;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4955e;
            m mVar2 = (m) atomicReferenceFieldUpdater.get(this);
            if (mVar2 != null) {
                return mVar2;
            }
            m mVar3 = new m(mVar.f4958a * 2, mVar.f4959b);
            int i4 = (int) (1073741823 & j);
            int i8 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i9 = mVar.f4960c;
                int i10 = i4 & i9;
                if (i10 == (i9 & i8)) {
                    break;
                }
                Object obj = mVar.f4961d.get(i10);
                if (obj == null) {
                    obj = new l(i4);
                }
                mVar3.f4961d.set(mVar3.f4960c & i4, obj);
                i4++;
            }
            atomicLongFieldUpdater.set(mVar3, (-1152921504606846977L) & j);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, mVar3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        m mVar = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f4956f;
            long j = atomicLongFieldUpdater.get(mVar);
            if ((j & 1152921504606846976L) != 0) {
                return f4957g;
            }
            int i4 = (int) (j & 1073741823);
            int i8 = mVar.f4960c;
            int i9 = i4 & i8;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i8) == i9) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = mVar.f4961d;
            Object obj = atomicReferenceArray.get(i9);
            boolean z8 = mVar.f4959b;
            if (obj == null) {
                if (z8) {
                    break;
                }
            } else {
                if (obj instanceof l) {
                    break;
                }
                long j5 = (i4 + 1) & 1073741823;
                if (f4956f.compareAndSet(mVar, j, (j & (-1073741824)) | j5)) {
                    atomicReferenceArray.set(i9, null);
                    return obj;
                }
                mVar = this;
                if (z8) {
                    while (true) {
                        long j8 = atomicLongFieldUpdater.get(mVar);
                        int i10 = (int) (j8 & 1073741823);
                        if ((j8 & 1152921504606846976L) != 0) {
                            mVar = mVar.c();
                        } else {
                            m mVar2 = mVar;
                            if (f4956f.compareAndSet(mVar2, j8, (j8 & (-1073741824)) | j5)) {
                                mVar2.f4961d.set(i10 & mVar2.f4960c, null);
                                mVar = null;
                            } else {
                                mVar = mVar2;
                            }
                        }
                        if (mVar == null) {
                            return obj;
                        }
                    }
                }
            }
        }
        return null;
    }
}
