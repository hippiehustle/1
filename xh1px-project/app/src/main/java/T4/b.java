package T4;

import Z5.y;
import com.buzbuz.smartautoclicker.SmartAutoClickerService;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import n6.InterfaceC1164c;
import s3.C1491b;
import t3.C1572j;

/* loaded from: classes.dex */
public final class b extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ boolean f5759h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ k f5760i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(k kVar, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f5760i = kVar;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        b bVar = (b) p((InterfaceC0617c) obj2, bool);
        y yVar = y.f7506a;
        bVar.v(yVar);
        return yVar;
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        b bVar = new b(this.f5760i, interfaceC0617c);
        bVar.f5759h = ((Boolean) obj).booleanValue();
        return bVar;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        boolean z8 = this.f5759h;
        Z5.a.d(obj);
        k kVar = this.f5760i;
        C1491b c1491b = (C1491b) kVar.f5785n.getValue();
        SmartAutoClickerService smartAutoClickerService = kVar.f5774a;
        boolean z9 = !kVar.f5775b.c();
        C1572j c1572j = c1491b.f14517f;
        if (c1572j != null) {
            c1491b.a(smartAutoClickerService, C1572j.a(c1572j, z8, z9, false, 9));
        }
        return y.f7506a;
    }
}
