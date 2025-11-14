package C3;

import Z5.y;
import a6.AbstractC0436k;
import b6.C0535c;
import d6.InterfaceC0617c;
import f6.AbstractC0720j;
import java.util.List;
import n6.InterfaceC1165d;

/* loaded from: classes.dex */
public final class b extends AbstractC0720j implements InterfaceC1165d {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f588h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ List f589i;
    public /* synthetic */ List j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i4, InterfaceC0617c interfaceC0617c, int i8) {
        super(i4, interfaceC0617c);
        this.f588h = i8;
    }

    @Override // n6.InterfaceC1165d
    public final Object j(Object obj, Object obj2, Object obj3) {
        List list = (List) obj;
        List list2 = (List) obj2;
        InterfaceC0617c interfaceC0617c = (InterfaceC0617c) obj3;
        switch (this.f588h) {
            case 0:
                b bVar = new b(3, interfaceC0617c, 0);
                bVar.f589i = list;
                bVar.j = list2;
                return bVar.v(y.f7506a);
            case 1:
                b bVar2 = new b(3, interfaceC0617c, 1);
                bVar2.f589i = list;
                bVar2.j = list2;
                return bVar2.v(y.f7506a);
            default:
                b bVar3 = new b(3, interfaceC0617c, 2);
                bVar3.f589i = list;
                bVar3.j = list2;
                return bVar3.v(y.f7506a);
        }
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        switch (this.f588h) {
            case 0:
                List list = this.f589i;
                List list2 = this.j;
                Z5.a.d(obj);
                C0535c i4 = E2.d.i();
                i4.addAll(list);
                i4.addAll(list2);
                return E2.d.f(i4);
            case 1:
                List list3 = this.f589i;
                List list4 = this.j;
                Z5.a.d(obj);
                C0535c i8 = E2.d.i();
                i8.addAll(list3);
                i8.addAll(list4);
                return E2.d.f(i8);
            default:
                List list5 = this.f589i;
                List list6 = this.j;
                Z5.a.d(obj);
                return AbstractC0436k.C0(list5, list6);
        }
    }
}
