package Q4;

import L7.AbstractC0166y;
import L7.InterfaceC0163v;
import Z5.y;
import com.buzbuz.smartautoclicker.feature.tutorial.ui.game.TutorialGameFragment;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class k extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f4878h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ TutorialGameFragment f4879i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(TutorialGameFragment tutorialGameFragment, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f4879i = tutorialGameFragment;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        k kVar = (k) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        y yVar = y.f7506a;
        kVar.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        k kVar = new k(this.f4879i, interfaceC0617c);
        kVar.f4878h = obj;
        return kVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        InterfaceC0163v interfaceC0163v = (InterfaceC0163v) this.f4878h;
        Z5.a.d(obj);
        TutorialGameFragment tutorialGameFragment = this.f4879i;
        AbstractC0166y.q(interfaceC0163v, null, null, new d(tutorialGameFragment, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new e(tutorialGameFragment, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new f(tutorialGameFragment, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new g(tutorialGameFragment, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new h(tutorialGameFragment, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new i(tutorialGameFragment, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new j(tutorialGameFragment, null), 3);
        return y.f7506a;
    }
}
