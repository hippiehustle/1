package Z5;

import java.io.Serializable;
import n6.InterfaceC1162a;

/* loaded from: classes.dex */
public final class z implements g, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC1162a f7507d;

    /* renamed from: e, reason: collision with root package name */
    public Object f7508e;

    @Override // Z5.g
    public final Object getValue() {
        if (this.f7508e == v.f7503a) {
            InterfaceC1162a interfaceC1162a = this.f7507d;
            o6.j.b(interfaceC1162a);
            this.f7508e = interfaceC1162a.a();
            this.f7507d = null;
        }
        return this.f7508e;
    }

    public final String toString() {
        if (this.f7508e != v.f7503a) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
