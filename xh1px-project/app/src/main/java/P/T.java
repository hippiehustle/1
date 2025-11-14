package P;

import android.view.View;
import android.view.ViewGroup;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0719i;
import n6.InterfaceC1164c;

/* loaded from: classes.dex */
public final class T extends AbstractC0719i implements InterfaceC1164c {

    /* renamed from: f, reason: collision with root package name */
    public int f4225f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f4226g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ View f4227h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(View view, InterfaceC0617c interfaceC0617c) {
        super(2, interfaceC0617c);
        this.f4227h = view;
    }

    @Override // n6.InterfaceC1164c
    public final Object l(Object obj, Object obj2) {
        return ((T) p((InterfaceC0617c) obj2, (H7.l) obj)).v(Z5.y.f7506a);
    }

    @Override // f6.AbstractC0711a
    public final InterfaceC0617c p(InterfaceC0617c interfaceC0617c, Object obj) {
        T t8 = new T(this.f4227h, interfaceC0617c);
        t8.f4226g = obj;
        return t8;
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        Object obj2;
        int i4 = this.f4225f;
        View view = this.f4227h;
        Object obj3 = EnumC0646a.f10656d;
        if (i4 != 0) {
            Object obj4 = Z5.y.f7506a;
            if (i4 != 1) {
                if (i4 == 2) {
                    Z5.a.d(obj);
                    return obj4;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            H7.l lVar = (H7.l) this.f4226g;
            Z5.a.d(obj);
            if (view instanceof ViewGroup) {
                this.f4226g = null;
                this.f4225f = 2;
                lVar.getClass();
                H7.s sVar = new H7.s(new S(0, (ViewGroup) view));
                if (!sVar.f2080e.hasNext()) {
                    obj2 = obj4;
                } else {
                    lVar.f2071f = sVar;
                    lVar.f2069d = 2;
                    lVar.f2072g = this;
                    obj2 = obj3;
                }
                if (obj2 != obj3) {
                    obj2 = obj4;
                }
                if (obj2 == obj3) {
                    return obj3;
                }
            }
            return obj4;
        }
        Z5.a.d(obj);
        H7.l lVar2 = (H7.l) this.f4226g;
        this.f4226g = lVar2;
        this.f4225f = 1;
        lVar2.f2070e = view;
        lVar2.f2069d = 3;
        lVar2.f2072g = this;
        return obj3;
    }
}
