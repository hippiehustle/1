package v7;

import t0.C1536c;
import w7.C1743e;

/* loaded from: classes.dex */
public final class d extends h implements l {

    /* renamed from: g, reason: collision with root package name */
    public volatile C1536c f15547g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ B6.n f15548h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(k kVar, B6.j jVar, B6.n nVar) {
        super(kVar, jVar);
        this.f15548h = nVar;
        if (kVar != null) {
            this.f15547g = null;
        } else {
            k(0);
            throw null;
        }
    }

    public static /* synthetic */ void f(int i4) {
        String str;
        int i8;
        if (i4 != 2) {
            str = "@NotNull method %s.%s must not return null";
        } else {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        if (i4 != 2) {
            i8 = 2;
        } else {
            i8 = 3;
        }
        Object[] objArr = new Object[i8];
        if (i4 != 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        } else {
            objArr[0] = "value";
        }
        if (i4 != 2) {
            objArr[1] = "recursionDetected";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
        }
        if (i4 == 2) {
            objArr[2] = "doPostCompute";
        }
        String format = String.format(str, objArr);
        if (i4 != 2) {
            throw new IllegalStateException(format);
        }
        throw new IllegalArgumentException(format);
    }

    public static /* synthetic */ void k(int i4) {
        String str;
        int i8;
        if (i4 != 2) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i4 != 2) {
            i8 = 3;
        } else {
            i8 = 2;
        }
        Object[] objArr = new Object[i8];
        if (i4 != 1) {
            if (i4 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            }
        } else {
            objArr[0] = "computable";
        }
        if (i4 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
        } else {
            objArr[1] = "invoke";
        }
        if (i4 != 2) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i4 != 2) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // v7.h, n6.InterfaceC1162a
    public final Object a() {
        Object a3;
        C1536c c1536c = this.f15547g;
        if (c1536c != null && ((Thread) c1536c.f14809f) == Thread.currentThread()) {
            if (((Thread) c1536c.f14809f) == Thread.currentThread()) {
                a3 = c1536c.f14808e;
            } else {
                throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
            }
        } else {
            a3 = super.a();
        }
        if (a3 != null) {
            return a3;
        }
        k(2);
        throw null;
    }

    @Override // v7.h
    public final void g(Object obj) {
        this.f15547g = new C1536c(obj);
        try {
            if (obj != null) {
                this.f15548h.m(obj);
            } else {
                f(2);
                throw null;
            }
        } finally {
            this.f15547g = null;
        }
    }

    @Override // v7.h
    public final N.f h(boolean z8) {
        return new N.f(new C1743e(E2.d.y(y7.l.f16570d)), false, 6);
    }
}
