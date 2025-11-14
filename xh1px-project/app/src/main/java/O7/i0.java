package O7;

import L7.C0150h;
import P7.AbstractC0284a;
import P7.AbstractC0285b;
import P7.AbstractC0286c;
import d6.InterfaceC0617c;
import d6.InterfaceC0622h;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class i0 extends AbstractC0284a implements N, InterfaceC0233f, P7.v {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4149i = AtomicReferenceFieldUpdater.newUpdater(i0.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: h, reason: collision with root package name */
    public int f4150h;

    public i0(Object obj) {
        this._state$volatile = obj;
    }

    @Override // P7.AbstractC0284a
    public final AbstractC0286c b() {
        return new j0();
    }

    @Override // P7.AbstractC0284a
    public final AbstractC0286c[] c() {
        return new j0[2];
    }

    public final Object f() {
        Q7.t tVar = AbstractC0285b.f4640b;
        Object obj = f4149i.get(this);
        if (obj == tVar) {
            return null;
        }
        return obj;
    }

    public final void g(Object obj) {
        if (obj == null) {
            obj = AbstractC0285b.f4640b;
        }
        h(null, obj);
    }

    public final boolean h(Object obj, Object obj2) {
        int i4;
        AbstractC0286c[] abstractC0286cArr;
        Q7.t tVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4149i;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !o6.j.a(obj3, obj)) {
                return false;
            }
            if (o6.j.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i8 = this.f4150h;
            if ((i8 & 1) == 0) {
                int i9 = i8 + 1;
                this.f4150h = i9;
                AbstractC0286c[] abstractC0286cArr2 = this.f4635d;
                while (true) {
                    j0[] j0VarArr = (j0[]) abstractC0286cArr2;
                    if (j0VarArr != null) {
                        for (j0 j0Var : j0VarArr) {
                            if (j0Var != null) {
                                AtomicReference atomicReference = j0Var.f4153a;
                                while (true) {
                                    Object obj4 = atomicReference.get();
                                    if (obj4 != null && obj4 != (tVar = V.f4106c)) {
                                        Q7.t tVar2 = V.f4105b;
                                        if (obj4 == tVar2) {
                                            while (!atomicReference.compareAndSet(obj4, tVar)) {
                                                if (atomicReference.get() != obj4) {
                                                    break;
                                                }
                                            }
                                        } else {
                                            while (!atomicReference.compareAndSet(obj4, tVar2)) {
                                                if (atomicReference.get() != obj4) {
                                                    break;
                                                }
                                            }
                                            ((C0150h) obj4).k(Z5.y.f7506a);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    synchronized (this) {
                        i4 = this.f4150h;
                        if (i4 == i9) {
                            this.f4150h = i9 + 1;
                            return true;
                        }
                        abstractC0286cArr = this.f4635d;
                    }
                    abstractC0286cArr2 = abstractC0286cArr;
                    i9 = i4;
                }
            } else {
                this.f4150h = i8 + 2;
                return true;
            }
        }
    }

    @Override // P7.v
    public final InterfaceC0233f m(InterfaceC0622h interfaceC0622h, int i4, N7.a aVar) {
        if (((i4 >= 0 && i4 < 2) || i4 == -2) && aVar == N7.a.f3796e) {
            return this;
        }
        return V.r(this, interfaceC0622h, i4, aVar);
    }

    @Override // O7.InterfaceC0234g
    public final Object n(Object obj, InterfaceC0617c interfaceC0617c) {
        g(obj);
        return Z5.y.f7506a;
    }

    @Override // O7.M
    public final void s() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // O7.M
    public final boolean t(Object obj) {
        g(obj);
        return true;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0086 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:13:0x0039, B:15:0x007e, B:17:0x0086, B:20:0x008d, B:21:0x0091, B:25:0x0094, B:27:0x00b5, B:30:0x00c5, B:31:0x00e1, B:37:0x00f1, B:33:0x00e8, B:36:0x00ee, B:46:0x009a, B:49:0x00a1, B:57:0x0053, B:59:0x005d, B:60:0x006e), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c5 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:13:0x0039, B:15:0x007e, B:17:0x0086, B:20:0x008d, B:21:0x0091, B:25:0x0094, B:27:0x00b5, B:30:0x00c5, B:31:0x00e1, B:37:0x00f1, B:33:0x00e8, B:36:0x00ee, B:46:0x009a, B:49:0x00a1, B:57:0x0053, B:59:0x005d, B:60:0x006e), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00c4 -> B:15:0x007e). Please report as a decompilation issue!!! */
    @Override // O7.InterfaceC0233f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object x(O7.InterfaceC0234g r18, d6.InterfaceC0617c r19) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O7.i0.x(O7.g, d6.c):java.lang.Object");
    }
}
