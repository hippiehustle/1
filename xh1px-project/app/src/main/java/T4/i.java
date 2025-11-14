package T4;

import L7.InterfaceC0163v;
import Z5.y;
import android.content.SharedPreferences;
import com.buzbuz.smartautoclicker.R;
import com.buzbuz.smartautoclicker.SmartAutoClickerService;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import i.AbstractC0863b;
import n6.InterfaceC1164c;
import z4.C1866j;

/* loaded from: classes.dex */
public final class i extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f5770h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ k f5771i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f5771i = kVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((i) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new i(this.f5771i, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        C1866j c1866j;
        int i4 = this.f5770h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            k kVar = this.f5771i;
            v2.h hVar = kVar.f5778e;
            SmartAutoClickerService smartAutoClickerService = kVar.f5774a;
            C4.f fVar = kVar.f5781h;
            SharedPreferences sharedPreferences = fVar.f632b;
            if (!AbstractC0863b.j(sharedPreferences, smartAutoClickerService) && !sharedPreferences.getBoolean("Debug_Report_Enabled", smartAutoClickerService.getResources().getBoolean(R.bool.default_debug_report_enabled))) {
                c1866j = null;
            } else {
                c1866j = fVar.f631a;
            }
            this.f5770h = 1;
            Object c6 = hVar.c(smartAutoClickerService, c1866j, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (c6 == enumC0646a) {
                return enumC0646a;
            }
        }
        return y.f7506a;
    }
}
