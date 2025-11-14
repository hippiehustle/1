package d5;

import L7.InterfaceC0163v;
import Z5.y;
import androidx.lifecycle.EnumC0504o;
import androidx.lifecycle.U;
import com.buzbuz.smartautoclicker.settings.SettingsFragment;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import g0.d0;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class o extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f10429h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ SettingsFragment f10430i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(SettingsFragment settingsFragment, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f10430i = settingsFragment;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((o) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new o(this.f10430i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f10429h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            SettingsFragment settingsFragment = this.f10430i;
            d0 o7 = settingsFragment.o();
            n nVar = new n(settingsFragment, null);
            this.f10429h = 1;
            Object h8 = U.h(o7, EnumC0504o.f8849g, nVar, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (h8 == enumC0646a) {
                return enumC0646a;
            }
        }
        return y.f7506a;
    }
}
