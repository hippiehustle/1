package X;

import a0.C0407b;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n6.InterfaceC1164c;

/* renamed from: X.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0338f extends AbstractC0720j implements InterfaceC1164c {

    /* renamed from: h, reason: collision with root package name */
    public Iterator f6726h;

    /* renamed from: i, reason: collision with root package name */
    public y2.c f6727i;
    public Object j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f6728l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ List f6729m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ArrayList f6730n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0338f(List list, ArrayList arrayList, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f6729m = list;
        this.f6730n = arrayList;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((C0338f) p((InterfaceC0617c) obj2, obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        C0338f c0338f = new C0338f(this.f6729m, this.f6730n, interfaceC0617c);
        c0338f.f6728l = obj;
        return c0338f;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0042  */
    @Override // f6.AbstractC0711a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        Iterator it;
        List list;
        y2.c cVar;
        Iterator it2;
        Object obj2;
        int i4 = this.k;
        EnumC0646a enumC0646a = EnumC0646a.f10656d;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    it = this.f6726h;
                    list = (List) this.f6728l;
                    Z5.a.d(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                obj2 = this.j;
                y2.c cVar2 = this.f6727i;
                it2 = this.f6726h;
                List list2 = (List) this.f6728l;
                Z5.a.d(obj);
                cVar = cVar2;
                list = list2;
                if (!((Boolean) obj).booleanValue()) {
                    list.add(new C0337e(cVar, null, 0));
                    this.f6728l = list;
                    this.f6726h = it2;
                    this.f6727i = null;
                    this.j = null;
                    this.k = 2;
                    cVar.getClass();
                    obj = cVar.a((C0407b) obj2, this);
                    if (obj != enumC0646a) {
                        it = it2;
                    }
                    return enumC0646a;
                }
                obj = obj2;
                it = it2;
            }
        } else {
            Z5.a.d(obj);
            obj = this.f6728l;
            it = this.f6729m.iterator();
            list = this.f6730n;
        }
        if (!it.hasNext()) {
            y2.c cVar3 = (y2.c) it.next();
            this.f6728l = list;
            this.f6726h = it;
            this.f6727i = cVar3;
            this.j = obj;
            this.k = 1;
            cVar3.getClass();
            Boolean bool = Boolean.TRUE;
            if (bool != enumC0646a) {
                Iterator it3 = it;
                obj2 = obj;
                obj = bool;
                cVar = cVar3;
                it2 = it3;
                if (!((Boolean) obj).booleanValue()) {
                }
                if (!it.hasNext()) {
                    return obj;
                }
            }
            return enumC0646a;
        }
    }
}
