package Q4;

import L7.InterfaceC0163v;
import O7.InterfaceC0233f;
import Z5.y;
import com.buzbuz.smartautoclicker.feature.tutorial.ui.game.TutorialGameFragment;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class g extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f4870h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ TutorialGameFragment f4871i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(TutorialGameFragment tutorialGameFragment, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f4871i = tutorialGameFragment;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((g) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new g(this.f4871i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f4870h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            TutorialGameFragment tutorialGameFragment = this.f4871i;
            InterfaceC0233f interfaceC0233f = tutorialGameFragment.T().f4902g;
            c cVar = new c(tutorialGameFragment, 3);
            this.f4870h = 1;
            Object x8 = interfaceC0233f.x(cVar, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (x8 == enumC0646a) {
                return enumC0646a;
            }
        }
        return y.f7506a;
    }
}
