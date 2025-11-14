package W4;

import L7.InterfaceC0163v;
import O7.P;
import Z5.y;
import com.buzbuz.smartautoclicker.scenarios.list.ScenarioListFragment;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import kotlin.KotlinNothingValueException;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class k extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f6599h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ScenarioListFragment f6600i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ScenarioListFragment scenarioListFragment, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f6600i = scenarioListFragment;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        ((k) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
        return EnumC0646a.f10656d;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new k(this.f6600i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f6599h;
        if (i4 != 0) {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Z5.a.d(obj);
            throw new KotlinNothingValueException();
        }
        Z5.a.d(obj);
        ScenarioListFragment scenarioListFragment = this.f6600i;
        P p8 = scenarioListFragment.S().j;
        j jVar = new j(scenarioListFragment, 0);
        this.f6599h = 1;
        p8.f4088d.x(jVar, this);
        return EnumC0646a.f10656d;
    }
}
