package L7;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class c0 implements U {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3205e = AtomicIntegerFieldUpdater.newUpdater(c0.class, "_isCompleting$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3206f = AtomicReferenceFieldUpdater.newUpdater(c0.class, Object.class, "_rootCause$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3207g = AtomicReferenceFieldUpdater.newUpdater(c0.class, Object.class, "_exceptionsHolder$volatile");
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final f0 f3208d;

    public c0(f0 f0Var, Throwable th) {
        this.f3208d = f0Var;
        this._rootCause$volatile = th;
    }

    @Override // L7.U
    public final boolean a() {
        if (c() == null) {
            return true;
        }
        return false;
    }

    public final void b(Throwable th) {
        Throwable c6 = c();
        if (c6 == null) {
            f3206f.set(this, th);
            return;
        }
        if (th != c6) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3207g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                atomicReferenceFieldUpdater.set(this, th);
                return;
            }
            if (obj instanceof Throwable) {
                if (th == obj) {
                    return;
                }
                ArrayList arrayList = new ArrayList(4);
                arrayList.add(obj);
                arrayList.add(th);
                atomicReferenceFieldUpdater.set(this, arrayList);
                return;
            }
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th);
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
        }
    }

    public final Throwable c() {
        return (Throwable) f3206f.get(this);
    }

    @Override // L7.U
    public final f0 d() {
        return this.f3208d;
    }

    public final boolean e() {
        if (c() != null) {
            return true;
        }
        return false;
    }

    public final ArrayList f(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3207g;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else if (obj instanceof ArrayList) {
            arrayList = (ArrayList) obj;
        } else {
            throw new IllegalStateException(("State is " + obj).toString());
        }
        Throwable c6 = c();
        if (c6 != null) {
            arrayList.add(0, c6);
        }
        if (th != null && !th.equals(c6)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, AbstractC0166y.f3260h);
        return arrayList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Finishing[cancelling=");
        sb.append(e());
        sb.append(", completing=");
        boolean z8 = true;
        if (f3205e.get(this) != 1) {
            z8 = false;
        }
        sb.append(z8);
        sb.append(", rootCause=");
        sb.append(c());
        sb.append(", exceptions=");
        sb.append(f3207g.get(this));
        sb.append(", list=");
        sb.append(this.f3208d);
        sb.append(']');
        return sb.toString();
    }
}
