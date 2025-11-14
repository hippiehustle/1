package k0;

import java.util.LinkedHashMap;
import o6.j;

/* renamed from: k0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0949d extends AbstractC0948c {
    public C0949d(AbstractC0948c abstractC0948c) {
        j.e(abstractC0948c, "initialExtras");
        LinkedHashMap linkedHashMap = abstractC0948c.f11951a;
        j.e(linkedHashMap, "initialExtras");
        this.f11951a.putAll(linkedHashMap);
    }

    @Override // k0.AbstractC0948c
    public final Object a(InterfaceC0947b interfaceC0947b) {
        return this.f11951a.get(interfaceC0947b);
    }

    public /* synthetic */ C0949d(int i4) {
        this(C0946a.f11950b);
    }
}
