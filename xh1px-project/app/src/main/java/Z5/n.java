package Z5;

import java.io.Serializable;
import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final class n implements g, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC1162a f7491d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f7492e = v.f7503a;

    /* renamed from: f, reason: collision with root package name */
    public final Object f7493f = this;

    public n(InterfaceC1162a interfaceC1162a) {
        this.f7491d = interfaceC1162a;
    }

    @Override // Z5.g
    public final Object getValue() {
        Object obj;
        Object obj2 = this.f7492e;
        v vVar = v.f7503a;
        if (obj2 != vVar) {
            return obj2;
        }
        synchronized (this.f7493f) {
            obj = this.f7492e;
            if (obj == vVar) {
                InterfaceC1162a interfaceC1162a = this.f7491d;
                o6.j.b(interfaceC1162a);
                obj = interfaceC1162a.a();
                this.f7492e = obj;
                this.f7491d = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (this.f7492e != v.f7503a) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
