package O4;

import L7.InterfaceC0163v;
import Z5.y;
import androidx.lifecycle.EnumC0504o;
import androidx.lifecycle.U;
import com.buzbuz.smartautoclicker.feature.tutorial.ui.TutorialActivity;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class f extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f4018h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ TutorialActivity f4019i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TutorialActivity tutorialActivity, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f4019i = tutorialActivity;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((f) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new f(this.f4019i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f4018h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            TutorialActivity tutorialActivity = this.f4019i;
            e eVar = new e(tutorialActivity, null);
            this.f4018h = 1;
            Object h8 = U.h(tutorialActivity, EnumC0504o.f8849g, eVar, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (h8 == enumC0646a) {
                return enumC0646a;
            }
        }
        return y.f7506a;
    }
}
