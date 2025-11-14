package H3;

import b6.C0538f;
import com.buzbuz.smartautoclicker.R;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import java.util.List;
import l2.C1001a;
import n6.InterfaceC1166e;

/* loaded from: classes.dex */
public final class q extends AbstractC0720j implements InterfaceC1166e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1959h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ I3.a f1960i;
    public /* synthetic */ I3.b j;
    public /* synthetic */ I3.b k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i4, InterfaceC0617c interfaceC0617c, int i8) {
        super(i4, interfaceC0617c);
        this.f1959h = i8;
    }

    @Override // n6.InterfaceC1166e
    public final Object q(Object obj, Object obj2, Object obj3, Object obj4) {
        I3.a aVar = (I3.a) obj;
        I3.b bVar = (I3.b) obj2;
        I3.b bVar2 = (I3.b) obj3;
        InterfaceC0617c interfaceC0617c = (InterfaceC0617c) obj4;
        switch (this.f1959h) {
            case 0:
                q qVar = new q(4, interfaceC0617c, 0);
                qVar.f1960i = aVar;
                qVar.j = bVar;
                qVar.k = bVar2;
                return qVar.v(Z5.y.f7506a);
            default:
                q qVar2 = new q(4, interfaceC0617c, 1);
                qVar2.f1960i = aVar;
                qVar2.j = bVar;
                qVar2.k = bVar2;
                return qVar2.v(Z5.y.f7506a);
        }
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        List list;
        List list2;
        boolean z8;
        boolean z9;
        List list3;
        List list4;
        switch (this.f1959h) {
            case 0:
                I3.a aVar = this.f1960i;
                I3.b bVar = this.j;
                I3.b bVar2 = this.k;
                Z5.a.d(obj);
                Object obj2 = aVar.f2086a;
                boolean z10 = false;
                if (obj2 != null && (list = bVar.f2089a) != null && (list2 = bVar2.f2089a) != null) {
                    I3.c cVar = new I3.c((C1001a) obj2, list, list2);
                    if (!aVar.f2087b && !bVar.f2091c && !bVar2.f2091c) {
                        z8 = false;
                    } else {
                        z8 = true;
                    }
                    if (aVar.f2088c && bVar.f2092d && bVar2.f2092d && (!bVar.f2089a.isEmpty() || !bVar2.f2089a.isEmpty())) {
                        z10 = true;
                    }
                    return new I3.a(cVar, z8, z10);
                }
                return new I3.a(null, false, false);
            default:
                I3.a aVar2 = this.f1960i;
                I3.b bVar3 = this.j;
                I3.b bVar4 = this.k;
                Z5.a.d(obj);
                C0538f c0538f = new C0538f();
                Integer num = new Integer(R.id.page_image_events);
                boolean z11 = bVar3.f2092d;
                List list5 = bVar3.f2089a;
                boolean z12 = false;
                if (z11 && ((list5 != null && !list5.isEmpty()) || ((list4 = bVar4.f2089a) != null && !list4.isEmpty()))) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                c0538f.put(num, Boolean.valueOf(z9));
                Integer num2 = new Integer(R.id.page_trigger_events);
                if (bVar4.f2092d && ((list5 != null && !list5.isEmpty()) || ((list3 = bVar4.f2089a) != null && !list3.isEmpty()))) {
                    z12 = true;
                }
                c0538f.put(num2, Boolean.valueOf(z12));
                c0538f.put(new Integer(R.id.page_config), Boolean.valueOf(aVar2.f2088c));
                c0538f.put(new Integer(R.id.page_more), Boolean.TRUE);
                return c0538f.c();
        }
    }
}
