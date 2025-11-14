package Q4;

import D4.C0040p;
import L7.InterfaceC0163v;
import Z5.y;
import com.buzbuz.smartautoclicker.feature.tutorial.ui.game.TutorialGameFragment;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class j extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f4876h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ TutorialGameFragment f4877i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(TutorialGameFragment tutorialGameFragment, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f4877i = tutorialGameFragment;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((j) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new j(this.f4877i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f4876h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            TutorialGameFragment tutorialGameFragment = this.f4877i;
            C0040p c0040p = tutorialGameFragment.T().f4899d;
            c cVar = new c(tutorialGameFragment, 6);
            this.f4876h = 1;
            Object x8 = c0040p.x(cVar, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (x8 == enumC0646a) {
                return enumC0646a;
            }
        }
        return y.f7506a;
    }
}
