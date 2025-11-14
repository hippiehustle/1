package O4;

import L7.InterfaceC0163v;
import Z5.y;
import com.buzbuz.smartautoclicker.feature.tutorial.ui.TutorialActivity;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class d extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f4014h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ TutorialActivity f4015i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TutorialActivity tutorialActivity, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f4015i = tutorialActivity;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((d) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new d(this.f4015i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f4014h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            int i8 = TutorialActivity.f9824J;
            TutorialActivity tutorialActivity = this.f4015i;
            W0.d dVar = tutorialActivity.z().f4033d;
            b bVar = new b(tutorialActivity, 1);
            this.f4014h = 1;
            Object x8 = dVar.x(bVar, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (x8 == enumC0646a) {
                return enumC0646a;
            }
        }
        return y.f7506a;
    }
}
