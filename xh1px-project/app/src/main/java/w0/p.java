package w0;

import L7.AbstractC0166y;
import L7.C0150h;
import L7.n0;
import a6.AbstractC0436k;
import b6.C0535c;
import e6.EnumC0646a;
import f6.AbstractC0713c;
import g5.C0787g;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.TimeoutCancellationException;
import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final int f15616a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1162a f15617b;

    /* renamed from: c, reason: collision with root package name */
    public final ReentrantLock f15618c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public int f15619d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f15620e;

    /* renamed from: f, reason: collision with root package name */
    public final j[] f15621f;

    /* renamed from: g, reason: collision with root package name */
    public final U7.h f15622g;

    /* renamed from: h, reason: collision with root package name */
    public final C0787g f15623h;

    /* JADX WARN: Type inference failed for: r4v4, types: [U7.h, U7.g] */
    /* JADX WARN: Type inference failed for: r4v5, types: [g5.g, java.lang.Object] */
    public p(int i4, InterfaceC1162a interfaceC1162a) {
        this.f15616a = i4;
        this.f15617b = interfaceC1162a;
        this.f15621f = new j[i4];
        int i8 = U7.i.f6201a;
        this.f15622g = new U7.g(i4);
        ?? obj = new Object();
        if (i4 >= 1) {
            if (i4 <= 1073741824) {
                i4 = Integer.bitCount(i4) != 1 ? Integer.highestOneBit(i4 - 1) << 1 : i4;
                obj.f11189c = i4 - 1;
                obj.f11190d = new Object[i4];
                this.f15623h = obj;
                return;
            }
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
        throw new IllegalArgumentException("capacity must be >= 1");
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0064, code lost:
    
        r0.f(r4, r9.f6200e);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008b A[Catch: all -> 0x00ce, TryCatch #2 {all -> 0x00ce, blocks: (B:13:0x0086, B:15:0x008b, B:17:0x0091, B:20:0x0098, B:21:0x00b2, B:23:0x00b8, B:27:0x00d0, B:28:0x00d5, B:29:0x00d6, B:30:0x00dd), top: B:12:0x0086, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d6 A[Catch: all -> 0x00ce, TryCatch #2 {all -> 0x00ce, blocks: (B:13:0x0086, B:15:0x008b, B:17:0x0091, B:20:0x0098, B:21:0x00b2, B:23:0x00b8, B:27:0x00d0, B:28:0x00d5, B:29:0x00d6, B:30:0x00dd), top: B:12:0x0086, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(AbstractC0713c abstractC0713c) {
        m mVar;
        int i4;
        int andDecrement;
        p pVar;
        ReentrantLock reentrantLock;
        try {
            try {
                if (abstractC0713c instanceof m) {
                    mVar = (m) abstractC0713c;
                    int i8 = mVar.j;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        mVar.j = i8 - Integer.MIN_VALUE;
                        Object obj = mVar.f15607h;
                        i4 = mVar.j;
                        if (i4 == 0) {
                            if (i4 == 1) {
                                pVar = mVar.f15606g;
                                Z5.a.d(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Z5.a.d(obj);
                            mVar.f15606g = this;
                            mVar.j = 1;
                            U7.h hVar = this.f15622g;
                            hVar.getClass();
                            int i9 = hVar.f6199d;
                            do {
                                andDecrement = U7.g.j.getAndDecrement(hVar);
                            } while (andDecrement > i9);
                            Object obj2 = Z5.y.f7506a;
                            Object obj3 = EnumC0646a.f10656d;
                            if (andDecrement <= 0) {
                                C0150h m6 = AbstractC0166y.m(E2.c.d0(mVar));
                                try {
                                    if (!hVar.b(m6)) {
                                        while (true) {
                                            int andDecrement2 = U7.g.j.getAndDecrement(hVar);
                                            if (andDecrement2 <= i9) {
                                                if (andDecrement2 > 0) {
                                                    break;
                                                }
                                                if (hVar.b(m6)) {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    Object u8 = m6.u();
                                    Object obj4 = u8;
                                    if (u8 != obj3) {
                                        obj4 = obj2;
                                    }
                                    if (obj4 == obj3) {
                                        obj2 = obj4;
                                    }
                                } catch (Throwable th) {
                                    m6.B();
                                    throw th;
                                }
                            }
                            if (obj2 == obj3) {
                                return obj3;
                            }
                            pVar = this;
                        }
                        reentrantLock = pVar.f15618c;
                        C0787g c0787g = pVar.f15623h;
                        reentrantLock.lock();
                        if (pVar.f15620e) {
                            if (c0787g.f11187a == c0787g.f11188b && pVar.f15619d < pVar.f15616a) {
                                j jVar = new j((D0.a) pVar.f15617b.a());
                                j[] jVarArr = pVar.f15621f;
                                int i10 = pVar.f15619d;
                                pVar.f15619d = i10 + 1;
                                jVarArr[i10] = jVar;
                                c0787g.a(jVar);
                            }
                            int i11 = c0787g.f11187a;
                            if (i11 != c0787g.f11188b) {
                                Object[] objArr = (Object[]) c0787g.f11190d;
                                Object obj5 = objArr[i11];
                                objArr[i11] = null;
                                c0787g.f11187a = c0787g.f11189c & (i11 + 1);
                                return (j) obj5;
                            }
                            throw new ArrayIndexOutOfBoundsException();
                        }
                        E2.b.M("Connection pool is closed", 21);
                        throw null;
                    }
                }
                if (pVar.f15620e) {
                }
            } finally {
                reentrantLock.unlock();
            }
            reentrantLock = pVar.f15618c;
            C0787g c0787g2 = pVar.f15623h;
            reentrantLock.lock();
        } catch (Throwable th2) {
            pVar.f15622g.c();
            throw th2;
        }
        mVar = new m(this, abstractC0713c);
        Object obj6 = mVar.f15607h;
        i4 = mVar.j;
        if (i4 == 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:9|(2:10|11)|12|13|14|(1:(1:38)(2:35|(1:37)))(1:16)|17|18|19|20|(3:22|23|(1:25)(10:27|12|13|14|(0)(0)|17|18|19|20|(2:28|29)(0)))(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007c, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007e, code lost:
    
        r14 = r14;
        r13 = r13;
        r1 = r0;
        r0 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0087 A[Catch: all -> 0x008b, TryCatch #0 {all -> 0x008b, blocks: (B:14:0x0083, B:16:0x0087, B:35:0x008f, B:38:0x0096), top: B:13:0x0083 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a A[Catch: all -> 0x007c, TRY_LEAVE, TryCatch #1 {all -> 0x007c, blocks: (B:20:0x0041, B:22:0x005a, B:28:0x006f, B:29:0x0076), top: B:19:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006f A[Catch: all -> 0x007c, TRY_ENTER, TryCatch #1 {all -> 0x007c, blocks: (B:20:0x0041, B:22:0x005a, B:28:0x006f, B:29:0x0076), top: B:19:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object, o6.u] */
    /* JADX WARN: Type inference failed for: r1v11, types: [n6.a] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0068 -> B:12:0x006a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j, e eVar, AbstractC0713c abstractC0713c) {
        n nVar;
        int i4;
        p pVar;
        o6.u uVar;
        n nVar2;
        Throwable th;
        long x8;
        e eVar2;
        if (abstractC0713c instanceof n) {
            nVar = (n) abstractC0713c;
            int i8 = nVar.f15613m;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                nVar.f15613m = i8 - Integer.MIN_VALUE;
                Object obj = nVar.k;
                i4 = nVar.f15613m;
                if (i4 == 0) {
                    if (i4 == 1) {
                        j = nVar.j;
                        o6.u uVar2 = nVar.f15611i;
                        ?? r12 = nVar.f15610h;
                        pVar = nVar.f15609g;
                        try {
                            Z5.a.d(obj);
                            eVar2 = r12;
                        } catch (Throwable th2) {
                            uVar = uVar2;
                            eVar = r12;
                            nVar2 = nVar;
                            th = th2;
                        }
                        uVar = uVar2;
                        eVar = eVar2;
                        nVar2 = nVar;
                        th = null;
                        try {
                            if (th instanceof TimeoutCancellationException) {
                                eVar.a();
                            } else if (th == null) {
                                Object obj2 = uVar.f13642d;
                                if (obj2 != null) {
                                    return obj2;
                                }
                            } else {
                                throw th;
                            }
                            nVar = nVar2;
                            ?? obj3 = new Object();
                            o oVar = new o(obj3, pVar, null);
                            nVar.f15609g = pVar;
                            nVar.f15610h = eVar;
                            nVar.f15611i = obj3;
                            nVar.j = j;
                            nVar.f15613m = 1;
                            x8 = AbstractC0166y.x(j);
                            if (x8 > 0) {
                                Object v8 = AbstractC0166y.v(new n0(x8, nVar), oVar);
                                EnumC0646a enumC0646a = EnumC0646a.f10656d;
                                if (v8 == enumC0646a) {
                                    return enumC0646a;
                                }
                                eVar2 = eVar;
                                uVar2 = obj3;
                                uVar = uVar2;
                                eVar = eVar2;
                                nVar2 = nVar;
                                th = null;
                                if (th instanceof TimeoutCancellationException) {
                                }
                                nVar = nVar2;
                                ?? obj32 = new Object();
                                o oVar2 = new o(obj32, pVar, null);
                                nVar.f15609g = pVar;
                                nVar.f15610h = eVar;
                                nVar.f15611i = obj32;
                                nVar.j = j;
                                nVar.f15613m = 1;
                                x8 = AbstractC0166y.x(j);
                                if (x8 > 0) {
                                    throw new TimeoutCancellationException("Timed out immediately", null);
                                }
                            }
                        } catch (Throwable th3) {
                            j jVar = (j) uVar.f13642d;
                            if (jVar != null) {
                                pVar.e(jVar);
                            }
                            throw th3;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Z5.a.d(obj);
                    pVar = this;
                    ?? obj322 = new Object();
                    o oVar22 = new o(obj322, pVar, null);
                    nVar.f15609g = pVar;
                    nVar.f15610h = eVar;
                    nVar.f15611i = obj322;
                    nVar.j = j;
                    nVar.f15613m = 1;
                    x8 = AbstractC0166y.x(j);
                    if (x8 > 0) {
                    }
                }
            }
        }
        nVar = new n(this, abstractC0713c);
        Object obj4 = nVar.k;
        i4 = nVar.f15613m;
        if (i4 == 0) {
        }
    }

    public final void c() {
        ReentrantLock reentrantLock = this.f15618c;
        reentrantLock.lock();
        try {
            this.f15620e = true;
            for (j jVar : this.f15621f) {
                if (jVar != null) {
                    jVar.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void d(StringBuilder sb) {
        String str;
        C0787g c0787g = this.f15623h;
        ReentrantLock reentrantLock = this.f15618c;
        reentrantLock.lock();
        try {
            C0535c i4 = E2.d.i();
            int i8 = (c0787g.f11188b - c0787g.f11187a) & c0787g.f11189c;
            for (int i9 = 0; i9 < i8; i9++) {
                if (i9 >= 0) {
                    int i10 = c0787g.f11188b;
                    int i11 = c0787g.f11187a;
                    int i12 = c0787g.f11189c;
                    if (i9 < ((i10 - i11) & i12)) {
                        Object obj = ((Object[]) c0787g.f11190d)[(i11 + i9) & i12];
                        o6.j.b(obj);
                        i4.add(obj);
                    }
                }
                throw new ArrayIndexOutOfBoundsException();
            }
            C0535c f8 = E2.d.f(i4);
            sb.append('\t' + toString() + " (");
            sb.append("capacity=" + this.f15616a + ", ");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("permits=");
            U7.h hVar = this.f15622g;
            hVar.getClass();
            sb2.append(Math.max(U7.g.j.get(hVar), 0));
            sb2.append(", ");
            sb.append(sb2.toString());
            sb.append("queue=(size=" + f8.g() + ")[" + AbstractC0436k.v0(f8, null, null, null, null, 63) + "], ");
            sb.append(")");
            sb.append('\n');
            int i13 = 0;
            for (j jVar : this.f15621f) {
                i13++;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("\t\t[");
                sb3.append(i13);
                sb3.append("] - ");
                if (jVar != null) {
                    str = jVar.f15595d.toString();
                } else {
                    str = null;
                }
                sb3.append(str);
                sb.append(sb3.toString());
                sb.append('\n');
                if (jVar != null) {
                    jVar.e(sb);
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void e(j jVar) {
        o6.j.e(jVar, "connection");
        ReentrantLock reentrantLock = this.f15618c;
        reentrantLock.lock();
        try {
            this.f15623h.a(jVar);
            reentrantLock.unlock();
            this.f15622g.c();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
