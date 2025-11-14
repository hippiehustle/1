package W4;

import L7.InterfaceC0163v;
import Z5.y;
import androidx.lifecycle.EnumC0504o;
import androidx.lifecycle.U;
import com.buzbuz.smartautoclicker.scenarios.list.ScenarioListFragment;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import g0.d0;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class n extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f6605h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ScenarioListFragment f6606i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ScenarioListFragment scenarioListFragment, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f6606i = scenarioListFragment;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((n) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new n(this.f6606i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f6605h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            ScenarioListFragment scenarioListFragment = this.f6606i;
            d0 o7 = scenarioListFragment.o();
            m mVar = new m(scenarioListFragment, null);
            this.f6605h = 1;
            Object h8 = U.h(o7, EnumC0504o.f8849g, mVar, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (h8 == enumC0646a) {
                return enumC0646a;
            }
        }
        return y.f7506a;
    }
}
