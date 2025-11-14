package O7;

import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1165d;
import n6.InterfaceC1166e;
import n6.InterfaceC1167f;

/* loaded from: classes.dex */
public final class K extends AbstractC0720j implements InterfaceC1165d {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4081h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f4082i;
    public /* synthetic */ InterfaceC0234g j;
    public /* synthetic */ Object[] k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC0720j f4083l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public K(InterfaceC0617c interfaceC0617c, InterfaceC1166e interfaceC1166e) {
        super(3, interfaceC0617c);
        this.f4083l = (AbstractC0720j) interfaceC1166e;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [f6.j, n6.e] */
    /* JADX WARN: Type inference failed for: r1v1, types: [n6.f, f6.j] */
    @Override // n6.InterfaceC1165d
    public final Object j(Object obj, Object obj2, Object obj3) {
        InterfaceC0234g interfaceC0234g = (InterfaceC0234g) obj;
        Object[] objArr = (Object[]) obj2;
        InterfaceC0617c interfaceC0617c = (InterfaceC0617c) obj3;
        switch (this.f4081h) {
            case 0:
                K k = new K(interfaceC0617c, (InterfaceC1166e) this.f4083l);
                k.j = interfaceC0234g;
                k.k = objArr;
                return k.v(Z5.y.f7506a);
            default:
                K k6 = new K(interfaceC0617c, (InterfaceC1167f) this.f4083l);
                k6.j = interfaceC0234g;
                k6.k = objArr;
                return k6.v(Z5.y.f7506a);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [f6.j, n6.e] */
    /* JADX WARN: Type inference failed for: r5v1, types: [n6.f, f6.j] */
    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        InterfaceC0234g interfaceC0234g;
        InterfaceC0234g interfaceC0234g2;
        K k;
        switch (this.f4081h) {
            case 0:
                int i4 = this.f4082i;
                EnumC0646a enumC0646a = EnumC0646a.f10656d;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            Z5.a.d(obj);
                            return Z5.y.f7506a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC0234g = this.j;
                    Z5.a.d(obj);
                } else {
                    Z5.a.d(obj);
                    interfaceC0234g = this.j;
                    Object[] objArr = this.k;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    this.j = interfaceC0234g;
                    this.f4082i = 1;
                    obj = this.f4083l.q(obj2, obj3, obj4, this);
                    if (obj == enumC0646a) {
                        return enumC0646a;
                    }
                }
                this.j = null;
                this.f4082i = 2;
                if (interfaceC0234g.n(obj, this) == enumC0646a) {
                    return enumC0646a;
                }
                return Z5.y.f7506a;
            default:
                int i8 = this.f4082i;
                EnumC0646a enumC0646a2 = EnumC0646a.f10656d;
                if (i8 != 0) {
                    if (i8 != 1) {
                        if (i8 == 2) {
                            Z5.a.d(obj);
                            return Z5.y.f7506a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC0234g2 = this.j;
                    Z5.a.d(obj);
                    k = this;
                } else {
                    Z5.a.d(obj);
                    interfaceC0234g2 = this.j;
                    Object[] objArr2 = this.k;
                    Object obj5 = objArr2[0];
                    Object obj6 = objArr2[1];
                    Object obj7 = objArr2[2];
                    Object obj8 = objArr2[3];
                    this.j = interfaceC0234g2;
                    this.f4082i = 1;
                    k = this;
                    obj = this.f4083l.b(obj5, obj6, obj7, obj8, k);
                    if (obj == enumC0646a2) {
                        return enumC0646a2;
                    }
                }
                k.j = null;
                k.f4082i = 2;
                if (interfaceC0234g2.n(obj, this) == enumC0646a2) {
                    return enumC0646a2;
                }
                return Z5.y.f7506a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public K(InterfaceC0617c interfaceC0617c, InterfaceC1167f interfaceC1167f) {
        super(3, interfaceC0617c);
        this.f4083l = (AbstractC0720j) interfaceC1167f;
    }
}
