package T6;

import C6.InterfaceC0004e;
import java.util.Collection;
import java.util.Set;
import n6.InterfaceC1163b;
import p7.InterfaceC1333o;

/* loaded from: classes.dex */
public final class C extends F7.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0004e f5803b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Set f5804c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1163b f5805d;

    public C(InterfaceC0004e interfaceC0004e, Set set, InterfaceC1163b interfaceC1163b) {
        this.f5803b = interfaceC0004e;
        this.f5804c = set;
        this.f5805d = interfaceC1163b;
    }

    @Override // F7.l
    public final boolean c(Object obj) {
        InterfaceC0004e interfaceC0004e = (InterfaceC0004e) obj;
        o6.j.e(interfaceC0004e, "current");
        if (interfaceC0004e != this.f5803b) {
            InterfaceC1333o o02 = interfaceC0004e.o0();
            o6.j.d(o02, "getStaticScope(...)");
            if (o02 instanceof E) {
                this.f5804c.addAll((Collection) this.f5805d.m(o02));
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // F7.l
    public final /* bridge */ /* synthetic */ Object j() {
        return Z5.y.f7506a;
    }
}
