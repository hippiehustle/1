package R4;

import D4.t;
import L7.InterfaceC0163v;
import R3.r;
import Z5.y;
import com.buzbuz.smartautoclicker.feature.tutorial.ui.list.TutorialListFragment;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;
import o6.j;

/* loaded from: classes.dex */
public final class e extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f5127h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ TutorialListFragment f5128i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(TutorialListFragment tutorialListFragment, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f5128i = tutorialListFragment;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((e) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new e(this.f5128i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f5127h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            TutorialListFragment tutorialListFragment = this.f5128i;
            r rVar = ((i) tutorialListFragment.f9845h0.getValue()).f5134b;
            d dVar = tutorialListFragment.j0;
            if (dVar != null) {
                t tVar = new t(10, dVar);
                this.f5127h = 1;
                Object x8 = rVar.x(tVar, this);
                EnumC0646a enumC0646a = EnumC0646a.f10656d;
                if (x8 == enumC0646a) {
                    return enumC0646a;
                }
            } else {
                j.i("adapter");
                throw null;
            }
        }
        return y.f7506a;
    }
}
