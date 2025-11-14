package Z5;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final class m implements g, Serializable {

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f7488f = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "e");

    /* renamed from: d, reason: collision with root package name */
    public volatile InterfaceC1162a f7489d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f7490e;

    @Override // Z5.g
    public final Object getValue() {
        Object obj = this.f7490e;
        v vVar = v.f7503a;
        if (obj != vVar) {
            return obj;
        }
        InterfaceC1162a interfaceC1162a = this.f7489d;
        if (interfaceC1162a != null) {
            Object a3 = interfaceC1162a.a();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7488f;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, vVar, a3)) {
                if (atomicReferenceFieldUpdater.get(this) != vVar) {
                }
            }
            this.f7489d = null;
            return a3;
        }
        return this.f7490e;
    }

    public final String toString() {
        if (this.f7490e != v.f7503a) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
