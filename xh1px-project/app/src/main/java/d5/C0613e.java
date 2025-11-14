package d5;

import L7.InterfaceC0163v;
import O7.P;
import Z5.y;
import com.buzbuz.smartautoclicker.settings.SettingsFragment;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;

/* renamed from: d5.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0613e extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f10409h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ SettingsFragment f10410i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0613e(SettingsFragment settingsFragment, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f10410i = settingsFragment;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C0613e) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new C0613e(this.f10410i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        int i4 = this.f10409h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
                return y.f7506a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Z5.a.d(obj);
        SettingsFragment settingsFragment = this.f10410i;
        P p8 = settingsFragment.S().f10438f;
        H3.b bVar = settingsFragment.f9878i0;
        if (bVar != null) {
            C0611c c0611c = new C0611c((A4.c) bVar.f1907l, 1);
            this.f10409h = 1;
            p8.f4088d.x(c0611c, this);
            return EnumC0646a.f10656d;
        }
        o6.j.i("viewBinding");
        throw null;
    }
}
