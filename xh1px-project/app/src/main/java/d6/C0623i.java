package d6;

import java.io.Serializable;
import n6.InterfaceC1164c;

/* renamed from: d6.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0623i implements InterfaceC0622h, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final C0623i f10448d = new Object();

    @Override // d6.InterfaceC0622h
    public final InterfaceC0620f B(InterfaceC0621g interfaceC0621g) {
        o6.j.e(interfaceC0621g, "key");
        return null;
    }

    @Override // d6.InterfaceC0622h
    public final InterfaceC0622h D(InterfaceC0622h interfaceC0622h) {
        o6.j.e(interfaceC0622h, "context");
        return interfaceC0622h;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // d6.InterfaceC0622h
    public final InterfaceC0622h y(InterfaceC0621g interfaceC0621g) {
        o6.j.e(interfaceC0621g, "key");
        return this;
    }

    @Override // d6.InterfaceC0622h
    public final Object n(Object obj, InterfaceC1164c interfaceC1164c) {
        return obj;
    }
}
