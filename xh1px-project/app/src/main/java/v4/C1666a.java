package v4;

import Z5.y;
import android.content.ComponentName;
import android.content.Intent;
import n6.InterfaceC1162a;

/* renamed from: v4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1666a implements InterfaceC1162a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15517d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1674i f15518e;

    public /* synthetic */ C1666a(C1674i c1674i, int i4) {
        this.f15517d = i4;
        this.f15518e = c1674i;
    }

    @Override // n6.InterfaceC1162a
    public final Object a() {
        switch (this.f15517d) {
            case 0:
                C1674i c1674i = this.f15518e;
                c1674i.c(new C1666a(c1674i, 1));
                break;
            case 1:
                C1674i c1674i2 = this.f15518e;
                c1674i2.i().o().d(c1674i2.h(), new E4.g(), false);
                break;
            default:
                C1674i c1674i3 = this.f15518e;
                c1674i3.i().a();
                Intent intent = new Intent();
                c1674i3.t().f15537b.getClass();
                Intent flags = intent.setComponent(new ComponentName("com.buzbuz.smartautoclicker", "com.buzbuz.smartautoclicker.feature.tutorial.ui.TutorialActivity")).setFlags(268435456);
                o6.j.d(flags, "setFlags(...)");
                c1674i3.h().startActivity(flags);
                break;
        }
        return y.f7506a;
    }
}
