package O7;

import L7.AbstractC0166y;
import P7.AbstractC0285b;
import android.accessibilityservice.GestureDescription;
import d6.InterfaceC0617c;
import e6.EnumC0646a;
import f6.AbstractC0720j;
import n6.InterfaceC1163b;
import q2.C1355a;
import q2.C1357c;
import u0.C1616g;

/* renamed from: O7.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0238k extends AbstractC0720j implements InterfaceC1163b {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4154h;

    /* renamed from: i, reason: collision with root package name */
    public int f4155i;
    public Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0238k(X.H h8, InterfaceC0617c interfaceC0617c) {
        super(1, interfaceC0617c);
        this.f4154h = 1;
        this.k = h8;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [f6.j, n6.b] */
    @Override // n6.InterfaceC1163b
    public final Object m(Object obj) {
        InterfaceC0617c interfaceC0617c = (InterfaceC0617c) obj;
        switch (this.f4154h) {
            case 0:
                return new C0238k((InterfaceC0234g) this.j, (o6.u) this.k, interfaceC0617c, 0).v(Z5.y.f7506a);
            case 1:
                return new C0238k((X.H) this.k, interfaceC0617c).v(Z5.y.f7506a);
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                return new C0238k((C1357c) this.j, (GestureDescription) this.k, interfaceC0617c, 2).v(Z5.y.f7506a);
            default:
                return new C0238k((u0.u) this.j, (AbstractC0720j) this.k, interfaceC0617c).v(Z5.y.f7506a);
        }
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [f6.j, n6.b] */
    @Override // f6.AbstractC0711a
    public final Object v(Object obj) {
        Throwable th;
        X.c0 c0Var;
        int i4 = this.f4154h;
        Z5.y yVar = Z5.y.f7506a;
        Object obj2 = this.k;
        EnumC0646a enumC0646a = EnumC0646a.f10656d;
        switch (i4) {
            case 0:
                o6.u uVar = (o6.u) obj2;
                int i8 = this.f4155i;
                if (i8 != 0) {
                    if (i8 == 1) {
                        Z5.a.d(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Z5.a.d(obj);
                    InterfaceC0234g interfaceC0234g = (InterfaceC0234g) this.j;
                    Q7.t tVar = AbstractC0285b.f4640b;
                    Object obj3 = uVar.f13642d;
                    if (obj3 == tVar) {
                        obj3 = null;
                    }
                    this.f4155i = 1;
                    if (interfaceC0234g.n(obj3, this) == enumC0646a) {
                        return enumC0646a;
                    }
                }
                uVar.f13642d = null;
                return yVar;
            case 1:
                X.H h8 = (X.H) obj2;
                int i9 = this.f4155i;
                try {
                } catch (Throwable th2) {
                    th = th2;
                    X.b0 h9 = h8.h();
                    this.j = th;
                    this.f4155i = 2;
                    obj = h9.a();
                    if (obj == enumC0646a) {
                        return enumC0646a;
                    }
                }
                if (i9 != 0) {
                    if (i9 != 1) {
                        if (i9 == 2) {
                            th = (Throwable) this.j;
                            Z5.a.d(obj);
                            c0Var = new X.U(th, ((Number) obj).intValue());
                            return new Z5.j(c0Var, Boolean.TRUE);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Z5.a.d(obj);
                } else {
                    Z5.a.d(obj);
                    this.f4155i = 1;
                    obj = X.H.f(h8, true, this);
                    if (obj == enumC0646a) {
                        return enumC0646a;
                    }
                }
                c0Var = (X.c0) obj;
                return new Z5.j(c0Var, Boolean.TRUE);
            case Z.g.FLOAT_FIELD_NUMBER /* 2 */:
                int i10 = this.f4155i;
                if (i10 != 0) {
                    if (i10 == 1) {
                        Z5.a.d(obj);
                        return yVar;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Z5.a.d(obj);
                S7.e eVar = L7.F.f3175a;
                M7.e eVar2 = Q7.n.f4962a;
                C1355a c1355a = new C1355a((C1357c) this.j, (GestureDescription) obj2, null);
                this.f4155i = 1;
                if (AbstractC0166y.A(eVar2, c1355a, this) == enumC0646a) {
                    return enumC0646a;
                }
                return yVar;
            default:
                u0.u uVar2 = (u0.u) this.j;
                int i11 = this.f4155i;
                try {
                    if (i11 != 0) {
                        if (i11 == 1) {
                            Z5.a.d(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        Z5.a.d(obj);
                        uVar2.a();
                        uVar2.a();
                        E0.a J6 = uVar2.f().J();
                        if (!J6.w()) {
                            h2.a.y(new C1616g(uVar2.e(), null));
                        }
                        if (J6.A()) {
                            J6.E();
                        } else {
                            J6.g();
                        }
                        this.f4155i = 1;
                        obj = ((AbstractC0720j) obj2).m(this);
                        if (obj == enumC0646a) {
                            return enumC0646a;
                        }
                    }
                    uVar2.f().J().C();
                    uVar2.k();
                    return obj;
                } catch (Throwable th3) {
                    uVar2.k();
                    throw th3;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0238k(Object obj, Object obj2, InterfaceC0617c interfaceC0617c, int i4) {
        super(1, interfaceC0617c);
        this.f4154h = i4;
        this.j = obj;
        this.k = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0238k(u0.u uVar, InterfaceC1163b interfaceC1163b, InterfaceC0617c interfaceC0617c) {
        super(1, interfaceC0617c);
        this.f4154h = 3;
        this.j = uVar;
        this.k = (AbstractC0720j) interfaceC1163b;
    }
}
