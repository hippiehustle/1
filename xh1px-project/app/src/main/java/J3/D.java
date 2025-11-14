package J3;

import L7.InterfaceC0163v;
import android.content.Context;
import android.content.SharedPreferences;
import com.buzbuz.smartautoclicker.R;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import i.AbstractC0863b;
import n6.InterfaceC1164c;
import z4.C1866j;

/* loaded from: classes.dex */
public final class D extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f2406h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ H f2407i;
    public final /* synthetic */ Context j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(H h8, Context context, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f2407i = h8;
        this.j = context;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((D) p((InterfaceC0617c) obj2, (InterfaceC0163v) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        return new D(this.f2407i, this.j, interfaceC0617c);
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        C1866j c1866j;
        int i4 = this.f2406h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            H h8 = this.f2407i;
            v2.h hVar = h8.f2413b;
            C4.f fVar = h8.f2418g;
            SharedPreferences sharedPreferences = fVar.f632b;
            Context context = this.j;
            if (!AbstractC0863b.j(sharedPreferences, context) && !sharedPreferences.getBoolean("Debug_Report_Enabled", context.getResources().getBoolean(R.bool.default_debug_report_enabled))) {
                c1866j = null;
            } else {
                c1866j = fVar.f631a;
            }
            h8.f2416e.getClass();
            this.f2406h = 1;
            Object c6 = hVar.c(context, c1866j, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (c6 == enumC0646a) {
                return enumC0646a;
            }
        }
        return Z5.y.f7506a;
    }
}
