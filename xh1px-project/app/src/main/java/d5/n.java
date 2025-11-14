package d5;

import L7.AbstractC0166y;
import L7.InterfaceC0163v;
import Z5.y;
import com.buzbuz.smartautoclicker.settings.SettingsFragment;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class n extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f10427h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ SettingsFragment f10428i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(SettingsFragment settingsFragment, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f10428i = settingsFragment;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        n nVar = (n) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        y yVar = y.f7506a;
        nVar.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        n nVar = new n(this.f10428i, interfaceC0617c);
        nVar.f10427h = obj;
        return nVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        InterfaceC0163v interfaceC0163v = (InterfaceC0163v) this.f10427h;
        Z5.a.d(obj);
        SettingsFragment settingsFragment = this.f10428i;
        AbstractC0166y.q(interfaceC0163v, null, null, new C0612d(settingsFragment, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new C0613e(settingsFragment, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new C0614f(settingsFragment, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new g(settingsFragment, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new h(settingsFragment, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new j(settingsFragment, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new k(settingsFragment, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new l(settingsFragment, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new m(settingsFragment, null), 3);
        return y.f7506a;
    }
}
