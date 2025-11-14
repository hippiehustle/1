package O7;

import L7.C0147e;
import L7.C0150h;
import L7.C0161t;
import P7.AbstractC0284a;
import P7.AbstractC0285b;
import P7.AbstractC0286c;
import d6.InterfaceC0617c;
import d6.InterfaceC0622h;
import e6.EnumC0646a;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public class U extends AbstractC0284a implements M, InterfaceC0233f, P7.v {

    /* renamed from: h, reason: collision with root package name */
    public final int f4098h;

    /* renamed from: i, reason: collision with root package name */
    public final int f4099i;
    public final N7.a j;
    public Object[] k;

    /* renamed from: l, reason: collision with root package name */
    public long f4100l;

    /* renamed from: m, reason: collision with root package name */
    public long f4101m;

    /* renamed from: n, reason: collision with root package name */
    public int f4102n;

    /* renamed from: o, reason: collision with root package name */
    public int f4103o;

    public U(int i4, int i8, N7.a aVar) {
        this.f4098h = i4;
        this.f4099i = i8;
        this.j = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0082 A[Catch: all -> 0x0036, TRY_ENTER, TryCatch #1 {all -> 0x0036, blocks: (B:14:0x002f, B:18:0x0078, B:21:0x0082, B:30:0x0095, B:33:0x009c, B:34:0x00a0, B:36:0x00a1, B:42:0x0049), top: B:7:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /* JADX WARN: Type inference failed for: r4v1, types: [P7.a] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [O7.U] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [O7.g] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2, types: [P7.c] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [O7.W] */
    /* JADX WARN: Type inference failed for: r9v8, types: [O7.W] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00af -> B:15:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void h(U u8, InterfaceC0234g interfaceC0234g, InterfaceC0617c interfaceC0617c) {
        T t8;
        int i4;
        ?? r42;
        InterfaceC0234g interfaceC0234g2;
        L7.X x8;
        L7.X x9;
        InterfaceC0234g interfaceC0234g3;
        Object r8;
        Q7.t tVar;
        EnumC0646a enumC0646a;
        W w8;
        try {
            try {
                if (interfaceC0617c instanceof T) {
                    t8 = (T) interfaceC0617c;
                    int i8 = t8.f4097m;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        t8.f4097m = i8 - Integer.MIN_VALUE;
                        Object obj = t8.k;
                        i4 = t8.f4097m;
                        if (i4 == 0) {
                            if (i4 != 1) {
                                if (i4 != 2) {
                                    if (i4 == 3) {
                                        x9 = t8.j;
                                        W w9 = t8.f4095i;
                                        interfaceC0234g3 = t8.f4094h;
                                        U u9 = t8.f4093g;
                                        Z5.a.d(obj);
                                        U u10 = u9;
                                        W w10 = w9;
                                        interfaceC0234g2 = interfaceC0234g3;
                                        x8 = x9;
                                        u8 = u10;
                                        w8 = w10;
                                        r42 = u8;
                                        x9 = x8;
                                        interfaceC0234g3 = interfaceC0234g2;
                                        interfaceC0234g = w8;
                                        do {
                                            r8 = r42.r(interfaceC0234g);
                                            tVar = V.f4104a;
                                            enumC0646a = EnumC0646a.f10656d;
                                            if (r8 == tVar) {
                                                if (x9 != null && !x9.a()) {
                                                    throw x9.z();
                                                }
                                                t8.f4093g = r42;
                                                t8.f4094h = interfaceC0234g3;
                                                t8.f4095i = interfaceC0234g;
                                                t8.j = x9;
                                                t8.f4097m = 3;
                                                u10 = r42;
                                                w10 = interfaceC0234g;
                                                if (interfaceC0234g3.n(r8, t8) == enumC0646a) {
                                                    return;
                                                }
                                                interfaceC0234g2 = interfaceC0234g3;
                                                x8 = x9;
                                                u8 = u10;
                                                w8 = w10;
                                                r42 = u8;
                                                x9 = x8;
                                                interfaceC0234g3 = interfaceC0234g2;
                                                interfaceC0234g = w8;
                                                r8 = r42.r(interfaceC0234g);
                                                tVar = V.f4104a;
                                                enumC0646a = EnumC0646a.f10656d;
                                                if (r8 == tVar) {
                                                    t8.f4093g = r42;
                                                    t8.f4094h = interfaceC0234g3;
                                                    t8.f4095i = interfaceC0234g;
                                                    t8.j = x9;
                                                    t8.f4097m = 2;
                                                }
                                            }
                                        } while (r42.f(interfaceC0234g, t8) != enumC0646a);
                                        return;
                                    }
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                x9 = t8.j;
                                W w11 = t8.f4095i;
                                interfaceC0234g3 = t8.f4094h;
                                U u11 = t8.f4093g;
                                Z5.a.d(obj);
                                r42 = u11;
                                interfaceC0234g = w11;
                                do {
                                    r8 = r42.r(interfaceC0234g);
                                    tVar = V.f4104a;
                                    enumC0646a = EnumC0646a.f10656d;
                                    if (r8 == tVar) {
                                    }
                                } while (r42.f(interfaceC0234g, t8) != enumC0646a);
                                return;
                            }
                            interfaceC0234g = t8.f4095i;
                            InterfaceC0234g interfaceC0234g4 = t8.f4094h;
                            U u12 = t8.f4093g;
                            try {
                                Z5.a.d(obj);
                                interfaceC0234g2 = interfaceC0234g4;
                                u8 = u12;
                                interfaceC0234g = interfaceC0234g;
                            } catch (Throwable th) {
                                th = th;
                                r42 = u12;
                                r42.d(interfaceC0234g);
                                throw th;
                            }
                        } else {
                            Z5.a.d(obj);
                            interfaceC0234g2 = interfaceC0234g;
                            interfaceC0234g = (W) u8.a();
                        }
                        InterfaceC0622h interfaceC0622h = t8.f10782e;
                        o6.j.b(interfaceC0622h);
                        x8 = (L7.X) interfaceC0622h.B(C0161t.f3244e);
                        w8 = interfaceC0234g;
                        r42 = u8;
                        x9 = x8;
                        interfaceC0234g3 = interfaceC0234g2;
                        interfaceC0234g = w8;
                        do {
                            r8 = r42.r(interfaceC0234g);
                            tVar = V.f4104a;
                            enumC0646a = EnumC0646a.f10656d;
                            if (r8 == tVar) {
                            }
                        } while (r42.f(interfaceC0234g, t8) != enumC0646a);
                        return;
                    }
                }
                InterfaceC0622h interfaceC0622h2 = t8.f10782e;
                o6.j.b(interfaceC0622h2);
                x8 = (L7.X) interfaceC0622h2.B(C0161t.f3244e);
                w8 = interfaceC0234g;
                r42 = u8;
                x9 = x8;
                interfaceC0234g3 = interfaceC0234g2;
                interfaceC0234g = w8;
                do {
                    r8 = r42.r(interfaceC0234g);
                    tVar = V.f4104a;
                    enumC0646a = EnumC0646a.f10656d;
                    if (r8 == tVar) {
                    }
                } while (r42.f(interfaceC0234g, t8) != enumC0646a);
                return;
            } catch (Throwable th2) {
                r42 = u8;
                th = th2;
                r42.d(interfaceC0234g);
                throw th;
            }
            if (i4 == 0) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
        t8 = new T(u8, interfaceC0617c);
        Object obj2 = t8.k;
        i4 = t8.f4097m;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [O7.W, P7.c, java.lang.Object] */
    @Override // P7.AbstractC0284a
    public final AbstractC0286c b() {
        ?? obj = new Object();
        obj.f4107a = -1L;
        return obj;
    }

    @Override // P7.AbstractC0284a
    public final AbstractC0286c[] c() {
        return new W[2];
    }

    public final Object f(W w8, T t8) {
        C0150h c0150h = new C0150h(1, E2.c.d0(t8));
        c0150h.v();
        synchronized (this) {
            try {
                if (q(w8) < 0) {
                    w8.f4108b = c0150h;
                } else {
                    c0150h.k(Z5.y.f7506a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object u8 = c0150h.u();
        if (u8 == EnumC0646a.f10656d) {
            return u8;
        }
        return Z5.y.f7506a;
    }

    public final void g() {
        if (this.f4099i != 0 || this.f4103o > 1) {
            Object[] objArr = this.k;
            o6.j.b(objArr);
            while (this.f4103o > 0) {
                long l6 = l();
                int i4 = this.f4102n;
                int i8 = this.f4103o;
                if (objArr[((int) ((l6 + (i4 + i8)) - 1)) & (objArr.length - 1)] == V.f4104a) {
                    this.f4103o = i8 - 1;
                    V.f(objArr, l() + this.f4102n + this.f4103o, null);
                } else {
                    return;
                }
            }
        }
    }

    public final void i() {
        AbstractC0286c[] abstractC0286cArr;
        Object[] objArr = this.k;
        o6.j.b(objArr);
        V.f(objArr, l(), null);
        this.f4102n--;
        long l6 = l() + 1;
        if (this.f4100l < l6) {
            this.f4100l = l6;
        }
        if (this.f4101m < l6) {
            if (this.f4636e != 0 && (abstractC0286cArr = this.f4635d) != null) {
                for (AbstractC0286c abstractC0286c : abstractC0286cArr) {
                    if (abstractC0286c != null) {
                        W w8 = (W) abstractC0286c;
                        long j = w8.f4107a;
                        if (j >= 0 && j < l6) {
                            w8.f4107a = l6;
                        }
                    }
                }
            }
            this.f4101m = l6;
        }
    }

    public final void j(Object obj) {
        int i4 = this.f4102n + this.f4103o;
        Object[] objArr = this.k;
        if (objArr == null) {
            objArr = o(null, 0, 2);
        } else if (i4 >= objArr.length) {
            objArr = o(objArr, i4, objArr.length * 2);
        }
        V.f(objArr, l() + i4, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object[], java.lang.Object] */
    public final InterfaceC0617c[] k(InterfaceC0617c[] interfaceC0617cArr) {
        AbstractC0286c[] abstractC0286cArr;
        W w8;
        C0150h c0150h;
        int length = interfaceC0617cArr.length;
        if (this.f4636e != 0 && (abstractC0286cArr = this.f4635d) != null) {
            int length2 = abstractC0286cArr.length;
            int i4 = 0;
            interfaceC0617cArr = interfaceC0617cArr;
            while (i4 < length2) {
                AbstractC0286c abstractC0286c = abstractC0286cArr[i4];
                if (abstractC0286c != null && (c0150h = (w8 = (W) abstractC0286c).f4108b) != null && q(w8) >= 0) {
                    int length3 = interfaceC0617cArr.length;
                    interfaceC0617cArr = interfaceC0617cArr;
                    if (length >= length3) {
                        ?? copyOf = Arrays.copyOf(interfaceC0617cArr, Math.max(2, interfaceC0617cArr.length * 2));
                        o6.j.d(copyOf, "copyOf(...)");
                        interfaceC0617cArr = copyOf;
                    }
                    interfaceC0617cArr[length] = c0150h;
                    w8.f4108b = null;
                    length++;
                }
                i4++;
                interfaceC0617cArr = interfaceC0617cArr;
            }
        }
        return interfaceC0617cArr;
    }

    public final long l() {
        return Math.min(this.f4101m, this.f4100l);
    }

    @Override // P7.v
    public final InterfaceC0233f m(InterfaceC0622h interfaceC0622h, int i4, N7.a aVar) {
        return V.r(this, interfaceC0622h, i4, aVar);
    }

    @Override // O7.InterfaceC0234g
    public final Object n(Object obj, InterfaceC0617c interfaceC0617c) {
        Throwable th;
        InterfaceC0617c[] k;
        S s8;
        if (t(obj)) {
            return Z5.y.f7506a;
        }
        C0150h c0150h = new C0150h(1, E2.c.d0(interfaceC0617c));
        c0150h.v();
        InterfaceC0617c[] interfaceC0617cArr = AbstractC0285b.f4639a;
        synchronized (this) {
            try {
                if (p(obj)) {
                    try {
                        c0150h.k(Z5.y.f7506a);
                        k = k(interfaceC0617cArr);
                        s8 = null;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    try {
                        S s9 = new S(this, l() + this.f4102n + this.f4103o, obj, c0150h);
                        j(s9);
                        this.f4103o++;
                        if (this.f4099i == 0) {
                            interfaceC0617cArr = k(interfaceC0617cArr);
                        }
                        k = interfaceC0617cArr;
                        s8 = s9;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (s8 != null) {
                    c0150h.x(new C0147e(2, s8));
                }
                for (InterfaceC0617c interfaceC0617c2 : k) {
                    if (interfaceC0617c2 != null) {
                        interfaceC0617c2.k(Z5.y.f7506a);
                    }
                }
                Object u8 = c0150h.u();
                EnumC0646a enumC0646a = EnumC0646a.f10656d;
                if (u8 != enumC0646a) {
                    u8 = Z5.y.f7506a;
                }
                if (u8 == enumC0646a) {
                    return u8;
                }
                return Z5.y.f7506a;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public final Object[] o(Object[] objArr, int i4, int i8) {
        if (i8 > 0) {
            Object[] objArr2 = new Object[i8];
            this.k = objArr2;
            if (objArr != null) {
                long l6 = l();
                for (int i9 = 0; i9 < i4; i9++) {
                    long j = i9 + l6;
                    V.f(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
                }
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow");
    }

    public final boolean p(Object obj) {
        int i4 = this.f4636e;
        int i8 = this.f4098h;
        if (i4 == 0) {
            if (i8 != 0) {
                j(obj);
                int i9 = this.f4102n + 1;
                this.f4102n = i9;
                if (i9 > i8) {
                    i();
                }
                this.f4101m = l() + this.f4102n;
                return true;
            }
        } else {
            int i10 = this.f4102n;
            int i11 = this.f4099i;
            if (i10 >= i11 && this.f4101m <= this.f4100l) {
                int ordinal = this.j.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                } else {
                    return false;
                }
            }
            j(obj);
            int i12 = this.f4102n + 1;
            this.f4102n = i12;
            if (i12 > i11) {
                i();
            }
            long l6 = l() + this.f4102n;
            long j = this.f4100l;
            if (((int) (l6 - j)) > i8) {
                u(1 + j, this.f4101m, l() + this.f4102n, l() + this.f4102n + this.f4103o);
            }
        }
        return true;
    }

    public final long q(W w8) {
        long j = w8.f4107a;
        if (j >= l() + this.f4102n) {
            if (this.f4099i > 0 || j > l() || this.f4103o == 0) {
                return -1L;
            }
            return j;
        }
        return j;
    }

    public final Object r(W w8) {
        Object obj;
        InterfaceC0617c[] interfaceC0617cArr = AbstractC0285b.f4639a;
        synchronized (this) {
            try {
                long q6 = q(w8);
                if (q6 < 0) {
                    obj = V.f4104a;
                } else {
                    long j = w8.f4107a;
                    Object[] objArr = this.k;
                    o6.j.b(objArr);
                    Object obj2 = objArr[((int) q6) & (objArr.length - 1)];
                    if (obj2 instanceof S) {
                        obj2 = ((S) obj2).f4091f;
                    }
                    w8.f4107a = q6 + 1;
                    Object obj3 = obj2;
                    interfaceC0617cArr = v(j);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (InterfaceC0617c interfaceC0617c : interfaceC0617cArr) {
            if (interfaceC0617c != null) {
                interfaceC0617c.k(Z5.y.f7506a);
            }
        }
        return obj;
    }

    @Override // O7.M
    public final void s() {
        synchronized (this) {
            try {
                try {
                    u(l() + this.f4102n, this.f4101m, l() + this.f4102n, l() + this.f4102n + this.f4103o);
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // O7.M
    public final boolean t(Object obj) {
        int i4;
        boolean z8;
        InterfaceC0617c[] interfaceC0617cArr = AbstractC0285b.f4639a;
        synchronized (this) {
            if (p(obj)) {
                interfaceC0617cArr = k(interfaceC0617cArr);
                z8 = true;
            } else {
                z8 = false;
            }
        }
        for (InterfaceC0617c interfaceC0617c : interfaceC0617cArr) {
            if (interfaceC0617c != null) {
                interfaceC0617c.k(Z5.y.f7506a);
            }
        }
        return z8;
    }

    public final void u(long j, long j5, long j8, long j9) {
        long min = Math.min(j5, j);
        for (long l6 = l(); l6 < min; l6++) {
            Object[] objArr = this.k;
            o6.j.b(objArr);
            V.f(objArr, l6, null);
        }
        this.f4100l = j;
        this.f4101m = j5;
        this.f4102n = (int) (j8 - min);
        this.f4103o = (int) (j9 - j8);
    }

    public final InterfaceC0617c[] v(long j) {
        int i4;
        long j5;
        long j8;
        long j9;
        InterfaceC0617c[] interfaceC0617cArr;
        long j10;
        InterfaceC0617c[] interfaceC0617cArr2;
        AbstractC0286c[] abstractC0286cArr;
        Q7.t tVar = V.f4104a;
        InterfaceC0617c[] interfaceC0617cArr3 = AbstractC0285b.f4639a;
        if (j <= this.f4101m) {
            long l6 = l();
            long j11 = this.f4102n + l6;
            int i8 = this.f4099i;
            if (i8 == 0 && this.f4103o > 0) {
                j11++;
            }
            int i9 = 0;
            if (this.f4636e != 0 && (abstractC0286cArr = this.f4635d) != null) {
                for (AbstractC0286c abstractC0286c : abstractC0286cArr) {
                    if (abstractC0286c != null) {
                        long j12 = ((W) abstractC0286c).f4107a;
                        if (j12 >= 0 && j12 < j11) {
                            j11 = j12;
                        }
                    }
                }
            }
            if (j11 > this.f4101m) {
                long l8 = l() + this.f4102n;
                if (this.f4636e > 0) {
                    i4 = Math.min(this.f4103o, i8 - ((int) (l8 - j11)));
                } else {
                    i4 = this.f4103o;
                }
                long j13 = this.f4103o + l8;
                if (i4 > 0) {
                    j9 = 1;
                    Object[] objArr = this.k;
                    o6.j.b(objArr);
                    j5 = l6;
                    InterfaceC0617c[] interfaceC0617cArr4 = new InterfaceC0617c[i4];
                    long j14 = l8;
                    while (true) {
                        if (l8 < j13) {
                            interfaceC0617cArr2 = interfaceC0617cArr4;
                            Object obj = objArr[(objArr.length - 1) & ((int) l8)];
                            if (obj != tVar) {
                                o6.j.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                                S s8 = (S) obj;
                                int i10 = i9 + 1;
                                j8 = j11;
                                interfaceC0617cArr2[i9] = s8.f4092g;
                                V.f(objArr, l8, tVar);
                                V.f(objArr, j14, s8.f4091f);
                                j14++;
                                if (i10 >= i4) {
                                    break;
                                }
                                i9 = i10;
                            } else {
                                j8 = j11;
                            }
                            l8++;
                            interfaceC0617cArr4 = interfaceC0617cArr2;
                            j11 = j8;
                        } else {
                            interfaceC0617cArr2 = interfaceC0617cArr4;
                            j8 = j11;
                            break;
                        }
                    }
                    l8 = j14;
                    interfaceC0617cArr = interfaceC0617cArr2;
                } else {
                    j5 = l6;
                    j8 = j11;
                    j9 = 1;
                    interfaceC0617cArr = interfaceC0617cArr3;
                }
                int i11 = (int) (l8 - j5);
                if (this.f4636e == 0) {
                    j10 = l8;
                } else {
                    j10 = j8;
                }
                long max = Math.max(this.f4100l, l8 - Math.min(this.f4098h, i11));
                if (i8 == 0 && max < j13) {
                    Object[] objArr2 = this.k;
                    o6.j.b(objArr2);
                    if (o6.j.a(objArr2[((int) max) & (objArr2.length - 1)], tVar)) {
                        l8 += j9;
                        max += j9;
                    }
                }
                u(max, j10, l8, j13);
                g();
                if (interfaceC0617cArr.length == 0) {
                    return interfaceC0617cArr;
                }
                return k(interfaceC0617cArr);
            }
        }
        return interfaceC0617cArr3;
    }

    @Override // O7.InterfaceC0233f
    public final Object x(InterfaceC0234g interfaceC0234g, InterfaceC0617c interfaceC0617c) {
        h(this, interfaceC0234g, interfaceC0617c);
        return EnumC0646a.f10656d;
    }
}
