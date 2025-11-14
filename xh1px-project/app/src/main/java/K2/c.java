package K2;

import L7.AbstractC0166y;
import L7.InterfaceC0163v;
import Z5.y;
import android.view.animation.Animation;
import androidx.constraintlayout.widget.ConstraintLayout;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import java.util.Objects;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class c extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f2606h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d f2607i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f2607i = dVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((c) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new c(this.f2607i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f2606h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            this.f2606h = 1;
            Object g8 = AbstractC0166y.g(3000L, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (g8 == enumC0646a) {
                return enumC0646a;
            }
        }
        d dVar = this.f2607i;
        Objects.toString(dVar.f2613f);
        ConstraintLayout constraintLayout = dVar.f2613f;
        if (constraintLayout != null) {
            Animation animation = dVar.f2609b;
            if (animation != null) {
                constraintLayout.startAnimation(animation);
            } else {
                o6.j.i("hideAnimation");
                throw null;
            }
        }
        dVar.f2612e = null;
        return y.f7506a;
    }
}
