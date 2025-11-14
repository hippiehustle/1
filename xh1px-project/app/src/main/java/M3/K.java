package M3;

import O7.C0235h;
import O7.InterfaceC0233f;
import O7.InterfaceC0234g;
import android.content.Context;
import com.buzbuz.smartautoclicker.R;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import k2.AbstractC0951a;
import k2.C0952b;
import k2.C0953c;
import n6.InterfaceC1165d;
import w3.C1692a;
import x3.C1787d;

/* loaded from: classes.dex */
public final class K extends AbstractC0720j implements InterfaceC1165d {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f3374h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f3375i;
    public final /* synthetic */ Context j;
    public /* synthetic */ Object k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f3376l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f3377m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(Z z8, Context context, InterfaceC0617c interfaceC0617c) {
        super(3, interfaceC0617c);
        this.f3377m = z8;
        this.j = context;
    }

    @Override // n6.InterfaceC1165d
    public final Object j(Object obj, Object obj2, Object obj3) {
        switch (this.f3374h) {
            case 0:
                K k = new K((Z) this.f3377m, this.j, (InterfaceC0617c) obj3);
                k.k = (I3.a) obj;
                k.f3376l = (f2.e) obj2;
                return k.v(Z5.y.f7506a);
            default:
                K k6 = new K((InterfaceC0617c) obj3, (C1787d) this.f3377m, this.j);
                k6.k = (InterfaceC0234g) obj;
                k6.f3376l = obj2;
                return k6.v(Z5.y.f7506a);
        }
    }

    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        InterfaceC0233f cVar;
        switch (this.f3374h) {
            case 0:
                Z z8 = (Z) this.f3377m;
                I3.a aVar = (I3.a) this.k;
                f2.e eVar = (f2.e) this.f3376l;
                int i4 = this.f3375i;
                if (i4 != 0) {
                    if (i4 == 1) {
                        Z5.a.d(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Z5.a.d(obj);
                    AbstractC0951a abstractC0951a = (AbstractC0951a) aVar.f2086a;
                    if (abstractC0951a == null) {
                        return null;
                    }
                    boolean z9 = abstractC0951a instanceof C0953c;
                    Context context = this.j;
                    if (z9) {
                        return Z.f(z8, context, eVar, true);
                    }
                    boolean z10 = abstractC0951a instanceof C0952b;
                    if (z10 && eVar.f10695f == f2.d.f10687d) {
                        return Z.f(z8, context, eVar, false);
                    }
                    f2.d dVar = f2.d.f10688e;
                    if (z10 && eVar.f10695f == dVar && abstractC0951a.h() == 2) {
                        String string = context.getString(R.string.field_condition_selection_title_or_operator);
                        o6.j.d(string, "getString(...)");
                        return new I(dVar, true, true, true, Z.g(context, eVar), false, string, context.getString(R.string.field_condition_selection_desc_or_operator), null);
                    }
                    if (!z10 || eVar.f10695f != dVar || ((AbstractC0951a) aVar.f2086a).h() != 1) {
                        return null;
                    }
                    this.k = null;
                    this.f3376l = null;
                    this.f3375i = 1;
                    obj = Z.e(z8, context, (C0952b) abstractC0951a, eVar, this);
                    EnumC0646a enumC0646a = EnumC0646a.f10656d;
                    if (obj == enumC0646a) {
                        return enumC0646a;
                    }
                }
                return (I) obj;
            default:
                C1787d c1787d = (C1787d) this.f3377m;
                int i8 = this.f3375i;
                if (i8 != 0) {
                    if (i8 == 1) {
                        Z5.a.d(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Z5.a.d(obj);
                    InterfaceC0234g interfaceC0234g = (InterfaceC0234g) this.k;
                    C1692a c1692a = (C1692a) this.f3376l;
                    Context context2 = this.j;
                    InterfaceC0617c interfaceC0617c = null;
                    if (c1692a == null) {
                        cVar = new C0235h(C1787d.a(c1787d, context2, false, null, null, null));
                    } else {
                        long j = c1692a.f15677a;
                        if (c1692a.f15678b) {
                            cVar = new A4.c(new H3.i(O7.V.u(c1787d.f16122c.f9111a.f9603d, new c2.d(interfaceC0617c, j, 1)), 2), c1787d.f16123d.f15509i, new N3.i(c1787d, context2, interfaceC0617c, 3), 27);
                        } else {
                            cVar = new A4.c(c1787d.f16120a.a(j), c1787d.f16121b.f13970i, new N3.i(c1787d, context2, interfaceC0617c, 4), 27);
                        }
                    }
                    this.k = null;
                    this.f3376l = null;
                    this.f3375i = 1;
                    Object l6 = O7.V.l(interfaceC0234g, cVar, this);
                    EnumC0646a enumC0646a2 = EnumC0646a.f10656d;
                    if (l6 == enumC0646a2) {
                        return enumC0646a2;
                    }
                }
                return Z5.y.f7506a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(InterfaceC0617c interfaceC0617c, C1787d c1787d, Context context) {
        super(3, interfaceC0617c);
        this.f3377m = c1787d;
        this.j = context;
    }
}
