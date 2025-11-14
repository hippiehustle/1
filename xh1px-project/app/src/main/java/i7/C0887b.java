package i7;

import C6.InterfaceC0001b;
import C6.InterfaceC0010k;
import n6.InterfaceC1164c;

/* renamed from: i7.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0887b implements InterfaceC1164c {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0001b f11771d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0001b f11772e;

    public C0887b(InterfaceC0001b interfaceC0001b, InterfaceC0001b interfaceC0001b2) {
        this.f11771d = interfaceC0001b;
        this.f11772e = interfaceC0001b2;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        boolean z8;
        InterfaceC0010k interfaceC0010k = (InterfaceC0010k) obj2;
        if (o6.j.a((InterfaceC0010k) obj, this.f11771d) && o6.j.a(interfaceC0010k, this.f11772e)) {
            z8 = true;
        } else {
            z8 = false;
        }
        return Boolean.valueOf(z8);
    }
}
