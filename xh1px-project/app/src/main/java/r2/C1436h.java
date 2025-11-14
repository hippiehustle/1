package r2;

import L7.InterfaceC0163v;
import L7.k0;
import O7.i0;
import Z5.y;
import a6.s;
import android.graphics.Point;
import android.util.Log;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import g0.b0;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import n6.InterfaceC1164c;
import s2.n;
import t0.C1536c;

/* renamed from: r2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1436h extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f14289h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j f14290i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1436h(j jVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f14290i = jVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C1436h) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C1436h(this.f14290i, interfaceC0617c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00fe, code lost:
    
        if (r1 == r8) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0100, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00f2, code lost:
    
        if (r14.b(r0, r13) != r8) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00cd, code lost:
    
        if (r14.o(r13) == r8) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x004d, code lost:
    
        if (r14 == r8) goto L61;
     */
    @Override // f6.AbstractC0711a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        boolean isTerminated;
        int i4 = this.f14289h;
        y yVar = y.f7506a;
        j jVar = this.f14290i;
        EnumC0646a enumC0646a = EnumC0646a.f10656d;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 == 4) {
                            Z5.a.d(obj);
                            jVar.f14303m = null;
                            return yVar;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Z5.a.d(obj);
                    i0 i0Var = jVar.f14305o;
                    this.f14289h = 4;
                    i0Var.n(k.f14310f, this);
                } else {
                    Z5.a.d(obj);
                    jVar.f14307q = null;
                    u2.b bVar = jVar.f14296d;
                    bVar.f15315c = 10000.0d;
                    bVar.a(bVar.b(), s.f7766d);
                    a2.h hVar = jVar.f14297e;
                    Point point = jVar.f14294b.f7104e.f7094a;
                    this.f14289h = 3;
                }
            } else {
                Z5.a.d(obj);
            }
        } else {
            Z5.a.d(obj);
            Log.i("DetectorEngine", "stopDetection");
            k0 k0Var = jVar.f14302l;
            if (k0Var != null) {
                this.f14289h = 1;
                k0Var.d(null);
                Object v8 = k0Var.v(this);
                if (v8 != enumC0646a) {
                    v8 = yVar;
                }
            }
        }
        jVar.f14302l = null;
        AutoCloseable autoCloseable = jVar.j;
        if (autoCloseable != null) {
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else if (autoCloseable instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) autoCloseable;
                if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                    executorService.shutdown();
                    boolean z8 = false;
                    while (!isTerminated) {
                        try {
                            isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (!z8) {
                                executorService.shutdownNow();
                                z8 = true;
                            }
                        }
                    }
                    if (z8) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
        jVar.j = null;
        n nVar = jVar.f14301i;
        if (nVar != null) {
            b0 b0Var = nVar.f14487c;
            C1536c c1536c = (C1536c) b0Var.f10988e;
            if (!((ConcurrentHashMap) c1536c.f14808e).isEmpty()) {
                ((Y1.c) c1536c.f14809f).d();
            }
            ((LinkedHashMap) ((C1536c) b0Var.f10990g).f14809f).clear();
        }
        jVar.f14301i = null;
        v2.j jVar2 = jVar.f14307q;
        if (jVar2 != null) {
            this.f14289h = 2;
        }
        jVar.f14307q = null;
        u2.b bVar2 = jVar.f14296d;
        bVar2.f15315c = 10000.0d;
        bVar2.a(bVar2.b(), s.f7766d);
        a2.h hVar2 = jVar.f14297e;
        Point point2 = jVar.f14294b.f7104e.f7094a;
        this.f14289h = 3;
    }
}
