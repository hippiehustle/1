package W4;

import L7.AbstractC0166y;
import L7.InterfaceC0163v;
import Z5.y;
import com.buzbuz.smartautoclicker.scenarios.list.ScenarioListFragment;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class m extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f6603h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ScenarioListFragment f6604i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ScenarioListFragment scenarioListFragment, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f6604i = scenarioListFragment;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        m mVar = (m) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        y yVar = y.f7506a;
        mVar.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        m mVar = new m(this.f6604i, interfaceC0617c);
        mVar.f6603h = obj;
        return mVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        InterfaceC0163v interfaceC0163v = (InterfaceC0163v) this.f6603h;
        Z5.a.d(obj);
        ScenarioListFragment scenarioListFragment = this.f6604i;
        AbstractC0166y.q(interfaceC0163v, null, null, new k(scenarioListFragment, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new l(scenarioListFragment, null), 3);
        return y.f7506a;
    }
}
