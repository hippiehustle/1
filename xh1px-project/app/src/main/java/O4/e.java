package O4;

import L7.AbstractC0166y;
import L7.InterfaceC0163v;
import Z5.y;
import com.buzbuz.smartautoclicker.feature.tutorial.ui.TutorialActivity;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class e extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f4016h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ TutorialActivity f4017i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(TutorialActivity tutorialActivity, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f4017i = tutorialActivity;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        e eVar = (e) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj);
        y yVar = y.f7506a;
        eVar.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        e eVar = new e(this.f4017i, interfaceC0617c);
        eVar.f4016h = obj;
        return eVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        InterfaceC0163v interfaceC0163v = (InterfaceC0163v) this.f4016h;
        Z5.a.d(obj);
        TutorialActivity tutorialActivity = this.f4017i;
        AbstractC0166y.q(interfaceC0163v, null, null, new c(tutorialActivity, null), 3);
        AbstractC0166y.q(interfaceC0163v, null, null, new d(tutorialActivity, null), 3);
        return y.f7506a;
    }
}
