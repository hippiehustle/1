package m7;

import C6.InterfaceC0002c;
import C6.InterfaceC0010k;
import n6.InterfaceC1163b;
import o6.j;

/* renamed from: m7.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1096b implements InterfaceC1163b {

    /* renamed from: e, reason: collision with root package name */
    public static final C1096b f12553e = new C1096b(0);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12554d;

    public /* synthetic */ C1096b(int i4) {
        this.f12554d = i4;
    }

    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        switch (this.f12554d) {
            case 0:
                InterfaceC0010k interfaceC0010k = (InterfaceC0010k) obj;
                int i4 = AbstractC1098d.f12556a;
                j.e(interfaceC0010k, "it");
                return interfaceC0010k.q();
            default:
                InterfaceC0002c interfaceC0002c = (InterfaceC0002c) obj;
                j.b(interfaceC0002c);
                return AbstractC1098d.l(interfaceC0002c);
        }
    }
}
