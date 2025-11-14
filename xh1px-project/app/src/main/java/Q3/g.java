package Q3;

import O7.InterfaceC0234g;
import Z5.y;
import a6.AbstractC0436k;
import android.content.Context;
import android.content.pm.PackageManager;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import java.util.List;
import n6.InterfaceC1164c;
import o6.j;
import s3.AbstractC1492c;

/* loaded from: classes.dex */
public final class g extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public int f4852h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f4853i;
    public final /* synthetic */ Context j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.j = context;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((g) p((InterfaceC0617c) obj2, (InterfaceC0234g) obj)).v(y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        g gVar = new g(this.j, interfaceC0617c);
        gVar.f4853i = obj;
        return gVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        InterfaceC0234g interfaceC0234g = (InterfaceC0234g) this.f4853i;
        int i4 = this.f4852h;
        if (i4 != 0) {
            if (i4 == 1) {
                Z5.a.d(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            Z5.a.d(obj);
            PackageManager packageManager = this.j.getPackageManager();
            j.d(packageManager, "getPackageManager(...)");
            List L02 = AbstractC0436k.L0(AbstractC1492c.m(packageManager), new A0.i(8));
            this.f4853i = null;
            this.f4852h = 1;
            Object n3 = interfaceC0234g.n(L02, this);
            EnumC0646a enumC0646a = EnumC0646a.f10656d;
            if (n3 == enumC0646a) {
                return enumC0646a;
            }
        }
        return y.f7506a;
    }
}
