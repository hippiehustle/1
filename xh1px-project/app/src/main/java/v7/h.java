package v7;

import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public class h implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final k f15552d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC1162a f15553e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f15554f;

    public h(k kVar, InterfaceC1162a interfaceC1162a) {
        if (kVar != null) {
            this.f15554f = j.f15555d;
            this.f15552d = kVar;
            this.f15553e = interfaceC1162a;
            return;
        }
        f(0);
        throw null;
    }

    public static /* synthetic */ void f(int i4) {
        String str;
        int i8;
        if (i4 != 2 && i4 != 3) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i4 != 2 && i4 != 3) {
            i8 = 3;
        } else {
            i8 = 2;
        }
        Object[] objArr = new Object[i8];
        if (i4 != 1) {
            if (i4 != 2 && i4 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            }
        } else {
            objArr[0] = "computable";
        }
        if (i4 != 2) {
            if (i4 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[1] = "renderDebugInformation";
            }
        } else {
            objArr[1] = "recursionDetected";
        }
        if (i4 != 2 && i4 != 3) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i4 == 2 || i4 == 3) {
            throw new IllegalStateException(format);
        }
    }

    @Override // n6.InterfaceC1162a
    public Object a() {
        Object a3;
        j jVar = j.f15557f;
        j jVar2 = j.f15556e;
        Object obj = this.f15554f;
        if (!(obj instanceof j)) {
            F7.l.k(obj);
            return obj;
        }
        this.f15552d.f15561a.lock();
        try {
            Object obj2 = this.f15554f;
            if (!(obj2 instanceof j)) {
                F7.l.k(obj2);
                return obj2;
            }
            try {
                if (obj2 == jVar2) {
                    this.f15554f = jVar;
                    N.f h8 = h(true);
                    if (!h8.f3524e) {
                        a3 = h8.f3525f;
                        return a3;
                    }
                }
                if (obj2 == jVar) {
                    N.f h9 = h(false);
                    if (!h9.f3524e) {
                        a3 = h9.f3525f;
                        return a3;
                    }
                }
                a3 = this.f15553e.a();
                g(a3);
                this.f15554f = a3;
                return a3;
            } catch (Throwable th) {
                if (!F7.l.i(th)) {
                    if (this.f15554f == jVar2) {
                        this.f15554f = new F7.k(th);
                    }
                    this.f15552d.f15562b.getClass();
                    throw th;
                }
                this.f15554f = j.f15555d;
                throw th;
            }
            this.f15554f = jVar2;
        } finally {
            this.f15552d.f15561a.unlock();
        }
    }

    public N.f h(boolean z8) {
        N.f d2 = this.f15552d.d(null, "in a lazy value");
        if (d2 != null) {
            return d2;
        }
        f(2);
        throw null;
    }

    public void g(Object obj) {
    }
}
